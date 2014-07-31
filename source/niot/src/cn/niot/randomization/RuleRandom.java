package cn.niot.randomization;
import cn.niot.dao.RecoDao;
import cn.niot.util.FunctionResult;
import cn.niot.util.RecoUtil;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.math.BigInteger;

public class RuleRandom {

	static String ERR = "ERR";
	static String OK = "OK";
	static int NO_LENGHT_LIMIT = -1;

	// Function: represent a decimal integer whose value range is from 1 to 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	public static FunctionResult IoTIDLength_Random(String Parameter) {
		FunctionResult Result = new FunctionResult();		
		
		return Result;
	}

	// Function: represent a decimal integer whose value range is from 1 to 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	public static FunctionResult IoTIDByte_Random(String Parameter) {
		FunctionResult Result = new FunctionResult();		
		
		return Result;
	}

	

	// Function: represent a decimal integer whose value range is from 1 to 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator: Dengguangqing
	public static FunctionResult TwoByteDecimalnt_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = Index[0];
//			int index2 = Index[1];
//
//			if ((IDstr[index1] == '0') && (IDstr[index2] == '0')) {
//				return ERR;
//			}
//
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '9')) {
//				return ERR;
//			}
//
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: decide the cigarette subclass code according to different
	// mainclass code (2)
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// Index[0] is the index of mainclass code whose values can be int 1, 2, 3,
	// 4, 9
	// Index[1] and Index[2] are the index of subclass codes
	// LenIndex: the number of indexes that must be 3
	// creator: zll
	public static FunctionResult CigaSubClassCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			// mainclass: 1 subclass: 01, 02, 99
//			if (IDstr[Index[0]] == '1') {
//				if (IDstr[Index[1]] == '0') {
//					if (IDstr[Index[2]] == '1' || IDstr[Index[2]] == '2') {
//						return OK;
//					}
//				} else if (IDstr[Index[1]] == '9') {
//					if (IDstr[Index[2]] == '9') {
//						return OK;
//					}
//				}
//			} else if (IDstr[Index[0]] == '2') { // mainclass: 2 subclass:
//				// 01-09, 10, 99
//				if (IDstr[Index[1]] == '0') {
//					if (IDstr[Index[2]] > '0' && IDstr[Index[2]] <= '9') {
//						return OK;
//					}
//				} else if (IDstr[Index[1]] == '1') {
//					if (IDstr[Index[2]] == '0') {
//						return OK;
//					}
//				} else if (IDstr[Index[1]] == '9') {
//					if (IDstr[Index[2]] == '9') {
//						return OK;
//					}
//				}
//			} else if (IDstr[Index[0]] == '3') { // mainclass: 3 subclass:
//				// 01-08, 99
//				if (IDstr[Index[1]] == '0') {
//					if (IDstr[Index[2]] > '0' && IDstr[Index[2]] < '9') {
//						return OK;
//					}
//				} else if (IDstr[Index[1]] == '9') {
//					if (IDstr[Index[2]] == '9') {
//						return OK;
//					}
//				}
//			} else if (IDstr[Index[0]] == '4') { // mainclass: 4 subclass:
//				// 01-09, 10, 11, 99
//				if (IDstr[Index[1]] == '0') {
//					if (IDstr[Index[2]] > '0' && IDstr[Index[2]] <= '9') {
//						return OK;
//					}
//				} else if (IDstr[Index[1]] == '1') {
//					if (IDstr[Index[2]] == '0' || IDstr[Index[2]] == '1') {
//						return OK;
//					}
//				} else if (IDstr[Index[1]] == '9') {
//					if (IDstr[Index[2]] == '9') {
//						return OK;
//					}
//				}
//			} else if (IDstr[Index[0]] == '9') { // mainclass: 9 subclass: 01
//				if (IDstr[Index[1]] == '0' && IDstr[Index[2]] == '1') {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: There are four characters. The first two characters are
	// represented as month, the other two
	// characters are represented the date in that month.
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// Index[0] and Index[1] are the index of month
	// Index[2] and Index[3] are the index of date
	// LenIndex: the number of indexes that must be 4
	// creator: zll
	public static FunctionResult MonthDate_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			int date = Integer.parseInt(String.valueOf(IDstr[Index[2]])) * 10
//					+ Integer.parseInt(String.valueOf(IDstr[Index[3]]));
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			if (IDstr[Index[0]] == '0') { // month: 01, 03, 05, 07, 08
//				if (IDstr[Index[1]] == '1' || IDstr[Index[1]] == '3'
//						|| IDstr[Index[1]] == '5' || IDstr[Index[1]] == '7'
//						|| IDstr[Index[1]] == '8') {
//					if (date <= 31) {
//						return OK;
//					}
//				} else if (IDstr[Index[1]] == '4' || IDstr[Index[1]] == '6'
//						|| IDstr[Index[1]] == '9') { // month: 04, 06, 09
//					if (date <= 30) {
//						return OK;
//					}
//				} else if (IDstr[Index[1]] == '2') { // month: 02
//					if (date <= 29) {
//						return OK;
//					}
//				}
//			} else if (IDstr[Index[0]] == '1') { // month: 10, 12
//				if (IDstr[Index[1]] == '0' || IDstr[Index[1]] == '2') {
//					if (date <= 31) {
//						return OK;
//					}
//				} else if (IDstr[Index[1]] == '1') { // month: 11
//					if (date <= 30) {
//						return OK;
//					}
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: Cigarette organization code. There are totally 2 characters.
	// Function: Cigarette organization code. There are totally 2 characters.(3)
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// Index[0] is the index of the first character of cigarette organization
	// code which is 1,2 or 9.
	// Index[1] is the index of the second character.
	// LenIndex: the number of indexes that must be 2
	// creator: zll
	public static FunctionResult CigaOrgCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			if (IDstr[Index[0]] == '1') {
//				if (IDstr[Index[1]] >= '0' && IDstr[Index[1]] <= '9') {
//					return OK;
//				}
//			} else if (IDstr[Index[0]] == '2') {
//				if (IDstr[Index[1]] >= '0' && IDstr[Index[1]] <= '3') {
//					return OK;
//				}
//			} else if (IDstr[Index[0]] == '9') {
//				if (IDstr[Index[1]] == '9') {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	
	// Function: Cigarette department or subordinate department code. There are
	// totally 2 characters.
	// Function: Cigarette department or subordinate department code. There are
	// totally 2 characters.(198)
	// IDstr: ID string. Code range is 00-97.
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes that must be 2
	// creator: zll
	public static FunctionResult CigaDepCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int depCode = Integer.parseInt(String.valueOf(IDstr[Index[0]]))
//					* 10 + Integer.parseInt(String.valueOf(IDstr[Index[1]]));
//			if (depCode >= 0 && depCode <= 97) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: There are all together 6 chars of administrative division code.
	// This method is to used to
	// connect to the database and get the first 4 chars of division code.
	// IDstr: ID string, the first 4 chars of administrative division code.
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes that must be 4
	// creator: zll
	public static FunctionResult First4CharsofAdminDivisionforCiga_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String id = "";
//			String append = "00";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			if (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '0') {
//				return OK;
//			}
//			RecoDao recoDao = new RecoDao();
//			for (int i = 0; i < LenIndex; i++) {
//				id = id.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			id = id.concat(append);
//			boolean ret = recoDao.getAdminDivisionID(id);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 6位行政区划代码.
	// Function: 6位行政区划代码的前2位.
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用行政区划代码的位置
	// LenIndex: 长度必须是2位
	public static FunctionResult First2CharsofAdminDivision_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			String id = "";
//			String append = "0000";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			RecoDao recoDao = new RecoDao();
//			for (int i = 0; i < LenIndex; i++) {
//				id = id.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			id = id.concat(append);
//			boolean ret = recoDao.getAdminDivisionID(id);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 6位行政区划代码.(296)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用行政区划代码的位置
	// LenIndex: 长度必须是6位
	// creator: zll
	public static FunctionResult AdminDivision_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			String id = "";
//			RecoDao recoDao = new RecoDao();
//			for (int i = 0; i < LenIndex; i++) {
//				id = id.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			boolean ret = recoDao.getAdminDivisionID(id);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 世界各国和地区名称代码为CPC编码调用,(279)中规定编码长度为2-3位，CPC编码为在第4位加0.
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用世界各国和地区名称代码的位置
	// LenIndex: 长度是多少，一定是4位
	// creator: zll
	public static FunctionResult CountryRegionCodeforCPC_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex - 1; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getCountryRegionCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 世界各国和地区名称代码，(279)中规定编码长度为2-3位.
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用世界各国和地区名称代码的位置
	// LenIndex: 长度是多少，一定是2-3位
	// creator: zll
	public static FunctionResult CountryRegionCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			String code = "";
//			for (int i = 0; i < LenIndex; i++) {
//				if (Index[i] < -1 || (Index[i] >= LenID && LenID != 2)) {
//					return ERR;
//				} else if (Index[i] >= LenID) {
//					LenIndex = LenIndex - 1;
//				}
//			}
//			if (!(LenIndex == 2 || LenIndex == 3)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getCountryRegionCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 烟草机械产品用物料 分类和编码 第3部分：机械外购件(7)中的5位编码.
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用烟草机械产品用物料代码的位置
	// LenIndex: 长度是6位
	// creator: zll
	public static FunctionResult TabaccoMachineProduct_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			String categoryCode = String.valueOf(IDstr[Index[0]]);
//			String groupCode = String.valueOf(IDstr[Index[1]])
//					+ String.valueOf(IDstr[Index[2]]);
//			String variatyCode = String.valueOf(IDstr[Index[3]])
//					+ String.valueOf(IDstr[Index[4]]);
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTabaccoMachineProduct(categoryCode,
//					groupCode, variatyCode);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 商品条码零售商品编码EAN UPC前3位前缀码.
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用前缀码的位置
	// LenIndex: 长度是3位
	// creator: zll
	public static FunctionResult PrefixofRetailCommodityNumber_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		try {
//			String code = "";
//			int num = 0;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			num = Integer.parseInt(code);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPrefixofRetailCommodityNumber(num);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 烟草机械物料 分类和编码第2部分：专用件 附录D中的单位编码.(672)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用前缀码的位置
	// LenIndex: 长度是2位，为大写字母
	// creator: zll
	public static FunctionResult TabaccoMachineProducer_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTabaccoMachineProducer(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 4位行政区号.
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用行政区好的位置
	// LenIndex: 长度是4位，为数字
	// creator: zll
	public static FunctionResult DistrictNo_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getDistrictNo(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: CID满足的域名规则.
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: (18,-1),从18位以后的字符串进行正则表达式验证
	// LenIndex: 长度必为2
	// creator: zll
	public static FunctionResult CIDRegex_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			String code = "";
//			String regex = "(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62}){2}\\.cid\\.iot\\.cn";
//			int prefix = 18;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 烟草企业标准件编码所需的类别代码，组别代码和品种代码(6)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用类别代码（1位），组别代码（2位）和品种代码（2位）的位置
	// LenIndex:长度必为5
	// creator: zll
	public static FunctionResult TabaccoStandardPart_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			String categoryCode = String.valueOf(IDstr[Index[0]]);
//			String groupCode = String.valueOf(IDstr[Index[1]])
//					+ String.valueOf(IDstr[Index[2]]);
//			String variatyCode = String.valueOf(IDstr[Index[3]])
//					+ String.valueOf(IDstr[Index[4]]);
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTabaccoStandardPart(categoryCode,
//					groupCode, variatyCode);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 烟草机械产品用物料分类和编码 第6部分：原、辅材料(4)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用类别代码（2位）和品种代码（3位）的位置
	// LenIndex:长度必为5
	// creator: zll
	public static FunctionResult TabaccoMaterial_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			String categoryCode = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			String variatyCode = String.valueOf(IDstr[Index[2]])
//					+ String.valueOf(IDstr[Index[3]])
//					+ String.valueOf(IDstr[Index[4]]);
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTabaccoMaterial(categoryCode, variatyCode);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 国际货运代理单证标识符编码中不定长的企业自定义编码正则匹配,数字或者字母，数字在字母后面。(55)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度<=16
	// creator: zll
	public static FunctionResult IntFreitForwarding_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			String regex = "[a-zA-Z][a-zA-Z0-9]{0,15}";
//			int prefix = 18;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			// 最后一位为校验位
//			for (int i = Index[0]; i < LenID - 1; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//
//			int[] modIndex = new int[LenID];
//			for (int i = 0; i < LenID; i++) {
//				modIndex[i] = i;
//			}
//			String modRet = MOD112(IDstr, LenID, modIndex, LenID);
//			if (ret && modRet.equals(OK)) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 财务会计分类与代码(15)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为6
	// creator: zll
	public static FunctionResult FoodAccount_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getFoodAccount(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与代码 粮食设备分类与代码(23)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为8
	// creator: zll
	public static FunctionResult GrainEquipment_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainEquipment(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食设施分类与编码(24)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为7
	// creator: zll
	public static FunctionResult GrainEstablishment_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 7) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainEstablishment(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 烟草机械产品用物料 分类和编码 第5部分：电器元器件 (5)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为5
	// creator: zll
	public static FunctionResult TabaccoElectricComponent_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			String categoryCode = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			String groupCode = String.valueOf(IDstr[Index[2]])
//					+ String.valueOf(IDstr[Index[3]])
//					+ String.valueOf(IDstr[Index[4]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTabaccoElectricComponent(categoryCode,
//					groupCode);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:两位数，第一位为0时，第二位为（0，1，2）；第一位为1时，第二位为（1，2,6,7）；第一位为（2）时，第二位为（0~5）
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes, 固定为2
	public static FunctionResult CPCTwoByte_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = Index[0];
//			int index2 = Index[1];
//
//			if (IDstr[index1] == '0') {
//				if ((IDstr[index2] == '0') || (IDstr[index2] == '1')
//						|| IDstr[index2] == '2') {
//					return OK;
//				}
//			}
//
//			if (IDstr[index1] == '1') {
//				if ((IDstr[index2] == '1') || (IDstr[index2] == '2')
//						|| (IDstr[index2] == '6') || (IDstr[index2] == '7')) {
//					return OK;
//				}
//			}
//
//			if (IDstr[index1] == '2') {
//				if ((IDstr[index2] >= '0') && (IDstr[index2] <= '5')) {
//					return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 判断两个字节是不是代表月份
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes, 固定为2
	public static FunctionResult Month_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = Index[0];
//			int index2 = Index[1];
//
//			if (IDstr[index1] == '0') {
//				if ((IDstr[index2] > '0') && (IDstr[index2] <= '9')) {
//					return OK;
//				}
//			}
//
//			if (IDstr[index1] == '1') {
//				if ((IDstr[index2] >= '0') && (IDstr[index2] <= '2')) {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 判断六个字节是不是属于LS/T 1704.3-2004表1中的编码
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes, 固定为6
	public static FunctionResult ClassOfGrain_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			int index4 = Index[3];
//			int index5 = Index[4];
//			int index6 = Index[5];
//
//			if (IDstr[index1] == '0' && IDstr[index2] == '1') {
//				if (IDstr[index3] == '0') {
//					if (IDstr[index4] == '1') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] >= '0' && IDstr[index6] <= '4') {
//								return OK;
//							}
//						}
//					} else if (IDstr[index4] == '2') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] >= '0' && IDstr[index6] <= '5') {
//								return OK;
//							}
//						}
//					}
//				}
//			}
//			if (IDstr[index1] == '0' && IDstr[index2] == '2') {
//				if (IDstr[index3] == '0') {
//					if (IDstr[index4] == '1') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] == '1' || IDstr[index6] == '0') {
//								return OK;
//							}
//						}
//					} else if (IDstr[index4] == '2') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] >= '0' && IDstr[index6] <= '2') {
//								return OK;
//							}
//						}
//					} else if (IDstr[index4] == '3') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] >= '0' && IDstr[index6] <= '1') {
//								return OK;
//							}
//						}
//					}
//				}
//			}
//			if (IDstr[index1] == '0' && IDstr[index2] == '3') {
//				if (IDstr[index3] == '0') {
//					if (IDstr[index4] == '1') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] >= '0' && IDstr[index6] <= '8') {
//								return OK;
//							}
//						} else if (IDstr[index5] == '1') {
//							if (IDstr[index6] >= '1' && IDstr[index6] <= '2') {
//								return OK;
//							}
//						}
//					} else if (IDstr[index4] == '2') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] >= '0' && IDstr[index6] <= '8') {
//								return OK;
//							}
//						} else if (IDstr[index5] == '1') {
//							if (IDstr[index6] >= '1' && IDstr[index6] <= '3') {
//								return OK;
//							}
//						}
//					} else if (IDstr[index4] == '3') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] >= '0' && IDstr[index6] <= '8') {
//								return OK;
//							}
//						} else if (IDstr[index5] == '1' && IDstr[index6] == '1') {
//							return OK;
//						}
//					} else if (IDstr[index4] == '4') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] == '0' || IDstr[index6] == '1') {
//								return OK;
//							}
//						}
//					} else if (IDstr[index4] == '5') {
//						if (IDstr[index5] == '0') {
//							if (IDstr[index6] == '0' || IDstr[index6] == '1') {
//								return OK;
//							}
//						}
//					}
//
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 判断2个字节是不是属于(01-07,99)
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes, 固定为2
	public static FunctionResult TwobytleCode07_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = Index[0];
//			int index2 = Index[1];
//
//			if (IDstr[index1] == '0') {
//				if (IDstr[index2] >= '1' && IDstr[index2] <= '7') {
//					return OK;
//				}
//			}
//
//			if (IDstr[index1] == '9' && IDstr[index2] == '9') {
//				return OK;
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 判断2个字节是不是属于(01-06,99)
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes, 固定为2
	public static FunctionResult TwobytleCode06_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = Index[0];
//			int index2 = Index[1];
//
//			if (IDstr[index1] == '0') {
//				if (IDstr[index2] >= '1' && IDstr[index2] <= '6') {
//					return OK;
//				}
//			}
//
//			if (IDstr[index1] == '9' && IDstr[index2] == '9') {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: UCODE 的Top Level Domain Code: TLDc的取值不可为"E000"和“FFFF”
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes, 固定为4
	public static FunctionResult CountUcode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return "ERR";
//			}
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			int index4 = Index[3];
//			if (IDstr[index1] == 'E') {
//				if ((IDstr[index2] == '0') && (IDstr[index3] == '0')
//						&& (IDstr[index4] == '0')) {
//					return "ERR";
//				}
//			}
//			if (IDstr[index1] == 'F') {
//				if ((IDstr[index2] == 'F') && (IDstr[index3] == 'F')
//						&& (IDstr[index4] == 'F')) {
//					return "ERR";
//				}
//			}
//			return "OK";
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: EPC编码的域名管理者(Domain Manager)域不能取值为0xA011363及全0
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// creator: Wu Zhenyu
	public static FunctionResult DomainManagerInEPCCheck_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			int i = 0;
//			int Index_k = 0; // is 0xA011363 or not
//			int Zero_k = 0; // is 0 or not
//			char[] str = { 'A', '0', '1', '1', '3', '6', '3' };
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// the length of domain manager is from 28 to 128
//			if (LenIndex < 28 || LenIndex > 128) {
//				return ERR;
//			}
//
//			for (i = 0; i < LenIndex; i++) {
//				if (IDstr[Index[i]] == str[Index_k]) { // as long as str is in
//					// the IDstr,Index_k
//					// will be 7
//					Index_k++;
//					if (Index_k == 7) {
//						return ERR;
//					}
//				} else {
//					Index_k = 0;
//				}
//
//				if (IDstr[Index[i]] == '0') {
//					Zero_k++;
//				}
//			}
//
//			if (Zero_k == LenIndex) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 374 Function: 检验是否属于 序号2开始求出偶数位上数字之和①；①×3=②；从序号3开始求出奇数位上数字之和③；②+③=④；用大于
	// 或等于结果④且为整数倍的最小数减去④得到的值。
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Creator:Wu Zhenyu
	public static FunctionResult CheckCodeForCommodityCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
	
//		try {
//			char checkcode = 0;
//			int i = 0;
//
//			// the sum of the odd and even number
//			int odd_sum = 0;
//			int even_sum = 0;
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			for (i = LenIndex - 2; i >= 0; i -= 2) {
//				even_sum += (IDstr[i] - 48);
//			}
//
//			for (i = LenIndex - 3; i >= 0; i -= 2) {
//				odd_sum += (IDstr[i] - 48);
//			}
//
//			if ((((even_sum * 3 + odd_sum)) % 10) == 0) {
//				checkcode = 48;
//			} else {
//				checkcode = (char) ((10 - ((even_sum * 3 + odd_sum)) % 10) + 48);
//			}
//
//			if (checkcode == IDstr[Index[LenIndex - 1]]) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:12位幢编码：6位 采用竣工时间法，时间未知，全部用"*"；仅知年代，如199***；知年份不知月份，如2008**；
	// 知道时间，如20080708， 后六位幢顺序号，不能为全0
	// IDstr: ID string
	// LenID: the number of characters in the ID string is 26
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes is 12
	// Creator:Wu Zhenyu
	public static FunctionResult HouseCode_CheckBasedCompleteTime_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			int i = 0;
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 12) {
//				return ERR;
//			}
//
//			// 当第一次出现"*"时，代表时间的六位代码中，从该位开始后面都是"*"
//			for (; i < 6; i++) {
//				if (IDstr[Index[i]] == '*') {
//					int k = i + 1;
//
//					while (k < 6) {
//						if (IDstr[Index[k]] == '*') {
//							k++;
//						} else {
//							return ERR;
//						}
//					}
//				}
//			}
//
//			// 判断 月份
//			int[] Index_month = { Index[4], Index[5] };
//
//			// if ((Month(IDstr, LenID, Index_month, Index_month.length)) ==
//			// ERR) { // 江峰
//			// // 实现的函数，判断是否是月份
//			// return ERR;
//			// }
//
//			// xjf 修改后
//			if (IDstr[Index[4]] != '*' && Index[5] != '*') {
//				if ((Month(IDstr, LenID, Index_month, Index_month.length)) == ERR) { // 江峰
//					// 实现的函数，判断是否是月份
//					return ERR;
//				}
//			}
//
//			if (IDstr[Index[4]] != '*' && Index[5] == '*') {
//				if ((int) IDstr[Index[4]] - 48 != 0
//						|| (int) IDstr[Index[4]] - 48 != 1
//						|| (int) IDstr[Index[4]] - 48 != 2) {
//					return ERR;
//				}
//			}
//
//			int zero_count = 0; // 不能全0
//			for (i = 6; i < LenIndex; i++) {
//				if (IDstr[Index[i]] == '0') {
//					zero_count++;
//					if (zero_count == 6) {
//						return ERR;
//					}
//				} else if (IDstr[Index[i]] < '0' || IDstr[Index[i]] > '9') {
//					return ERR;
//				}
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:12位幢编码,由6位横坐标码与6位纵坐标码组成(坐标法),横纵坐标均取小数点前六位整数
	// IDstr: ID string
	// LenID: the number of characters in the ID string is 26
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes is 12
	// Creator:Wu Zhenyu
	public static FunctionResult HouseCode_CheckBasedCoordinate_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 12) {
//				return ERR;
//			}
//
//			// 判断横纵坐标的范围
//			int i = 0;
//			for (; i < LenIndex; i++) {
//				if (IDstr[Index[i]] < '0' || IDstr[Index[i]] > '9') {
//					return ERR;
//				}
//			}
//
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:12位幢编码,采用分宗法，4位街坊号或房产分区代码、4位宗地号、4位幢顺序号组成，4位幢顺序号0001~9999
	// IDstr: ID string
	// LenID: the number of characters in the ID string is 26
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes is 12
	// Creator:Wu Zhenyu
	public static FunctionResult HouseCode_CheckBasedFenzong_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			// 4位街坊号 房产分区代码，在文档中找到的编号只有两位
//			int i = 0;
//			int count = 0;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			for (; i < 4; i++) {
//				if (IDstr[Index[i]] == '0') {
//					count++;
//					if (count == 4) {
//						return ERR;
//					}
//				} else if (IDstr[Index[i]] < '0' || IDstr[Index[i]] > '9') {
//					return ERR;
//				}
//			}
//
//			// 4位宗地号
//			count = 0;
//			for (i = 4; i < 8; i++) {
//				if (IDstr[Index[i]] == '0') {
//					count++;
//					if (count == 4) {
//						return ERR;
//					}
//				} else if (IDstr[Index[i]] > '9' || IDstr[Index[i]] < '0') {
//					return ERR;
//				}
//			}
//
//			// 4位幢顺序号
//			count = 0;
//			for (i = 8; i < 12; i++) {
//				if (IDstr[Index[i]] == '0') {
//					count++;
//					if (count == 4) {
//						return ERR;
//					}
//				} else if (IDstr[Index[i]] > '9' || IDstr[Index[i]] < '0') {
//					return ERR;
//				}
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:12位幢编码，采用分幅法，8位分幅图分丘图号和4位幢顺序号组成，4位幢顺序号0001~9999
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes is 12
	// Creator:Wu Zhenyu
	public static FunctionResult HouseCode_CheckBasedFenfu_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			int i = 0;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 12) {
//				return ERR;
//			}
//
//			// 前八位
//			for (; i < 8; i++) {
//				if (IDstr[Index[i]] < '0' || IDstr[Index[i]] > '9') {
//					return ERR;
//				}
//			}
//
//			// 后四位顺序号，0001~9999
//			int count = 0;
//			for (i = 8; i < LenIndex; i++) {
//				if (IDstr[Index[i]] == '0') {
//					count++;
//
//					if (count == 4) {
//						return ERR;
//					}
//				}
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:按生成户的时间顺序从0001开始，0001~9999
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes is 4
	// Creator:Wu Zhenyu
	public static FunctionResult HouseCode_CheckUnitCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//
//			int count = 0;
//			for (int i = 0; i < LenIndex; i++) {
//				if (IDstr[Index[i]] == '0') {
//					count++;
//
//					if (count == 4) {
//						return ERR;
//					}
//				} else if (IDstr[Index[i]] > '9' || IDstr[Index[i]] < '0') {
//					return ERR;
//				}
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 中间12位幢代码，同时用四种方法
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes is 12
	// Creator:Wu Zhenyu
	public static FunctionResult HouseCode_CheckTwelBitCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			String[] result = {
//					HouseCode_CheckBasedCompleteTime(IDstr, LenID, Index,
//							LenIndex),
//					HouseCode_CheckBasedCoordinate(IDstr, LenID, Index,
//							LenIndex),
//					HouseCode_CheckBasedFenzong(IDstr, LenID, Index, LenIndex),
//					HouseCode_CheckBasedFenfu(IDstr, LenID, Index, LenIndex) };
//
//			for (int i = 0; i < result.length; i++) {
//				if (result[i] == OK) {
//					return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	
	public static FunctionResult HouseCode_CheckCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		char[] IDstrTemp = new char[LenID];
//		for (int k = 0; k < LenID; k++) {
//			if ('*' == IDstr[k]) {
//				IDstrTemp[k] = '0';
//			} else {
//				IDstrTemp[k] = IDstr[k];
//			}
//		}
//		int i = 0;
//		int j = 10;
//		for (i = 0; i < LenIndex - 1; i++) {
//			int mode10 = (((int) IDstrTemp[Index[i]] - 48) + j) % 10;
//			if (0 == mode10) {
//				mode10 = 10;
//			}
//			j = (mode10 * 2) % 11;
//		}
//		if ((((int) IDstrTemp[Index[LenIndex - 1]] - 48) + j) % 10 == 1) {
//			return OK;
//		}
//		return ERR;

	}

	// Function: 校验算法 实现 C=MOD(11-MOD(∑Ci×Wi,11),10)
	// 其中MOD－表示求余函数；i－表示代码字符从左至右位置序号；Ci－表示第i位置上的代码字符的值；Wi－表示第i位置上的加权因子，
	// 加权因子的公式是：2的n-1次幂除以11取余数，n就是那个i，从右向左排列
	// 当校检的值为10时 赋值位X
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	public static FunctionResult DeviceMOD163_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		// MOD 校验算法，字符串开辟空间时要多一位留给最后加校验位
//		double sum = 0; // 最后的校验码
//		int i;
//		int j = LenIndex - 1;
//		for (i = 0; i < LenIndex - 1; i++) {
//			sum = sum + (int) (IDstr[Index[i]] - 48)
//					* (Math.pow(2, LenIndex - i - 1) % 11);
//		}
//		String check;
//		int mod = (int) (11 - (sum % 11));
//		check = Integer.toString(mod % 10);
//
//		if (check.equals(Integer.toString((int) IDstr[Index[j]] - 48))) {
//			return OK;
//		} else {
//			return ERR;
//		}
	}

	// Function: 蛋与蛋制品分类与代码（232）中的蛋与蛋制品编码表
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长3
	// Creator:许江峰 232
	public static FunctionResult Egg232_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int index3 = (int) IDstr[Index[2]] - 48;
//			if (index1 == 1 && (index2 == 1 || index2 == 2)) {
//				if (index3 > 0 && index3 < 5) {
//					return OK;
//				}
//			}
//			if (index1 == 1 && (index2 == 3)) {
//				if (index3 > 0 && index3 < 8) {
//					return OK;
//				}
//			}
//			if (index1 == 2 && (index2 == 1 || index2 == 2)) {
//				if (index3 > 0 && index3 < 4) {
//					return OK;
//				}
//			}
//			if (index1 == 2 && (index2 == 3)) {
//				if (index3 > 0 && index3 <= 9) {
//					return OK;
//				}
//			}
//			if (index1 == 3 && (index2 == 1 || index2 == 2 || index2 == 3)) {
//				if (index3 > 0 && index3 < 3) {
//					return OK;
//				}
//			}
//			if (index1 == 4 && (index2 == 1 || index2 == 2 || index2 == 3)) {
//				if (index3 > 0 && index3 < 3) {
//					return OK;
//				}
//			}
//			if (index1 == 5 && (index2 == 1 || index2 == 2 || index2 == 3)) {
//				if (index3 > 0 && index3 <= 9) {
//					return OK;
//				}
//			}
//			if (index1 == 6 && (index2 == 1 || index2 == 2 || index2 == 3)) {
//				if (index3 > 0 && index3 < 6) {
//					return OK;
//				}
//			}
//			if (index1 == 8
//					&& (index2 == 1 || index2 == 2 || index2 == 3 || index2 == 4)) {
//				if (index3 > 0 && index3 < 6) {
//					return OK;
//				}
//			}
//			if (index1 == 7 && (index2 == 1 || index2 == 2 || index2 == 3)) {
//				if (index3 > 0 && index3 < 5) {
//					return OK;
//				}
//			}
//			if (index1 == 9 && (index2 == 1)) {
//				if (index3 > 0 && index3 < 5) {
//					return OK;
//				}
//			}
//			if (index1 == 9 && (index2 == 2)) {
//				if (index3 > 0 && index3 < 9) {
//					return OK;
//				}
//			}
//			if (index1 == 9 && (index2 == 3)) {
//				if (index3 > 0 && index3 < 8) {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: represent a decimal integer whose value range is from 00001 to
	// 99999
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult FiveByteDecimalnt_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			int index4 = Index[3];
//			int index5 = Index[4];
//			if ((IDstr[index1] == '0') && (IDstr[index2] == '0')
//					&& (IDstr[index3] == '0') && (IDstr[index4] == '0')
//					&& (IDstr[index5] == '0')) {
//				return ERR;
//			}
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index3] < '0') || (IDstr[index3] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index4] < '0') || (IDstr[index4] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index5] < '0') || (IDstr[index5] > '9')) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: represent a decimal integer whose value range is from 0001 to
	// 9999
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult FourByteDecimalnt_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			int index4 = Index[3];
//			if ((IDstr[index1] == '0') && (IDstr[index2] == '0')
//					&& (IDstr[index3] == '0') && (IDstr[index4] == '0')) {
//				return ERR;
//			}
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index3] < '0') || (IDstr[index3] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index4] < '0') || (IDstr[index4] > '9')) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 实现模10“隔位乘2”求和的校验
	// 即A-Z换算成10进制的10-35，对新的10进制组成新的数组；对新数组的从右到左开始每一位乘以2或1的循环求和sum
	// 校验位的值为 10-sum%10
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult InternationalSecurities_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			int i = 0; // 用于判断16进制
//			int j; // 用于数组的遍历
//			int b = 0;
//			char a;
//			a = 'A';
//			for (j = 0; j < LenIndex - 1; j++) {
//				for (i = 0; i < 26; i++) {
//					char c = (char) (a + i);
//
//					if ((int) IDstr[Index[j]] == c) {
//						IDstr[Index[j]] = (char) (10 + i);
//
//					}
//				}
//				if (IDstr[Index[j]] > 47) {
//					IDstr[Index[j]] = (char) (IDstr[Index[j]] - 48);
//				}
//				if ((int) IDstr[Index[j]] / 10 >= 1)
//					b++;
//			}
//			b = b + LenIndex - 1;
//			int[] nums = new int[b];
//			int e = 0;
//			e = b - 1;
//			for (j = 0; j < LenIndex - 1; j++) {
//				if ((int) IDstr[Index[LenIndex - j - 2]] / 10 < 1) {
//					nums[e] = (int) IDstr[Index[LenIndex - j - 2]];
//					e--;
//				}
//				if ((int) IDstr[Index[LenIndex - j - 2]] / 10 >= 1) {
//					nums[e] = (int) (IDstr[Index[LenIndex - j - 2]] % 10);
//					e--;
//					nums[e] = (int) Math.floor((int) IDstr[Index[LenIndex - j
//							- 2]] / 10);
//					e--;
//				}
//			}
//			int f; // 用于X2的数组遍历
//			int sum = 0; // 用于接受校验码
//			int check; // 用于校验码的值
//			int bb = 0;
//			int ff = 0;
//			for (f = 0; f < b; f++) {
//				if ((b - f) % 2 != 0) {
//					nums[f] = nums[f] * 2;
//					if (nums[f] * 2 > 9) {
//						bb++;
//					}
//				}
//			}
//			ff = bb + b - 1;
//			int[] numss = new int[ff + 1];
//			for (f = 0; f < b; f++) {
//				if (nums[f] < 10) {
//					numss[ff] = nums[f];
//					ff--;
//				}
//				if (nums[f] >= 10) {
//					numss[ff] = (int) (nums[f] % 10);
//					ff--;
//					numss[ff] = (int) 1;
//					ff--;
//				}
//
//			}
//			for (f = 0; f < bb + b; f++) {
//				sum = sum + numss[f];
//			}
//			if (10 - sum % 10 == 10) {
//				check = 0;
//			} else {
//				check = 10 - sum % 10;
//			}
//
//			if (check == (int) IDstr[Index[LenIndex - 1]] - 48) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: ISO 7064:1983.MOD 11-2校验算法 实现 C=11-MOD(∑Ci×Wi,11)
	// 其中MOD－表示求余函数；i－表示代码字符从左至右位置序号；Ci－表示第i位置上的代码字符的值；Wi－表示第i位置上的加权因子，
	// 加权因子的公式是：2的n-1次幂除以11取余数，n就是那个i，从右向左排列
	// 当校检的值为10时 赋值位X
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult MOD112_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// ISO 7064:1983.MOD 11-2校验算法，字符串开辟空间时要多一位留给最后加校验位
//			double sum = 0; // 最后的校验码
//			int i, j;
//			int b = LenIndex - 1;
//			int a;
//			a = 'A';
//			for (j = 0; j < LenIndex - 1; j++) {
//				for (i = 0; i < 26; i++) {
//					char c = (char) (a + i);
//					if ((int) IDstr[Index[j]] == c) {
//						IDstr[Index[j]] = (char) (10 + i);
//					}
//				}
//			}
//
//			for (i = 0; i < LenIndex - 1; i++) {
//				if (IDstr[Index[i]] > 47) {
//					IDstr[Index[i]] = (char) (IDstr[Index[i]] - 48);
//				}
//				sum = sum + (int) (IDstr[Index[i]])
//						* (Math.pow(2, LenIndex - i - 1) % 11);
//			}
//			char check;
//			int mod;
//			sum %= 11;
//			mod = (int) (12 - sum) % 11;
//			if (mod == 10) {
//				check = "X".charAt(0); // X表示10
//			} else {
//				String jieshou = Integer.toString(mod);
//				check = jieshou.charAt(0);
//			}
//
//			if (check == (IDstr[Index[b]])) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 实现校验 MOD 16-3 即16进制的数换算成10进制，对新的10进制的数值乘以权重对16取余；权重位11,9,3,1的循环
	// 权重位1~9的循环
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长16
	// Creator:许江峰
	public static FunctionResult MOD163_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// MOD 16-3校验算法，字符串开辟空间时要多一位留给最后加校验位
//			double sum = 0; // 最后的求校验码数值
//			int i;
//			int w = 0; // 权重
//			int h = 0; // 十进制
//			int j = LenIndex - 1;
//			for (i = 0; i < LenIndex; i++) {
//				if ((LenIndex - i) % 4 == 0) {
//					w = 11;
//				}
//				if ((LenIndex - i) % 4 == 3) {
//					w = 9;
//				}
//				if ((LenIndex - i) % 4 == 2) {
//					w = 3;
//				}
//				if ((LenIndex - i) % 4 == 1) {
//					w = 1;
//				}
//				if ((int) IDstr[Index[i]] == 'A') {
//					IDstr[Index[i]] = (char) 10;
//				}
//				if ((int) IDstr[Index[i]] == 'B') {
//					IDstr[Index[i]] = (char) 11;
//				}
//				if ((int) IDstr[Index[i]] == 'C') {
//					IDstr[Index[i]] = (char) 12;
//				}
//				if ((int) IDstr[Index[i]] == 'D') {
//					IDstr[Index[i]] = (char) 13;
//				}
//				if ((int) IDstr[Index[i]] == 'E') {
//					IDstr[Index[i]] = (char) 14;
//				}
//				if ((int) IDstr[Index[i]] == 'F') {
//					IDstr[Index[i]] = (char) 15;
//				}
//				if (IDstr[Index[i]] > 47) {
//					IDstr[Index[i]] = (char) (IDstr[Index[i]] - 48);
//				}
//				sum = sum + (int) IDstr[Index[i]] * w;
//			}
//			int cd = (int) (sum % 16);
//
//			if (cd == 0) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 实现校验
	// 即数组奇数位乘以1与偶数位乘以2的和sum
	// 校验位的值为 10-sum%10
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult MrpCheck_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			int f; // 用于X2的数组遍历
//			int sum = 0; // 用于接受校验码
//			int check; // 用于校验码的值
//			int b = 0;
//			int j = 0;
//			for (f = 0; f < LenIndex - 1; f++) {
//
//				if (IDstr[Index[f]] > 47) {
//					IDstr[Index[f]] = (char) (IDstr[Index[f]] - 48);
//				}
//				if ((f + 1) % 2 == 0) {
//					IDstr[Index[f]] = (char) ((int) IDstr[Index[f]] * 2);
//					if ((int) (IDstr[Index[f]]) * 2 > 9) {
//						b++;
//					}
//				}
//			}
//			b = b + LenIndex - 1;
//			int[] nums = new int[b];
//			int e = 0;
//			e = b - 1;
//			for (j = 0; j < LenIndex - 1; j++) {
//				if ((int) IDstr[Index[j]] < 10) {
//					nums[e] = (int) IDstr[Index[j]];
//					e--;
//				}
//				if ((int) IDstr[Index[j]] > 9) {
//					nums[e] = (int) (IDstr[Index[j]] % 10);
//					e--;
//					nums[e] = (int) Math.floor((int) IDstr[Index[j]] / 10);
//					e--;
//				}
//			}
//
//			for (f = 0; f < b; f++) {
//				sum = sum + nums[f];
//			}
//
//			if (10 - sum % 10 == 10) {
//				check = 0;
//			} else {
//				check = 10 - sum % 10;
//			}
//			if (check == (int) IDstr[Index[LenIndex - 1]] - 48) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult MusicCheck_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// 从T开始算Index
//			int S = 0;
//			int S1 = 0;
//			int check = 0;
//			int i;
//			for (i = 1; i < LenIndex; i++) {
//				if (i % 9 != 0) {
//					S1 = (int) (IDstr[Index[i]] - 48) * (i % 9);
//					S = S + S1;
//				} else {
//					S1 = (int) (IDstr[Index[i]] - 48) * 9;
//					S = S + S1;
//				}
//			}
//			S = S + 1;
//			if (S % 10 != 0) {
//				return ERR;
//			}
//
//			else {
//				return OK;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: represent a decimal integer whose value range is from 001 to
	// 999
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult ThreeByteDecimalnt_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			if ((IDstr[index1] == '0') && (IDstr[index2] == '0')
//					&& (IDstr[index3] == '0')) {
//				return ERR;
//			}
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index3] < '0') || (IDstr[index3] > '9')) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 值只能位SR MX SM YZ
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult TwoByteSRMXSMYZ_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			if ((IDstr[Index[0]] == 'S') && (IDstr[Index[1]] == 'R')) {
//				return OK;
//			}
//
//			if ((IDstr[Index[0]] == 'M') && (IDstr[Index[1]] == 'X')) {
//				return OK;
//			}
//
//			if ((IDstr[Index[0]] == 'S') && (IDstr[Index[1]] == 'M')) {
//				return OK;
//			}
//			if ((IDstr[Index[0]] == 'Y') && (IDstr[Index[1]] == 'Z')) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:纺织品 机织物组织代码及示例 的正则表达
	// IDstr: 标识编码
	// LenID: 标识编码的长度 不固定
	// Index: 调用正则的的索引位置
	// LenIndex:不固定
	// creator: xjf
	public static FunctionResult Weaves355_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		// int index1 = Index[0];
//		try {
//			String code = "";
//			String regex = "([1-3][0-1]-)(([0-9][0-9]\\s*)+-){2}([0-9][0-9]\\s*)*";
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			code = code.replace(" ", "");
//			code = code.replace("-", "");
//
//			if (code.length() >= 8 && ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 商品条码 资产编码与条码表示最后的系列号为1-16位，使用正则进行匹配(58)
	// IDstr: 标识编码
	// LenID: 标识编码的长度 不固定
	// Index: 调用正则的的索引位置
	// LenIndex:0-13位为全球可回收资产代码,LenIndex必为3，第一位为起始的位数，第二位为正则可重复的次数,第三位为-1
	// creator: zll
	public static FunctionResult GraiSerialNo_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			String code = "";
//			int num = Index[1];
//			String regex = "[a-zA-Z0-9!\"%&'()*+,-./:;<=>?_]{1,"
//					+ String.valueOf(num) + "}";
//
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 药品电子监管码应用码规则，当IDstr[1]为9时，应用码可以为0,1,2
	// IDstr: 标识编码
	// LenID: 标识编码的长度 20位
	// Index: 调用正则的的索引位置
	// LenIndex:长度为1，只验证IDstr[1]是否为9
	// creator: zll
	public static FunctionResult MedAppCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 1) {
//				return ERR;
//			}
//			if (IDstr[1] == '9') {
//				if (!(IDstr[Index[0]] == '0' || IDstr[Index[0]] == '1' || IDstr[Index[0]] == '2')) {
//					return ERR;
//				}
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 烟用材料分类代码与产品编码
	// IDstr: 标识编码
	// LenID: 标识编码的长度4位
	// Index: 调用正则的的索引位置
	// LenIndex:长度为4
	// creator: zll
	public static FunctionResult TabaccoMaterials_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			String categoryCode = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			String groupCode = String.valueOf(IDstr[Index[2]])
//					+ String.valueOf(IDstr[Index[3]]);
//			RecoDao dao = new RecoDao();
//			boolean ret = dao.getTobbacoMaterials(categoryCode, groupCode);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 有问题的啊 9 15425
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult N14(char[] IDstr, int LenID, String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
	
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// 从T开始算Index
//			int S = 0;
//			int S1 = 0;
//			int i;
//			int a = (int) (IDstr[Index[0]] - 32) * 2; // 用于接受第一位
//			for (i = 0; i < 14; i++) {
//				S = S
//						+ ((int) (IDstr[Index[2 * i + 1]] - 48) * 10 + (int) (IDstr[Index[2 * i + 2]] - 48))
//						* (i + 4);
//
//			}
//			S = S + 104 + 102 + a + 99 * 3;
//			S1 = S % 103 + 32;
//
//			if ((int) (IDstr[Index[LenIndex - 1]] - 48) == S1) {
//				return OK;
//			}
//
//			else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 413 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireInfo_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			// int Xx = 8;
//			int i = 10 * index1 + index2;
//			if (i >= 10 && i <= 13) {
//				return OK;
//			} else if (i >= 20 && i <= 23) {
//				return OK;
//			} else if (i >= 30 && i <= 33 || i == 90) {
//				return OK;
//			}
//
//			else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	
	// Function: 409 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireInfotainass_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			// int Xx = 8;
//			int i = 10 * index1 + index2;
//			if (i >= 20 && i <= 22) {
//				return OK;
//			} else if (i == 30 || i == 10 || i == 90) {
//				return OK;
//			}
//
//			else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 406 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireInfotainrate_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			int index1 = 0;
//			int index2 = 0;
//			int i = 0;
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			index1 = (int) IDstr[Index[0]] - 48;
//			index2 = (int) IDstr[Index[1]] - 48;
//
//			// int Xx = 8;
//			i = 10 * index1 + index2;
//			if (i >= 20 && i <= 21) {
//				return OK;
//			} else if (i >= 40 && i <= 43) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 188城市市政综合监管信息系统
	// IDstr: 标识编码
	// LenID: 标识编码的长度 12位
	// Index: 调用验证算法的索引位置
	// LenIndex:12
	// creator:fdl
	public static FunctionResult Littlecode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			if ((IDstr[Index[0]] == '0' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '2')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '3')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '4')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '5')
