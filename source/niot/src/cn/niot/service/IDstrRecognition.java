package cn.niot.service;

import java.text.DateFormat;
import java.util.*;
import java.lang.reflect.*;

import net.sf.json.JSONObject;

import cn.niot.dao.*;
import cn.niot.util.JdbcUtils;
import cn.niot.util.RecoUtil;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.text.SimpleDateFormat;

public class IDstrRecognition {
	static String DEBUG = "OFF";// the value of DEBUG can be "ON" or "OFF"
	static String DEBUG_RES = "OFF";// the value of DEBUG_RES can be "ON" or
									// "OFF"
	static String DEBUG_LINE = "OFF";// the value of DEBUG_LINE can be "ON" or
										// "OFF"
	static String DEBUG_TIME = "OFF";// the value of DEBUG_TIME can be "ON" or
										// "OFF"
	static int line = 0;

	static HashMap<String, Double> rmvRuleSet;
	static HashMap<String, Double> rmvIDSet;
	static HashMap<String, ArrayList<String>> hashMapTypeToRules;// 类型对应规则
	static HashMap<String, ArrayList<String>> hashMapRuleToTypes;// 规则对应类型

	public static void readDao(int type) {
		hashMapTypeToRules = new HashMap<String, ArrayList<String>>();// 类型对应规则
		hashMapRuleToTypes = new HashMap<String, ArrayList<String>>();// 规则对应类型
		rmvRuleSet = new HashMap<String, Double>();// rmvRuleSet<规则名，权重>
		rmvIDSet = new HashMap<String, Double>();// rmvIDSet<类型名，先验概率>
		RecoDao dao = RecoDao.getRecoDao();
		if (type == 0) {
			hashMapTypeToRules = dao.DBreadTypeAndRules(rmvRuleSet, rmvIDSet,
					hashMapRuleToTypes);
		} else {
			hashMapTypeToRules = dao.HibernateDBreadTypeAndRules(rmvRuleSet,
					rmvIDSet, hashMapRuleToTypes);
		}
	}

