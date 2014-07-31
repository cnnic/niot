package cn.niot.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mypack.TestHibernate;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import cn.unitTest.RuleFuncTest;
import cn.niot.service.*;
import cn.niot.util.RecoUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

/**
 * 
* @Title: RespCode.java 
* @Package cn.niot.zt 
* @Description:
* @author Zhang Tao
* @date 2013-12-3 
* @version V1.0
 */



public class IoTIDRecognitionAction extends ActionSupport {

	private String code;

	private String status;

	private String data;


	private String statement;
	

	private String extraData;

	private String Msg;


	public String getData() {
		return data;
	}

	public String getStatus() {
		return status;
	}

	public String getStatement() {
		return statement;
	}

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getExtraData() {
		return extraData;
	}

	public String replaceBlank(String str) {

        String dest = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\s*|\\t|\\r|\\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

	public String execute() throws Exception {
		long begin = System.currentTimeMillis();
		// added by dgq, for test only
		int nflag = 0;
		if (0 == nflag) {
			IDstrRecognition.readDao(0);
			// System.setOut(new PrintStream(new
			// FileOutputStream("e:\\result.txt")));
			IDstrRecognition.testAndTestID();
			System.out.println("The end of this run!!!!\n");
			return SUCCESS;
		}

		String IoTcode = null;
		if (this.code != null) {
			IoTcode = replaceBlank(this.code);
			// System.out.println("\nIoTcode:   " + IoTcode);
			// System.out.println("\nLength of IoTcode:   " + IoTcode.length());
		}

		if (IoTcode != null) {
			IDstrRecognition.readDao(0);
			HashMap<String, Double> typeProbability = IDstrRecognition
					.IoTIDRecognizeAlg(IoTcode);
			// added by dgq on 2014-04-29, to remove those items with
			// probability of 0.0
			Iterator iterator_IDPro = typeProbability.keySet().iterator();
			while (iterator_IDPro.hasNext()) {
				String key_IDstd = iterator_IDPro.next().toString();				
				double probability = typeProbability.get(key_IDstd);
				if (0 >= probability) {
					iterator_IDPro.remove();
				}
			}


			// HashMap<String, Double> ChineseName_Pro =
			// RecoUtil.replaceIotId(typeProbability);
			HashMap<String, Double> ShortName_Probability = new HashMap<String, Double>();
			JSONObject jsonObjectRes = IDstrRecognition.getTwoNamesByIDCode(
					typeProbability, ShortName_Probability);
			this.extraData = (jsonObjectRes.toString()).replace("\"", "\'");

			int len = ShortName_Probability.size();
			if (RecoUtil.NO_ID_MATCHED == len) {
				this.status = String.valueOf(RecoUtil.NO_ID_MATCHED);
				// this.status = "1";
			} else if (RecoUtil.ONE_ID_MATCHED == len) {
				Iterator iterator = ShortName_Probability.keySet().iterator();
				while (iterator.hasNext()) {
					Object key = iterator.next();
					this.data = String.valueOf(key);
					this.status = String.valueOf(RecoUtil.ONE_ID_MATCHED);
				}
			} else {
				this.status = String.valueOf(len);

				JSONArray jsonArray = new JSONArray();
				Iterator iterator2 = ShortName_Probability.keySet().iterator();
				while (iterator2.hasNext()) {
					Object key = iterator2.next();
					JSONObject jsonObject = new JSONObject();
					double probability = ShortName_Probability.get(key);
					jsonObject.put("codeName", String.valueOf(key));
					jsonObject.put("probability", String.valueOf(probability));
					if (!jsonArray.add(jsonObject)) {
						System.out.println("ERROR! jsonArray.add(jsonObject)");
					}
					this.data = jsonArray.toString();
				}
			}

		}
		// System.out.println("during:"+(System.currentTimeMillis()-begin));
		System.out.println("\nthis.data:   " + this.data);
		System.out.println("\nthis.extraData:   " + this.extraData);
		return SUCCESS;
	}
}