//					|| (IDstr[Index[0]] == '2' && IDstr[Index[1]] == '1')) {
//				return OK;
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 403 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireInfocamp_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			// int Xx = 8;
//			int i = 10 * index1 + index2;
//			if (i >= 10 && i <= 15) {
//				return OK;
//			} else if (i >= 20 && i <= 29) {
//				return OK;
//			} else if (i == 30 || i == 10 || i == 90) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 殡葬服务、设施、用品分类与代码 第6-12位对应规则
	// IDstr: 标识编码
	// LenID: 标识编码的长度 15位
	// Index: 调用验证算法的索引位置
	// LenIndex:7
	// creator:zt
	public static FunctionResult FuneralInterment_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 7) {
//				return ERR;
//			}
//			String id = "";
//			RecoDao recoDao = new RecoDao();
//			for (int i = 1; i < LenIndex; i++) {
//				id = id.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			if (IDstr[Index[0]] == '1') {
//				boolean ret = recoDao.getFuneral(id,
//						RecoUtil.SELECT_FUNERALSERVICE);
//				if (ret) {
//					return OK;
//				} else
//					return ERR;
//			} else if (IDstr[Index[0]] == '2') {
//				boolean ret = recoDao.getFuneral(id,
//						RecoUtil.SELECT_FUNERALFACILITIES);
//				if (ret) {
//					return OK;
//				} else
//					return ERR;
//			} else if (IDstr[Index[0]] == '3') {
//				boolean ret = recoDao.getFuneral(id, RecoUtil.SELECT_SUPPLIES);
//				if (ret) {
//					return OK;
//				} else
//					return ERR;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 194-烟草机械电气配置和技术文件代码附录D表查询
	// IDstr: 标识编码
	// LenID: 标识编码的长度2位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult TobaccoTech_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			String s = "";
//			for (int i = 0; i < 2; i++) {
//				s = s.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			if (s.equals("00") || s.equals("01") || s.equals("10")
//					|| s.equals("11") || s.equals("12") || s.equals("30")
//					|| s.equals("31") || s.equals("32") || s.equals("44")
//					|| s.equals("45") || s.equals("33") || s.equals("40")
//					|| s.equals("41") || s.equals("42") || s.equals("43")
//					|| s.equals("46") || s.equals("47") || s.equals("48")
//					|| s.equals("50") || s.equals("60")) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}
	
	// 395——消防信息代码
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator: fdl
	public static FunctionResult FireInfomation_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getFireInfomation395(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	// Function: represent a decimal integer whose value range is from 1 to 399
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator: fdl
	public static FunctionResult ThreeByteDecimalnt1_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			if ((IDstr[index1] == '0') && (IDstr[index2] == '0')
//					&& (IDstr[index3] == '0')) {
//				return ERR;
//			}
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '3')) {
//				return ERR;
//			}
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index3] < '0') || (IDstr[index3] > '9')) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 实现校验 MOD 97-10
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长13
	// Creator:zt
	public static FunctionResult MOD9710_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 15) {
//				return ERR;
//			}
//			String id1 = "";
//			String id2 = "";
//			// RecoDao recoDao = new RecoDao();
//			for (int i = 0; i < 13; i++) {
//				id1 = id1.concat(String.valueOf(IDstr[Index[i]]));
//			}
//
//			for (int i = 13; i < 15; i++) {
//				id2 = id2.concat(String.valueOf(IDstr[Index[i]]));
//			}
//
//			double input = Double.parseDouble(id1);
//			double output = Double.parseDouble(id2);
//			if ((98 - (input * 100) % 97) == output) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 194-烟草机械电气配置和技术文件代码附录C表查询
	// IDstr: 标识编码
	// LenID: 标识编码的长度3位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult tabaccoC_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPrefixoftabaccoC(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 402 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireInfofailities_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * index1 + index2;
//			if (i >= 20 && i <= 24) {
//				return OK;
//			} else if (i == 29 || i == 10) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 399 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireInfowatersupply_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			// int Xx = 8;
//			int i = 10 * index1 + index2;
//			if (i >= 20 && i <= 22) {
//				return OK;
//			} else if (i >= 30 && i <= 33) {
//				return OK;
//			} else if (i == 40 || i == 10 || i == 90) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 398 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 4
	// creator: xjf
	public static FunctionResult FireInfowatersource_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int index4 = (int) IDstr[Index[3]] - 48;
//			// int Xx = 8;
//			int i = 1000 * index1 + 100 * index2 + 10 * index3 + index4;
//			if (i >= 1110 && i <= 1112) {
//				return OK;
//			} else if (i >= 1120 && i <= 1122) {
//				return OK;
//			} else if (i == 1000 || i == 1100 || i == 1200 || i == 1300
//					|| i == 1900 || i == 2000 || i == 2100 || i == 2900
//					|| i == 9000) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 91-中国煤炭编码系统 第1-12位对应规则
	// IDstr: 标识编码
	// LenID: 标识编码的长度 12位
	// Index: 调用验证算法的索引位置
	// LenIndex:12
	// creator:fdl
	public static FunctionResult CoalInterment_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 12) {
//				return ERR;
//			}
//			if ((IDstr[Index[0]] == '0' && IDstr[Index[1]] == '2')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '3')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '4')
//					|| (IDstr[Index[0]] == '1' && IDstr[Index[1]] == '9')
//					|| (IDstr[Index[0]] == '5' && IDstr[Index[1]] == '0')) {
//				if ((IDstr[Index[2]] == '2' && IDstr[Index[3]] == '4')
//						|| (IDstr[Index[2]] == '2' && IDstr[Index[3]] == '5')
//						|| (IDstr[Index[2]] == '3' && IDstr[Index[3]] == '5')
//						|| (IDstr[Index[2]] == '3' && IDstr[Index[3]] == '9')
//						|| (IDstr[Index[2]] == '1' && IDstr[Index[3]] == '1')
//						|| (IDstr[Index[2]] == '1' && IDstr[Index[3]] == '2')
//						|| (IDstr[Index[2]] == '1' && IDstr[Index[3]] == '3')
//						|| (IDstr[Index[2]] == '2' && IDstr[Index[3]] == '2')
//						|| (IDstr[Index[2]] == '2' && IDstr[Index[3]] == '3')) {
//					if ((IDstr[Index[4]] == '0' && IDstr[Index[5]] == '1')
//							|| (IDstr[Index[4]] == '0' && IDstr[Index[5]] == '2')
//							|| (IDstr[Index[4]] == '0' && IDstr[Index[5]] == '9')
//							|| (IDstr[Index[4]] == '1' && IDstr[Index[5]] == '0')
//							|| (IDstr[Index[4]] == '4' && IDstr[Index[5]] == '9')) {
//						return OK;
//					}
//
//				} else
//					return ERR;
//
//			} else
//				return ERR;
//
//			if (IDstr[Index[6]] == '0' || IDstr[Index[6]] == '1'
//					|| IDstr[Index[6]] == '2' || IDstr[Index[6]] == '3'
//					|| IDstr[Index[6]] == '4' || IDstr[Index[6]] == '5'
//					|| IDstr[Index[6]] == '6') {
//				return OK;
//			}
//			// else return ERR;
//
//			if (IDstr[Index[7]] == '1' || IDstr[Index[7]] == '2'
//					|| IDstr[Index[7]] == '3' || IDstr[Index[7]] == '4'
//					|| IDstr[Index[7]] == '5') {
//				return OK;
//			}
//			if ((IDstr[Index[8]] == '0' && IDstr[Index[9]] == '0')
//					|| (IDstr[Index[8]] == '0' && IDstr[Index[9]] == '1')
//					|| (IDstr[Index[8]] == '0' && IDstr[Index[9]] == '2')
//					|| (IDstr[Index[8]] == '2' && IDstr[Index[9]] == '9')
//					|| (IDstr[Index[8]] == '3' && IDstr[Index[9]] == '0')) {
//				if ((IDstr[Index[10]] == '0' && IDstr[Index[11]] == '0')
//						|| (IDstr[Index[10]] == '0' && IDstr[Index[11]] == '1')
//						|| (IDstr[Index[10]] == '0' && IDstr[Index[11]] == '2')
//						|| (IDstr[Index[10]] == '3' && IDstr[Index[11]] == '1')
//						|| (IDstr[Index[10]] == '3' && IDstr[Index[11]] == '2')) {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 393 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireInfoSmoke_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * index1 + index2;
//			if (i >= 10 && i <= 11) {
//				return OK;
//			} else if (i >= 20 && i <= 22) {
//				return OK;
//			} else if (i == 90) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 394 ExtinguishFire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult ExtinguishFire_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int i = 100 * index1 + 10 * index2 + index3;
//			if (i >= 110 && i <= 114) {
//				return OK;
//			} else if (i >= 119 && i <= 122) {
//				return OK;
//			} else if (i >= 210 && i <= 214) {
//				return OK;
//			} else if (i >= 310 && i <= 323) {
//				return OK;
//			} else if (i >= 329 && i <= 333) {
//				return OK;
//			} else if (i >= 410 && i <= 413) {
//				return OK;
//			} else if (i >= 419 && i <= 423) {
//				return OK;
//			} else if (i == 100 || i == 129 || i == 180 || i == 190 || i == 200
//					|| i == 219 || i == 300 || i == 339 || i == 380 || i == 390
//					|| i == 400 || i == 429) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 90-商品条码——参与方位编码与条码表示 第13校验码
	// IDstr: 标识编码
	// LenID: 标识编码的长度 13位
	// Index: 调用验证算法的索引位置
	// LenIndex:13
	// creator:fdl
	public static FunctionResult CheckCodebarcode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 13) {
//				return ERR;
//			}
//			int sum = 0;
//			int sum1 = 0;// 偶数序号位上的数值和
//			int sum2 = 0;// 奇数序号位上的数值和
//			int dd = 0;// sum和整除中间数
//			int code = 0;// 最后一位验证码
//
//			for (int i = 1; i < 12; i++) {
//				if (i % 2 == 1) {
//					sum1 = sum1 + (IDstr[i]);
//					sum1 = sum1 - 48;// 字符转化为整形
//				}
//			}
//
//			sum1 = sum1 * 3;
//			for (int i = 0; i < 11; i++) {
//				if (i % 2 == 0) {
//					sum2 += IDstr[i];
//					sum2 = sum2 - 48;// 字符转化为整形
//				}
//			}
//
//			sum = sum1 + sum2;
//			dd = sum / 10;
//			dd += 1;
//			dd = dd * 10;
//			code = dd - sum;
//			if (code == 10) {
//				if ((int) IDstr[12] - 48 == 0) {
//					return OK;
//				}
//			}
//
//			if (code == (int) IDstr[12] - 48) {
//				return OK;
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 384 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireInfoBuild_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			// int Xx = 8;
//			int i = 10 * index1 + index2;
//			if (i >= 10 && i <= 14) {
//				return OK;
//			} else if (i >= 19 && i <= 25) {
//				return OK;
//			} else if (i >= 29 && i <= 32) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 381 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireInfoStstion_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * index1 + index2;
//			if (i >= 10 && i <= 12) {
//				return OK;
//			} else if (i == 20 || i == 60 || i == 70 || i == 80 || i == 90) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 362
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult PositionClass_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i3 = (int) IDstr[Index[2]] - 48;
//			if (i1 == 1) { // gongwuyuan
//				if (i2 >= 0 && i2 <= 4) {
//					if (i3 == 1 || i3 == 2) {
//						return OK;
//					}
//				}
//				if (i2 == 5 || i2 == 6) {
//					if (i3 == 0) {
//						return OK;
//					}
//				}
//				if (i2 == 9) {
//					if (i3 == 9) {
//						return OK;
//					}
//				}
//			}
//			if (i1 == 2) { // 职员级别
//				if (i2 >= 1 && i2 <= 4) {
//					if (i3 == 1 || i3 == 2) {
//						return OK;
//					}
//				}
//				if (i2 == 5 || i2 == 6) {
//					if (i3 == 0) {
//						return OK;
//					}
//				}
//				if (i2 == 9) {
//					if (i3 == 9) {
//						return OK;
//					}
//				}
//			}
//			if (i1 == 4) { // 专业技术职务级别
//				if (i2 == 1) {
//					if (i3 == 1 || i3 == 2 || i3 == 0) {
//						return OK;
//					}
//				}
//				if (i2 == 2) {
//					if (i3 == 0) {
//						return OK;
//					}
//				}
//				if (i2 == 3) {
//					if (i3 == 0 || i3 == 4 || i3 == 5) {
//						return OK;
//					}
//				}
//				if (i2 == 9) {
//					if (i3 == 9) {
//						return OK;
//					}
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 实现校验6位数物流编码
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:方丹丽
	// 校验例子码123450
	public static FunctionResult LogisticsCheck_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			int[] a = new int[6];
//			int sum = 0;
//			for (int i = 0; i < 6; i++) {
//				a[i] = IDstr[i] - 48;
//			}
//			sum = 5 * a[1] + 4 * a[2] + 3 * a[3] + 2 * a[4];
//
//			if (sum % 11 == a[5]) {
//				return OK;
//			}
//
//			return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 268-——珠全国人大政协机构分类代码编制方法 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度3位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult TheCenteralPartyCommitte_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 3; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff268(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 270——自然灾害Natural disaster
	// IDstr: 标识编码
	// LenID: 标识编码的长度6位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult Naturaldisaster_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 6) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 6; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff270(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 275—物流作业货物
	// IDstr: 标识编码
	// LenID: 标识编码的长度4位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult Logisticsoperation_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff275(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 276—废弃物品货物
	// IDstr: 标识编码
	// LenID: 标识编码的长度4位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult Wasteproducts_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff276(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 281-——珠宝玉石及金属材质分类代码编制方法 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度6位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult JadejewelryMaterialclassif_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 6) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 6; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariffMa281(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 365
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult EconomicCate_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i3 = (int) IDstr[Index[2]] - 48;
//			if (i1 == 1) {
//				if (i2 >= 0 && i2 <= 7 || i2 == 9) {
//					if (i3 == 0) {
//						return OK;
//					}
//				}
//				if (i2 == 4) {
//					if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 9) {
//						return OK;
//					}
//				}
//				if (i2 == 5) {
//					if (i3 == 1 || i3 == 9) {
//						return OK;
//					}
//				}
//				if (i2 == 7) {
//					if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5
//							|| i3 == 9) {
//						return OK;
//					}
//				}
//			}
//			if (i1 == 2) {
//				if (i2 >= 0 && i2 <= 4 || i2 == 9) {
//					if (i3 == 0) {
//						return OK;
//					}
//				}
//			}
//			if (i1 == 3) {
//				if (i2 >= 0 && i2 <= 4 || i2 == 9) {
//					if (i3 == 0) {
//						return OK;
//					}
//				}
//			}
//			if (i1 == 9) {
//				if (i2 == 0) {
//					if (i3 == 0) {
//						return OK;
//					}
//				}
//
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 367
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult CodeUnderCount_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i3 = (int) IDstr[Index[2]] - 48;
//			int i = 100 * i1 + 10 * i2 + i3;
//			if (i >= 0 && i <= 399) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 368
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult NonMotorVehicle_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i3 = (int) IDstr[Index[2]] - 48;
//			if (i1 == 7) {
//				if (i2 >= 1 && i2 <= 3) {
//					if (i3 == 0 || i3 == 1 || i3 == 2) {
//						return OK;
//					}
//				}
//				if (i2 == 0) {
//					if (i3 == 0) {
//						return OK;
//					}
//				}
//				if (i2 == 2) {
//					if (i3 == 3) {
//						return OK;
//					}
//				}
//			}
//			if (i1 == 8) {
//				if (i2 == 0) {
//					if (i3 == 0) {
//						return OK;
//					}
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 370
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult PoliticalCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + 1 * i2;
//			if (i >= 1 && i <= 13) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 206
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult CodeTobacco_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i3 = (int) IDstr[Index[2]] - 48;
//			int i = 100 * i1 + 10 * i2 + i3;
//			;
//			if (i >= 101 && i <= 113 && i != 110) {
//				return OK;
//			}
//			if (i == 203) {
//				return OK;
//			}
//			if (i >= 301 && i <= 319) {
//				return OK;
//			}
//			if (i >= 330 && i <= 341) {
//				return OK;
//			}
//			if (i >= 401 && i <= 409) {
//				return OK;
//			}
//			if (i >= 501 && i <= 504) {
//				return OK;
//			}
//			if (i == 521 || i == 522) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 245
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult CodeHighway_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			if (i1 == 1) {
//				if (i2 >= 0 && i2 <= 2) {
//					return OK;
//				}
//			}
//			if (i1 == 2) {
//				if (i2 >= 0 && i2 <= 3) {
//					return OK;
//				}
//			}
//			if (i1 == 3) {
//				if (i2 >= 0 && i2 <= 3) {
//					return OK;
//				}
//			}
//			if (i1 == 4) {
//				if (i2 >= 0 && i2 <= 2) {
//					return OK;
//				}
//			}
//			if (i1 == 5 || i1 == 9) {
//				if (i2 == 0) {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 246
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult CodeDiscillinary_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			if (i1 == 1) {
//				if (i2 >= 0 && i2 <= 4 || i2 == 7 || i2 == 9) {
//					return OK;
//				}
//			}
//			if (i1 == 2) {
//				if (i2 >= 0 && i2 <= 4) {
//					return OK;
//				}
//				if (i2 >= 7 && i2 <= 9) {
//					return OK;
//				}
//			}
//			if (i1 == 3) {
//				if (i2 >= 0 && i2 <= 7 || i2 == 9) {
//					return OK;
//				}
//			}
//			if (i1 == 4) {
//				if (i2 >= 0 && i2 <= 1) {
//					return OK;
//				}
//				if (i2 >= 7 && i2 <= 9) {
//					return OK;
//				}
//			}
//			if (i1 == 5) {
//				if (i2 >= 0 && i2 <= 1) {
//					return OK;
//				}
//				if (i2 >= 7 && i2 <= 9) {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 321
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult Climatic_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + 1 * i2;
//			if (i == 11) {
//				if (IDstr[Index[2]] == 'A') {
//					return OK;
//				}
//			}
//			if (i == 12) {
//				if (IDstr[Index[2]] == 'A' || IDstr[Index[2]] == 'B'
//						|| IDstr[Index[2]] == 'C' || IDstr[Index[2]] == 'D'
//						|| IDstr[Index[2]] == 'E') {
//					return OK;
//				}
//			}
//			if (i == 13) {
//				if (IDstr[Index[2]] == 'A' || IDstr[Index[2]] == 'B'
//						|| IDstr[Index[2]] == 'D' || IDstr[Index[2]] == 'E') {
//					return OK;
//				}
//			}
//			if (i == 21) {
//				if (IDstr[Index[2]] == 'A') {
//					return OK;
//				}
//			}
//			if (i == 22) {
//				if (IDstr[Index[2]] == 'A') {
//					return OK;
//				}
//			}
//			if (i == 23) {
//				if (IDstr[Index[2]] == 'A' || IDstr[Index[2]] == 'B') {
//					return OK;
//				}
//			}
//			if (i == 29) {
//				if (IDstr[Index[2]] == 'A') {
//					return OK;
//				}
//			}
//			if (i == 31) {
//				if (IDstr[Index[2]] == 'A' || IDstr[Index[2]] == 'B') {
//					return OK;
//				}
//			}
//			if (i == 32) {
//				if (IDstr[Index[2]] == 'A') {
//					return OK;
//				}
//			}
//			if (i == 33) {
//				if (IDstr[Index[2]] == 'A') {
//					return OK;
//				}
//			}
//			if (i == 41) {
//				if (IDstr[Index[2]] == 'D') {
//					return OK;
//				}
//			}
//			if (i == 42) {
//				if (IDstr[Index[2]] == 'A' || IDstr[Index[2]] == 'B'
//						|| IDstr[Index[2]] == 'C') {
//					return OK;
//				}
//			}
//			if (i == 43) {
//				if (IDstr[Index[2]] == 'A' || IDstr[Index[2]] == 'B'
//						|| IDstr[Index[2]] == 'C') {
//					return OK;
//				}
//			}
//			if (i == 44) {
//				if (IDstr[Index[2]] == 'B' || IDstr[Index[2]] == 'C') {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 266
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 1,2,3,4
	// creator: xjf
	public static FunctionResult FamilyRelationship_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenID == 1) {
//				int i1 = (int) IDstr[0] - 48;
//				if (i1 >= 0 && i1 <= 8) {
//					return OK;
//				}
//			}
//			if (LenID == 2) {
//				int i1 = (int) IDstr[0] - 48;
//				int i2 = (int) IDstr[1] - 48;
//				int i = 10 * i1 + 1 * i2;
//				if (i == 1 || i == 2) {
//					return OK;
//				}
//				if (i == 10 || i == 12 || i == 11) {
//					return OK;
//				}
//				if (i >= 20 && i <= 97 || i == 99) {
//					return OK;
//				}
//			}
//			if (LenID == 3) {
//				int i1 = (int) IDstr[0] - 48;
//				int i2 = (int) IDstr[1] - 48;
//				int i = 10 * i1 + 1 * i2;
//				int i3 = (int) IDstr[2] - 48;
//				if (i == 1 || i == 2) {
//					if (i3 >= 0 && i3 <= 8) {
//						return OK;
//					}
//				}
//				if (i == 10 || i == 12 || i == 11) {
//					if (i3 >= 0 && i3 <= 8) {
//						return OK;
//					}
//				}
//				if (i >= 20 && i <= 97 || i == 99) {
//					if (i3 >= 0 && i3 <= 8) {
//						return OK;
//					}
//				}
//			}
//			if (LenID == 4) {
//				int i1 = (int) IDstr[0] - 48;
//				int i2 = (int) IDstr[1] - 48;
//				int i = 10 * i1 + 1 * i2;
//				int flat = 0;
//				if (i == 1 || i == 2) {
//					flat = 0;
//				}
//				if (i == 10 || i == 12 || i == 11) {
//					flat = 0;
//				}
//				if (i >= 20 && i <= 97 || i == 99) {
//					flat = 0;
//				}
//				if (flat == 0) {
//					int i3 = (int) IDstr[2] - 48;
//					int i4 = (int) IDstr[3] - 48;
//					i = 10 * i3 + 1 * i4;
//					if (i == 1 || i == 2 || i == 0) {
//						return OK;
//					}
//					if (i == 10 || i == 12 || i == 11 || i == 0) {
//						return OK;
//					}
//					if (i >= 20 && i <= 97 || i == 99 || i == 0) {
//						return OK;
//					}
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 417 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: zll
	public static FunctionResult FirevehicleState_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 20 && i <= 27) {
//				return OK;
//			}
//			if (i1 == 9 || i1 == 1 || (i1 >= 3 && i1 <= 7)) {
//				if (i2 == 0) {
//					return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 420 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: zll
	public static FunctionResult FireCauseofcasuslty_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 01 && i <= 07) {
//				return OK;
//			}
//			if (i == 99) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 421 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult FireDisposalstate_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 01 && i <= 12) {
//				return OK;
//			}
//			if (i == 99) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 422 423 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult FireDevelopstateORcategory_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 1) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			if (i1 >= 1 && i1 <= 6) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 422 423 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult FireRating_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 1) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			if (i1 >= 1 && i1 <= 4) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 426 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult Firereading_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 1) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			if (i1 >= 1 && i1 <= 3) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 427 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult FirerescuePlan_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 1) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			if (i1 >= 1 && i1 <= 5) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 428 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 5
	// creator: xjf
	public static FunctionResult FireFightrescuePlan_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i2 = (int) IDstr[Index[2]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i3 = (int) IDstr[Index[3]] - 48;
//			int i4 = (int) IDstr[Index[4]] - 48;
//			int flag = 0;
//			int i = 10 * i1 + i2;
//			if (i0 == 0 && i3 == 0 && i4 == 0) {
//				flag = 1;
//			}
//			if (i >= 10 && i <= 15 && flag == 1) {
//				return OK;
//			}
//			if (i >= 19 && i <= 35 && flag == 1) {
//				return OK;
//			}
//			if (i >= 39 && i <= 40 && flag == 1) {
//				return OK;
//			}
//			if (i == 50 || i == 60 || i == 90 || i == 89) {
//				if (flag == 1) {
//					return OK;
//				}
//			}
//			if (i >= 70 && i <= 76 && flag == 1) {
//				return OK;
//			}
//			if (i >= 79 && i <= 85 && flag == 1) {
//				return OK;
//			}
//			if (i0 == 1 && i3 == 0 && i4 == 0 && i == 0) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 430 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult Firealarm_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 10 && i <= 13) {
//				return OK;
//			}
//			if (i >= 20 && i <= 23) {
//				return OK;
//			}
//			if (i == 29) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 436 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FireautomaticSystem_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 30 && i <= 32) {
//				return OK;
//			}
//			if (i >= 20 && i <= 22) {
//				return OK;
//			}
//			if (i >= 40 && i <= 43) {
//				return OK;
//			}
//			if (i == 10) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 437 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult Firelocation_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 10 && i <= 12 || i == 20) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 438 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult Fireconstructionlicence_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 10 && i <= 13 || i == 90) {
//				return OK;
//			}
//			if (i >= 19 && i <= 20) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 444 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 4
	// creator: xjf
	public static FunctionResult Firesupervisionenforcement_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i3 = (int) IDstr[Index[2]] - 48;
//			int i4 = (int) IDstr[Index[3]] - 48;
//			int i = 1000 * i1 + 100 * i2 + 10 * i3 + i4;
//			if (i >= 1000 && i <= 1003 || i == 1099) {
//				return OK;
//			}
//			if (i >= 2000 && i <= 2009 || i == 2099) {
//				return OK;
//			}
//			if (i >= 3000 && i <= 3003 || i == 3099) {
//				return OK;
//			}
//			if (i >= 4000 && i <= 4002 || i == 4099 || i == 9900) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 451 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 4
	// creator: xjf
	public static FunctionResult Fireexpert_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i3 = (int) IDstr[Index[2]] - 48;
//			int i4 = (int) IDstr[Index[3]] - 48;
//			int i = 1000 * i1 + 100 * i2 + 10 * i3 + i4;
//			int ii = 10 * i1 + i2;
//			if (i >= 100 && i <= 107) {
//				return OK;
//			}
//			if (i >= 199 && i <= 203) {
//				return OK;
//			}
//			if (i >= 299 && i <= 304) {
//				return OK;
//			}
//			if (i >= 399 && i <= 407) {
//				return OK;
//			}
//			if (i >= 499 && i <= 500 || i == 9900) {
//				return OK;
//			}
//			if (ii >= 6 && ii <= 18) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 453
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult Chemicalrisk_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i3 = (int) IDstr[Index[2]] - 48;
//			int i = 100 * i1 + 10 * i2 + 1 * i3;
//			if (i >= 100 && i <= 116) {
//				return OK;
//			}
//			if (i >= 199 && i <= 210) {
//				return OK;
//			}
//			if (i >= 299 && i <= 301 || i == 399) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 456
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 6
	// creator: xjf
	public static FunctionResult Casecharacer_Random(String curChars, String index) {        
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i3 = (int) IDstr[Index[2]] - 48;
//			int i4 = (int) IDstr[Index[3]] - 48;
//			int i5 = (int) IDstr[Index[4]] - 48;
//			int i6 = (int) IDstr[Index[5]] - 48;
//			int i = 10 * i1 + 1 * i2;
//			int ii = i3 + i4 + i5 + i6;
//			if (i >= 1 && i <= 11 && ii == 0) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 457
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult TypePractitioner_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 10 && i <= 13) {
//				return OK;
//			}
//			if (i >= 19 && i <= 23) {
//				return OK;
//			}
//			if (i >= 29 && i <= 30) {
//				return OK;
//			}
//			if (i == 40 || i == 99) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 460
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult RexreationMatetial_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 10 && i <= 11) {
//				return OK;
//			}
//			if (i >= 19 && i <= 24) {
//				return OK;
//			}
//			if (i >= 29 && i <= 33) {
//				return OK;
//			}
//			if (i >= 90 && i <= 93) {
//				return OK;
//			}
//			if (i == 39 || i == 99) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 462
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult StatuPractitioner_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * i1 + i2;
//			if (i >= 10 && i <= 13) {
//				return OK;
//			}
//			if (i >= 19 && i <= 20) {
//				return OK;
//			}
//			if (i == 90 || i == 99) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 463
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult Recreationplace_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i2 = (int) IDstr[Index[2]] - 48;
//			int i = 10 * i1 + 1 * i2;
//			if (i == 1 || i == 2) {
//				if (IDstr[Index[0]] == 'J' || IDstr[Index[0]] == 'H') {
//					return OK;
//				}
//			}
//			if (i == 99) {
//				if (IDstr[Index[0]] == 'J' || IDstr[Index[0]] == 'H') {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 464
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult PublicSecutity_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i2 = (int) IDstr[Index[2]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i = 10 * i1 + 1 * i2 + 100 * i0;
//			if (i >= 110 && i <= 117) {
//				return OK;
//			}
//			if (i >= 119 && i <= 122) {
//				return OK;
//			}
//			if (i >= 129 && i <= 131) {
//				return OK;
//			}
//			if (i >= 139 && i <= 142) {
//				return OK;
//			}
//			if (i == 100 || i == 149 || i == 199 || i == 200 || i == 300
//					|| i == 999) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 465.3
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 4
	// creator: xjf
	public static FunctionResult Borderinfo3_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i2 = (int) IDstr[Index[2]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i3 = (int) IDstr[Index[3]] - 48;
//			int i = 100 * i1 + 10 * i2 + 1000 * i0 + i3;
//			int a[] = { 100, 200, 300, 400, 401, 402, 403, 404, 500, 600, 2600,
//					2700, 7900, 8000, 9000 };
//			for (int ii = 0; ii < a.length; ii++) {
//				if (i == a[ii]) {
//					return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 465.4
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult Borderinfo4_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i = 10 * i0 + i1;
//			int a[] = { 11, 21, 22, 23, 31, 32, 33, 34, 99 };
//			for (int ii = 0; ii < a.length; ii++) {
//				if (i == a[ii]) {
//					return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 465.5
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult Borderinfo5_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i2 = (int) IDstr[Index[2]] - 48;
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i = 100 * i0 + 10 * i1 + i2;
//			int a[] = { 100, 101, 102, 199, 200, 210, 211, 212, 213, 219, 220,
//					221, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 249,
//					250, 251, 252, 253, 259, 299, 300, 301, 302, 303, 309 };
//			for (int ii = 0; ii < a.length; ii++) {
//				if (i == a[ii]) {
//					return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 465.6
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult Borderinfo6_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int i2 = (int) IDstr[Index[2]] - 48;
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i = 100 * i0 + 10 * i1 + i2;
//			if (i >= 101 && i <= 108) {
//				return OK;
//			}
//			if (i >= 201 && i <= 202) {
//				return OK;
//			}
//			if (i >= 300 && i <= 306) {
//				return OK;
//			}
//			if (i == 399 || i == 401 || i == 502 || i == 900) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 466.4
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult FianceManage_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i = 10 * i0 + 1 * i1;
//			if (i >= 41 && i <= 49) {
//				return OK;
//			}
//			if (i >= 55 && i <= 64) {
//				return OK;
//			}
//			if (i >= 75 && i <= 76) {
//				return OK;
//			}
//			if (i >= 80 && i <= 84) {
//				return OK;
//			}
//			if (i == 10 || i == 71 || i == 87 || i == 99 || i == 20 || i == 30) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 467
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: xjf
	public static FunctionResult FinanceSecManageInfo_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i = i1 + 10 * i0;
//			if (i >= 1 && i <= 9) {
//				return OK;
//			}
//
//			if (i == 19) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 503
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult ExplosiveCivilian_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i = i1 + 10 * i0;
//			if (i >= 1 && i <= 6) {
//				return OK;
//			}
//
//			if (i == 99) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: represent a decimal integer whose value range is from 000001 to
	// 999999
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult SixByteDecimalnt_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[2]] - 48;
//			int i3 = (int) IDstr[Index[3]] - 48;
//			int i4 = (int) IDstr[Index[4]] - 48;
//			int i5 = (int) IDstr[Index[5]] - 48;
//			int i = 100000 * i0 + 10000 * i1 + 1000 * i2 + 100 * i3 + 10 * i4
//					+ i5;
//			if (i >= 1 && i <= 999999) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 01-08 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 504
	public static FunctionResult OneTO08_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 8;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-09 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 504 509
	public static FunctionResult OneTO09_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 9;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-07 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 511
	public static FunctionResult OneTO07_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 7;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-05 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 512
	public static FunctionResult OneTO05_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 5;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-15 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 213
	public static FunctionResult OneTO15_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 15;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-13 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 213
	public static FunctionResult OneTO13_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 13;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-11 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 213
	public static FunctionResult OneTO11_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 11;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;
	}

	// Function: 01-14 99 98
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 214
	public static FunctionResult OneTO14_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 14;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99 || i == 98) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-39 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 225
	public static FunctionResult OneTO39_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 39;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-22 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 225
	public static FunctionResult OneTO22_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 22;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-10 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 225
	public static FunctionResult OneTO10_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 10;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-29 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 225
	public static FunctionResult OneTO29_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 29;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-21 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 225
	public static FunctionResult OneTO21_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 21;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-46 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes ?????2
	// Creator:???? 225
	public static FunctionResult OneTO46_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 46;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-72 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 225
	public static FunctionResult OneTO72_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 72;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99 || i == 90) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: ISO 7064:1983.MOD 37 36
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult MOD3736_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// ISO 7064:1983.MOD 11-2校验算法，字符串开辟空间时要多一位留给最后加校验位
//			double sum = 0; // 最后的校验码
//			int i, j;
//			int a;
//			a = 'A';
//			for (j = 0; j < LenIndex - 1; j++) {
//				for (i = 0; i < 26; i++) {
//					char c = (char) (a + i);
//					if ((int) IDstr[Index[j]] == c) {
//						IDstr[Index[j]] = (char) (10 + i);
//					}
//				}
//			}
//			for (i = 0; i < LenIndex - 1; i++) {
//				if (IDstr[Index[i]] > 47) {
//					IDstr[Index[i]] = (char) (IDstr[Index[i]] - 48);
//				}
//			}
//			int p = 36;
//			int s;
//			for (i = 1; i < LenIndex; i++) {
//				if ((p + (int) IDstr[Index[i - 1]]) % 36 == 0) {
//					s = 36;
//				} else {
//					s = (p + (int) IDstr[Index[i - 1]]) % 36;
//				}
//				p = (s * 2) % 37;
//			}
//			int mod;
//			mod = 37 - (p % 36); 
//			String numLetter = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//			char checkDigit = numLetter.charAt(mod);
//			if (checkDigit == IDstr[Index[LenIndex - 1]]) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	public static FunctionResult MOD1110_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// ISO 7064:1983.MOD 11-2校验算法，字符串开辟空间时要多一位留给最后加校验位
//			double sum = 0; // 最后的校验码
//			int i, j;
//			int b = LenIndex - 1;
//			int a;
//			a = 'A';
//			for (j = 0; j < LenIndex; j++) {
//				for (i = 0; i < 26; i++) {
//					char c = (char) (a + i);
//					if ((int) IDstr[Index[j]] == c) {
//						IDstr[Index[j]] = (char) (10 + i);
//					}
//				}
//			}
//			for (i = 0; i < LenIndex; i++) {
//				if (IDstr[Index[i]] > 47) {
//					IDstr[Index[i]] = (char) (IDstr[Index[i]] - 48);
//				}
//			}
//			int p = 10;
//			int s;
//			for (i = 1; i < LenIndex; i++) {
//				if ((p + (int) IDstr[Index[i - 1]]) % 10 == 0) {
//					s = 10;
//				} else {
//					s = (p + (int) IDstr[Index[i - 1]]) % 10;
//				}
//				p = (s * 2) % 11;
//			}
//
//			int mod;
//			mod = 11 - (p % 10);
//			if (mod == (int) IDstr[Index[4]]) {
//				return OK;
//			} else {
//
//				return ERR;
//
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: represent a decimal integer whose value range is from 0000 0001
	// to EFFF FFFF
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult VersionISAN_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//			int i, j;
//			int a;
//			int b = 0;
//			a = 'A';
//			for (j = 0; j < LenIndex; j++) {
//				for (i = 0; i < 26; i++) {
//					char c = (char) (a + i);
//					if ((int) IDstr[Index[j]] == c) {
//						IDstr[Index[j]] = (char) (10 + i);
//					}
//				}
//			}
//
//			for (i = 0; i < LenIndex; i++) {
//				if (IDstr[Index[i]] > 47) {
//					IDstr[Index[i]] = (char) (IDstr[Index[i]] - 48);
//				}
//				if ((int) IDstr[Index[i]] < 0 || (int) IDstr[Index[i]] > 15) {
//					return ERR;
//				}
//				if ((int) IDstr[Index[i]] == 0) {
//					b++;
//				}
//			}
//			if ((int) IDstr[Index[0]] == 15) {
//				return ERR;
//			}
//			if (b == 8) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:622校检位
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult VehicleIdenCode_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 16) {
//				return ERR;
//			}
//			int i, j;
//			int sum = 0;
//			int sum1 = 0;
//			for (i = 0; i < LenIndex; i++) {
//
//				if ((int) IDstr[Index[i]] == 'A') {
//					IDstr[Index[i]] = (char) 1;
//				}
//				if ((int) IDstr[Index[i]] == 'B') {
//					IDstr[Index[i]] = (char) 2;
//				}
//				if ((int) IDstr[Index[i]] == 'C') {
//					IDstr[Index[i]] = (char) 3;
//				}
//				if ((int) IDstr[Index[i]] == 'D') {
//					IDstr[Index[i]] = (char) 4;
//				}
//				if ((int) IDstr[Index[i]] == 'E') {
//					IDstr[Index[i]] = (char) 5;
//				}
//				if ((int) IDstr[Index[i]] == 'F') {
//					IDstr[Index[i]] = (char) 6;
//				}
//				if ((int) IDstr[Index[i]] == 'G') {
//					IDstr[Index[i]] = (char) 7;
//				}
//				if ((int) IDstr[Index[i]] == 'H') {
//					IDstr[Index[i]] = (char) 8;
//				}
//				if ((int) IDstr[Index[i]] == 'J') {
//					IDstr[Index[i]] = (char) 1;
//				}
//				if ((int) IDstr[Index[i]] == 'K') {
//					IDstr[Index[i]] = (char) 2;
//				}
//				if ((int) IDstr[Index[i]] == 'L') {
//					IDstr[Index[i]] = (char) 3;
//				}
//				if ((int) IDstr[Index[i]] == 'M') {
//					IDstr[Index[i]] = (char) 4;
//				}
//				if ((int) IDstr[Index[i]] == 'N') {
//					IDstr[Index[i]] = (char) 5;
//				}
//				if ((int) IDstr[Index[i]] == 'P') {
//					IDstr[Index[i]] = (char) 7;
//				}
//				if ((int) IDstr[Index[i]] == 'R') {
//					IDstr[Index[i]] = (char) 9;
//				}
//				if ((int) IDstr[Index[i]] == 'S') {
//					IDstr[Index[i]] = (char) 2;
//				}
//				if ((int) IDstr[Index[i]] == 'T') {
//					IDstr[Index[i]] = (char) 3;
//				}
//				if ((int) IDstr[Index[i]] == 'U') {
//					IDstr[Index[i]] = (char) 4;
//				}
//				if ((int) IDstr[Index[i]] == 'V') {
//					IDstr[Index[i]] = (char) 5;
//				}
//				if ((int) IDstr[Index[i]] == 'W') {
//					IDstr[Index[i]] = (char) 6;
//				}
//				if ((int) IDstr[Index[i]] == 'X') {
//					IDstr[Index[i]] = (char) 7;
//				}
//				if ((int) IDstr[Index[i]] == 'Y') {
//					IDstr[Index[i]] = (char) 8;
//				}
//				if ((int) IDstr[Index[i]] == 'Z') {
//					IDstr[Index[i]] = (char) 9;
//				}
//				if (IDstr[Index[i]] > 47) {
//					IDstr[Index[i]] = (char) (IDstr[Index[i]] - 48);
//				}
//				j = i + 1;
//				if (j < 8) {
//					sum1 = (9 - j) * (int) IDstr[Index[i]];
//				}
//				if (j == 8) {
//					sum1 = 10 * (int) IDstr[Index[i]];
//				}
//				if (j > 9) {
//					sum1 = (19 - j) * (int) IDstr[Index[i]];
//				}
//				sum = sum1 + sum;
//			}
//			int mod = sum % 11;
//			char check;
//			if (mod == 10) {
//				check = "X".charAt(0); // X表示10
//			} else {
//				String jieshou = Integer.toString(mod);
//				check = jieshou.charAt(0);
//			}
//			if (check == (IDstr[8])) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//
//		}
	}

	// Function: 校检位 乘以3或1 求
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长16
	// Creator:许江峰
	public static FunctionResult CommodityCodeCheck632_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// MOD 16-3校验算法，字符串开辟空间时要多一位留给最后加校验位
//			double sum = 0; // 最后的求校验码数值
//			int i;
//			int w = 0; // 权重
//			int h = 0; // 十进制
//			int j = 0;
//			for (i = 0; i < LenIndex - 1; i++) {
//				for (j = 0; j < LenIndex; j++) {
//					if (i == LenIndex - 2 - (2 * j)) {
//						w = 3;
//					}
//					if (i == LenIndex - 2 - (2 * j + 1)) {
//						w = 1;
//					}
//				}
//				sum = sum + (int) (IDstr[Index[i]] - 48) * w;
//			}
//			int cd = 10 - (int) (sum % 10);
//			if (cd == 10) {
//				cd = 0;
//			}
//			if (cd == (int) IDstr[Index[LenIndex - 1]] - 48) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 00-14 18 20 22 27 33 42
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰639
	public static FunctionResult ZeroTO14_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 14;
//		int i = 10 * index1 + index2;
//		if (i >= 0 && i <= Xx || i == 18 || i == 20 || i == 22 || i == 27
//				|| i == 33 || i == 42) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 00-24
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰654
	public static FunctionResult ZeroTO24_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 24;
//		int i = 10 * index1 + index2;
//		if (i >= 0 && i <= Xx) {
//			return OK;
//		} else
//			return ERR;
	}

	// Function: 00-60
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰654
	public static FunctionResult ZeroTO60_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//	
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 60;
//		int i = 10 * index1 + index2;
//		if (i >= 0 && i <= Xx) {
//			return OK;
//		} else
//			return ERR;
	}

	private static String getHexString(String hexString) {
		String hexStr = "";
		for (int i = hexString.length(); i < 4; i++) {
			if (i == hexString.length())
				hexStr = "0";
			else
				hexStr = hexStr + "0";
		}
		return hexStr + hexString;
	}

	public static String enUnicode(String content) { // 将汉字转换为16进制数
		String enUnicode = null;
		for (int i = 0; i < content.length(); i++) {
			if (i == 0) {
				enUnicode = getHexString(Integer.toHexString(content.charAt(i))
						.toUpperCase());
			} else {
				enUnicode = enUnicode
						+ getHexString(Integer.toHexString(content.charAt(i))
								.toUpperCase());
			}
		}
		return enUnicode;
	}

	// Function: 657 小写字母转2进制
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰657
	public static FunctionResult Xiaoxie_Random(String curChars, String index) {
        FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		int i;
//		String out = null;
//		int aa;
//		aa = 'a';
//		for (j = 0; j < LenIndex; j++) {
//			for (i = 0; i < 26; i++) {
//				char c = (char) (aa + i);
//				if ((int) IDstr[Index[j]] == c) {
//					IDstr[Index[j]] = (char) (i);
//				}
//				if ((int) IDstr[Index[j]] == 32) {
//					IDstr[Index[j]] = (char) (26);
//				}
//			}
//		}
//		int[] jie = new int[LenIndex];
//		for (i = 0; i < LenIndex; i++) {
//			j = (int) IDstr[Index[i]];
//			String a = Integer.toString(j); // 输入数值
//			BigInteger src = new BigInteger(a); // 转换为BigInteger类型
//			String bb = src.toString(2);
//			int bbb = Integer.parseInt(bb);
//			jie[i] = bbb;
//		}
//		for (i = 0; i < LenIndex; i++) {
//			j = jie[i];
//			String bb = Integer.toString(j); // 输入数值
//			if (bb.length() == 1) {
//				bb = "0000" + bb;
//			}
//			if (bb.length() == 2) {
//				bb = "000" + bb;
//			}
//			if (bb.length() == 3) {
//				bb = "00" + bb;
//			}
//			if (bb.length() == 4) {
//				bb = "0" + bb;
//			}
//			if (i == 0) {
//				out = bb;
//			} else {
//				out += bb;
//			}
//		}
//		return OK;
	}

	// Function: 657 大写字母转2进制
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰657
	public static FunctionResult Daxie_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		int i;
