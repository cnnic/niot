package cn.niot.util;

import java.util.HashMap;

public class FunctionResult {
	// a flag used to indicate the state of the currently called function
	public String ResultFlag = "ERR";
	
	// a flag used to indicate the type of function,
	// can be "Byte", "Length", "Function";
	public String FunctionType = "Byte";
	
	/* a data structure of HashMap used to store the result, which includes two parts: index and corresponding char
	 * length -> key == 0
	 * */
	public HashMap<Integer,String > FunctionResult;

}