	public static HashMap<String, Double> IoTIDRecognizeAlg(String s) {
		// System.out.println(System.currentTimeMillis());
		HashMap<String, Double> typeProbability = new HashMap<String, Double>();

		long timeDaoBegin = 0, timeDao = 0, timeSortRulesBegin = 0, timeSortRules = 0, timeMatchBegin = 0, timeMatch = 0, timeSubtractionBegin = 0, timeSubtraction = 0, timeUnionBegin = 0, timeUnion = 0;

		// RecoDao dao = RecoDao.getRecoDao();
		// if("ON"==DEBUG_TIME)timeDaoBegin=System.currentTimeMillis();
		// hashMapTypeToRules = dao.HibernateDBreadTypeAndRules(rmvRuleSet,
		// rmvIDSet,
		// hashMapRuleToTypes);
		// if("ON"==DEBUG_TIME)timeDao=System.currentTimeMillis()-timeDaoBegin;
		ArrayList<String> rulesList;
		sortRules(); //Temporarily moved by dgq, 2014-04-21
		//*
		while (rmvIDSet.size() != 0 && rmvRuleSet.size() != 0) {
			if ("ON" == DEBUG_TIME) {
				timeSortRulesBegin = System.currentTimeMillis();
			}
			// Temporarily moved by dgq, 2014-04-21
			if ("ON" == DEBUG_TIME) {
				timeSortRules += (System.currentTimeMillis() - timeSortRulesBegin);
			}
			String maxRule = getMax();// Temporarily moved by dgq, 2014-04-21
			// String maxRule = getMax_dgq();// Temporarily added by dgq,
			// 2014-04-21
			String[] splitRules = maxRule.split("\\)\\(\\?\\#PARA=");// 提取规则名
			String[] splitParameter = splitRules[1].split("\\)\\{\\]");// 提取参数
			if ("ON" == DEBUG) {
				System.out.print("matching " + splitRules[0] + "("
						+ splitParameter[0] + ").");
			}
			if ("ON" == DEBUG_TIME) {
				timeMatchBegin = System.currentTimeMillis();
			}
			if (match(splitRules[0], splitParameter[0], s)) {
				// intersection(rmvIDSet, hashMapRuleToTypes.get(maxRule));
				if ("ON" == DEBUG_TIME) {
					timeMatch += (System.currentTimeMillis() - timeMatchBegin);
				}
				if ("ON" == DEBUG) {
					System.out.println("OK");
				}
				rmvRuleSet.remove(maxRule);
			} else {
				subtraction(rmvIDSet, hashMapRuleToTypes.get(maxRule));
				union(maxRule);
				if ("ON" == DEBUG_TIME) {
					timeMatch += (System.currentTimeMillis() - timeMatchBegin);
				}

				if ("ON" == DEBUG) {
					System.out.println("ERR");
				}
				if ("ON" == DEBUG_TIME) {
					timeSubtractionBegin = System.currentTimeMillis();
				}

				if ("ON" == DEBUG_TIME) {
					//subtraction(rmvIDSet, hashMapRuleToTypes.get(maxRule));
					timeSubtraction += (System.currentTimeMillis() - timeSubtractionBegin);
				}
				if ("ON" == DEBUG_TIME) {
					timeUnionBegin = System.currentTimeMillis();
				}

				if ("ON" == DEBUG_TIME) {
					//union(maxRule);
					timeUnion += (System.currentTimeMillis() - timeUnionBegin);
					
				}
			}

		}
		//*/
		/*
		while (rmvIDSet.size() != 0 && rmvRuleSet.size() != 0) {
			if ("ON" == DEBUG_TIME)
				timeSortRulesBegin = System.currentTimeMillis();			
			if ("ON" == DEBUG_TIME)timeSortRules = System.currentTimeMillis() - timeSortRulesBegin;
			String maxRule = getMax();//Temporarily moved by dgq, 2014-04-21
			//String maxRule = getMax_dgq();// Temporarily added by dgq,
											// 2014-04-21
			String[] splitRules = maxRule.split("\\)\\(\\?\\#PARA=");// 提取规则名
			String[] splitParameter = splitRules[1].split("\\)\\{\\]");// 提取参数
			if ("ON" == DEBUG) {
				System.out.print("matching " + splitRules[0] + "("
						+ splitParameter[0] + ").");
			}
			if ("ON" == DEBUG_TIME)
				timeMatchBegin = System.currentTimeMillis();
			if (match(splitRules[0], splitParameter[0], s)) {
				// intersection(rmvIDSet, hashMapRuleToTypes.get(maxRule));
				if ("ON" == DEBUG_TIME)
					timeMatch = System.currentTimeMillis() - timeMatchBegin;
				if ("ON" == DEBUG) {
					System.out.println("OK");
				}
			} else {
				if ("ON" == DEBUG_TIME)
					timeMatch = System.currentTimeMillis() - timeMatchBegin;
				if ("ON" == DEBUG) {
					System.out.println("ERR");
				}
				if ("ON" == DEBUG_TIME)
					timeSubtractionBegin = System.currentTimeMillis();
				subtraction(rmvIDSet, hashMapRuleToTypes.get(maxRule));
				if ("ON" == DEBUG_TIME)
					timeSubtraction = System.currentTimeMillis()
							- timeSubtractionBegin;
			}
			if ("ON" == DEBUG_TIME)
				timeUnionBegin = System.currentTimeMillis();
			union(maxRule);
			if ("ON" == DEBUG_TIME)
				timeUnion = System.currentTimeMillis() - timeUnionBegin;
		} 
		*/
		if ("ON" == DEBUG_TIME)
			System.out.println("读数据库用时：" + timeDao + ",SortRules用时："
					+ timeSortRules + ",Match用时：" + timeMatch
					+ ",Subtraction用时：" + timeSubtraction + ",Union用时："
					+ timeUnion);
		Date now = new Date();
		DateFormat d1 = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG);
		if ("ON" == DEBUG) {
			System.out.print("DEBUG: " + d1.format(now) + ":");
		}