//		String out = null;
//		int aa;
//		aa = 'A';
//		for (j = 0; j < LenIndex; j++) {
//			for (i = 0; i < 26; i++) {
//				char c = (char) (aa + i);
//				if ((int) IDstr[Index[j]] == c) {
//					IDstr[Index[j]] = (char) (i);
//				}
//				if ((int) IDstr[Index[j]] == 32) {
//					IDstr[Index[j]] = (char) (26);
//				}
//			}
//		}
//		int[] jie = new int[LenIndex];
//		for (i = 0; i < LenIndex; i++) {
//			j = (int) IDstr[Index[i]];
//			String a = Integer.toString(j); // 输入数值
//			BigInteger src = new BigInteger(a); // 转换为BigInteger类型
//			String bb = src.toString(2);
//			int bbb = Integer.parseInt(bb);
//			jie[i] = bbb;
//		}
//		for (i = 0; i < LenIndex; i++) {
//			j = jie[i];
//			String bb = Integer.toString(j); // 输入数值
//			if (bb.length() == 1) {
//				bb = "0000" + bb;
//			}
//			if (bb.length() == 2) {
//				bb = "000" + bb;
//			}
//			if (bb.length() == 3) {
//				bb = "00" + bb;
//			}
//			if (bb.length() == 4) {
//				bb = "0" + bb;
//			}
//			if (i == 0) {
//				out = bb;
//			} else {
//				out += bb;
//			}
//		}
//		return OK;
	}

	// Function: 657 数字字母转2进制
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰657
	public static FunctionResult Hunpai_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		int i;
