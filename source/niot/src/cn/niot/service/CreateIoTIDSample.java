package cn.niot.service;

import java.text.DateFormat;
import java.util.*;
import java.lang.reflect.*;

import net.sf.json.JSONObject;

import cn.niot.dao.*;
import cn.niot.util.FunctionResult;
import cn.niot.util.RecoUtil;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.text.SimpleDateFormat;

public class CreateIoTIDSample {
	static String ERR = "ERR";
	static String OK = "OK";
	static String EMPTY_STRING = "";
	static int LENGTH_RULE_INDEX = 0;
	
	static HashMap<String, ArrayList<String>> hashMapTypeToFunctionRules;// 类型对应函数规则
	static HashMap<String, ArrayList<String>> hashMapTypeToByteRules;// 类型对应字节规则
	static HashMap<String, String> hashMapTypeToLengthRule;// 类型对应长度规则
	static HashMap<String, Integer> hashMapTypeSampleNumber;// 类型对应规则
	static String FUNCTION_SUFFIX = "_Random";
	
	/* Function: read meta data relating to IoTIDs and their rules from table "iotid"
	 * Input: 
	 * @param type: a flag used to hint which database reading method is used.
	 * Output: NONE
	 * creator: Guangqing Deng
	 * time: 2014年7月7日
	 */
	public static void readDao(int type) {
		hashMapTypeToLengthRule = new HashMap<String, String>();// 类型对应长度规则
		hashMapTypeToByteRules = new HashMap<String, ArrayList<String>>();// 类型对应字节规则
		hashMapTypeToFunctionRules = new HashMap<String, ArrayList<String>>();// 类型对应函数规则
		
		RecoDao dao = RecoDao.getRecoDao();
		/*
		 * if lengthRule in table "IoTID" is "15-16", then the corresponding rule in the hashMapTypeToRules
		 * is "IoTIDLength)(?#PARA=15-16){]"
		 * 
		 * if byterule in table "IoTID" is "1,0,0,0,0,240,239,219,48", then the corresponding rule in the hashMapTypeToRules
		 * is "IoTIDByte)(?#PARA=1,0,0,0,0,240,239,219,48){]"
		 * */
		//initiate the data structure of hashMapTypeToRules and hashMapTypeSampleNumber according to table "iotidcode"
		String flag = dao.DBreadIoTIDTypesAndRules(hashMapTypeSampleNumber, hashMapTypeToLengthRule, 
				hashMapTypeToByteRules, hashMapTypeToFunctionRules);
		if (flag != OK) {
			return;
		}
	}
	
	/*Function:generate a certain number of samples for each IDType
	 *Input:NONE
	 *Output:a HashMap.
	 *       The index of the HashMap is the IDType
	 *       the value of the index are the samples related to that type 
	 *creator:Guangqing Deng
	 *time:2014年7月25日
	 */
	
	public static HashMap<String, ArrayList<String>> generateIoTIDSamples() {
		HashMap<String, ArrayList<String>> hashMapTypeToSamples = new HashMap<String, ArrayList<String>>();// 类型-标识样本
		
		Iterator iterator_Count = hashMapTypeSampleNumber.keySet().iterator();
		while (iterator_Count.hasNext()) {
			String IDType = iterator_Count.next().toString();
			
			String LengthRule = hashMapTypeToLengthRule.get(IDType);
			ArrayList<String> ByteRuleSet = hashMapTypeToByteRules.get(IDType);
			ArrayList<String> FunctionRuleSet = hashMapTypeToFunctionRules.get(IDType);
			
			Integer Number = hashMapTypeSampleNumber.get(IDType);
			
			ArrayList<String> ArraySamples = new ArrayList<String>();
			for (int i = 0; i < Number; i++) {
				String Result = generateOneIoTIDInstance(IDType, LengthRule, ByteRuleSet, FunctionRuleSet);
				ArraySamples.add(Result);
			}
			hashMapTypeToSamples.put(IDType, ArraySamples);
		}
		return hashMapTypeToSamples;
	}
	