		double totalProbabity = 0;
		if (rmvIDSet.size() == 0) {
			if ("ON" == DEBUG) {
				System.out.println(s + " doesn't belong any Type.");
			}
		} else {
			if ("ON" == DEBUG_RES) {
				System.out.print(s + " belong to:");
			}
			Iterator<String> iterator = rmvIDSet.keySet().iterator();
			while (iterator.hasNext()) {
				Object key = iterator.next();
				totalProbabity = totalProbabity + rmvIDSet.get(key);
				if ("ON" == DEBUG_RES) {
					System.out.print("DEBUG_RES" + (String) key + " ");
				}
			}
			if ("ON" == DEBUG_RES) {
				System.out.println("DEBUG_RES" + "");
			}
		}
		if ("ON" == DEBUG_LINE) {
			line = line + 1;
			System.out.println(line);
		}
		Iterator<String> iterator2 = rmvIDSet.keySet().iterator();
		Date today = new Date();
		SimpleDateFormat f = new SimpleDateFormat("HH");
		String time = f.format(today);
		while (iterator2.hasNext()) {
			Object key2 = iterator2.next();
			double probability = 0;
			if (totalProbabity != 0){
				probability = rmvIDSet.get(key2) / totalProbabity;
			}			
			typeProbability.put(String.valueOf(key2), probability);
		}
		/*
		 * // change the pri probabilty while (iterator2.hasNext()) { Object
		 * key2 = iterator2.next(); double probability = rmvIDSet.get(key2) /
		 * totalProbabity; typeProbability.put(String.valueOf(key2),
		 * probability); RecoDao.add1ToPriorProbabilityX(Integer.parseInt(time),
		 * String.valueOf(key2)); }
		 */
		// System.out.println(System.currentTimeMillis());
		return typeProbability;
	}

	public static JSONObject getTwoNamesByIDCode(
			HashMap<String, Double> HashMapID2Probability,
			HashMap<String, Double> ShortName_Probability) {
		Iterator iterator_t = HashMapID2Probability.keySet().iterator();
		HashMap<String, String> IDCode_ChineseName = new HashMap<String, String>();
		HashMap<String, String> IDCode_ShortName = new HashMap<String, String>();
		ShortName_Probability.clear();

		RecoDao dao = new RecoDao();
		int nAppendedIndex = 0;
		while (iterator_t.hasNext()) {
			String key_IDstd = iterator_t.next().toString();
			double probability = HashMapID2Probability.get(key_IDstd);

			String ChineseName = dao.getIDDetail(key_IDstd);
			IDCode_ChineseName.put(key_IDstd, ChineseName);

			char[] ShortName = new char[RecoUtil.DISPLAYLENGTH];
			int nIndex = 0;
			for (int i = 0; i < key_IDstd.length(); i++) {
				char charTemp = key_IDstd.charAt(i);
				if ((charTemp >= '0' && charTemp <= '9')
						|| (charTemp >= 'a' && charTemp <= 'z')
						|| (charTemp >= 'A' && charTemp <= 'Z')) {
					ShortName[nIndex] = charTemp;
					nIndex++;
					if (nIndex >= RecoUtil.DISPLAYLENGTH) {
						break;
					}
				}
			}
			String CurShortName = (String.valueOf(ShortName)).trim();
			if (ShortName_Probability.containsKey(CurShortName)) {
				String ResShortName = CurShortName
						+ String.valueOf(nAppendedIndex);
				nAppendedIndex++;
				IDCode_ShortName.put(key_IDstd, ResShortName);
				ShortName_Probability.put(ResShortName, probability);
			} else {
				IDCode_ShortName.put(key_IDstd, CurShortName);
				ShortName_Probability.put(CurShortName, probability);
			}
		}
		// ////////////////////////////////////////////////////////////////////
		JSONObject jsonObjectRes = new JSONObject();

		Iterator iterator_temp = HashMapID2Probability.keySet().iterator();
		while (iterator_temp.hasNext()) {
			String key_IDstd = iterator_temp.next().toString();
			String ChineseName = (IDCode_ChineseName.get(key_IDstd)).toString();
			String ShortName = (IDCode_ShortName.get(key_IDstd)).toString();
			JSONObject jsonObject2 = new JSONObject();
			jsonObject2.put("fullName", ChineseName);
			jsonObject2.put("codeNum", key_IDstd);
			jsonObjectRes.put(ShortName, jsonObject2);
		}
		return jsonObjectRes;
	}

	private static boolean match(String maxRule, String parameter, String input) {
		try {
			String[] arg = new String[2];
			arg[0] = parameter;
			arg[1] = input;
			Object result = "";
			Object[] argOther = new Object[4];
			Class[] c = new Class[4];
			Class ruleFunctionClass = Class
					.forName("cn.niot.rule.RuleFunction");

			if (maxRule.equals("IoTIDByte")) {
				argOther[0] = input;
				argOther[1] = parameter;
				argOther[2] = "";
				argOther[3] = "";
				c[0] = argOther[0].getClass();
				c[1] = argOther[1].getClass();
				c[2] = argOther[2].getClass();
				c[3] = argOther[3].getClass();
			} else if (maxRule.equals("IoTIDLength")) {
				argOther[0] = input;
				argOther[1] = 0;
				argOther[2] = parameter;
				argOther[3] = 0;
				c[0] = String.class;
				c[1] = int.class;
				c[2] = String.class;
				c[3] = int.class;
			} else {
				argOther[0] = input.toCharArray();
				argOther[1] = input.length();
				String[] splitString = parameter.split(",");
				int[] index = new int[splitString.length];
				for (int i = 0; i < splitString.length; i++) {
					index[i] = Integer.parseInt(splitString[i]);
				}
				argOther[2] = index;
				argOther[3] = index.length;
				c[0] = char[].class;
				c[1] = int.class;
				c[2] = int[].class;
				c[3] = int.class;
			}
			Method method = ruleFunctionClass.getMethod(maxRule, c);
			result = method.invoke(null, argOther);
			if (result == "OK")
				return true;
			if (result == "ERR")
				return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("RuleFunction.java file can not find " + maxRule
					+ " method,error");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	// some comments added by dengguangqing, on 2014-04-21
	// get the rule with the largest weight
	private static String getMax() {
		Set<String> keySet = rmvRuleSet.keySet();
		Iterator ikey = keySet.iterator();
		String maxName = (String) ikey.next();
		String nextName = "";
		double max = rmvRuleSet.get(maxName);
		double next = 0;

		while (ikey.hasNext()) {
			nextName = (String) ikey.next();
			next = rmvRuleSet.get(nextName);
			String[] functionHead=nextName.split("\\)\\(\\?\\#PARA=");
			if(functionHead[0].equals("IoTIDLength")){
				return nextName;
			}
			if(functionHead[0].equals("IoTIDByte")){
				return nextName;
			}
			if (next > max) {
				max = next;
				maxName = nextName;
			}
		}
		return maxName;
	}

	//some comments added by dengguangqing, on 2014-04-21
	// some comments added by dengguangqing, on 2014-04-21
	// get one rule randomly
	private static String getMax_dgq() {
		Set<String> keySet = rmvRuleSet.keySet();
		Iterator ikey = keySet.iterator();
		String nextName = "";

		while (ikey.hasNext()) {
			nextName = (String) ikey.next();
			break;
		}
		return nextName;
	}

	private static void sortRules() {
		// TODO Auto-generated method stub
		double p = 0.0;
		Set<String> rulekeySet = rmvRuleSet.keySet();
		Iterator<String> ruleikey = rulekeySet.iterator();
		while (ruleikey.hasNext()) {
			p = 0.0;
			String ruleName = (String) ruleikey.next();
			Set<String> idkeySet = rmvIDSet.keySet();
			Iterator<String> idikey = idkeySet.iterator();
			/*
			 * while (idikey.hasNext()) { String idName = idikey.next(); if
			 * (hashMapRuleToTypes.get(ruleName).indexOf(idName) >= 0 &&
			 * rmvIDSet.containsKey(idName)) { p = p + (double)
			 * rmvIDSet.get(idName); } }
			 */
			ArrayList<String> IDs = hashMapRuleToTypes.get(ruleName);
			double sum_p = 0;
			for (int i = 0; i < IDs.size(); i++) {
				String s = IDs.get(i).toString();
				double currentP = rmvIDSet.get(s);
				sum_p += currentP;

			}

			/*
			 * if (p == 0 || p == 1) { System.out.println("ERROR!  " + ruleName
			 * + " p is 0 or 1,error!"); }
			 */
			if (p > 1 || p < 0) {
				System.out.println("ERROR!  " + ruleName
						+ " p is not in 1~0 range,error!");
			}
			// rmvRuleSet.put(ruleName, w(p));// p!=0 or 1
			rmvRuleSet.put(ruleName, w(sum_p));// p!=0 or 1
		}
	}

	private static double w(double p) {
		double q = 1 - p;
		return p * Math.log(1 / p) / Math.log(2) + q * Math.log(1 / q)
				/ Math.log(2);
	}

	// comments added by dengguangqing, 2014-04-21
	// remove those IDs in rmvIDSet relating to the rule which fails in matching
	private static void subtraction(HashMap<String, Double> rmvIDSet,
			ArrayList<String> arrayList) {
		Iterator<String> iterator = rmvIDSet.keySet().iterator();

		while (iterator.hasNext()) {
			String temp = (String) iterator.next();

			if (arrayList.indexOf(temp) >= 0) { // ��arrayList���ҵ���
				// rmvIDSet.remove(temp);
				iterator.remove();
			}
		}
	}

	//
	private static void intersection(HashMap<String, Double> rmvIDSet,
			ArrayList<String> arrayList) {
		Iterator<String> iterator = rmvIDSet.keySet().iterator();

		ArrayList<String> delete_list = new ArrayList<String>();

		while (iterator.hasNext()) {
			String temp = (String) iterator.next(); 

			if (arrayList.indexOf(temp) == -1) { 
				// rmvIDSet.remove(temp); 
				delete_list.add(temp);
			}
		}

		for (String id_str : delete_list) {
			rmvIDSet.remove(id_str);
		}
	}

	// some comments added by dengguangqing, 2014-04-21
	// update rmvRuleSet according to new rmvIDSet and currently already matched
	// rule
	private static void union(String delRule) {
		Iterator<String> iter = rmvIDSet.keySet().iterator();// IoT ID set

		//ArrayList<String> arrayList = new ArrayList<String>(); 
		ArrayList<String> arrayList_Rules;
		HashSet<String> arrayList = new HashSet<String>();

		while (iter.hasNext()) {
			String ID_key = (String) iter.next();

			arrayList_Rules = new ArrayList<String>();
			arrayList_Rules = hashMapTypeToRules.get(ID_key);// obtain the rule
																// set
																// corresponding
																// to the given
																// IoT ID

			for (String rule : arrayList_Rules) {
				arrayList.add(rule);
			}
		}

		Iterator<String> iterator = rmvRuleSet.keySet().iterator();

		while (iterator.hasNext()) {
			String Rule_key = iterator.next();

			if (!arrayList.contains((String)Rule_key)) { 
				// rmvRuleSet.remove(Rule_key);
				iterator.remove();
			}
		}
		rmvRuleSet.remove(delRule);
	}

	public static void testAndTestID() throws IOException {
		long timeRuleMatchBegin = System.currentTimeMillis();
		HashMap<String, String> testHashMap = new HashMap<String, String>();
		testHashMap = RecoDao.test();
		Iterator<String> iterator1 = testHashMap.keySet().iterator();
		while (iterator1.hasNext()) {
			timeRuleMatchBegin = System.currentTimeMillis();
			Object testID = iterator1.next();
			String test = testHashMap.get(testID);
			int i = 0;
			//System.out.println(testID + "  " + test);
			
			// just for test, added by dgq
			if (test.equals("6959999699990")) {
				i = 0;
			}			
			
			ArrayList<String> s = hashMapTypeToRules.get(testID);
			String resFlag = "OK";
			String res = "";
			int size = s.size();
			for (i = 0; i < size; i++) {
				String temp = s.get(i);
				String[] splitRules = temp.split("\\)\\(\\?\\#PARA=");// 提取规则名
				String[] splitParameter = splitRules[1].split("\\)\\{\\]");// 提取参数
				if (!match(splitRules[0], splitParameter[0], test)) {
					resFlag = "ERR";
					res = res + "ERROR!  IoTID:" + testID + "  InputIDstr:"
							+ test + "  Function:" + splitRules[0]
							+ "  FuncPara:" + splitParameter[0] + "\n";

				} else {
					res = res + "OK!  IoTID:" + testID + "  InputIDstr:" + test
							+ "  Function:" + splitRules[0] + "  FuncPara:"
							+ splitParameter[0] + "\n";

				}
			}
			if (resFlag == "OK") {
				File f = new File("e://DebugResultOK.txt");
				BufferedWriter output = new BufferedWriter(new FileWriter(f,
						true));
				output.append(res);
				output.append("\n");
				output.flush();
				output.close();

				// ////////////////////////////////
				File f1 = new File("e://DebugResultOKID.txt");
				BufferedWriter output1 = new BufferedWriter(new FileWriter(f1,
						true));
				output1.append(testID.toString()+":  " + test);
				output1.append("\n");
				output1.flush();
				output1.close();
				
				////////////////added by dgq, on 2014-05-06//////////////////////////////////////////////////////////////
				/*
				IDstrRecognition.readDao(0);
				HashMap<String, Double> typeProbability = IDstrRecognition.IoTIDRecognizeAlg(test);
				Iterator iterator_IDPro = typeProbability.keySet().iterator();
				
				//added by dgq, on 2014-05-06
				File outfile1 = new File("e://Collision.txt");
				BufferedWriter outputfiles1 = new BufferedWriter(new FileWriter(outfile1, true));
				outputfiles1.append(testID.toString()+" <=> ");
				outputfiles1.flush();
				outputfiles1.close();
				
				while (iterator_IDPro.hasNext()) {
					String key_IDstd = iterator_IDPro.next().toString();
					
					//added by dgq, on 2014-05-06
					File file = new File("e://Collision.txt");
					BufferedWriter outputfile = new BufferedWriter(new FileWriter(file, true));
					outputfile.append(key_IDstd);
					outputfile.append("{]");
					outputfile.flush();
					outputfile.close();
				}
				//added by dgq, on 2014-05-06
				File outfile = new File("e://Collision.txt");
				BufferedWriter outputfiles = new BufferedWriter(new FileWriter(outfile, true));
				outputfiles.append("\n");
				outputfiles.flush();
				outputfiles.close();
				*/
				//////////////////////////////////////////////////////////////////////////////
			} else {
				File f = new File("e://DebugResultERROR.txt");
				BufferedWriter output = new BufferedWriter(new FileWriter(f,
						true));
				output.append(res);
				output.append("\n");
				output.flush();
				output.close();

				// ////////////////////////////////
				File f1 = new File("e://DebugResultERRORID.txt");
				BufferedWriter output1 = new BufferedWriter(new FileWriter(f1,
						true));
				output1.append(testID.toString()+":  " + test);
				output1.append("\n");
				output1.flush();
				output1.close();
			}
			
			long timeRuleMatchEnd = System.currentTimeMillis() - timeRuleMatchBegin;
			File ftime = new File("e://IDrecognitionTime.txt");
			BufferedWriter output1 = new BufferedWriter(new FileWriter(ftime,true));
			output1.append(testID.toString() + ": " + String.valueOf(timeRuleMatchEnd) + "\n");
			output1.flush();
			output1.close();
		}
	}
}