//		String out = null;
//		int aa, aaa, aaaa;
//		aa = 'A';
//		aaa = 'a';
//		aaaa = '0';
//		for (j = 0; j < LenIndex; j++) {
//			for (i = 0; i < 26; i++) {
//				char c = (char) (aa + i);
//				char cc = (char) (aaa + i);
//				if ((int) IDstr[Index[j]] == c) {
//					IDstr[Index[j]] = (char) (i + 10);
//				}
//				if ((int) IDstr[Index[j]] == cc) {
//					IDstr[Index[j]] = (char) (i + 36);
//				}
//				if ((int) IDstr[Index[j]] == 32) {
//					IDstr[Index[j]] = (char) (62);
//				}
//			}
//			for (i = 0; i < 10; i++) {
//				char ccc = (char) (aaaa + i);
//				if ((int) IDstr[Index[j]] == ccc) {
//					IDstr[Index[j]] = (char) (IDstr[Index[j]] - 48);
//				}
//			}
//		}
//		int[] jie = new int[LenIndex];
//		for (i = 0; i < LenIndex; i++) {
//			j = (int) IDstr[Index[i]];
//			String a = Integer.toString(j); // 输入数值
//			BigInteger src = new BigInteger(a); // 转换为BigInteger类型
//			String bb = src.toString(2);
//			int bbb = Integer.parseInt(bb);
//			jie[i] = bbb;
//		}
//		for (i = 0; i < LenIndex; i++) {
//			j = jie[i];
//			String bb = Integer.toString(j); // 输入数值
//			if (bb.length() == 1) {
//				bb = "0000" + bb;
//			}
//			if (bb.length() == 2) {
//				bb = "000" + bb;
//			}
//			if (bb.length() == 3) {
//				bb = "00" + bb;
//			}
//			if (bb.length() == 4) {
//				bb = "0" + bb;
//			}
//			if (i == 0) {
//				out = bb;
//			} else {
//				out += bb;
//			}
//		}
//		return OK;
	}

	// Function: 657 数字模式转2进制
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰657
	public static FunctionResult figure_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j = 0;
//		int i, ii = 0;
//		int leg;
//		String out = null; // 用于接受或判断
//		if (LenIndex % 3 != 0) {
//			leg = LenIndex / 3 + 1;
//		} else {
//			leg = LenIndex / 3;
//		}
//		int legg = leg * 3;
//		int[] jie = new int[leg];
//		char[] newIDstr = new char[legg]; // 接受数字
//		int[] GB = new int[leg]; // 接受 特殊符号
//		int[] GB1 = new int[leg]; // 接受特殊符号所在的位置
//		for (i = 0; i < LenIndex; i++) {
//			if (IDstr[Index[i]] > 47) {
//				newIDstr[j] = (char) (IDstr[Index[i]] - 48);
//				j++;
//			} else {
//				if (IDstr[Index[i]] == 32) {
//					if ((i - 4 * ii) % 3 == 0) {
//						GB[ii] = 1000;
//					}
//					if ((i - 4 * ii) % 3 == 1) {
//						GB[ii] = 1001;
//					}
//					if ((i - 4 * ii) % 3 == 2) {
//						GB[ii] = 1002;
//					}
//				}
//				if (IDstr[Index[i]] == 43) {
//					if ((i - 4 * ii) % 3 == 0) {
//						GB[ii] = 1003;
//					}
//					if ((i - 4 * ii) % 3 == 1) {
//						GB[ii] = 1004;
//					}
//					if ((i - 4 * ii) % 3 == 2) {
//						GB[ii] = 1005;
//					}
//				}
//				if (IDstr[Index[i]] == 45) {
//					if ((i - 4 * ii) % 3 == 0) {
//						GB[ii] = 1006;
//					}
//					if ((i - 4 * ii) % 3 == 1) {
//						GB[ii] = 1007;
//					}
//					if ((i - 4 * ii) % 3 == 2) {
//						GB[ii] = 1008;
//					}
//				}
//				if (IDstr[Index[i]] == 46) {
//					if ((i - 4 * ii) % 3 == 0) {
//						GB[ii] = 1009;
//					}
//					if ((i - 4 * ii) % 3 == 1) {
//						GB[ii] = 1010;
//					}
//					if ((i - 4 * ii) % 3 == 2) {
//						GB[ii] = 1011;
//					}
//				}
//				if (IDstr[Index[i]] == 44) {
//					if ((i - 4 * ii) % 3 == 0) {
//						GB[ii] = 1012;
//					}
//					if ((i - 4 * ii) % 3 == 1) {
//						GB[ii] = 1013;
//					}
//					if ((i - 4 * ii) % 3 == 2) {
//						GB[ii] = 1014;
//					}
//				}
//				GB1[ii] = i;
//				ii++;
//			}
//
//		}
//		int bu0;
//		if (j % 3 != 0) {
//			leg = j / 3 + 1;
//			bu0 = 3 - j % 3;
//		} else {
//			leg = j / 3;
//			bu0 = j % 3;
//		}
//		int bu = leg * 3 - i;
//		for (j = 0; j < bu; j++) {
//			if (bu != 0) {
//				newIDstr[i] = (char) (0);
//				i++;
//			}
//		}
//		int legleg = leg;
//		for (i = 0; i < leg; i++) {
//			jie[i] = 100 * (int) newIDstr[3 * i] + 10
//					* (int) newIDstr[3 * i + 1] + (int) newIDstr[3 * i + 2];
//		}
//		int jj = 0;
//		int[] GB2 = new int[leg]; // 接受特殊符号所在10进制的的位置
//		leg = 0;
//		for (j = 0; j < ii; j++) {
//			if (leg != 0) {
//				leg = GB1[j] / 3 + 1;
//				GB2[j] = leg;
//			} else {
//				leg = GB1[j] / 3;
//				GB2[j] = leg;
//				leg = 1;
//			}
//		}
//		leg = legleg;
//		int[] newgb = new int[leg + ii]; // 全新的数值来接受所有的10进制
//		jj = 0; // 由于接受GB中的位
//		for (i = 0; i < leg + ii; i++) {
//			j++;
//			if (ii != 0) {
//				for (j = 0; j < ii; j++) {
//					if (i == GB2[j]) {
//						newgb[i] = GB[jj];
//						jj++;
//						i++;
//						newgb[i] = jie[i - jj];
//						break;
//					} else {
//						newgb[i] = jie[i - jj];
//					}
//				}
//			} else {
//				newgb[i] = jie[i];
//			}
//		}
//		int[] Two = new int[leg + ii]; // 接受转换成的2进制数组
//		for (i = 0; i < leg + ii; i++) {
//			j = (int) newgb[i];
//			String a = Integer.toString(j); // 输入数值
//			BigInteger src = new BigInteger(a); // 转换为BigInteger类型
//			String bb = src.toString(2);
//			int bbb = Integer.parseInt(bb);
//			Two[i] = bbb;
//		}
//		for (i = 0; i < leg + ii; i++) {
//			j = Two[i];
//			String bb = Integer.toString(j); // 输入数值
//			if (bb.length() == 5) {
//				bb = "00000" + bb;
//			}
//			if (bb.length() == 6) {
//				bb = "0000" + bb;
//			}
//			if (bb.length() == 7) {
//				bb = "000" + bb;
//			}
//			if (bb.length() == 8) {
//				bb = "00" + bb;
//			}
//			if (bb.length() == 9) {
//				bb = "0" + bb;
//			}
//			if (i == 0) {
//				out = bb;
//			} else {
//				out += bb;
//			}
//		}
//		if (bu0 == 1) {
//			out = "01" + out;
//		} else if (bu0 == 2) {
//			out = "10" + out;
//		} else if (bu0 == 0) {
//			out = "00" + out;
//		} else {
//			out = "11" + out;
//		}
//		return OK;
	}

	// Function: 校检位
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰664
	public static FunctionResult Check4BitBarCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int i;
//		int[] newIDstr = new int[LenIndex];
//		for (i = 0; i < LenIndex; i++) {
//			newIDstr[i] = (int) (IDstr[Index[i]] - 48);
//		}
//		// 用于2-的第一位
//		int a = newIDstr[1];
//		int b = 0; // 用于接受加权值?
//		if (a * 2 < 10) {
//			b = a * 2;
//		} else if (a * 2 > 9) {
//			b = (a * 2 - 1) % 10;
//		}
//		// 用于2-的第二位
//		int a2 = newIDstr[2];
//		int b2 = 0; // 用于接受加权值
//		if (a2 * 2 < 10) {
//			b2 = a2 * 2;
//		} else if (a2 * 2 > 9) {
//			b2 = (a2 * 2 - 1) % 10;
//		}
//		// 用于3的第三位
//		int a3 = newIDstr[3];
//		int b3 = 0; // 用于接受加权值
//		if (a3 * 3 < 10) {
//			b3 = a3 * 3;
//		} else if (a3 * 3 > 9) {
//			b3 = (a3 * 3) % 10;
//		}
//		// 用于5-的第四位
//		int a4 = newIDstr[4];
//		int b4 = 0; // 用于接受加权值
//		if (a4 * 5 < 10) {
//			b4 = a4 * 5;
//		} else if (a4 * 5 > 9) {
//			b4 = ((a4 * 5) - (int) Math.floor((a4 * 5) / 10)) % 10;
//		}
//		int check;
//		check = ((b + b2 + b3 + b4) * 3) % 10;
//		if (check == newIDstr[0]) {
//			return OK;
//		} else {
//			return ERR;
//		}
	}

	// Function: 校检位
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰664
	public static FunctionResult Check5BitBarCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int i;
