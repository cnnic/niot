package cn.niot.dao;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import cn.niot.service.CreateIoTIDSample;
import mypack.HibernateSessionFactory;
import mypack.Iotid;

import org.hibernate.Query;
import org.hibernate.Transaction;

import cn.niot.util.JdbcUtils;

import cn.niot.util.*;

public class RecoDao {
	
	public static int flagHash = 0;
	
	//定义动态数据TableName用于存储从Mysql取出的表名
	public static ArrayList<String> TableName = new ArrayList<String>();
	// 将数据分别以code和id作为key存入哈希表中，只需要执行一次，以后就直接取数据
	public static Hashtable htKeyCodeAsValue = new Hashtable<String,Hashtable>();
	public static Hashtable htKeyIdAsValue = new Hashtable<String,Hashtable>();
	
	private static RecoDao recoDao = new RecoDao();

	// public static Connection connection = null;
	public static RecoDao getRecoDao() {
		return recoDao;
	}

	
	// 提取函数，用于提取sql语句中的表名
	public String extractFunction(String sql) {
		Pattern regex = Pattern.compile("(?<=from\\s)\\w+");
		Matcher m = regex.matcher(sql);
		while(m.find()) {
			return m.group();
		}
		
		return null;
		
	}
	
	// 公共函数
	public boolean publicFunction(String sql, String code) {
		
		Hashtable hashtable = new Hashtable<String,String>();
		String tableName = extractFunction(sql);
		boolean ret = false;
		System.out.println(code);
		System.out.println(tableName);
		
		try {
			if(flagHash == 0) {
				hashTable();
				flagHash = 1;
			}
		
			if(hashtable.get(code) != null)
			{
				System.out.println("not null");
				ret = true;
			}
		} finally {
			JdbcUtils.free(null, null, null);
		}
		
		return ret;
		
	}

	
	// 将数据分别以code和id作为key存入哈希表中，只需要执行一次，以后就直接取数据
	public void hashTable(){
		
		//注册JDBC驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//连接Mysql数据库
        Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://218.241.108.143:3306/idrecohash", "root", "niot");
		} catch (SQLException e) {
			System.out.println(e.toString());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			DatabaseMetaData meta = null;;
			ResultSet rs = meta .getTables(null, null,null,null);			
			while(rs.next()) {
				TableName.add(rs.getString("TABLE_NAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//results[i]用于存储SQL语句的运行结果
		PreparedStatement stmt[] = new PreparedStatement[TableName.size()];
		ResultSet results[] = new ResultSet[TableName.size()];
		
		try {
			
			for (int i = 0; i < TableName.size(); i++) {
			
			stmt[i] = connection.prepareStatement("select * from "+TableName.get(i));
			results[i] = stmt[i].executeQuery();
			}
					
		  //将数据库中表的信息存入相应的哈希表，code作为key，id作为value
		    for(int i = 0; i < TableName.size(); i++) {
		    	//System.out.println(TableName.get(i));
		    	Hashtable htCodeID = new Hashtable();
		    	Hashtable htIDCode = new Hashtable();
		    	while (results[i].next()) {
		    		//htKeyCode[i].put(results[i].getObject("code"), results[i].getObject("id"));
		    		htCodeID.put(results[i].getObject("code"), results[i].getObject("id")); 
		    		//htKeyId[i].put(results[i].getObject("id"), results[i].getObject("code"));
		    		htIDCode.put(results[i].getObject("id"), results[i].getObject("code"));
		    	}
		    	htKeyCodeAsValue.put(TableName.get(i), htCodeID);
		    	htKeyIdAsValue.put(TableName.get(i), htIDCode);
		    }	    
		} catch (SQLException e) {
			System.out.println(e.toString());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public String getIoTID(String id) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_IOTID);
			stmt.setString(1, id);
			results = stmt.executeQuery();

			while (results.next()) {
				String res = results.getString("id") + "  "
						+ results.getString("length") + "  "
						+ results.getString("byte") + "  "
						+ results.getString("function");
				System.out.println(res);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return "ok";
	}

	/*
	 * Hibernate test
	 */
	public HashMap<String, ArrayList<String>> HibernateDBreadTypeAndRules(
			HashMap<String, Double> rmvRuleSet,
			HashMap<String, Double> rmvIDSet,
			HashMap<String, ArrayList<String>> hashMapRuleToTypes) {
		HashMap<String, ArrayList<String>> hashMapTypeToRules = new HashMap<String, ArrayList<String>>();

		org.hibernate.Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();

		try {
			Query query = session.createQuery("from Iotid  ");
			List<Iotid> list = query.list();
			int rowcount = 0;
			for (Iotid admin : list) {
				ArrayList<String> rules = new ArrayList<String>();// ֵ е
																	// ArrayList
				String idType = admin.getid();// results.getString("id");
				String lengthRule = admin.getLength();// results.getString("length");
				String byteRule = admin.getByte_();// results.getString("byte");
				String functionRules = admin.getFunction();// results.getString("function");
				double priorProbability = admin.getPriorProbability();// results.getDouble("priorProbability");
				if (lengthRule.length() != 0) {
					lengthRule = "IoTIDLength)(?#PARA=" + lengthRule + "){]";
					rules.add(lengthRule);// eg.length8)(?#PARA=8){]
					// length8,8
					rmvRuleSet.put(lengthRule, 0.5);// rmvRuleSet length
					hashMapTypeToRulesSwitchhashMapRuleToTypes(
							hashMapRuleToTypes, lengthRule, idType);// hashMapTypeToRulesת
																	// hashMapRuleToTypes,
																	// length
				}
				if (byteRule.length() != 0) {
					String[] byteStrArray = byteRule.split(";");
					for (int i = 0; i < byteStrArray.length; i++) {
						byteStrArray[i] = "IoTIDByte)(?#PARA="
								+ byteStrArray[i] + "){]";
						rules.add(byteStrArray[i]);
						rmvRuleSet.put(byteStrArray[i], 0.5);// rmvRuleSet byte
						hashMapTypeToRulesSwitchhashMapRuleToTypes(
								hashMapRuleToTypes, byteStrArray[i], idType);// hashMapTypeToRulesת
																				// hashMapRuleToTypes,
																				// byte
					}
				}
				rmvIDSet.put(idType, priorProbability);// rmvRuleSet ID, 0.5
				ArrayList<String> types = new ArrayList<String>();

				String[] splitFunctionRules = functionRules
						.split("\\(\\?\\#ALGNAME=");
				for (int i = 0; i < splitFunctionRules.length; i++) {
					if (splitFunctionRules[i].length() != 0) {
						rules.add(splitFunctionRules[i]);
						rmvRuleSet.put(splitFunctionRules[i], 0.5);
						hashMapTypeToRulesSwitchhashMapRuleToTypes(
								hashMapRuleToTypes, splitFunctionRules[i],
								idType);
					}
				}
				hashMapTypeToRules.put(idType, rules);
			}
		} finally {
			if (session != null)
				session.close();
		}
		return hashMapTypeToRules;
	}

	/*
	 * 参数也是返回值 返回hashMapTypeToRules、rmvRuleSet、rmvIDSet、hashMapRuleToTypes
	 */
	public HashMap<String, ArrayList<String>> DBreadTypeAndRules(
			HashMap<String, Double> rmvRuleSet,
			HashMap<String, Double> rmvIDSet,
			HashMap<String, ArrayList<String>> hashMapRuleToTypes) {
		HashMap<String, ArrayList<String>> hashMapTypeToRules = new HashMap<String, ArrayList<String>>();

		Connection connection = JdbcUtils.getConnection();

		PreparedStatement stmt = null;
		ResultSet results = null;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_TYPEANDRULES);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				ArrayList<String> rules = new ArrayList<String>();// 函数返回值中的ArrayList
				String idType = results.getString("id");
				String lengthRule = results.getString("length");
				String byteRule = results.getString("byte");
				String functionRules = results.getString("function");
				double priorProbability = results.getDouble("priorProbability");
				if (lengthRule.length() != 0) {
					lengthRule = "IoTIDLength)(?#PARA=" + lengthRule + "){]";
					rules.add(lengthRule);// eg.length8)(?#PARA=8){]
					// 函数名字叫length8,参数8
					rmvRuleSet.put(lengthRule, 0.5);// 向rmvRuleSet添加length规则
					hashMapTypeToRulesSwitchhashMapRuleToTypes(
							hashMapRuleToTypes, lengthRule, idType);// hhashMapTypeToRules转换为hashMapRuleToTypes,处理length
				}
				if (byteRule.length() != 0) {
					String[] byteStrArray = byteRule.split(";");
					for (int i = 0; i < byteStrArray.length; i++) {
						byteStrArray[i] = "IoTIDByte)(?#PARA="
								+ byteStrArray[i] + "){]";
						rules.add(byteStrArray[i]);
						rmvRuleSet.put(byteStrArray[i], 0.5);// 向rmvRuleSet添加byte规则
						hashMapTypeToRulesSwitchhashMapRuleToTypes(
								hashMapRuleToTypes, byteStrArray[i], idType);// hhashMapTypeToRules转换为hashMapRuleToTypes,处理length
					}
				}
				rmvIDSet.put(idType, priorProbability);// 向rmvRuleSet添加ID,先验概率0.5
				ArrayList<String> types = new ArrayList<String>();

				String[] splitFunctionRules = functionRules
						.split("\\(\\?\\#ALGNAME=");
				for (int i = 0; i < splitFunctionRules.length; i++) {
					if (splitFunctionRules[i].length() != 0) {
						rules.add(splitFunctionRules[i]);
						rmvRuleSet.put(splitFunctionRules[i], 0.5);
						hashMapTypeToRulesSwitchhashMapRuleToTypes(
								hashMapRuleToTypes, splitFunctionRules[i],
								idType);
					}
				}
				hashMapTypeToRules.put(idType, rules);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return hashMapTypeToRules;
	}
	
	/* Function: read data relating to IoTIDs and their rules from table "iotidcode"
	 * Input: 
	 * @param type: a flag used to hint which database reading method is used.
	 * Output:
	 * @param HashMap<String, ArrayList<String>>: one data structure of HashMap with key of IoTID type and value of a group of rules
	 *        relating to the key.
	 * creator: Guangqing Deng
	 * time: 2014年7月7日
	 */
	public String DBreadIoTIDTypesAndRules(HashMap<String, Integer> hashMapTypeSampleNumber, HashMap<String, String>hashMapTypeToLengthRule
			, HashMap<String, ArrayList<String>>hashMapTypeToByteRule, HashMap<String, ArrayList<String>>hashMapTypeToFunctionRule) {		
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_TYPEANDRULES);
			results = stmt.executeQuery();

			while (results.next()) {
				ArrayList<String> ByteRules = new ArrayList<String>();// 字节规则列表
				ArrayList<String> FunctionRules = new ArrayList<String>();// 函数规则列表
				String idType = results.getString("id");
				String lengthRule = results.getString("length");
				String byteRule = results.getString("byte");
				String functionRules = results.getString("function");
				
				int Number = results.getInt("number");
				hashMapTypeSampleNumber.put(idType, Number);
				
				// process the length rule
				if (lengthRule.length() > 0) {
					lengthRule = "IoTIDLength)(?#PARA=" + lengthRule + "){]";
					hashMapTypeToLengthRule.put(idType, lengthRule);
				}
				
				// process the byte rule
				if (byteRule.length() > 0) {
					String[] byteStrArray = byteRule.split(";");
					int ByteLength = byteStrArray.length;
					for (int i = 0; i < ByteLength; i++) {
						byteStrArray[i] = "IoTIDByte)(?#PARA=" + byteStrArray[i] + "){]";
						ByteRules.add(byteStrArray[i]);							
					}
					hashMapTypeToByteRule.put(idType, ByteRules);
				}				
				
				// at last, process the function rule
				if (functionRules.length() > 0) {
					String[] splitFunctionRules = functionRules.split("\\(\\?\\#ALGNAME=");
					int FunctionLength = splitFunctionRules.length;
					for (int i = 0; i < FunctionLength; i++) {
						if (splitFunctionRules[i].length() != 0) {
							FunctionRules.add(splitFunctionRules[i]);						
						}
					}
					hashMapTypeToFunctionRule.put(idType, FunctionRules);
				}				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return "OK";
	}

	private void hashMapTypeToRulesSwitchhashMapRuleToTypes(
			HashMap<String, ArrayList<String>> hashMapRuleToTypes, String rule,
			String idType) {
		ArrayList<String> types = new ArrayList<String>();
		if (hashMapRuleToTypes.get(rule) == null) {// hashMapTypeToRules转换为hashMapRuleToTypes,处理function
			types.add(idType);
			hashMapRuleToTypes.put(rule, types);
		} else {
			types = hashMapRuleToTypes.get(rule);
			types.add(idType);
			hashMapRuleToTypes.put(rule, types);
		}

	}

	// 行政区划代码(296)
	public boolean getAdminDivisionID(String id) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_ADMINDIVISION);
			stmt.setString(1, id);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 世界各国和地区名称代码(279)
	public boolean getCountryRegionCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_COUNTRYREGIONCODE);
			int i = 1;
			stmt.setString(i++, code);
			stmt.setString(i++, code);
			stmt.setString(i++, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 烟草机械产品用物料 分类和编码 第3部分：机械外购件(7)
	public boolean getTabaccoMachineProduct(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TABACCOMACHINEPRODUCT);
			int i = 1;
			stmt.setString(i++, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}


	// 商品条码零售商品编码EAN UPC前3位前缀码
	public boolean getPrefixofRetailCommodityNumber(int code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_EANUPC);
			int i = 1;
			stmt.setInt(i++, code);
			stmt.setInt(i++, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 烟草机械物料 分类和编码第2部分：专用件 附录D中的单位编码(672)
	public boolean getTabaccoMachineProducer(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TABACCOMACHINEPRODUCER);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// CID调用4位数字行政区号
	public boolean getDistrictNo(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_DISTRICTNO);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	/// 烟草机械产品用物料 企业机械标准件 编码中的类别代码，组别代码和品种代码(6)
	public boolean getTabaccoStandardPart(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TABACCOSTANDARDPART);
			int i = 1;
			stmt.setString(i++, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}


	// 烟草机械产品用物料分类和编码 第6部分：原、辅材料(4)
	public boolean getTabaccoMaterial(String categoryCode, String variatyCode) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_TABACCOMATERIAL);
			int i = 1;
			stmt.setString(i++, categoryCode);
			stmt.setString(i++, variatyCode);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 财务会计分类与代码(15)
	public boolean getFoodAccount(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_FOORDACCOUNT);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与代码 粮食设备分类与代码(23)
	public boolean getGrainEquipment(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GRAINEQUIPMENT);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食设施分类与编码(24)
	public boolean getGrainEstablishment(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_GRAINESTABLISHMENT);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 烟草机械产品用物料 分类和编码 第5部分：电器元器件 (5)
	public boolean getTabaccoElectricComponent(String categoryCode,
			String groupCode) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TABACCOELECTRICCOMPONENT);
			int i = 1;
			stmt.setString(i++, categoryCode);
			stmt.setString(i++, groupCode);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 随机取出一条行政区划代码数据
	public String getRandomAdminDivision() {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		String code = "";
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_RANDOMADMINDIVISION);
			results = stmt.executeQuery();
			while (results.next()) {
				code = results.getString("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return code;
	}

	// 随机取出一条EANUPC数据
	public String getRandomEANUPC() {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		String code = "";
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_RANDOMEANUPC);
			results = stmt.executeQuery();
			while (results.next()) {
				code = String.valueOf(results.getInt("code"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return code;
	}

	// 返回标准详细信息
	public String getIDDetail(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		String name = "";
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_IDDETAIL);
			stmt.setString(1, code);
			results = stmt.executeQuery();
			while (results.next()) {
				name = results.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return name;
	}

	// 烟用材料编码 第1部分：烟用材料分类代码与产品代码(10)
	public boolean getTobbacoMaterials(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TABACCOMATERIALS);
			int i = 1;
			stmt.setString(i++, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}



	// 粮食信息分类与编码 粮食贸易业务统计分类与代码(14)
	public boolean getFoodTrade(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_FOODTRADE);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食加工(18)
	public boolean getFoodEconomy(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_FOODECONOMY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食仓储业务统计分类与代码(16)
	public boolean getGrainStoreHouse(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GRAINSTOREHOUSE);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 储粮病虫害分类与代码(17)
	public boolean getGrainsDiseases(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GRAINSDISEASES);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食加工第1部分：加工作业分类与代码(19)
	public boolean getGrainsProcess(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GRAINSPROCESS);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食仓储第3部分：器材分类与代码(20)
	public boolean getGrainsEquipment(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GRAINSEQUIPMENT);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食仓储第2部分：粮情检测分类与代码(21)
	public boolean getGrainConditionDetection(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_GRAINCONDITIONDETECTION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食仓储第1部分：仓储作业分类与代码(22)
	public boolean getgrainsSmartWMS(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GRAINSSMARTWMS);
			int i = 1;
			stmt.setString(i, code + "%");

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (rowcount >= 1) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食检验第2部分：质量标准分类与代码(26)
	public boolean getGrainsQualityStandard(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_GRIANQUALITYSTANDARD);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 计量器具命名与分类编码(32)
	public boolean getMeasuringInstrument(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_MEASURINGINSTRUMENT);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食检验 第1部分：指标分类与代码(27)
	public boolean getGrainsIndex(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GRAINSINDEX);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食及加工产品分类与代码(28)
	public boolean getGrainsInformation(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_GRAINSINFORMATION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食属性分类与代码(29)
	public boolean getGrainsAttribute(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GRAINSATTRIBUTE);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 粮食信息分类与编码 粮食行政、事业机构及社会团体分类与代码(31)
	public boolean getGrainsAdministrative(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_GRAINSADMINISTRATIVE);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 建筑产品分类和代码(34)
	public boolean getConstructionProducts(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_CONSTRUCTIONPRODUCTS);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 导航电子地图数据分类与编码(45)
	public boolean getElectronicMap(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_ELECTRONICMAP);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 地理信息分类与编码规则(56)
	public boolean getGeographicInformation(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_GEOGRAPHICINFORMATION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 纺织面料编码化纤部分(64)
	public boolean getTextileFabricNameCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TETILEFABRICNAME);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 纺织面料属性代码(64)机织物X1X2
	public boolean getPropertiesMainMaterial(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PROPERTIESMAINMATERIAL);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 纺织面料属性代码(64)非织造布X1X2
	public boolean getPropertiesMain(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PROPERTIESMAIN);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 纺织面料属性代码(64)纤维特征 X3X4
	public boolean getPropertiesFiberCharacteristics(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PROPERTIERFIBERCHARACTERS);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 纺织面料属性代码(64)X7X8纤网固结方式
	public boolean getPropertiesMix(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PROPERTIESMIX);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 纺织面料属性代码(64)X9X10 01-19 99
	public boolean getPropertiesFabric(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PROPERTIESFABRIC);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 纺织面料属性代码(64)X11X12
	public boolean getPropertiesDyeingandFinishing(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PROPERTIESDYEING);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 面向装备制造业产品全生命周期工艺知识第2部分(65)
	public boolean getGeneralManufacturingProcess(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_MANUFACTURINGPROCESS);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 全国主要产品分类与代码第2部分 不可运输产品后3位(712)
	public boolean getUntransportableProduct(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_UNTRANSPORTABLEPRODUCT);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 全国主要产品分类与代码第2部分 不可运输产品后3位(712)
	public boolean getLastThreeUntransportableProduct(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_LASTTHREEUNTRANSPORTABLEPRODUCT);
			int i = 1;
			stmt.setString(i, "%" + code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 道路交通信息采集信息分类与编码(77)
	public boolean getTrafficInformationCollection(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TRAFFICINFORMATIONCOLLECTION);
			int i = 1;
			stmt.setString(i++, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}


	// 烟草行业工商统计数据元第2部分 代码集(202)
	public boolean getTrafficOrganization(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TABACCOORGANIZATION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 烟叶代码第5部分烟叶颜色代码(204)
	public boolean getTobaccoLeafColor(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TABACCOLEAFCOLOR);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 烟叶代码第2部分烟叶形态代码(207)
	public boolean getTobaccoLeafForm(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_TABACCOLEAFFORM);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 烟叶代码第1部分烟叶分类与代码(208)
	public boolean getTobaccoLeafClass(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TABACCOLEAFCLASS);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 儿童大便性状代码(213)
	public boolean getChildrenExcrement(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_CHILDRENEXCREMENT);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 查找殡葬服务分类、设施分类、用品分类代码
	public boolean getFuneral(String id, String type) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(type);
			stmt.setString(1, id);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 饮酒频率代码(214)
	public boolean getDrinkingFrequency(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_DRINKINGFREQUENCY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 饮酒种类代码(214)
	public boolean getDrinkingClass(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_DRINKINGCLASS);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 身体活动频率代码(214)
	public boolean getPhysicalActivityFrequency(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PHYSICALACTIVITYFREQUENCY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 妊娠终止方式代码表(215)
	public boolean getTerminationofPregnancy(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TERMINATIONOFPREGNENCY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 分娩方式代码(215)
	public boolean getModeofProduction(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_MODEOFPRODUCTION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 分娩地点类别代码(215)
	public boolean getDileveryPlace(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_DILIVERYPLACE);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 卫生信息数据元值域代码第17部分：卫生管理(218)
	public boolean getHealthSupervisionObject(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HEALTHSUPERVISIONOBJECT);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 交通工具代码(219)
	public boolean getCommunicationCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_COMMUNICATIONCODE);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 卫生监督机构职工类别代码(220)
	public boolean getHygieneAgencyPersonnel(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HYGIENEAGENCYPERSONNEL);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 卫生监督机构职工类别代码(220)
	public boolean getWorkerHealthSupervision(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_WORKERHEALTHSUPERVISION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 烟草机械(195)
	public boolean getTobaccoMachineryID(String id) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_TABACCOMACHINEPRODUCT);
			stmt.setString(1, id);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 280-中央党政机关代码编制方法 查表数据库
	public boolean getPortTariff280(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF281);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 281-珠宝玉石及金属产品分类代码编制方法 查表数据库
	public boolean getPortTariff281(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFFMa281);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 281-珠宝玉石及金属材质分类代码编制方法 查表数据库
	public boolean getPortTariffMa281(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFFMa281);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 282-信息安全技术代码编制方法 查表数据库
	public boolean getPortTariffMa282(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFFMa282);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 284-社会经济目标分类和代码表 查表数据库
	public boolean getPortTariffMa284(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFFMa284);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 285-物流信息分类和代码表 查表数据库
	public boolean getPortTariffMa285(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFFMa285);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 287-服装分类和代码表 查表数据库
	public boolean getPortTariffMa287(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFFMa287);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 288-服装分类和代码表 查表数据库
	public boolean getPortTariffMa288(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFFMa288);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 291-医药器械分类和代码表 查表数据库
	public boolean getPortTariffMa291(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFFMa191);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 烟草机械电气配置和技术文件代码附录C表查询
	public boolean getPrefixoftabaccoC(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_tabaccoC);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 268-中央党政机关代码编制方法 查表数据库
	public boolean getPortTariff268(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF268);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 270-自然灾害分类代码编制方法 查表数据库
	public boolean getPortTariff270(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF270);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 275-物流作业货物分类代码编制方法 查表数据库
	public boolean getPortTariff275(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF275);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				//System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 276-废弃物品分类代码编制方法 查表数据库
	public boolean getPortTariff276(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF276);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 395-消防信息代码分类和代码表 查表数据库
	public boolean getFireInfomation395(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF395);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 399-消防信息代码分类和代码表 查表数据库
	public boolean getFireInfomation399(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF399);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 403-消防信息代码分类和代码表 查表数据库：社会宣传教育活动分类
	public boolean getFireInfomation403(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF403);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 409-消防信息代码分类和代码表 查表数据库：消防训练考核代码
	public boolean getFireInfomation409(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF409);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 国际贸易运输船舶名称与代码编制原则(312)
	public boolean getInternationalShipCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_INTERNATIONALSHIP);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 沿海行政区域代码(238)
	public boolean getCoastalAdminAreaID(String id) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_COASTALADMINAREAID);
			stmt.setString(1, id);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (rowcount == 1) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 经济类型代码(227)
	public boolean getWirtschaftsTypCodeID(String id) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_WIRTSCHAFTSTYPCODE);
			stmt.setString(1, id);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 传染病名称代码(225)
	public boolean getInfectiousDiseasesID(String id) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_INFECTIOUSDISEASES);
			stmt.setString(1, id);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 地名分类与类别代码编制规则(309)
	public boolean getGeographicalCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;

		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_GEOGRAPHICALCODE);

			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 农药剂型名称及代码
	public boolean getPesticideFormulationCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PESTICIDECODE);

			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 乘用车尺寸代码(306)
	public boolean getPassengerCarCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PASSENGERCARCODE);

			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;

	}

	public boolean getCivilAviation(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_CIVILAVIATION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation32(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION32);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation50(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION50);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation53(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION53);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getSecurityAccounterments(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_SECURITYACCOUNTERMENTS);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getSpecialVehicle(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_SPECIALVEHICLE);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation5(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION5);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation41(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION41);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation63(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION63);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation64(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION64);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getHighwayTransportation(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYTRANSPORTATION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getHighwayTransportation4b1(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYTRANSPORTATION4B1);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getHighwayTransportation4b7(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYTRANSPORTATION4B7);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getHighwayTransportation4b9(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYTRANSPORTATION4B9);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getHighwayTransportation4c3(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYTRANSPORTATION4C3);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPortTariff3(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF3);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPortTariff4(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF4);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPortTariff9(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF9);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPortTariff25(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF25);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPortTariff26(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF26);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPortTariff10(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF10);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getMachinery2(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_MACHINERY2);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getHighwayMaintenance4(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYMAINTENANCE4);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getHighwayMaintenance3(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYMAINTENANCE3);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getMachinery3(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_MACHINERY3);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getMachinery4(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_MACHINERY4);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getMachinery5(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_MACHINERY5);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getMachinery6(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_MACHINERY6);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getMachinery7(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_MACHINERY7);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getMachinery8(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_MACHINERY8);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getMachinery9(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_MACHINERY9);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getMachinery10(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_MACHINERY10);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getHighwayTransportation4c6(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYTRANSPORTATION4C6);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getHighwayTransportation4b10(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYTRANSPORTATION4B10);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getWaterwayTransportation(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_WATERWAYTRANSPORTATION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPort(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORT);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 410
	public boolean getOfficialPositonByCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_OFFICIALPOSITION);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation60(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION60);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation22(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION22);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getRoadTransportation21(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ROADTRANSPORTATION21);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 山脉山峰名称代码(297)
	public boolean getMountainRangeAndPeakName(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_MOUNTAINRANGEANDPEAKNAME);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 知识产权文献与信息分类及代码(298)
	public boolean getIntellectualProperty(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_INTELLECTUALPROPERTY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 民用航空业信息分类与代码 (340)
	public boolean getClassificationOfCivilAviation(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_CLASSIFICATIONOFCIVILAVIATION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 高等学校本科、专科专业名称代码(328)
	public boolean getNormalAndShortCycleSpeciality(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_NORMALANDSHORTCYCLESPECIALITY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 船舶维修保养体系 第二部分(337)
	public boolean getMaintenanceSystemPTwo(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_MAINTENANCESYSTEMPTWO);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 国际贸易合同代码(326)
	public boolean getCountryRegionCode1(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_COUNTRYREGIONCODE1);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getFirst2CharsofAdminDivision(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_FIRST2CHARSOFADMINDIVISION);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 电力科技成果分类与代码(784)
	public boolean getElectricPower(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_ELECTRICPOWER);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 全国电网名称代码(785)
	public boolean getPowerGrid(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_POWERGRID);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 电力行业单位类别代码(787)
	public boolean getElectricPowerIndustry(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ELECTRICPOWERINDUSTRY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 电力地理信息系统图形符号分类与代码(788)
	public boolean getElectricPowerGeography(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ELECTRICPOWERGEOGRAPHY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 电压等级代码(789)
	public boolean getVoltageClass(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_VOLTAGECLASS);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 电力物资编码 第二部分 机电产品(909)
	public boolean getPowerGoodsP2(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_POWERGOODSP2);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 基础地理信息要素分类与代码(353)
	public boolean getGeographicalInfoCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GEOGRAPHICINFO);
			stmt.setString(1, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 生产过程危险和有害因素分类与代码(354)
	public boolean getHarmfulFactorCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_HARMFULFACTOR);
			stmt.setString(1, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 中华人民共和国铁路车站代码(366)
	public boolean getRailwayStationCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_RAILWAYSTATIONCODE);
			stmt.setString(1, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 林业资源分类与代码 林木病害
	public boolean getTreeDiseaseCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_TREEDISEASE);
			stmt.setString(1, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 内河船舶分类与代码(314-1)
	public boolean getNavigationShipCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_NAVIGATIONSHIP);
			stmt.setString(1, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 常用证件代码(470)
	public boolean getTravelCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_TRAVLEDOCUMENT);
			stmt.setString(1, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 公安部消防局和省级公安消防总队代码(474)
	public boolean getProvinceAdminCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PROVINCEADMINCODE);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 列管单位代码(474)
	public boolean getAdminDivision1(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_ADMINDIVISION1);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials44(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS44);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials45(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS45);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials46(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS46);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials47(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS47);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials49(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS49);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials50(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS50);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials51(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS51);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials52(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS52);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials53(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS53);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	public boolean getPowerMaterials54(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_POWERMATERIALS54);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 509互联网网上服务营业场所-第五部分
	// IDstr: 标识编码
	// LenID: 标识编码的长度5位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public boolean getPortTariff509(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTTARIFF509);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 核元素编码——国家代码
	// IDstr: 标识编码
	// LenID: 标识编码的长度5位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public boolean getPortNuclearelementNation(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PORTNuclearelementNation);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 核元素编码
	// IDstr: 标识编码
	// LenID: 标识编码的长度5位
	// Index: 调用验证算法的索引位置
	// LenIndex:a3
	// creator:fdl
	public boolean getPortNuclearelements(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PORTNuclearelements);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// Function: 汽车产品零部件边编码规则
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index:4
	// LenIndex: 长度必为4
	// creator: fdl
	public boolean getPortCarProductCompnent(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PORTCarProductCompnent);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// Function: TCL金能电池编码规则
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index:4
	// LenIndex: 长度必为4
	// creator: fdl
	public boolean getPortTCLBatteryProduct(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_PORTTCLBatteryProduct);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// Function: TCL金能电池编码规则——第三级编码
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index:4
	// LenIndex: 长度必为4
	// creator: fdl
	public boolean getPortProductCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTProductCode);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 商品条码 应用标识符(632)
	public boolean getBarCodeForCommodity(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_BARCODEFORCOMMODITY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	/*
	 * 757 author:wt
	 */
	public boolean getHighwayDatabase17(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYDATABASE17);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	/*
	 * 757 author:wt
	 */
	public boolean getHighwayDatabase46(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYDATABASE46);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	/*
	 * 757 author:wt
	 */
	public boolean getHighwayDatabase47(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYDATABASE47);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	/*
	 * 757 author:wt
	 */
	public boolean getHighwayDatabase71(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_HIGHWAYDATABASE71);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 中国石油天然气总公司企、事业单位代码(763)
	public boolean getGassCompany(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_GASSCOMPANY);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 11 hydrologic data
	public boolean getHydrologicData(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_HYDROLOGICDATA);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 12 meat and vegetable
	public boolean getMeatandVegetable(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_MEATANDVEGETABLE);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// Function: 森林类型编码规则
	// IDstr: 标识编码
	// LenID: 标识编码的长度
	// Index:5
	// LenIndex: 长度必为5
	// creator: fdl
	public boolean getPortForestTypes(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PORTForestTypes);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
				System.out.println("results=" + results.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 700-动物疾病
	public boolean getAnimalDiseaseByCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_ANIMIALDISEASE700);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 698-全国卫生行业医疗器械、仪器设备分类
	public boolean getMedicalInstrumentByCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection
					.prepareStatement(RecoUtil.SELECT_MEDICALINSTRUMENT);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 728-中医病症分类
	public boolean getTCMdiseaseByCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_TCMDISEASE);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 728<2>-中医病症分类
	public boolean getTCMFeatureByCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_TCMFEATURE);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 706,708-地质矿物术语分类选词范围
	public boolean getDZClassifyByCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_DZCLASSIIFY);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// 710——地质矿物术语分类选词范围
	public boolean getDZClassify710ByCode(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_DZCLASSIFY710);
			int i = 1;
			stmt.setString(i, code);
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// function: query the table phonenumber and thus check the legality of the
	// prefix of a given phone number (7 numbers)
	// creator: dgq
	public boolean getPrefixPhoneNO(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_PHONENUMBER);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// function: query the table vehiclenonormal and thus check the legality of
	// the prefix of a normal vehicle character (2 characters)
	// creator: dgq
	public boolean getPrefixNormalVehicleNO(String code) throws UnsupportedEncodingException {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_NORMALVEHICLENO);
			int i = 1;
			stmt.setString(i, code);
			stmt.execute("set names utf8");
			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// function: query the table vehiclenomarmy and thus check the legality of
	// the prefix of a normal vehicle character (2 characters)
	// creator: dgq
	public boolean getPrefixArmyVehicleNO(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_ARMYVEHICLENO);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}

	// function: query the table vehiclenomwj and thus check the legality of the
	// third character of a WJ vehicle character
	// creator: dgq
	public boolean getPrefixWJVehicleNO(String code) {
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		boolean ret = false;
		try {
			stmt = connection.prepareStatement(RecoUtil.SELECT_WJVEHICLENO);
			int i = 1;
			stmt.setString(i, code);

			results = stmt.executeQuery();
			int rowcount = 0;
			while (results.next()) {
				rowcount++;
			}
			if (1 == rowcount) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return ret;
	}
	
	public static HashMap<String, String> test()
	{
		HashMap<String, String> test = new HashMap<String, String>();
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try{
			stmt = connection.prepareStatement(RecoUtil.SELECT_TEST);
			results = stmt.executeQuery();
			int rowcount = 0;
			while(results.next()){
				test.put(results.getString("testID"), results.getString("test"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return test;
	}
	//add priorProbabilityX
	//by menglunyang
	public static String add1ToPriorProbabilityX(int hour, String ID){
		Connection connection = JdbcUtils.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try {
			switch (hour){
			case 0:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY0);break;
			case 1:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY1);break;
			case 2:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY2);break;
			case 3:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY3);break;
			case 4:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY4);break;
			case 5:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY5);break;
			case 6:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY6);break;
			case 7:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY7);break;
			case 8:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY8);break;
			case 9:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY9);break;
			case 10:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY10);break;
			case 11:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY11);break;
			case 12:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY12);break;
			case 13:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY13);break;
			case 14:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY14);break;
			case 15:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY15);break;
			case 16:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY16);break;
			case 17:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY17);break;
			case 18:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY18);break;
			case 19:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY19);break;
			case 20:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY20);break;
			case 21:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY21);break;
			case 22:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY22);break;
			case 23:stmt = connection.prepareStatement(RecoUtil.ADD_ONE_TO_PRIORPROBABILITY23);break;
			
			}
			stmt.setString(1, ID);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, null, connection);
		}
		return "ok";
	}

}