	/*Function:generate a single sample according to the given type and rules
     * Input:
     * @param IoTID: represents the Type of the sample
     * @param LengthRule:indicates the length of the sample 
     * @param IoTIDByteRuleSet: the byte rules rules related to that type
     * @param IoTIDFunctionRuleSet: the function rules related to that type            
     * Output:the code sample
     * creator:Guangqing Deng
     * time:2014年7月25日
     */
	public static String generateOneIoTIDInstance(String IoTID, String LengthRule, ArrayList<String> IoTIDByteRuleSet,
			ArrayList<String> IoTIDFunctionRuleSet) {
		String IoTIDInstance = EMPTY_STRING;
		FunctionResult RuleResult = new FunctionResult();
		// first, calculate the length of the coming IoTID code 
		RuleResult = generateStringByOneRule(LengthRule, IoTIDInstance);
		if (RuleResult.ResultFlag == ERR) {
			return EMPTY_STRING;
		}
		int CodeLength = Integer.parseInt((RuleResult.FunctionResult).get(LENGTH_RULE_INDEX));
		
		char [] CodeResult = new char[CodeLength];
		int m = 0;	
		for (m = 0; m < CodeLength; m++) {
			CodeResult[m] = 0;
		} 

		int RuleSetSize = IoTIDByteRuleSet.size();
		for (int i = 0; i < RuleSetSize; i++) {
			String Rule = IoTIDByteRuleSet.get(i).toString();
			RuleResult = generateStringByOneRule(Rule, IoTIDInstance);
			if (RuleResult.ResultFlag == ERR) {
				return EMPTY_STRING;
			}
			HashMap<Integer,String> FunctionResult = RuleResult.FunctionResult;
			Iterator it= FunctionResult.keySet().iterator();
			while (it.hasNext())
			{
				Integer key= (Integer)it.next();
				String IoTIDByte = FunctionResult.get(key);
				char charTemp = IoTIDByte.charAt(0);
				CodeResult[key] = charTemp;
			}
		}	
		// to do something for function rule processing 
		// please consider the processing sequence of function rules
		// 
		
		
		IoTIDInstance = CodeResult.toString();
		return IoTIDInstance;
	}
	
	//(match(splitRules[0], splitParameter[0], s))
	//match(String maxRule, String parameter, String input)
	
	/*Function:generate a part of the sample according to one rule that related to the given type 
	 * Input:
	 * @param Rule:the given rule,which could be IoTIDByte,IoTIDLength or IoTIDFunction
	 * @param curIoTID:part of the result that generated by the rules before this,since one sample
	 *                 is generated by several rules and one single rule can only determine one or several bits of the sample
	 * Output:part of the samples
	 * creator:Guangqing Deng
	 * time:2014年7月25日
	 */
	private static FunctionResult generateStringByOneRule(String Rule,String curIoTID) {
		/*
		 * if lengthRule in table "IoTID" is "15-16", then the corresponding rule in the hashMapTypeToRules
		 * is "IoTIDLength)(?#PARA=15-16){]"
		 * 
		 * if byterule in table "IoTID" is "1,0,0,0,0,240,239,219,48", then the corresponding rule in the hashMapTypeToRules
		 * is "IoTIDByte)(?#PARA=1,0,0,0,0,240,239,219,48){]"
		 * 
		 * (?#ALGNAME=MrpCheck)(?#PARA=0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15){]
		 * */
		String[] splitRules = Rule.split("\\)\\(\\?\\#PARA=");// 提取规则名
		String[] splitParameter = splitRules[1].split("\\)\\{\\]");// 提取参数
		String RuleName = splitRules[0] + FUNCTION_SUFFIX;
		String RuleParameter = splitParameter[0];
		Object ResultTemp = "";
		FunctionResult Result = new FunctionResult();
		try {			
			Class ruleFunctionClass = Class.forName("cn.niot.randomization.RuleRandom");//specify the class name
			
			if (RuleName.equals("IoTIDByte" + FUNCTION_SUFFIX) || RuleName.equals("IoTIDLength" + FUNCTION_SUFFIX)) {
				Object[] Args = new Object[1];
				Args[0] = RuleParameter;
				Class[] c = new Class[1];
				c[0] = String.class;
				Method method = ruleFunctionClass.getMethod(RuleName, c);
				ResultTemp = method.invoke(null, Args);	
				Result = (FunctionResult) ResultTemp;
				if (RuleName.equals("IoTIDByte")){
					Result.FunctionType = "Byte";
				} else {
					Result.FunctionType = "Length";
				}				
			} else {
				Object[] Args = new Object[2];
				Class[] c = new Class[2];
				
				Args[0] = curIoTID;
				Args[1] = RuleParameter;
				
				/*String[] splitString = RuleParameter.split(",");
				int[] index = new int[splitString.length];
				for (int i = 0; i < splitString.length; i++) {
					index[i] = Integer.parseInt(splitString[i]);
				}
				
				Args[0] = index;
				Args[1] = index.length;*/

				c[0] = String.class;
				c[1] = String.class;
				
				Method method = ruleFunctionClass.getMethod(RuleName, c);
				ResultTemp = method.invoke(null, Args);
				Result = (FunctionResult) ResultTemp;
				Result.FunctionType = "Function";
			}			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Result.ResultFlag = ERR;
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Result.ResultFlag = ERR;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Result.ResultFlag = ERR;
			System.out.println("RuleFunction.java file can not find " + RuleName
					+ " method,error");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Result.ResultFlag = ERR;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Result.ResultFlag = ERR;
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Result.ResultFlag = ERR;
		}
		return Result;
	}
}