//		int[] newIDstr = new int[LenIndex];
//		for (i = 0; i < LenIndex; i++) {
//			newIDstr[i] = (int) (IDstr[Index[i]] - 48);
//		}
//		// 用于2-的第五位
//		int a = newIDstr[5];
//		int b = 0; // 用于接受加权值
//		if (a * 2 < 10) {
//			b = a * 2;
//		} else if (a * 2 > 9) {
//			b = (a * 2 - 1) % 10;
//		}
//		// 用于2-的第二位
//		int a2 = newIDstr[2];
//		int b2 = 0; // 用于接受加权值
//		if (a2 * 2 < 10) {
//			b2 = a2 * 2;
//		} else if (a2 * 2 > 9) {
//			b2 = (a2 * 2 - 1) % 10;
//		}
//		// 用于5+的第一位
//		int a1 = newIDstr[1];
//		int b1 = 0; // 用于接受加权值
//		if (a1 * 5 < 10) {
//			b1 = a1 * 5;
//		} else if (a1 * 5 > 9) {
//			b1 = ((a1 * 5) + (int) Math.floor((a1 * 5) / 10)) % 10;
//		}
//		// 用于5+的第四位
//		int a3 = newIDstr[4];
//		int b3 = 0; // 用于接受加权值
//		if (a3 * 5 < 10) {
//			b3 = a3 * 5;
//		} else if (a3 * 5 > 9) {
//			b3 = ((a3 * 5) + (int) Math.floor((a3 * 5) / 10)) % 10;
//		}
//		// 用于5-的第三位
//		int a4 = newIDstr[3];
//		int b4 = 0; // 用于接受加权值
//		if (a4 * 5 < 10) {
//			b4 = a4 * 5;
//		} else if (a4 * 5 > 9) {
//			b4 = ((a4 * 5) - (int) Math.floor((a4 * 5) / 10)) % 10;
//		}
//		int check;
//		check = 10 - (((b + b2 + b3 + b4 + b1)) % 10);
//		// 用于5-的校检位
//		int a0 = newIDstr[0];
//		int b0 = 0; // 用于接受加权值
//		if (a0 * 5 < 10) {
//			b0 = a0 * 5;
//		} else if (a0 * 5 > 9) {
//			b0 = ((a0 * 5) - (int) Math.floor((a0 * 5) / 10)) % 10;
//		}
//		if (check == b0) {
//			return OK;
//		} else {
//			return ERR;
//		}
	}
	
	// Function:681
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult FlavorSubstance_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenID == 4) {
//				int i = ((int) IDstr[Index[1]] - 48) * 100
//						+ ((int) IDstr[Index[2]] - 48) * 10
//						+ ((int) IDstr[Index[3]] - 48);
//				if ((int) IDstr[Index[0]] == 'N') {
//					if (i > 0 && i < 378) {
//						return OK;
//					}
//				} else {
//					return ERR;
//				}
//			} else if (LenID == 5) {
//				int j = ((int) IDstr[Index[1]] - 48) * 1000
//						+ ((int) IDstr[Index[2]] - 48) * 100
//						+ ((int) IDstr[Index[3]] - 48) * 10
//						+ ((int) IDstr[Index[4]] - 48);
//
//				if ((int) IDstr[Index[0]] == 'I') {
//					if (j > 1000 && j < 2087) {
//						return OK;
//					}
//				} else if ((int) IDstr[Index[0]] == 'A') {
//					if (j > 3000 && j < 3212) {
//						return OK;
//					}
//				} else {
//					return ERR;
//				}
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
//		return ERR;
	}

	// Function: 757 表59 值 10 11 12 20
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: xjf
	public static FunctionResult Highway59_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * index1 + index2;
//			if (i == 10 || i == 11 || i == 12 || i == 20) {
//				return OK;
//			}
//
//			else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 01-11 90
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult OneTO11and90_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int Xx = 11;
//			int i = 10 * index1 + index2;
//			if (i >= 01 && i <= Xx || i == 90) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	
	// Function: 10 11 12 19 20 21 22 29 30
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult HighwayTransportationB9_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int i = 10 * index1 + index2;
//		if (i >= 10 && i <= 12 || i == 19) {
//			return OK;
//		} else if (i >= 20 && i <= 22 || i == 29 || i == 30) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: jt/t 444--201 biao C3
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长4
	// Creator:许江峰
	public static FunctionResult HighwayTransportationC3_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int index3 = (int) IDstr[Index[2]] - 48;
//		int index4 = (int) IDstr[Index[3]] - 48;
//		int i = 10 * index1 + index2;
//		int j = 10 * index3 + index4;
//		if (i >= 1 && i <= 17 && j == 0) {
//			return OK;
//		} else if (i == 8 && j == 10) {
//			return OK;
//		} else if (i == 15 && j == 20) {
//			return OK;
//		} else if (i == 16 && j == 10) {
//			return OK;
//		} else
//			return ERR;
	}

	// Function: jt/t 444--201 biao C6
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult HighwayTransportationC6_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int i = 10 * index1 + index2;
//		if (i >= 10 && i <= 12) {
//			return OK;
//		} else if (i >= 20 && i <= 23) {
//			return OK;
//		} else if (i >= 30 && i <= 33) {
//			return OK;
//		} else if (i >= 40 && i <= 42) {
//			return OK;
//		} else if (i == 80 || i == 90) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: jt/t 430
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult Porttariff_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int i = (int) IDstr[Index[0]] - 48;
//		int j = (int) IDstr[Index[1]] - 48;
//		if (i >= 0 && i <= 5 && j == 0) {
//			return OK;
//		} else if (i == 3 && j >= 0 && j <= 4) {
//			return OK;
//		} else
//			return ERR;
	}

	// Function: jt/t 430
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult Porttariff4_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int i = (int) IDstr[Index[0]] - 48;
//		int j = (int) IDstr[Index[1]] - 48;
//		if (i >= 1 && i <= 3 && j == 0) {
//			return OK;
//		} else if (i == 6 && j == 0) {
//			return OK;
//		} else if (i == 6 && j == 1) {
//			return OK;
//		} else if (i == 6 && j == 2) {
//			return OK;
//		} else if (i == 6 && j == 9) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: jt/t 430
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult Porttariff10_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int index3 = (int) IDstr[Index[2]] - 48;
//		int i = 100 * index1 + 10 * index2 + index3;
//
//		if (i >= 110 && i <= 112) {
//			return OK;
//		} else if (i >= 120 && i <= 122) {
//			return OK;
//		} else if (i == 100) {
//			return OK;
//		} else if (i == 200) {
//			return OK;
//		} else if (i == 300) {
//			return OK;
//		} else if (i == 310) {
//			return OK;
//		} else if (i == 320) {
//			return OK;
//		} else
//			return ERR;
	}

	// Function: 01-24 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult OneoTO24_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 24;
//		int i = 10 * index1 + index2;
//		if (i >= 1 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;
	}

	// Function: 01-17
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult OneTO17_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 17;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-17,99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult OneTO17NO99_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 17;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-12
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult OneTO12No99_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 12;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-13
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰
	public static FunctionResult OneTO13No99_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 13;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 两位或四位
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult TwoOrFour_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		if (LenIndex == 2) {
//			int i = 10 * index1 + index2;
//			if (i >= 00 && i <= 99) {
//				return OK;
//			} else
//				return ERR;
//		}
//		if (LenIndex == 4) {
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int index4 = (int) IDstr[Index[3]] - 48;
//			int i = 1000 * index1 + 100 * index2 + 10 * index3 + index4;
//			if (i >= 00 && i <= 9999) {
//				return OK;
//			} else
//				return ERR;
//
//		}
//		return ERR;
	}

	// Function: 910 中的表15
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table15_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int i = 10 * index1 + index2;
//		if (i == 1) {
//			if (LenID == 13) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 2) {
//			if (LenID == 13) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 3) {
//			if (LenID == 14) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 4) {
//			if (LenID == 13) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 5) {
//			if (LenID == 11) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 6) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 7) {
//			if (LenID == 11) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 8) {
//			if (LenID == 15) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 9) {
//			if (LenID == 10) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 10) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 11) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 12) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 13) {
//			if (LenID == 10) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: 910 中的表18
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table18_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = (int) IDstr[Index[0]] - 48;
//		if (i == 2) {
//			if (LenID == 8) {
//				return OK;
//			} else
//				return ERR;
//		} else {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//
//		}
	}

	// Function: 910 中的表19
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table19_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = (int) IDstr[Index[0]] - 48;
//		if (i == 1) {
//			if (LenID == 10) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 2) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: 910 中的表20
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table20_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = (int) IDstr[Index[1]] - 48;
//		if (i == 1 || i == 2 || i == 5) {
//			if (LenID == 13) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 6) {
//			if (LenID == 8) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 3 || i == 4) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品 之标准件
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table17_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int i = 10 * index1 + index2;
//		if (i == 3) {
//			if (LenID == 15) {
//				return OK;
//			} else
//				return ERR;
//		} else {
//			if (LenID == 18) {
//				return OK;
//			} else
//				return ERR;
//		}
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table22
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table22_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = (int) IDstr[Index[0]] - 48;
//		if (i == 1) {
//			if (LenID == 11) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 2) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table27
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table27_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = (int) IDstr[Index[1]] - 48;
//		if (i == 1) {
//			if (LenID == 14) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 2) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table28
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table28_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = (int) IDstr[Index[1]] - 48;
//		if (i == 1 || i == 3) {
//			if (LenID == 8) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 2) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table29
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table29_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = (int) IDstr[Index[1]] - 48;
//		if (i == 1 || i == 2 || i == 5 || i == 7) {
//			if (LenID == 8) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 3) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 6) {
//			if (LenID == 7) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 4) {
//			if (LenID == 13) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table30
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table30_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = ((int) IDstr[Index[1]] - 48) + 10
//				* ((int) IDstr[Index[0]] - 48);
//		if (i == 1 || i == 3) {
//			if (LenID == 11) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 6) {
//			if (LenID == 10) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 4) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 7 || i == 8) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 9 || i == 10 || i == 11 || i == 12) {
//			if (LenID == 8) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 6) {
//			if (LenID == 7) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 5) {
//			if (LenID == 6) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table31
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table31_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = ((int) IDstr[Index[1]] - 48) + 10
//				* ((int) IDstr[Index[0]] - 48);
//		if (i == 1 || i == 2) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 4) {
//			if (LenID == 11) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 7) {
//			if (LenID == 10) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 3 || i == 6 || i == 9) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 5 || i == 8) {
//			if (LenID == 8) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table32
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table32_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = ((int) IDstr[Index[1]] - 48) + 10
//				* ((int) IDstr[Index[0]] - 48);
//		if (i == 1 || i == 2) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 4 || i == 3) {
//			if (LenID == 11) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 5) {
//			if (LenID == 7) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table34
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table34_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = ((int) IDstr[Index[1]] - 48) + 10
//				* ((int) IDstr[Index[0]] - 48);
//		if (i == 1) {
//			if (LenID == 15) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 2) {
//			if (LenID == 14) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 4) {
//			if (LenID == 13) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 5 || i == 7) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 3 || i == 6) {
//			if (LenID == 11) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 8) {
//			if (LenID == 10) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 9 || i == 10 || i == 11) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table35
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table35_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = ((int) IDstr[Index[1]] - 48) + 10
//				* ((int) IDstr[Index[0]] - 48);
//		if (i == 1 || i == 2) {
//			if (LenID == 10) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 3 || i == 4) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table38
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table38_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = ((int) IDstr[Index[1]] - 48) + 10
//				* ((int) IDstr[Index[0]] - 48);
//		if (i == 1) {
//			if (LenID == 14) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 2) {
//			if (LenID == 15) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 3) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table41
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table41_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = ((int) IDstr[Index[1]] - 48) + 10
//				* ((int) IDstr[Index[0]] - 48);
//		if (i == 1 || i == 2) {
//			if (LenID == 11) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 3) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 9) {
//			if (LenID == 5) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: DL/T 700.2-1999第二部分 机电产品table43
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:许江峰
	public static FunctionResult Table43_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		int j;
//		for (j = 0; j < LenID; j++) {
//			if (((int) IDstr[Index[j]] - 48) >= 0
//					&& ((int) IDstr[Index[j]] - 48) <= 9) {
//				return OK;
//			} else
//				return ERR;
//		}
//		int i = ((int) IDstr[Index[1]] - 48) + 10
//				* ((int) IDstr[Index[0]] - 48);
//		if (i == 14) {
//			if (LenID == 14) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8) {
//			if (LenID == 13) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 6 || i == 12 || i == 1) {
//			if (LenID == 12) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 9 || i == 10 || i == 11 || i == 13) {
//			if (LenID == 11) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 15) {
//			if (LenID == 9) {
//				return OK;
//			} else
//				return ERR;
//		} else if (i == 9) {
//			if (LenID == 6) {
//				return OK;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	// Function: 01-03 99
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 504
	public static FunctionResult OneTO03_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 3;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 99) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 01-40
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:许江峰 504
	public static FunctionResult OneTO42No99_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 99;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function: 粮食信息分类与编码 粮食贸易业务统计分类与代码(14)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为6
	// creator: zll
	public static FunctionResult FoodTrade_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getFoodTrade(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食加工(18)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为5
	// creator: zll
	public static FunctionResult FoodEconomy_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getFoodEconomy(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食仓储业务统计分类与代码(16)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为8
	// creator: zll
	public static FunctionResult GainStoreHouse_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainStoreHouse(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 储粮病虫害分类与代码(17)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为5
	// creator: zll
	public static FunctionResult GainsDiseases_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainsDiseases(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食加工第1部分：加工作业分类与代码(19)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为8
	// creator: zll
	public static FunctionResult GainsProcess_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainsProcess(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食仓储第3部分：器材分类与代码(20)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为4
	// creator: zll
	public static FunctionResult GainsEquipment_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainsEquipment(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食仓储第2部分：粮情检测分类与代码(21)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为3
	// creator: zll
	public static FunctionResult GainsConditionDetection_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainConditionDetection(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食仓储第1部分：仓储作业分类与代码(22)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为5或者6
	// creator: zll
	public static FunctionResult GrainsSmartWMS_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 5 || LenID == 6)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getgrainsSmartWMS(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食检验第2部分：质量标准分类与代码(26)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为8
	// creator: zll
	public static FunctionResult GrainsQualityStandard_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainsQualityStandard(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 计量器具命名与分类编码(32)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为8
	// creator: zll
	public static FunctionResult MeasuringInstrument_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMeasuringInstrument(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食检验 第1部分：指标分类与代码(27)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为8
	// creator: zll
	public static FunctionResult GrainsIndex_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainsIndex(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食及加工产品分类与代码(28)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为7
	// creator: zll
	public static FunctionResult GrainsInformation_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 7) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainsInformation(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食属性分类与代码(29)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为3
	// creator: zll
	public static FunctionResult GrainsAttribute_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainsAttribute(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食企业分类与代码(30)中的前两位判断，数值范围为10,11,19,30
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为2
	// creator: zll
	public static FunctionResult GrainEnterprise_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			if (code.equals("10") || code.equals("11") || code.equals("19")
//					|| code.equals("30")) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 粮食信息分类与编码 粮食行政、事业机构及社会团体分类与代码(31)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为6
	// creator: zll
	public static FunctionResult GrainAdministrative_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGrainsAdministrative(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 建筑产品分类和代码(34)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度必为5
	// creator: zll
	public static FunctionResult ConstructionProducts_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getConstructionProducts(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 承运人标识符编码规则，直接满足正则表达式(44)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度11-17
	// creator: zll
	public static FunctionResult CarrierIdentifier_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			String regex = "[a-zA-Z0-9]{1,7}[0-9]{3}[A-D][0-9]{6}";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 导航电子地图数据分类与编码(45)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:变长，最小长度4
	// creator: zll
	public static FunctionResult ElectronicMap_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// if (LenIndex != 4) {
//			// return ERR;
//			// }
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getElectronicMap(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 电子收费关键信息编码(46)，前4位为两个汉字\u4e00-\u9fa5
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度8
	// creator: zll
	public static FunctionResult ChineseCharRegex_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			String regex = "(4[E-F,e-f][0-9,A-F,a-f]{2}|[5-8,A-F,a-f][0-9,A-F,a-f]{3}|9[0-9,A-E,a-e]][0-9,A-F,a-f]{2}|9[F,f][0-9][0-9,A-F,a-f]|9[F,f][a,A][0-5]){2}";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 判断2个字节是不是属于(01-53)
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes, 固定为2
	// creator: helinjia
	public static FunctionResult TwobytleWeekCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = Index[0];
//			int index2 = Index[1];
//
//			if (IDstr[index1] >= '1' && IDstr[index1] <= '4') {
//				if (IDstr[index2] >= '0' && IDstr[index2] <= '9') {
//					return OK;
//				}
//			}
//
//			if (IDstr[index1] == '0') {
//				if (IDstr[index2] >= '1' && IDstr[index2] <= '9') {
//					return OK;
//				}
//			}
//			if (IDstr[index1] == '5') {
//				if (IDstr[index2] >= '0' && IDstr[index2] <= '3') {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 地理信息分类与编码规则(56)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度5
	// creator: zll
	public static FunctionResult GeographicInformation_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGeographicInformation(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 地理信息分类与编码规则(56)中的属性码为不定长数字
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:不定长
	// creator: zll
	public static FunctionResult GeographicPropertyRegex_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			String regex = "\\d+";
//			int prefix = 10;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 数字城市地理信息公共平台，正整数(62)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:不定长
	// creator: zll
	public static FunctionResult DigitRegex_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			String regex = "[0-9]*[1-9][0-9]*";
//			int prefix = 14;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 纺织面料编码化纤部分(64)纺织面料名称代码
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度为5
	// creator: zll
	public static FunctionResult TextileFabricNameCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTextileFabricNameCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 纺织面料编码化纤部分(64)纺织面料属性代码X1X2
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度为2
	// creator: zll
	public static FunctionResult PropertiesMain_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPropertiesMainMaterial(code);
//			boolean retMain = recoDao.getPropertiesMain(code);
//			if (ret || retMain) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 纺织面料编码化纤部分(64)纤维特征 X3X4
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度为2
	// creator: zll
	public static FunctionResult PropertiesFiberCharacteristics_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPropertiesFiberCharacteristics(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 纺织面料属性代码(64)X7X8纤网固结方式,另外可能为[1-3,9],[1-3,9]
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度为2
	// creator: zll
	public static FunctionResult PropertiesMix_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			String regex = "[1-3,9]{2}";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPropertiesMix(code);
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean retRegex = ma.matches();
//			if (ret || retRegex) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 纺织面料属性代码(64)X9X10 3种可能01-19,99 01-09,99 01-12,99，所以选择最大范围满足
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度为2
	// creator: zll
	public static FunctionResult PropertiesFabric_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPropertiesFabric(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 纺织面料属性代码(64)X11X12
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度为2
	// creator: zll
	public static FunctionResult PropertiesDyeingandFinishing_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPropertiesDyeingandFinishing(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 纺织面料属性代码(64)X11X12
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度为9
	// creator: zll
	public static FunctionResult GeneralManufacturingProcess_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 9) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGeneralManufacturingProcess(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 道路交通信息服务信息分类与编码(68)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度为2
	// creator: zll
	public static FunctionResult TrafficInformation_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			// 前两位数
//			int index1 = (int) IDstr[0] - 48;
//			int index2 = (int) IDstr[1] - 48;
//			int i = 10 * index1 + index2;
//			// 3,4位数
//			int index3 = (int) IDstr[Index[0]] - 48;
//			int index4 = (int) IDstr[Index[1]] - 48;
//			int j = 10 * index3 + index4;
//			if (i >= 1 && i <= 4) {
//				if (j >= 1 && j <= 4 || j == 99) {
//					return OK;
//				}
//			} else if (i == 5) {
//				if (j >= 1 && j <= 5 || j == 99) {
//					return OK;
//				}
//			} else if (i == 99) {
//				if (j == 99) {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 全国主要产品分类与代码第2部分 不可运输产品(712)
	// IDstr: 标识编码
	// LenID: 标识编码的长度1-5
	// Index: 调用正则的的索引位置
	// LenIndex:长度为2,0和-1
	// creator: zll
	public static FunctionResult UntransportableProduct_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID >= 1 && LenID <= 5)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getUntransportableProduct(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 全国主要产品分类与代码第2部分 不可运输产品后3位(712)
	// IDstr: 标识编码
	// LenID: 标识编码的长度1-5
	// Index: 调用正则的的索引位置
	// LenIndex:长度为3
	// creator: zll
	public static FunctionResult LastThreeUntransportableProduct_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getLastThreeUntransportableProduct(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 道路交通信息采集信息分类与编码(77)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 固定长4
	// Creator:zll
	public static FunctionResult TrafficInformationCollection_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		String firstCode = String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String secondCode = String.valueOf(IDstr[Index[2]])
//				+ String.valueOf(IDstr[Index[3]]);
//		RecoDao recoDao = new RecoDao();
//		boolean ret = recoDao.getTrafficInformationCollection(firstCode,
//				secondCode);
//		if (ret) {
//			return OK;
//		} else
//			return ERR;
	}

	// Function: 烟草行业工商统计数据元第2部分 代码集(202)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 固定长2
	// Creator:zll
	public static FunctionResult TobaccoLeafColor_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTobaccoLeafColor(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 烟叶代码第5部分烟叶颜色代码(204)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 固定长2
	// Creator:zll
	public static FunctionResult TrafficOrganization_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTrafficOrganization(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 烟叶代码第2部分烟叶形态代码(207)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 固定长3
	// Creator:zll
	public static FunctionResult TobaccoLeafForm_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTobaccoLeafForm(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 烟叶代码第1部分烟叶分类与代码(208)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 固定长5
	// Creator:zll
	public static FunctionResult TobaccoLeafClass_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTobaccoLeafClass(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 儿童大便性状代码(213)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult ChildrenExcrement_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getChildrenExcrement(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 01-11 90
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:zll
	public static FunctionResult OneToEleven_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int Xx = 11;
//			int i = 10 * index1 + index2;
//			if (i >= 01 && i <= Xx) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 饮酒频率代码(214)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult DrinkingFrequency_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getDrinkingFrequency(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 饮酒频率代码(214)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult DrinkingClass_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getDrinkingClass(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 饮酒频率代码(214)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult PhysicalActivityFrequency_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPhysicalActivityFrequency(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 妊娠终止方式代码表(215)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult TerminationofPregnancy_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTerminationofPregnancy(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 妊娠终止方式代码表(215)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult ModeofProduction_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getModeofProduction(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 分娩地点类别代码(215)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult DileveryPlace_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getDileveryPlace(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 卫生信息数据元值域代码第17部分：卫生管理(218)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为2-8
	// Creator:zll
	public static FunctionResult HealthSupervisionObject_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID >= 2 && LenID <= 8)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHealthSupervisionObject(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 交通工具代码(219)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult CommunicationCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getCommunicationCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 卫生监督机构人员编制类别代码(220)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult HygieneAgencyPersonnel_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHygieneAgencyPersonnel(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 卫生监督机构人员编制类别代码(220)
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为1-2
	// Creator:zll
	public static FunctionResult WorkerHealthSupervision_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID == 1 || LenID == 2)) {
//				return ERR;
//			}
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getWorkerHealthSupervision(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 实现校验15位数17710
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:方丹丽
	// 检验例子码110108000000016
	public static FunctionResult BussManaCheck_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 15) {
//				return ERR;
//			}
//			int[] a = new int[15];
//			for (int i = 0; i < 15; i++) {
//				a[14 - i] = IDstr[i] - 48;
//			}
//			int[] p = new int[15];
//			int[] s = new int[15];
//			p[0] = 10;
//			for (int i = 0; i < 14; i++) {
//				s[i] = p[i] % 11 + a[14 - i];
//				p[i + 1] = (s[i] % 10) * 2;
//
//				if (s[i] % 10 == 0) {
//					p[i + 1] = 20;
//				}
//			}
//			p[14] = (s[13] % 10) * 2;
//			s[14] = p[14] % 11 + a[0];
//
//			if (s[14] % 10 == 1) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 280-——珠宝玉石及金属产品分类代码编制方法 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度5位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult JadejewelryClass_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff280(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 282-——信息安全技术代码编制方法 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度4位
	// Index: 调用验证算法的索引位置
	// creator:fdl
	public static FunctionResult InformationSafe_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariffMa282(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 280-——中央党政机关代码编制方法 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度3位
	// Index: 调用验证算法的索引位置
	// creator:fdl
	public static FunctionResult CodeHighWayLine_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			int index4 = Index[3];
//			if ((IDstr[index1] == '0') && (IDstr[index2] == '0')
//					&& (IDstr[index3] == '0') && (IDstr[index4] == '0')) {
//				return ERR;
//			}
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index3] < '0') || (IDstr[index3] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index4] < '0') || (IDstr[index4] > '9')) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 284-——社会经济目标分类和代码表 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度6位
	// Index: 调用验证算法的索引位置
	// LenIndex:a6
	// creator:fdl
	public static FunctionResult goalsocialeconomic_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		// if (LenIndex != 6) {
//		// return ERR;
//		// }
//		try {
//			String code = "";
//			for (int i = 0; i < 6; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariffMa284(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	// 285-——物流信息分类和代码表 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度6位
	// Index: 调用验证算法的索引位置
	// LenIndex:a6
	// creator:fdl
	public static FunctionResult LogisticsInf_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5 && LenIndex != 7) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < IDstr.length; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariffMa285(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 287-——服装分类和代码表 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度6位
	// Index: 调用验证算法的索引位置
	// LenIndex:a6
	// creator:fdl
	public static FunctionResult clothesclass_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 6 && LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < IDstr.length; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariffMa287(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 288-——服装名字分类代码编制方法 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度5位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult ClothesName_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariffMa288(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 191-——医药器械分类和代码表 查表数据库
	// IDstr: 标识编码
	// LenID: 标识编码的长度6位
	// Index: 调用验证算法的索引位置
	// LenIndex:a6
	// creator:fdl
	public static FunctionResult Pharmacequipment_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 8) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < IDstr.length; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariffMa291(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 六位沿海行政区域分类与代码
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用沿海行政区域代码的位置
	// LenIndex: 长度为六位
	// creator: gcc
	public static FunctionResult CoastalAdminAreaId_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			String id = "";
//			RecoDao recoDao = new RecoDao();
//			for (int i = 0; i < LenIndex; i++) {
//				id = id.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			boolean ret = recoDao.getCoastalAdminAreaID(id);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 六位船舶登记号
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用船舶登记号代码的位置
	// LenIndex: 长度为六位
	// creator: gcc
	public static FunctionResult InternationalShipCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 7) {
//				return ERR;
//			}
//			String code = "";
//			RecoDao recoDao = new RecoDao();
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			boolean ret = recoDao.getInternationalShipCode(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 沿海行政区域代码的前两位
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用沿海行政区域代码前两位的位置
	// LenIndex: 长度为两位
	// creator: gcc
	public static FunctionResult First2CharsofCoastalAdminAreaId_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			String append = "0000";
//			String id = "";
//			RecoDao recoDao = new RecoDao();
//			for (int i = 0; i < LenIndex; i++) {
//				id = id.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			id = id.concat(append);
//			boolean ret = recoDao.getCoastalAdminAreaID(id);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 两位经济类型代码
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用经济类型代码的位置
	// LenIndex: 长度为两位
	// creator: gcc
	public static FunctionResult WirtschaftsTypCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			String id = "";
//			RecoDao recoDao = new RecoDao();
//			for (int i = 0; i < LenIndex; i++) {
//				id = id.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			boolean ret = recoDao.getWirtschaftsTypCodeID(id);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 传染病名称代码采用3层4位数字顺序代码，第一层1位数字表示；第二层2位数字表示，第3层1位数字表示。所有数字升序排列
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用传染病名称代码的位置
	// LenIndex: 长度必须为4位
	// creator: gcc
	public static FunctionResult InfectiousDiseases_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//
//			String id = "";
//			RecoDao recodao = new RecoDao();
//			for (int i = 0; i < LenIndex; i++) {
//				id = id.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			boolean ret = recodao.getInfectiousDiseasesID(id);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 海洋站区站号
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用海洋站区号代码的位置
	// LenIndex: 长度是两位
	// creator: gcc
	public static FunctionResult OceanStationCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int Xx = 12;
//			int i = 10 * index1 + index2;
//			if (i >= 01 && i < Xx || i == 15 || i == 16) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 地名分类与类别代码编制规则（309）
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用地理属性代码的位置
	// LenIndex: 长度是四位
	// creator: gcc
	public static FunctionResult GeographicalCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			String code = "";
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGeographicalCode(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 农药剂型名称及代码（305）
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的索引位置长度为2-4
	// creator: gcc
	public static FunctionResult PesticideFormulationCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID > 1 && LenID < 5)) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPesticideFormulationCode(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 乘用车尺寸代码
	// IDstr: ID String
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的索引位置长度为6-8
	// creator: gcc
	public static FunctionResult PassengerCarCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (!(LenID > 5 && LenID < 9)) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int i = 4; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPassengerCarCode(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult RoadTransportation21_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation21(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: MH/T 0018-1999
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用正则的的索引位置 长度为0-8
	// 判断0-8位是不是在数据库中存在
	// Creator:wt
	public static FunctionResult CivilAviation_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 9) {
//			return ERR;
//		}
//		if (IDstr[0] != '2' || IDstr[1] != '7') {
//			return ERR;
//		}
//		String code = "";
//		for (int i = 0; i < 9; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getCivilAviation(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult RoadTransportation22_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation22(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult RoadTransportation32_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation32(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult RoadTransportation5_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]])
//					+ String.valueOf(IDstr[Index[2]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation5(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult RoadTransportation41_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]])
//					+ String.valueOf(IDstr[Index[2]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation41(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult RoadTransportation50_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation50(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult RoadTransportation53_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]])
//					+ String.valueOf(IDstr[Index[2]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation53(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult RoadTransportation63_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation63(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult Port(char[] IDstr, int LenID, String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]])
//					+ String.valueOf(IDstr[Index[2]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPort(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult RoadTransportation60_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		if (IDstr[0] != 'A' && IDstr[0] != 'B')
//			return ERR;
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]])
//					+ String.valueOf(IDstr[Index[2]])
//					+ String.valueOf(IDstr[Index[3]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation60(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult RoadTransportation64_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRoadTransportation64(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult HighwayTransportation4b1_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayTransportation4b1(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult HighwayTransportation4b7_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]])
//					+ String.valueOf(IDstr[Index[2]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayTransportation4b7(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult HighwayTransportation4b9_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayTransportation4b9(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult HighwayTransportation4c3_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayTransportation4c3(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	public static FunctionResult PortTariff3_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff3(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	public static FunctionResult PortTariff4_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 2; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff4(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// e.g 1000 /1010/1011/1020
	public static FunctionResult PortTariff9_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff9(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	public static FunctionResult PortTariff25_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff25(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	public static FunctionResult PortTariff26_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 3; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff26(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	public static FunctionResult PortTariff10_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 3; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff10(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult Machinery2_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMachinery2(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult HighwayMaintenance4_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 10) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 10; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayMaintenance4(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult HighwayMaintenance3_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 10) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 10; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayMaintenance3(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult Machinery3_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMachinery3(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult Machinery4_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMachinery4(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult Machinery5_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMachinery5(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult Machinery6_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMachinery6(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult Machinery7_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMachinery7(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult Machinery8_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMachinery8(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult Machinery9_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMachinery9(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult Machinery10_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMachinery10(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	public static FunctionResult HighwayTransportation4c6_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 2; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayTransportation4c6(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult WaterwayTransportation_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 3; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getWaterwayTransportation(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult HighwayTransportation4b10_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 1) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayTransportation4b10(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult HighwayTransportation_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//		try {
//			String code = String.valueOf(IDstr[Index[0]])
//					+ String.valueOf(IDstr[Index[1]])
//					+ String.valueOf(IDstr[Index[2]]);
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayTransportation(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult TwobyteCode06and90_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 06;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx || i == 90) {
//			return OK;
//		} else
//			return ERR;
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */
	public static FunctionResult SecurityAccounterments_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (IDstr[0] != 'A' && IDstr[0] != 'B') {
//			return ERR;
//		}
//
//		if (LenIndex != 7) {
//			return ERR;
//		}
//
//		String code = new String(IDstr);
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getSecurityAccounterments(code);
//			if (ret)
//				return OK;
//			else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	public static FunctionResult SpecialVehicle_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//
//		String code = new String(IDstr);
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getSpecialVehicle(code);
//			if (ret)
//				return OK;
//			else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * 2 or 3 bit code IDstr: ID string LenID: the number of characters in the
	 * ID string Index: the list of corresponding indexes regarding to this
	 * algorithm Index: the list of corresponding indexes regarding to this
	 * algorithm LenIndex: the number of indexes creator:wt
	 */
	public static FunctionResult TwoOrThree_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenID == 15) {
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			if (index1 < 0 || index1 > 9 || index2 < 0 || index2 > 9)
//				return ERR;
//			int Xx = 99;
//			int i = 10 * index1 + index2;
//			if (i >= 01 && i <= Xx) {
//				return OK;
//			} else
//				return ERR;
//		} else if (LenID == 16) {
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[0]] - 48;
//			int index3 = (int) IDstr[Index[0]] - 48;
//			if (index1 < 0 || index1 > 9 || index2 < 0 || index2 > 9
//					|| index3 < 0 || index3 > 9)
//				return ERR;
//			int i = 100 * index1 + 10 * index2 + index3;
//			int Xx = 999;
//			if (i > 01 && i <= Xx)
//				return OK;
//			else
//				return ERR;
//		} else
//			return ERR;
	}

	// A1234
	// 12345
	public static FunctionResult CommodityName_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (IDstr[Index[0]] == 'A') {
//			for (int i = 1; i < LenIndex; i++) {
//				if (IDstr[Index[i]] < '0' || IDstr[Index[i]] > '9')
//					return ERR;
//			}
//			return OK;
//		}
//		if (IDstr[Index[0]] >= '0' && IDstr[Index[0]] <= '9') {
//			for (int i = 1; i < LenIndex; i++) {
//				if (IDstr[Index[i]] < '0' || IDstr[Index[i]] > '9')
//					return ERR;
//			}
//			return OK;
//		}
//		return ERR;
	}

	// 377——社会兼职
	// IDstr: 标识编码
	// LenID: 标识编码的长度 4位
	// Index: 调用验证算法的索引位置
	// LenIndex:4
	// creator:fdl
	public static FunctionResult SocialWork_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			if ((IDstr[Index[0]] == '0' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '2')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '6')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '4')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '5')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '7')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '8')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '9')
//					|| (IDstr[Index[0]] == '1' && IDstr[Index[1]] == '0')
//					|| (IDstr[Index[0]] == '4' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == '4' && IDstr[Index[1]] == '2')
//					|| (IDstr[Index[0]] == '4' && IDstr[Index[1]] == '3')
//					|| (IDstr[Index[0]] == '5' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == '6' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == '6' && IDstr[Index[1]] == '2')
//					|| (IDstr[Index[0]] == '6' && IDstr[Index[1]] == '3')
//					|| (IDstr[Index[0]] == '6' && IDstr[Index[1]] == '4')) {
//				return OK;
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 386 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 3
	// creator: lhx
	public static FunctionResult FireInfoori_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int i = 100 * index1 + 10 * index2 + index3;
//			if (i >= 100 && i <= 103) {
//				return OK;
//			} else if (i >= 200 && i <= 202) {
//				return OK;
//			} else if (i >= 300 && i <= 303) {
//				return OK;
//			} else if (i >= 402 && i <= 404) {
//				return OK;
//			} else if (i >= 500 && i <= 502) {
//				return OK;
//			} else if (i >= 600 && i <= 603) {
//				return OK;
//			} else if (i >= 700 && i <= 702) {
//				return OK;
//			} else if (i == 199 || i == 399 || i == 400 || i == 499 || i == 599
//					|| i == 699 || i == 900) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 410 Cadres job code
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 4
	// creator: lhx
	public static FunctionResult OfficialPostionCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//		
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < IDstr.length; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getOfficialPositonByCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 山脉山峰名称代码（297）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult MountainRangeAndPeakName_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
		
//		try {
//			String code = "";
//
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMountainRangeAndPeakName(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 知识产权文献与信息分类及代码（298）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult IntellectualProperty_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;

//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getIntellectualProperty(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 民用航空业信息分类与代码 (340)
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult ClassificationOfCivilAviation_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getClassificationOfCivilAviation(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 高等学校本科、专科专业名称代码（328）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult NormalAndShortCycleSpeciality_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;

//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getNormalAndShortCycleSpeciality(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 船舶维修保养体系 第二部分（337）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult MaintenanceSystemPTwo_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 14) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMaintenanceSystemPTwo(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:国际贸易合同代码（326）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult CountryRegionCode1_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getCountryRegionCode1(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:电力科技成果分类与代码（784）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult ElectricPower_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getElectricPower(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:全国电网名称代码（785）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult PowerGrid_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;

//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerGrid(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:电力行业单位类别代码（787）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult ElectricPowerIndustry_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getElectricPowerIndustry(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:电力地理信息系统图形符号分类与代码（788）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult ElectricPowerGeography_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;

//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 7) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getElectricPowerGeography(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:电压等级代码（789）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult VoltageClass_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 7) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getVoltageClass(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:电力物资编码 第二部分 机电产品（909）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult PowerGoodsP2_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			String code = "";
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerGoodsP2(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 金属热处理工艺分类及代号，工艺类型与工艺名称层次
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用标识编码的位置
	// LenIndex: 长度为2
	// creator: gcc
	public static FunctionResult MetalHeatCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			if (index1 == 1) {
//				if (index2 > 0 && index2 < 9) {
//					return OK;
//				}
//			}
//
//			if (index1 == 2) {
//				if (index2 > 0 && index2 < 6) {
//					return OK;
//				}
//			}
//
//			if (index1 == 3) {
//				if (index2 > 0 && index2 < 8) {
//					return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 基础地理信息要素分类与代码
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用标识编码的位置
	// LenIndex: 长度为六位
	// creator: gcc
	public static FunctionResult GeographicInfoCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			String code = "";
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGeographicalInfoCode(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 生产过程危险和有害因素分类与代码(354)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex: 长度必为6
	// creator: gcc
	public static FunctionResult HarmfulFactor_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHarmfulFactorCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 中华人民共和国铁路车站分类与代码(366)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex: 长度必为6
	// creator: gcc
	public static FunctionResult RailwayStationCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getRailwayStationCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 旋转电机整体结构的防护等级（IP代码） 分级(261)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的索引位置
	// LenIndex: 不定长
	// creator: gcc
	public static FunctionResult ProtectionDegreeRegex_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[A-Z]*";
//			int prefix = 4;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 林业档案分类与代码（237）
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的索引位置
	// LenIndex: 不定长
	// creator: gcc
	public static FunctionResult ForestryClassRegex_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[1-9]*";
//			int prefix = 3;
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 地质矿产术语分类与代码（241-244）
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex: 不定长
	// creator: gcc
	public static FunctionResult MineralRegex_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[A-Z]{0,4}[0-9]*";
//			int prefix = 2;
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 国际航运货物装卸费用和船舶租赁方式条款代码
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用条款代码的位置
	// LenIndex: 长度为两位
	// creator: gcc
	public static FunctionResult StevedorageChartering_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			char index1 = IDstr[Index[0]];
//			char index2 = IDstr[Index[1]];
//			if ((index1 == 'L') && ((index2 == 'T') || (index2 == 'F'))) {
//				return OK;
//			}
//			if (index1 == 'F') {
//				if (index2 == 'I' || index2 == 'O' || index2 == 'N'
//						|| index2 == 'T' || index2 == 'S' || index2 == 'A'
//						|| index2 == 'D' || index2 == 'L') {
//					return OK;
//				}
//			}
//			if ((index1 == 'U') && (index2 == 'T')) {
//				return OK;
//			}
//			if ((index1 == 'D') && (index2 == 'L')) {
//				return OK;
//			}
//			if ((index1 == 'T') && ((index2 == 'D') || (index2 == 'W'))) {
//				return OK;
//			}
//			if (index1 == 'V') {
//				if (index2 == 'F' || index2 == 'L' || index2 == 'P'
//						|| index2 == 'A') {
//					return OK;
//				}
//			}
//			if (index1 == 'A' && index2 == 'C') {
//				return OK;
//			}
//			if (index1 == 'B' && index2 == 'C') {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 林业资源分类与代码 林木病害
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用林木病害的位置
	// LenIndex: 长度为六位
	// creator: gcc
	public static FunctionResult TreeDiseaseCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			String code = "";
//			RecoDao recoDao = new RecoDao();
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			boolean ret = recoDao.getTreeDiseaseCode(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 内河船舶分类与代码前四位（341-1）
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用船舶代码的位置
	// LenIndex: 长度是四位
	// creator: gcc
	public static FunctionResult NavigationShip_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			String code = "";
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getNavigationShipCode(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 第46部分：消防训练分类与代码（411）
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用消防训练分类与代码代码的位置
	// LenIndex: 长度是六位
	// creator: gcc
	public static FunctionResult NavigationShipAddCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//
//			if (index1 == 1) {
//				if ((index2 >= 0 && index2 < 8) || index2 == 9)
//					return OK;
//			}
//			if (index1 == 2) {
//				if (index2 > 0 && index2 <= 9)
//					return OK;
//			}
//
//			if (index1 == 3) {
//				if (index2 == 0 || index2 == 1 || index2 == 9) {
//					return OK;
//				}
//			}
//			if (index1 == 4 || index2 == 5) {
//				if ((index2 >= 0 && index2 < 5) || index2 == 9)
//					return OK;
//			}
//			if (index1 == 6) {
//				if ((index2 >= 0 && index2 < 7) || index2 == 9)
//					return OK;
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 第33部分：起火原因分类与代码（425）
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用起火原因分类与代码代码的位置
	// LenIndex: 长度是六位
	// creator: gcc
	public static FunctionResult FireTrainCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int index4 = (int) IDstr[Index[3]] - 48;
//			int index5 = (int) IDstr[Index[4]] - 48;
//			int index6 = (int) IDstr[Index[5]] - 48;
//			int Xx = 10 * index1 + index2;
//			int Yy = 10 * index3 + index4;
//			int Zz = 10 * index5 + index6;
//			if ((Xx > 0 && Xx < 5) || Xx == 99) {
//				if (Yy == 0 && Zz == 0)
//					return OK;
//			}
//			if (Xx == 1) {
//				if ((Yy > 0 && Yy < 7) || Yy == 99) {
//					if (Zz == 0)
//						return OK;
//				}
//			}
//			if (Xx == 2) {
//				if (Yy == 1) {
//					if (Zz >= 0 && Zz < 11)
//						return OK;
//				}
//			}
//			if (Xx == 2 || Xx == 3) {
//				if (Yy == 2) {
//					if (Zz >= 0 && Zz < 4)
//						return OK;
//				}
//			}
//			if (Xx == 2 || Xx == 3) {
//				if (Yy == 3) {
//					if (Zz >= 0 && Zz < 3)
//						return OK;
//				}
//			}
//			if (Xx == 2 || Xx == 3) {
//				if (Yy == 99) {
//					if (Zz == 0)
//						return OK;
//				}
//			}
//			if (Xx == 3) {
//				if (Yy == 1) {
//					if (Zz >= 0 && Zz < 15)
//						return OK;
//				}
//			}
//			if (Xx == 4) {
//				if ((Yy > 0 && Yy < 8) || Yy == 99)
//					if (Zz == 0)
//						return OK;
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 第28部分：消防出警事件分类与代码（425）
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用消防出警事件分类与代码代码的位置
	// LenIndex: 长度是四位
	// creator: gcc
	public static FunctionResult FireCauseCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int index4 = (int) IDstr[Index[3]] - 48;
//			int index5 = (int) IDstr[Index[4]] - 48;
//			int index6 = (int) IDstr[Index[5]] - 48;
//			int Xx = 10 * index1 + index2;
//			int Yy = 10 * index3 + index4;
//			int Zz = 10 * index5 + index6;
//			if ((Xx > 0 && Xx < 10) || Xx == 98 || Xx == 99) {
//				if (Yy == 0 && Zz == 0)
//					return OK;
//			}
//			if (Xx == 1) {
//				if (Yy == 1) {
//					if ((Zz >= 0 && Zz < 7) || Zz == 99)
//						return OK;
//				}
//			}
//			if (Xx == 1) {
//				if (Yy == 3) {
//					if ((Zz >= 0 && Zz < 3) || Zz == 99)
//						return OK;
//				}
//			}
//			if (Xx == 1) {
//				if (Yy == 2 || Yy == 99) {
//					if (Zz == 0)
//						return OK;
//				}
//			}
//			if (Xx == 2) {
//				if (Yy == 1 || Yy == 5) {
//					if ((Zz >= 0 && Zz < 4) || Zz == 99)
//						return OK;
//				}
//			}
//			if (Xx == 2) {
//				if (Yy == 2 || Yy == 3) {
//					if ((Zz >= 0 && Zz < 5) || Zz == 99)
//						return OK;
//				}
//			}
//			if (Xx == 2) {
//				if (Yy == 4) {
//					if ((Zz >= 0 && Zz < 9) || Zz == 99)
//						return OK;
//				}
//			}
//			if (Xx == 2) {
//				if (Yy == 99) {
//					if (Zz == 0)
//						return OK;
//				}
//			}
//			if (Xx == 3) {
//				if (Yy > 0 && Yy < 12 || Yy == 99) {
//					if (Zz == 0)
//						return OK;
//				}
//			}
//			if (Xx == 4 || Xx == 6) {
//				if (Yy > 0 && Yy < 4 || Yy == 99) {
//					if (Zz == 0)
//						return OK;
//				}
//			}
//			if (Xx == 5) {
//				if (Yy == 1 || Yy == 2 || Yy == 99) {
//					if (Zz == 0)
//						return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 第28部分：消防出警事件分类与代码（425）
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用消防出警事件分类与代码代码的位置
	// LenIndex: 长度是四位
	// creator: gcc
	public static FunctionResult FireForceCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int index4 = (int) IDstr[Index[3]] - 48;
//			int Xx = 10 * index3 + index4;
//
//			if ((index1 > 0 && index1 < 6) || index1 == 9) {
//				if (index2 == 0 && Xx == 0)
//					return OK;
//			}
//			if (index1 == 1) {
//				if (index2 == 1 || index2 == 3) {
//					if ((Xx >= 0 && Xx < 6) || Xx == 99)
//						return OK;
//				}
//			}
//			if (index1 == 1) {
//				if (index2 == 2) {
//					if ((Xx >= 0 && Xx < 8) || Xx == 99)
//						return OK;
//				}
//			}
//			if (index1 == 1 || index1 == 2 || index1 == 9) {
//				if (index2 == 9) {
//					if (Xx == 0)
//						return OK;
//				}
//			}
//			if (index1 == 2) {
//				if (index2 == 2 || index2 == 4) {
//					if (Xx >= 0 && Xx < 7 || Xx == 99)
//						return OK;
//				}
//			}
//			if (index1 == 2) {
//				if (index2 == 1) {
//					if ((Xx >= 0 && Xx < 9) || Xx == 99)
//						return OK;
//				}
//			}
//			if (index1 == 2) {
//				if (index2 == 3) {
//					if ((Xx >= 0 && Xx < 3) || Xx == 99)
//						return OK;
//				}
//			}
//			if (index1 == 2) {
//				if (index2 == 5) {
//					if ((Xx >= 0 && Xx < 6) || Xx == 99)
//						return OK;
//				}
//			}
//			if (index1 == 2) {
//				if (index2 == 6) {
//					if ((Xx >= 0 && Xx < 8) || Xx == 99)
//						return OK;
//				}
//			}
//			if (index1 == 4) {
//				if (index2 > 0 && index2 < 4 || index2 == 9) {
//					if (Xx == 0)
//						return OK;
//				}
//			}
//			if (index1 == 5) {
//				if (index2 > 0 && index2 < 6 || index2 == 9) {
//					if (Xx == 0)
//						return OK;
//				}
//			}
//			if (index1 == 9) {
//				if (index2 == 1) {
//					if (Xx == 0)
//						return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 412 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 4
	// creator: gcc
	public static FunctionResult FireInfotrain_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[1]] - 48;
//			int index2 = (int) IDstr[Index[2]] - 48;
//			int index3 = (int) IDstr[Index[3]] - 48;
//			int index4 = (int) IDstr[Index[0]] - 48;
//			// int Xx = 8;
//			int i = 100 * index1 + 10 * index2 + index3 + 1000 * index4;
//			if (i >= 100 && i <= 104) {
//				return OK;
//			} else if (i >= 200 && i <= 203) {
//				return OK;
//			} else if (i == 299 || i == 99) {
//				return OK;
//			}
//
//			else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 419 fire information
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: gcc
	public static FunctionResult ServiceState_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			if ((index1 > 0 && index1 < 8) || index1 == 9) {
//				if (index2 == 0) {
//					return OK;
//				}
//			}
//			if (index1 == 2) {
//				if (index2 > 0 && index2 < 8) {
//					return OK;
//				}
//			}
//			return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 457
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 2
	// creator: gcc
	public static FunctionResult PractitionerType_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int i = 10 * index1 + index2;
//			if (i >= 10 && i <= 13) {
//				return OK;
//			}
//			if (i >= 19 && i <= 23) {
//				return OK;
//			}
//			if (i >= 29 && i <= 30 || i == 40 || i == 99) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 第28部分：消防出警事件分类与代码（425）
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用消防出警事件分类与代码代码的位置
	// LenIndex: 长度是四位
	// creator: gcc
	public static FunctionResult FinancialCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//
//			if (index1 == 1 || index1 == 2 || index1 == 3 || index1 == 6
//					|| index1 == 8) {
//				if (index2 == 0) {
//					return OK;
//				}
//			}
//			if (index1 == 4) {
//				if (index2 > 0 && index2 <= 9) {
//					return OK;
//				}
//			}
//			if (index1 == 5) {
//				if (index2 > 4 && index2 <= 9) {
//					return OK;
//				}
//			}
//			if (index1 == 6) {
//				if (index2 > 0 && index2 <= 4) {
//					return OK;
//				}
//			}
//			if (index1 == 7) {
//				if (index2 == 1 || index2 == 5 || index2 == 6) {
//					return OK;
//				}
//			}
//			if (index1 == 8) {
//				if ((index2 > 0 && index2 <= 4) || index2 == 7) {
//					return OK;
//				}
//			}
//			if (index1 == 9) {
//				if (index2 == 9) {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: GA/T 556.3
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用金库类别代码的位置
	// LenIndex: 长度是两位
	// creator: gcc
	public static FunctionResult TreasuryClass_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//
//			if (index1 == 0) {
//				if (index2 > 0 && index2 <= 9) {
//					return OK;
//				}
//			}
//
//			if (index1 == 1) {
//				if (index2 == 9) {
//					return OK;
//				}
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: GA/T 556.1
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用职务类别代码的位置
	// LenIndex: 长度是两位
	// creator: gcc
	public static FunctionResult JobClassificationCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 4) {
//				return ERR;
//			}
//
//			char index1 = IDstr[Index[0]];
//			char index2 = IDstr[Index[1]];
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int index4 = (int) IDstr[Index[3]] - 48;
//			int Xx = 10 * index3 + index4;
//			if (index1 == 'F' && index2 == 'F') {
//				if ((Xx > 0 && Xx < 4) || Xx == 9) {
//					return OK;
//				}
//			}
//			if (index1 == 'F' && index2 == 'Z') {
//				if (Xx == 1) {
//					return OK;
//				}
//			}
//
//			if ((index1 == 'Z' || index1 == 'C') && index2 == 'F') {
//				if (Xx > 0 && Xx < 4) {
//					return OK;
//				}
//			}
//
//			if ((index1 == 'D' || index1 == 'X') && index2 == 'F') {
//				if (Xx > 0 && Xx < 3) {
//					return OK;
//				}
//			}
//
//			if (((index1 == 'D' || index1 == 'X') && index2 == 'Y')
//					|| (index1 == 'Z' && index2 == 'Z')) {
//				if (Xx > 0 && Xx < 10) {
//					return OK;
//				}
//			}
//
//			if (index1 == 'S' && index2 == 'X') {
//				if (Xx > 2 && Xx < 9) {
//					return OK;
//				}
//			}
//
//			if (index1 == 'S' && index2 == 'F') {
//				if ((Xx > 0 && Xx < 13) || Xx == 19) {
//					return OK;
//				}
//			}
//
//			if (index1 == 'D' && index2 == 'Z') {
//				if ((Xx > 0 && Xx < 13) || Xx == 19 || Xx == 14) {
//					return OK;
//				}
//			}
//
//			if (index1 == 'X' && index2 == 'Z') {
//				if (Xx > 0 && Xx < 11) {
//					return OK;
//				}
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 常用证件代码（470）
	// IDstr: ID string
	// LenID: 标识编码
	// Index: 标识编码的长度
	// LenIndex: 调用索引位置长度为3
	// creator: gcc
	public static FunctionResult TravleDocumentCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTravelCode(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:公安部消防局和省级公安消防总队代码(474)
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult ProvinceAdminCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getProvinceAdminCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:列管单位代码(474)
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult AdminDivision1_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 9) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getAdminDivision1(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 国际贸易合同代码编制规则自定义编码正则匹配,数字或者字母，数字在字母后面。(326)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度<=9
	// creator: yzc
	public static FunctionResult DraftingRulesForCodes_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[A-Z][A-Z0-9]{0,8}";
//			int prefix = 8;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 环境信息分类与代码正则匹配,数字(776)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度无穷
	// creator: yzc
	public static FunctionResult EnvironmentalInformation_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[0-9][1-9]*";
//			int prefix = 8;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 废水类别代码正则匹配,数字(782)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度无穷
	// creator: yzc
	public static FunctionResult Wastewater_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[0-9][1-9]*";
//			int prefix = 5;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 银行表示代码分支机构代码正则匹配,数字，字母(332)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度<=4
	// creator: yzc
	public static FunctionResult BankCodes_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[1-9A-W,Y,Z]{0,3}";
//			int prefix = 8;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 书证物证种类代码（538）
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:yzc
	public static FunctionResult DocumentEnvidence_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '3')) {
//				return ERR;
//			}
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index3] < '0') || (IDstr[index3] > '9')) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 受害单位行业分类代码（532）
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:yzc
	public static FunctionResult EconomicCasesUnit_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index3] < '0') || (IDstr[index3] > '9')) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 作案手段代码（539）
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:yzc
	public static FunctionResult CodesOfMakingCases_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '8')) {
//				return ERR;
//			}
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index3] < '0') || (IDstr[index3] > '9')) {
//				return ERR;
//			}
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 01-48
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 固定长2
	// Creator:yzc
	public static FunctionResult OneTO48_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 48;
//		int i = 10 * index1 + index2;
//		if (i >= 01 && i <= Xx) {
//			return OK;
//		} else
//			return ERR;

	}

	// Function:公路路线标识规则和国道编号正则匹配,数字，字母(598)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度<=3
	// creator: yzc
	public static FunctionResult NationalTrunkHighway_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			String code = "";
//			String regex = "[0-9,w]{0,1}[0-9,w]{0,1}[1-9]{0,1}";
//			int prefix = 2;
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置,6,-1
	// LenIndex:2
	// creator: wt
	public static FunctionResult ParamCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//
//		if (len == 4) {
//			String regex = "[0-9]{2}\\.[0-9]";
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else if (len == 5) {
//			String regex = "[0-9]{2}\\.[0-9]{2}";
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		}
//
//		return ERR;
	}

	// DL/T_700.1-1999_51
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置,6,-1
	// LenIndex:2
	// creator: wt
	public static FunctionResult ParamCode6_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		if (len == 6) {
//
//			String regex = "[0-9]{2}\\.[0-9]{3}";
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else if (len == 7) {
//			String regex = "[0-9]{3}\\.[0-9]{3}";
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		}
//		return ERR;

	}

	/*
	 * 前4位是数字，后2位是小数 1234.12 author:wt
	 */
	public static FunctionResult ParamCode7_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		for (int i = 0; i < 4; i++) {
//			int index = (int) IDstr[Index[i]] - 48;
//			if (index < 0 || index > 9)
//				return ERR;
//		}
//		char c = IDstr[Index[4]];
//		if (c == '.') {
//			int index1 = (int) IDstr[Index[5]] - 48;
//			int index2 = (int) IDstr[Index[6]] - 48;
//			if (index1 >= 0 && index1 <= 9 && index2 >= 0 && index2 <= 9)
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 可能是1,2,3,6位的数字
	 * 
	 * author:wt
	 */
	public static FunctionResult ParamCode17_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//
//		if (len == 1) {
//			String regex2 = "[0-9]";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else if (len == 2) {
//			String regex2 = "[0-9]{2}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else if (len == 3) {
//			String regex2 = "[0-9]{3}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else if (len == 6) {
//			String regex2 = "[0-9]{6}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是6位或7位的数字 author：wt
	 */
	public static FunctionResult ParamCode19_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//
//		if (len == 6) {
//			String regex2 = "[0-9]{6}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else if (len == 7) {
//			String regex2 = "[0-9]{7}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是4位或8位或9的数字 author：wt
	 */
	public static FunctionResult ParamCode20_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//
//		if (len == 4) {
//			String regex1 = "[0-9]{4}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else if (len == 8) {
//			String regex2 = "[0-9]{8}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//
//				return OK;
//
//			} else
//				return ERR;
//		} else if (len == 9) {
//			String regex2 = "[0-9]{9}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是8位或6位数字 当为8位时，码的第一位是1 当为6位时，码的第一位是2 author：wt
	 */
	public static FunctionResult ParamCode22_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		if (len == 6) {
//			String regex1 = "[0-9]{6}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '2')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 8) {
//			String regex2 = "[0-9]{8}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '1')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是10位或8位数字 当为10位时，码的第1,2位是01 当为8位时，码的第1,2位是02 author：wt
	 */
	public static FunctionResult ParamCode27_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		if (len == 10) {
//			String regex1 = "[0-9]{10}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '1')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 8) {
//			String regex2 = "[0-9]{8}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '2')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是4位或5位数字 当为4位时，码的第1,2位是01或03 当为5位时，码的第1,2位是02 author：wt
	 */
	public static FunctionResult ParamCode28_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;

//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		if (len == 4) {
//			String regex1 = "[0-9]{4}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && (IDstr[1] == '1' || IDstr[1] == '3'))
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 5) {
//			String regex2 = "[0-9]{5}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '2')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是3,4,5,9位数字 当为3位时，码的第1,2位是06 当为4位时，码的第1,2位是01,02,05,07
	 * 当为5位时，码的第1,2位是03 当为9位时，码的第1,2位是04 author：wt
	 */
	public static FunctionResult ParamCode29_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		if (len == 3) {
//			String regex1 = "[0-9]{3}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '6')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 4) {
//			String regex1 = "[0-9]{4}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0'
//						&& (IDstr[1] == '1' || IDstr[1] == '2'
//								|| IDstr[1] == '5' || IDstr[1] == '7'))
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 5) {
//			String regex2 = "[0-9]{5}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '3')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 9) {
//			String regex2 = "[0-9]{9}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '4')
//					return OK;
//				else
//					return ERR;
//
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是2,3,4,5,6,7,8位数字 当为2位时，码的第1,2位是05 当为3位时，码的第1,2位是06
	 * 当为4位时，码的第1,2位是09,10,11,12 当为5位时，码的第1,2位是07,08 当为6位时，码的第1,2位是02
	 * 当为7位时，码的第1,2位是01,03 当为8位时，码的第1,2位是04 author：wt
	 */
	public static FunctionResult ParamCode30_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		int len2 = IDstr.length;
//		for (int i = Index[0]; i < len2; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		if (len == 2) {
//			String regex1 = "[0-9]{2}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '5')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 3) {
//			String regex1 = "[0-9]{3}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '6')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 4) {
//			String regex1 = "[0-9]{4}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '9' || IDstr[0] == '1'
//						&& IDstr[1] == '0' || IDstr[0] == '1'
//						&& IDstr[1] == '1' || IDstr[0] == '1'
//						&& IDstr[1] == '2')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 5) {
//			String regex1 = "[0-9]{5}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && (IDstr[1] == '7' || IDstr[1] == '8'))
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 6) {
//			String regex1 = "[0-9]{6}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '2')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 7) {
//			String regex1 = "[0-9]{7}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && (IDstr[1] == '1' || IDstr[1] == '3'))
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 8) {
//			String regex1 = "[0-9]{8}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '4')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是4,5,6,7,8位数字 当为4位时，码的第1,2位是05,08 当为5位时，码的第1,2位是03,06,09
	 * 当为6位时，码的第1,2位是07 当为7位时，码的第1,2位是04 当为8位时，码的第1,2位是01,02 author：wt
	 */
	public static FunctionResult ParamCode31_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		if (len == 4) {
//			String regex1 = "[0-9]{4}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0'
//						&& (IDstr[1] == '1' || IDstr[1] == '2'
//								|| IDstr[1] == '5' || IDstr[1] == '7'))
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 5) {
//			String regex2 = "[0-9]{5}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '3')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 9) {
//			String regex2 = "[0-9]{9}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '4')
//					return OK;
//				else
//					return ERR;
//
//			} else
//				return ERR;
//		} else
//			return ERR;
		/*
		 * if (LenIndex == 4) { for (int i = 0; i < 4; i++) { int index = (int)
		 * IDstr[Index[i]] - 48; if (index < 0 || index > 9) return ERR; } if
		 * (IDstr[0] == '0' && (IDstr[1] == '1' || IDstr[1] == '2' || IDstr[1]
		 * == '5' || IDstr[1] == '7')) return OK; else return ERR; } if
		 * (LenIndex == 5) { for (int i = 0; i < 5; i++) { int index = (int)
		 * IDstr[Index[i]] - 48; if (index < 0 || index > 9) return ERR; } if
		 * (IDstr[0] == '0' && IDstr[1] == '3') return OK; else return ERR; } if
		 * (LenIndex == 9) { for (int i = 0; i < 9; i++) { int index = (int)
		 * IDstr[Index[i]] - 48; if (index < 0 || index > 9) return ERR; } if
		 * (IDstr[0] == '0' && IDstr[1] == '4') return OK; else return ERR; }
		 * return ERR;
		 */
	}

	/*
	 * 校验最后的码，可能是3,7,8位数字 当为3位时，码的第1,2位是05 当为7位时，码的第1,2位是03,04
	 * 当为8位时，码的第1,2位是01,02 author：wt
	 */
	public static FunctionResult ParamCode32_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		if (len == 3) {
//			String regex1 = "[0-9]{3}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '5')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 7) {
//			String regex2 = "[0-9]{7}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && (IDstr[1] == '3' || IDstr[1] == '4'))
//					return OK;
//				else
//					return ERR;
//
//			} else
//				return ERR;
//		} else if (len == 8) {
//			String regex2 = "[0-9]{8}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && (IDstr[1] == '1' || IDstr[1] == '2'))
//					return OK;
//				else
//					return ERR;
//
//			} else
//				return ERR;
//		} else
//			return ERR;
		/*
		 * if (LenIndex == 3) { for (int i = 0; i < 3; i++) { int index = (int)
		 * IDstr[Index[i]] - 48; if (index < 0 || index > 9) return ERR; } if
		 * (IDstr[0] == '0' && IDstr[1] == '5') return OK; else return ERR; } if
		 * (LenIndex == 7) { for (int i = 0; i < 7; i++) { int index = (int)
		 * IDstr[Index[i]] - 48; if (index < 0 || index > 9) return ERR; } if
		 * (IDstr[0] == '0' && (IDstr[1] == '3' || IDstr[1] == '4')) return OK;
		 * else return ERR; } if (LenIndex == 8) { for (int i = 0; i < 8; i++) {
		 * int index = (int) IDstr[Index[i]] - 48; if (index < 0 || index > 9)
		 * return ERR; } if (IDstr[0] == '0' && (IDstr[1] == '1' || IDstr[1] ==
		 * '2')) return OK; else return ERR; } return ERR;
		 */
	}

	/*
	 * 校验最后的码，可能是5,6,7,8,9,10,11位数字 当为5位时，码的第1,2位是09,10,11 当为6位时，码的第1,2位是08
	 * 当为7位时，码的第1,2位是03,06 当为8位时，码的第1,2位是05,07 当为9位时，码的第1,2位是04
	 * 当为10位时，码的第1,2位是02 当为11位时，码的第1,2位是01 author：wt
	 */
	public static FunctionResult ParamCode34_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//
//		if (len == 5) {
//			String regex2 = "[0-9]{5}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '9' || IDstr[0] == '1'
//						&& IDstr[1] == '0' || IDstr[0] == '1'
//						&& IDstr[1] == '1')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 6) {
//			String regex2 = "[0-9]{6}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '8')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 7) {
//			String regex2 = "[0-9]{7}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && (IDstr[1] == '3' || IDstr[1] == '6'))
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 8) {
//			String regex2 = "[0-9]{8}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && (IDstr[1] == '5' || IDstr[1] == '7'))
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 9) {
//			String regex2 = "[0-9]{9}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '4')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 10) {
//			String regex2 = "[0-9]{10}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '2')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 11) {
//			String regex2 = "[0-9]{11}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '1')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是5,6位数字 当为5位时，码的第1,2位是3,4 当为6位时，码的第1,2位是1,2 author：wt
	 */
	public static FunctionResult ParamCode35_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//
//		if (len == 5) {
//			String regex2 = "[0-9]{5}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '3' || IDstr[0] == '4')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 6) {
//			String regex2 = "[0-9]{6}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '1' || IDstr[0] == '2')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		}
//
//		else
//			return ERR;

		/*
		 * if (LenIndex == 5) { for (int i = 0; i < 5; i++) { int index = (int)
		 * IDstr[Index[i]] - 48; if (index < 0 || index > 9) return ERR; } if
		 * (IDstr[0] == '3' || IDstr[0] == '4') return OK; else return ERR; } if
		 * (LenIndex == 6) { for (int i = 0; i < 6; i++) { int index = (int)
		 * IDstr[Index[i]] - 48; if (index < 0 || index > 9) return ERR; } if
		 * (IDstr[0] == '1' || IDstr[0] == '2') return OK; else return ERR; }
		 * return ERR;
		 */
	}

	/*
	 * 校验最后的码，可能是7,9,10位数字 当为7位时，码的第1位是3 当为9位时，码的第1位是1 当为10位时，码的第1位是2 author：wt
	 */
	public static FunctionResult ParamCode38_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//
//		if (len == 7) {
//			String regex2 = "[0-9]{7}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '3')
//					return OK;
//				else
//					return ERR;
//
//			} else
//				return ERR;
//		} else if (len == 9) {
//			String regex2 = "[0-9]{9}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '1')
//					return OK;
//				else
//					return ERR;
//
//			} else
//				return ERR;
//		} else if (len == 10) {
//			String regex2 = "[0-9]{10}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '2')
//					return OK;
//				else
//					return ERR;
//
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是6,7位数字 当为6位时，码的第1位是1或2 当为7位时，码的第1位是3 author：wt
	 */
	public static FunctionResult ParamCode41_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		int len2 = IDstr.length;
//		for (int i = Index[0]; i < len2; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		if (len == 6) {
//			String regex1 = "[0-9]{6}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '1' || IDstr[0] == '2')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 7) {
//			String regex2 = "[0-9]{7}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '3') {
//					return OK;
//				} else
//					return ERR;
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * 校验最后的码，可能是6,7位数字 当为3位时，码的第1,2位是15 当为5位时，码的第1,2位是09,10,11,13
	 * 当为6位时，码的第1,2位是01,06,12 当为7位时，码的第1,2位是02,03,04,05,07,08 当为8位时，码的第1,2位是14
	 * author：wt
	 */
	public static FunctionResult ParamCode43_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//		for (int i = Index[0]; i < IDstr.length; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		int len = code.length();
//		// System.out.println("aaa:"+IDstr[0]+"b:"+len);
//		if (len == 3) {
//			String regex1 = "[0-9]{3}";
//			Pattern pa = Pattern.compile(regex1);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '1' && IDstr[1] == '5')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 5) {
//			String regex2 = "[0-9]{5}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '9' || IDstr[0] == '1'
//						&& IDstr[1] == '0' || IDstr[0] == '1'
//						&& IDstr[1] == '1' || IDstr[0] == '1'
//						&& IDstr[1] == '3')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 6) {
//			String regex2 = "[0-9]{5}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '1' || IDstr[0] == '0'
//						&& IDstr[1] == '6' || IDstr[0] == '1'
//						&& IDstr[1] == '2')
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} else if (len == 7) {
//			String regex2 = "[0-9]{7}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '0' && IDstr[1] == '2' || IDstr[0] == '0'
//						&& IDstr[1] == '3' || IDstr[0] == '0'
//						&& IDstr[1] == '4' || IDstr[0] == '0'
//						&& IDstr[1] == '5' || IDstr[0] == '0'
//						&& IDstr[1] == '7' || IDstr[0] == '0'
//						&& IDstr[1] == '8')
//					return OK;
//				else
//					return ERR;
//
//			} else
//				return ERR;
//		} else if (len == 8) {
//			String regex2 = "[0-9]{8}";
//			Pattern pa = Pattern.compile(regex2);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				if (IDstr[0] == '1' && IDstr[1] == '4')
//					return OK;
//				else
//					return ERR;
//
//			} else
//				return ERR;
//		} else
//			return ERR;
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials44_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials44(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials45_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials45(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials46_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials46(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials47_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials47(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials49_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials49(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials50_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials50(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials51_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials51(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials52_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials52(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials53_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials53(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * IDstr: ID string LenID: the number of characters in the ID string Index:
	 * the list of corresponding indexes regarding to this algorithm Index: the
	 * list of corresponding indexes regarding to this algorithm LenIndex: the
	 * number of indexes creator:wt
	 */

	public static FunctionResult PowerMaterials54_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPowerMaterials54(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	// 509互联网网上服务营业场所——第五部分
	// IDstr: 标识编码
	// LenID: 标识编码的长度4位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public static FunctionResult InternetWebService_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTariff509(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 966-国家工程建设标准体系编码统一规则 fdl
	// [A1 A2 A3 B1 C1 D1 E1 F1 G1 H1 J1 K1 L1 M1 N1 P1 Q1 R1]两位关联
	public static FunctionResult projectbuild_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			if ((IDstr[Index[0]] == 'A' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'A' && IDstr[Index[1]] == '2')
//					|| (IDstr[Index[0]] == 'A' && IDstr[Index[1]] == '3')
//					|| (IDstr[Index[0]] == 'B' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'C' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'D' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'E' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'F' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'G' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'H' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'J' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'K' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'L' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'M' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'N' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'P' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'Q' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == 'R' && IDstr[Index[1]] == '1')) {
//				return OK;
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 放射源编码规则 核元素国家代码 fdl
	public static FunctionResult NuclearelementNation_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 2; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortNuclearelementNation(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 放射源编码规则 fdl
	public static FunctionResult Nuclearelements_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 2; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortNuclearelements(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 工商行政管理注册号编制规则 fdl
	public static FunctionResult BusinessAdminis_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			String code = "";
//			for (int i = 0; i < 6; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getAdminDivisionID(code);
//			if (ret) {
//				return OK;
//			} else if (code.equals("100000")) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 汽车标准件产品编号规则
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: (13,-1),从13位以后的字符串进行正则表达式验证
	// LenIndex: 长度至少为1位，最多2位
	// creator: fdl
	public static FunctionResult CarProduct_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[1-6,9][0-4,6,9,A-N,P-Y]{0,1}";
//			int prefix = 13;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			// 最后一位为校验位
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 汽车产品零部件边编码规则
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index:4
	// LenIndex: 长度必为4
	// creator: fdl
	public static FunctionResult CarProductCompnent_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortCarProductCompnent(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// GB/T 23733中国标准音乐作品编码 fdl
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index:15
	// LenIndex: 长度必为15
	// creator: fdl
	public static FunctionResult StandardMusicCheckCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 15) {
//				return ERR;
//			}
//			int i;
//			int[] newIDstr = new int[LenIndex];
//			for (i = 0; i < LenIndex - 4; i++) {
//				newIDstr[i] = (int) (IDstr[Index[i + 4]] - 48);
//			}
//
//			int sum = 0;
//			for (int j = 1; j < 10; j++) {
//				sum = 1 + sum + i * newIDstr[i];
//			}
//			sum = sum + newIDstr[10];
//
//			int check;
//			check = sum % 10;
//			if (check == 0) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: TCL金能电池编码规则
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index:4
	// LenIndex: 长度必为4
	// creator: fdl
	public static FunctionResult TCLBatteryProduct_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 4; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortTCLBatteryProduct(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: TCL金能电池编码规则——第三级编码
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index:4
	// LenIndex: 长度必为4
	// creator: fdl
	public static FunctionResult ProductCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (IDstr[0] == '2') {
//			String code = "";
//			String regex = "[0-9]*";
//			for (int i = Index[0]; i < IDstr.length; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		}
//		if (IDstr[0] == '1') {
//			String code = "";
//			for (int i = Index[0]; i < IDstr.length; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortProductCode(code);
//			if (ret) {
//				return OK;
//			} else {
//				return ERR;
//			}
//		}
//		return ERR;
	}

	// Function: 504 第10部分：服务类型及内容代码
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 4
	// creator: lhx
	public static FunctionResult ServiceContentCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int index4 = (int) IDstr[Index[3]] - 48;
//			int code = index1 * 1000 + index2 * 100 + index3 * 10 + index4;
//			if ((code >= 0 && code <= 11) || code == 999)
//				return OK;
//			else if ((code >= 1000 && code <= 1010) || code == 1999)
//				return OK;
//			else if ((code >= 2000 && code <= 2180) || code == 2999)
//				return OK;
//			else if (code == 9999)
//				return OK;
//			else
//				return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	// Function: 516 第1部分：交通违法行为分类代码
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// LenIndex: the number of indexes that must be 4
	// creator: lhx
	public static FunctionResult TraViolativeActionCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//		try {
//			int index1 = (int) IDstr[Index[0]] - 48;
//			int index2 = (int) IDstr[Index[1]] - 48;
//			int index3 = (int) IDstr[Index[2]] - 48;
//			int index4 = (int) IDstr[Index[3]] - 48;
//			int code = index1 * 1000 + index2 * 100 + index3 * 10 + index4;
//			if ((index1 >= 1 && index1 <= 8) && (index2 >= 0 && index2 <= 7)) {
//				if (code >= 1001 && code <= 1073)
//					return OK;
//				else if (code >= 1101 && code <= 1110)
//					return OK;
//				else if (code >= 1201 && code <= 1239)
//					return OK;
//				else if (code >= 1301 && code <= 1339)
//					return OK;
//				else if (code >= 1601 && code <= 1609)
//					return OK;
//				else if (code >= 1701 && code <= 1709)
//					return OK;
//				else if (code >= 2001 && code <= 2055)
//					return OK;
//				else if (code >= 3001 && code <= 3030)
//					return OK;
//				else if (code >= 4001 && code <= 4009)
//					return OK;
//				else if (code >= 4201 && code <= 4203)
//					return OK;
//				else if (code >= 4301 && code <= 4310)
//					return OK;
//				else if (code >= 4601 && code <= 4606)
//					return OK;
//				else if (code >= 5001 && code <= 5067)
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	// Function: 516-2 represent a decimal integer whose value range is from 1
	// to
	// 9999999999
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:lhx
	public static FunctionResult TenByteDecimalnt_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 10) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				int check = (int) IDstr[Index[i]] - 48;
//				if (check >= 0 && check <= 9)
//					;
//				else
//					return ERR;
//
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//			int i2 = (int) IDstr[Index[2]] - 48;
//			int i3 = (int) IDstr[Index[3]] - 48;
//			int i4 = (int) IDstr[Index[4]] - 48;
//			int i5 = (int) IDstr[Index[5]] - 48;
//			int i6 = (int) IDstr[Index[6]] - 48;
//			int i7 = (int) IDstr[Index[7]] - 48;
//			int i8 = (int) IDstr[Index[8]] - 48;
//			int i9 = (int) IDstr[Index[9]] - 48;
//
//			long i = 1000000000l * i0 + 100000000l * i1 + 10000000l * i2
//					+ 1000000 * i3 + 100000l * i4 + i5 * 10000l + i6 * 1000l
//					+ i7 * 100l + i8 * 10l + i9;
//			if (i >= 1 && i <= 9999999999l) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:510 居民身份证材料及所有软件、设备代码
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 7
	// Creator:lhx
	public static FunctionResult IDcardByMaterial_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 7) {
//				return ERR;
//			}
//			String code = "";
//			for (int i = 0; i < 3; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//
//			int i0 = (int) IDstr[Index[3]] - 48;
//			int i1 = (int) IDstr[Index[4]] - 48;
//			int i2 = (int) IDstr[Index[5]] - 48;
//			int i3 = (int) IDstr[Index[6]] - 48;
//			long i = 1000 * i0 + 100 * i1 + 10 * i2 + i3;
//			if (code != null && code.equals("JCL")) {
//				if (i == 110 || i == 120 || i == 190 || i == 220 || i == 290
//						|| i == 310 || i == 320 || i == 330 || i == 390
//						|| i == 410 || i == 490 || i == 510 || i == 520
//						|| i == 530 || i == 590 || i == 610 || i == 690
//						|| i == 710 || i == 720 || i == 730 || i == 740
//						|| i == 750 || i == 760 || i == 790 || i == 210)
//					return OK;
//				else
//					return ERR;
//			} else if (code != null && code.equals("JGC")) {
//				if (i == 110 || i == 120 || i == 130 || i == 140 || i == 190
//						|| i == 210 || i == 290)
//					return OK;
//				else
//					return ERR;
//
//			} else if (code != null && code.equals("JRJ")) {
//				if (i == 110 || i == 120 || i == 130 || i == 140 || i == 150
//						|| i == 190 || i == 210 || i == 290 || i == 310
//						|| i == 390 || i == 410 || i == 420 || i == 490
//						|| i == 590)
//					return OK;
//				else
//					return ERR;
//			} else if (code != null && code.equals("JCS")) {
//				if (i == 110 || i == 120 || i == 190 || i == 130)
//					return OK;
//				else
//					return ERR;
//			} else if (code != null && code.equals("JGS")) {
//				if (i == 110 || i == 150 || i == 190 || i == 210 || i == 220
//						|| i == 290 || i == 310 || i == 320 || i == 390
//						|| i == 490 || i == 590 || i == 120)
//					return OK;
//				else
//					return ERR;
//			} else if (code != null && code.equals("JAS")) {
//				if (i == 110 || i == 120 || i == 130 || i == 190 || i == 210
//						|| i == 230 || i == 220 || i == 290 || i == 240
//						|| i == 310 || i == 320 || i == 390)
//					return OK;
//				else
//					return ERR;
//			} else if (code != null && code.equals("JJS")) {
//				if (i == 110 || i == 120 || i == 190 || i == 210 || i == 220
//						|| i == 290)
//					return OK;
//				else
//					return ERR;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 信用主体表示规范校验码 类似MOD112
	// 其中MOD－表示求余函数；i－表示代码字符从左至右位置序号；Ci－表示第i位置上的代码字符的值；Wi－表示第i位置上的加权因子，
	// 加权因子的公式是：2的n-1次幂除以11取余数，n就是那个i，从右向左排列
	// 当校检的值为10时 赋值位X.当校检的值为11时 赋值位0
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:YZC
	public static FunctionResult MOD11_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// ISO 7064:1983.MOD 11-2校验算法，字符串开辟空间时要多一位留给最后加校验位
//			double sum = 0; // 最后的校验码
//			int i, j;
//			int b = LenIndex - 1;
//			int a;
//			a = 'A';
//			for (j = 0; j < LenIndex - 1; j++) {
//				for (i = 0; i < 26; i++) {
//					char c = (char) (a + i);
//					if ((int) IDstr[Index[j]] == c) {
//						IDstr[Index[j]] = (char) (10 + i);
//					}
//				}
//			}
//
//			for (i = 0; i < LenIndex - 1; i++) {
//				if (IDstr[Index[i]] > 47) {
//					IDstr[Index[i]] = (char) (IDstr[Index[i]] - 48);
//				}
//				sum = sum + (int) (IDstr[Index[i]])
//						* (Math.pow(2, LenIndex - i - 1) % 11);
//			}
//			char check;
//			int mod;
//			sum %= 11;
//			mod = (int) (11 - sum) % 11;
//			if (mod == 10) {
//				check = "X".charAt(0); // X表示10
//			} else {
//				String jieshou = Integer.toString(mod);
//				check = jieshou.charAt(0);
//			}
//			if (check == (IDstr[Index[b]])) {
//
//				return OK;
//
//			} else {
//
//				return ERR;
//
//			}
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 信用主体标识规范正则匹配,数字(603)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度<=2
	// creator: yzc
	public static FunctionResult CreditIdentifiers_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[0-9]{0,1}";
//			int prefix = 13;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID - 1; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 轮胎气门嘴及其零部件的标识方法正则匹配,字母(615)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度<=1
	// creator: yzc
	public static FunctionResult TubesValves_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[C]{0,}";
//			int prefix = 4;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 轮胎气门嘴及其零部件的标识方法正则匹配,字母(615)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度<=1
	// creator: yzc
	public static FunctionResult TubesValves1_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[C]{0,}";
//			int prefix = 3;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:商品条码 应用标识符（632）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult BarCodeForCommodity_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		int[] indexNew = null;
//		if (LenIndex > LenCODE) {
//			LenIndex = LenCODE;
//			indexNew = new int[LenIndex];
//			for (int i = 0; i < LenIndex; i++) {
//				indexNew[i] = Index[i];
//			}
//		} else {
//			indexNew = Index;
//		}
//		if (!checkInputParam(CODEstr, LenCODE, indexNew, LenIndex)) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(CODEstr[indexNew[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getBarCodeForCommodity(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 识别卡 发卡者标识 第一部分正则匹配,数字(635)
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:长度<=12
	// creator: yzc
	public static FunctionResult IdentificationCardsP1_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[0-9]{0,11}";
//			int prefix = 6;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			// 最后一位为校验位
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			int[] modIndex = new int[LenID];
//			for (int i = 0; i < LenID; i++) {
//				modIndex[i] = i;
//			}
//			String modRet = InternationalSecurities(IDstr, LenID, modIndex,
//					LenID);
//			if (ret && modRet.equals(OK)) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * 校验前4位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase70_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "43", "44", "45", "46", "47", "48", "49", "50", "51",
//				"52", "53" };
//		for (int i = 0; i < 11; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;

	}

	/*
	 * 校验前4位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase71_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 4) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayDatabase71(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase66_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "11", "12", "13", "14", "15", "16", "17", "18", "24",
//				"31", "41", "42", "43", "44", "51", "52", "53", "54", "55",
//				"56", "57", "61", "62", "90" };
//		for (int i = 0; i < 24; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase65_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "11", "12", "13", "17", "18", "19" };
//		for (int i = 0; i < 6; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase59_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "10", "11", "12", "20" };
//		for (int i = 0; i < 4; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 757 author:wt
	 */
	public static FunctionResult HighwayDatabase47_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 3) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayDatabase47(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * 757 author:wt
	 */
	public static FunctionResult HighwayDatabase46_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayDatabase46(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase26_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "00", "01", "02", "03", "04", "05", "06", "07", "08",
//				"09", "10", "11", "12", "13", "14", "15", "90" };
//		for (int i = 0; i < 17; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase25_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "00", "01", "02", "03", "04", "05", "06", "07", "08",
//				"09", "10", "11", "12", "90" };
//		for (int i = 0; i < 14; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase24_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "10", "11", "12", "13", "14", "15", "16", "17", "18",
//				"20", "21", "22", "23", "24", "25", "26", "27", "30", "31",
//				"32", "40", "50", "60", "61", "62", "63", "70", "80", "90" };
//		for (int i = 0; i < 29; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase18_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "10", "11", "12", "20", "21", "22", "23", "30", "31",
//				"32", "33", "40", "41", "42", "50", "90" };
//		for (int i = 0; i < 16; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 757 author:wt
	 */
	public static FunctionResult HighwayDatabase17_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//
//		String code = "";
//		for (int i = 0; i < LenIndex; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		try {
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHighwayDatabase17(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase16_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "10", "11", "12", "13", "20", "21", "22", "30", "31",
//				"32", "40", "41", "42", "43", "44", "45" };
//		for (int i = 0; i < 16; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase13_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "10", "11", "12", "20", "21", "22", "23", "24", "25",
//				"26", "27", "28", "29", "40", "41", "42", "43", "44", "45",
//				"46", "47", "90" };
//		for (int i = 0; i < 22; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase8_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;

//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "10", "11", "12", "13", "14", "15", "16", "17", "18",
//				"19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
//				"29", "30", "40", "41", "42", "50", "60", "70", "80", "90" };
//		for (int i = 0; i < 29; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase7_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "GG", "GS", "GX", "GY", "GZ", "SS", "SX", "SY", "SZ",
//				"XX", "XY", "XZ", "YY", "YZ" };
//		for (int i = 0; i < 14; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	/*
	 * 校验前2位是不是这些数字 757 author:wt
	 */
	public static FunctionResult HighwayDatabase6_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		String code = "" + String.valueOf(IDstr[Index[0]])
//				+ String.valueOf(IDstr[Index[1]]);
//		String[] data = { "10", "11", "20", "21", "30", "31", "32", "33", "34",
//				"35", "36", "40", "41", "50", "51", "60", "61", "70", "71",
//				"72", "73", "74", "75", "76", "90", "91" };
//		for (int i = 0; i < 26; i++) {
//			if (code.equals(data[i]))
//				return OK;
//		}
//		return ERR;
	}

	// Function:中国石油天然气总公司企、事业单位代码（763）
	// CODEstr: 标识编码
	// LenCODE: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:
	// Creator:YZC
	public static FunctionResult GassCompany_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			if (!checkInputParam(CODEstr, LenCODE, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (LenIndex != 7) {
//				return ERR;
//			}
//			for (int i = 0; i < LenIndex; i++) {
//				code = code.concat(String.valueOf(CODEstr[Index[i]]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getGassCompany(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * 验证标准11的前六位是不是在数据库中
	 * 
	 * author:wt
	 */
	public static FunctionResult HydrologicData_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 6) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < IDstr.length; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getHydrologicData(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}

	}

	/*
	 * 验证标准12的前9位是不是在数据库中
	 * 
	 * author:wt
	 */
	public static FunctionResult MeatandVegetable_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 9) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < IDstr.length; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMeatandVegetable(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// 中国动物分类代码 fdl
	// Function: represent a decimal integer whose value range is from 010 to
	// 999
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator: fdl
	public static FunctionResult ChinaAnimal_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			if ((IDstr[Index[0]] == 'A' && IDstr[Index[1]] == 'G')
//					|| (IDstr[Index[0]] == 'A' && IDstr[Index[1]] == 'M')
//					|| (IDstr[Index[0]] == 'A' && IDstr[Index[1]] == 'V')
//					|| (IDstr[Index[0]] == 'M' && IDstr[Index[1]] == 'A')
//					|| (IDstr[Index[0]] == 'P' && IDstr[Index[1]] == 'S')
//					|| (IDstr[Index[0]] == 'R' && IDstr[Index[1]] == 'P')) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 森林类型编码规则
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index:5
	// LenIndex: 长度必为5
	// creator: fdl
	public static FunctionResult ForestTypes_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 5) {
//			return ERR;
//		}
//		try {
//			String code = "";
//			for (int i = 0; i < 5; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPortForestTypes(code);
//			if (ret) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:654 烟卷箱用条码标签 组织机构类型
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 2
	// Creator:lhx
	public static FunctionResult OrganizationCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//
//			int i = 10 * i0 + i1;
//			if ((i >= 10 && i <= 23) || i == 99) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:654 烟卷箱用条码标签 组织所属省、自治区、直辖市
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 2
	// Creator:lhx
	public static FunctionResult Province_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//
//			int i = 10 * i0 + i1;
//			if (i >= 11 && i <= 15) {
//				return OK;
//			} else if (i >= 21 && i <= 23)
//				return OK;
//			else if (i >= 31 && i <= 37)
//				return OK;
//			else if (i >= 41 && i <= 46)
//				return OK;
//			else if (i >= 50 && i <= 54)
//				return OK;
//			else if (i >= 61 && i <= 65)
//				return OK;
//			else if (i == 71 || i == 81 || i == 82 || i == 00)
//				return OK;
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:654 烟卷箱用条码标签 组织所属市、地区
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 2
	// Creator:lhx
	public static FunctionResult City_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;

//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//
//			int i = 10 * i0 + i1;
//			if (i >= 0 && i <= 70) {
//				return OK;
//			} else if (i == 90)
//				return OK;
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:658 二位条形码网格矩阵码 小写字母模式
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 5
	// Creator:lhx
	public static FunctionResult Letter_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 5) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int k = 0; k < 5; k++) {
//				if (IDstr[k] == '0' || IDstr[k] == '1') {
//					code = code.concat(String.valueOf(IDstr[k]));
//				} else
//					return ERR;
//			}
//			BigInteger src = new BigInteger(code, 2);
//			if (src.intValue() >= 0 && src.intValue() <= 26)
//				return OK;
//			else
//				return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:658 二位条形码网格矩阵码 数字字母混合模式
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 6
	// Creator:lhx
	public static FunctionResult DigitAndLetter_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int k = 0; k < 6; k++) {
//				if (IDstr[k] == '0' || IDstr[k] == '1') {
//					code = code.concat(String.valueOf(IDstr[k]));
//				} else
//					return ERR;
//			}
//			BigInteger src = new BigInteger(code, 2);
//			int traCode = src.intValue();
//			if (traCode >= 0 && traCode <= 63)
//				return OK;
//			else
//				return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:700 陆生野生动物疫病分类
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 10
	// Creator:lhx
	public static FunctionResult AnimalDisease_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 10) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int k = 0; k < 10; k++) {
//
//				code = code.concat(String.valueOf(IDstr[k]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getAnimalDiseaseByCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:704海洋信息分类与代码3,4两位定义
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 2
	// Creator:lhx
	public static FunctionResult OceanInfoMid_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			int i1 = (int) IDstr[Index[1]] - 48;
//			int i0 = (int) IDstr[Index[0]] - 48;
//
//			int i = 10 * i0 + i1;
//			if (i >= 1 && i <= 14) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:698 全国卫生行业医疗器械、仪器设备分类
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 8
	// Creator:lhx
	public static FunctionResult MedicalInstru_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 8) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int k = 0; k < 8; k++) {
//
//				code = code.concat(String.valueOf(IDstr[k]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getMedicalInstrumentByCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:728(1)中医疾病分类
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 6
	// Creator:lhx
	public static FunctionResult TCMDisease_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int k = 0; k < 6; k++) {
//
//				code = code.concat(String.valueOf(IDstr[k]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTCMdiseaseByCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:728(2)中医疾病症状
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 6
	// Creator:lhx
	public static FunctionResult TCMFeature_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 6) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int k = 0; k < 6; k++) {
//
//				code = code.concat(String.valueOf(IDstr[k]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getTCMFeatureByCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:706,708地质分类
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 2
	// Creator:lhx
	public static FunctionResult DZClassify_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int k = 0; k < 2; k++) {
//
//				code = code.concat(String.valueOf(IDstr[k]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getDZClassifyByCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:710地质分类
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes 2
	// Creator:lhx
	public static FunctionResult DZClassify710_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//			String code = "";
//
//			for (int k = 0; k < 2; k++) {
//
//				code = code.concat(String.valueOf(IDstr[k]));
//			}
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getDZClassify710ByCode(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 722 国际贸易计量单位
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index: 调用正则的的索引位置
	// LenIndex:不定长
	// creator: lhx
	public static FunctionResult MeasureUnit_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[0-9,A-Z]{1,3}";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//
//			for (int i = 0; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: check the legality of the first seven numbers of a given mobile
	// phone number
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// creator: dgq
	public static FunctionResult MobilePhoneNum_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//
//			String code = "";
//			int LEN_PREFIX = 7; // relate to the first 7 number of a given phone
//			// number
//			for (int i = 0; i < LEN_PREFIX; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPrefixPhoneNO(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: check the legality of the first two characters of a normal
	// vehicle number
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// creator: dgq
	public static FunctionResult VehicleNONormal_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//
//			String code = "";
//			int LEN_PREFIX = 2; // relate to the first 2 characters of a given
//			// normal vehicle number
//			for (int i = 0; i < LEN_PREFIX; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPrefixNormalVehicleNO(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: check the legality of the first two characters of a army
	// vehicle number
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// creator: dgq
	public static FunctionResult VehicleNOArmy_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//
//			String code = "";
//			int LEN_PREFIX = 2; // relate to the first 2 characters of a army
//			// vehicle number
//			for (int i = 0; i < LEN_PREFIX; i++) {
//				code = code.concat(String.valueOf(IDstr[Index[i]]));
//			}
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPrefixArmyVehicleNO(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: check the legality of the last one character of a army vehicle
	// number
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// creator: dgq
	public static FunctionResult VehicleNOArmySuffix_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//
//			if (7 == LenID) { // the length of the army vehicle number is 7
//				if (IDstr[6] >= '0' && IDstr[6] <= '9') {
//					return OK;
//				}
//			} else if (6 == LenID) {// the length of the army vehicle number is
//				// 6
//				return OK;
//			}
//
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: check the legality of the third character of a WJ vehicle
	// number
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// creator: dgq
	public static FunctionResult VehicleNOWJ_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;

//		try {
//
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//
//			String code = String.valueOf(IDstr[Index[0]]);
//
//			RecoDao recoDao = new RecoDao();
//			boolean ret = recoDao.getPrefixWJVehicleNO(code);
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function:
	// http://zh.wikipedia.org/zh-cn/%E5%9B%BD%E9%99%85%E6%A0%87%E5%87%86%E4%B9%A6%E5%8F%B7
	// creator: menglunyang
	public static FunctionResult ISBN13_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (IDstr[0] == '9' && IDstr[1] == '7'
//					&& (IDstr[2] == '8' || IDstr[2] == '9')) {
//				int checkNumber = (IDstr[0] - 48) * 1 + (IDstr[1] - 48) * 3
//						+ (IDstr[2] - 48) * 1 + (IDstr[3] - 48) * 3
//						+ (IDstr[4] - 48) * 1 + (IDstr[5] - 48) * 3
//						+ (IDstr[6] - 48) * 1 + (IDstr[7] - 48) * 3
//						+ (IDstr[8] - 48) * 1 + (IDstr[9] - 48) * 3
//						+ (IDstr[10] - 48) * 1 + (IDstr[11] - 48) * 3;
//				checkNumber = checkNumber % 10;
//				checkNumber = 10 - checkNumber;
//				if (checkNumber == 10 && IDstr[12] == '0'
//						|| checkNumber == IDstr[12] - 48)
//					return OK;
//			}
//			return ERR;
//
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	/*
	 * 1,2,3 digit wt
	 */
	public static FunctionResult One2ThreeDigit_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//
//		for (int i = Index[0]; i < LenID; i++) {
//			code = code.concat(String.valueOf(IDstr[i]));
//		}
//		String regex = "[0-9]{1,3}";
//		Pattern pa = Pattern.compile(regex);
//		Matcher ma = pa.matcher(code);
//		boolean ret = ma.matches();
//		if (ret) {
//			return OK;
//		} else
//			return ERR;
	}

	// JT/T_307.5-1999 校验最后一位是A-E或者空
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator:wt
	public static FunctionResult A2EOrNull_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//
//		int len = LenID - 1 - Index[0];
//		if (len == 0)
//			return OK;
//		if (len == 1) {
//			String code = String.valueOf(IDstr[LenID - 1]);
//
//			String regex = "[A-E]";
//
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		}
//		return ERR;
	}

	// special character underline _
	// zll
	public static FunctionResult Underline_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[_]";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// Index[0]保存的位置
//			code = String.valueOf(IDstr[Index[0]]);
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// special character hyphen - zll
	public static FunctionResult Hyphen_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[-]";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// Index[0]保存的位置
//			code = String.valueOf(IDstr[Index[0]]);
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// specail character plus - zll
	public static FunctionResult Plus_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[+]";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// Index[0]保存的位置
//			code = String.valueOf(IDstr[Index[0]]);
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// specail character slash - zll
	public static FunctionResult Slash_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;

//		try {
//			String code = "";
//			String regex = "[/]";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// Index[0]保存的位置
//			code = String.valueOf(IDstr[Index[0]]);
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// specail character dot - zll
	public static FunctionResult Dot_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[.]";
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			// Index[0]保存的位置
//			code = String.valueOf(IDstr[Index[0]]);
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// Function: 判断2个字节是不是属于(01-08,90)
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes, 固定为2
	public static FunctionResult TwobytleCode08and90_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			int index1 = Index[0];
//			int index2 = Index[1];
//
//			if (IDstr[index1] == '0') {
//				if (IDstr[index2] >= '1' && IDstr[index2] <= '8') {
//					return OK;
//				}
//			}
//
//			if (IDstr[index1] == '9' && IDstr[index2] == '0') {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// DL/T_700.1-1999_53(910) yzc
	public static FunctionResult Powergoodsuncertainly_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			String code = "";
//			String regex = "[0-9]{0,2}";
//			int prefix = 7;
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (Index[0] != prefix) {
//				return ERR;
//			}
//			for (int i = Index[0]; i < LenID; i++) {
//				code = code.concat(String.valueOf(IDstr[i]));
//			}
//			Pattern pa = Pattern.compile(regex);
//			Matcher ma = pa.matcher(code);
//			boolean ret = ma.matches();
//			if (ret) {
//				return OK;
//			} else
//				return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// wt
	public static FunctionResult OneTO10No99_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		if (LenIndex != 2) {
//			return ERR;
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int Xx = 10;
//		int i = 10 * index1 + index2;
//
//		if (i >= 01 && i <= Xx) {
//			return OK;
//		} else
//			return ERR;
	}

	// 全国主要产品分类代码 fdl
	// Function: represent a decimal integer whose value range is from 010 to
	// 999
	// IDstr: ID string
	// LenID: the number of characters in the ID string
	// Index: the list of corresponding indexes regarding to this algorithm
	// LenIndex: the number of indexes
	// Creator: fdl
	public static FunctionResult ProductThreeByte_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 3) {
//				return ERR;
//			}
//
//			int index1 = Index[0];
//			int index2 = Index[1];
//			int index3 = Index[2];
//
//			if ((IDstr[index1] == '0') && (IDstr[index2] == '0')) {
//				return ERR;
//			}
//
//			if ((IDstr[index1] < '0') || (IDstr[index1] > '9')) {
//				return ERR;
//			}
//
//			if ((IDstr[index2] < '0') || (IDstr[index2] > '9')) {
//				return ERR;
//			}
//			if ((IDstr[index3] < '0') || (IDstr[index3] > '9')) {
//				return ERR;
//			}
//
//			return OK;
//		} catch (Exception e) {
//			return ERR;
//		}
	}

	// GB/T_28422-2012_6 wt
	public static FunctionResult ClassOfCardCode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//			return ERR;
//		}
//		String code = "";
//
//		for (int i = 0; i < 2; i++) {
//			code = code.concat(String.valueOf(IDstr[Index[i]]));
//		}
//		int index1 = (int) IDstr[Index[0]] - 48;
//		int index2 = (int) IDstr[Index[1]] - 48;
//		int num = 10 * index1 + index2;
//		if (num >= 21 && num <= 53 && index1 >= 0 && index2 <= 9 && index2 >= 0
//				&& index2 <= 9)
//			return OK;
//		else
//			return ERR;
	}

	// 188城市市政综合监管信息系统
	// IDstr: 标识编码
	// LenID: 标识编码的长度 12位
	// Index: 调用验证算法的索引位置
	// LenIndex:12
	// creator:fdl
	public static FunctionResult Bigcode_Random(String curChars, String index) {
		FunctionResult Result = new FunctionResult();
		
		// to do something here!!!
		
		return Result;
//
//		try {
//			if (!checkInputParam(IDstr, LenID, Index, LenIndex)) {
//				return ERR;
//			}
//			if (LenIndex != 2) {
//				return ERR;
//			}
//
//			if ((IDstr[Index[0]] == '0' && IDstr[Index[1]] == '1')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '2')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '3')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '4')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '5')
//					|| (IDstr[Index[0]] == '0' && IDstr[Index[1]] == '6')
//					|| (IDstr[Index[0]] == '2' && IDstr[Index[1]] == '1')) {
//				return OK;
//			}
//			return ERR;
//		} catch (Exception e) {
//			return ERR;
//		}
	}
}

