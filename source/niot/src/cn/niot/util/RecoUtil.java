package cn.niot.util;

import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.niot.dao.RecoDao;

import com.opensymphony.xwork2.ActionContext;

public class RecoUtil {
	public static final String JNDI_NAME = "java:comp/env/jdbc/IoTDataSource";
	public static final String SELECT_IOTID = "select * from iotid where code=?";
	public static final String COLUMNNAME = "columnName";
	public static final String ID_LEN = "Len";
	public static final String ID_NAME = "IDName";
	public static final int INTERVAL_WIDTH = 2;
	public static final int COUNT_NUMBER_CHARS = 64;

	// 没有匹配成功任何一种标识
	public static final int NO_ID_MATCHED = 0;

	// 匹配成功一种标识
	public static final int ONE_ID_MATCHED = 1;

	// 编码详细信息
	public static final String SELECT_IDDETAIL = "select * from iotid join iotdetail on iotdetail.id=iotid.id and iotid.id=?";

	// 前端页面显示标准名称短码字符的最大长度
	public static final int DISPLAYLENGTH = 9;

	// administrative division
	public static final String SELECT_ADMINDIVISION = "select * from admindivision where code=?";

	// country and region code
	public static final String SELECT_COUNTRYREGIONCODE = "select * from countryregioncode where twocharcode=? or threecharcode=? or numcode=?";

	// 烟草机械产品用物料
	public static final String SELECT_TABACCOMACHINEPRODUCT = "select * from tabaccomachineproduct where code=?";

	// 商品条码零售商品编码EAN UPC前3位前缀码
	public static final String SELECT_EANUPC = "select * from EANUPC where begincode<=? and endcode>=?";

	// 烟草机械电气配置和技术文件代码附录C表查询
	public static final String SELECT_tabaccoC = "select * from tabaccoC where code=?";

	// 烟草机械物料 分类和编码第2部分：专用件 附录D中的单位编码(672)
	public static final String SELECT_TABACCOMACHINEPRODUCER = "select * from tabaccomachineproducer where code=? limit 1";

	// CID调用4位数字行政区号
	public static final String SELECT_DISTRICTNO = "select * from districtno where code=?";

	// 烟草机械产品用物料 企业机械标准件 编码中的类别代码，组别代码和品种代码(6)
	public static final String SELECT_TABACCOSTANDARDPART = "select * from tabaccostandardpart where code=?";

	// 烟草机械产品用物料分类和编码 第6部分：原、辅材料(4)
	public static final String SELECT_TABACCOMATERIAL = "select * from tabaccomaterial where code=?";

	// 粮食信息分类与编码 财务会计分类与代码(15)
	public static final String SELECT_FOORDACCOUNT = "select * from foodaccount where code=?";

	// 粮食信息分类与代码 粮食设备分类与代码(23)
	public static final String SELECT_GRAINEQUIPMENT = "select * from grainequipment where code=?";

	// 粮食信息分类与编码 粮食设施分类与编码(24)
	public static final String SELECT_GRAINESTABLISHMENT = "select * from grainestablishment where code=?";

	// 烟草机械产品用物料 分类和编码 第5部分：电器元器件 (5)
	public static final String SELECT_TABACCOELECTRICCOMPONENT = "select * from tabaccoelectriccomponent where code=?";

	// 行政区划代码随机取一条记录
	public static final String SELECT_RANDOMADMINDIVISION = "select * from admindivision where code>=convert(floor(((SELECT MAX(convert(code,signed)) FROM admindivision)-(SELECT MIN(convert(code,signed)) FROM admindivision)) * rand() + (SELECT MIN(convert(code,signed)) FROM admindivision)),char(6)) limit 1";

	// EANUPC代码随机一条记录
	public static final String SELECT_RANDOMEANUPC = "select floor(rand()*(endcode-begincode)+begincode) as code from (select * from EANUPC where rowno >= (select floor(rand()*(max(rowno)-min(rowno))) + min(rowno) from EANUPC) limit 1) t";

	public static final String SELECT_TYPEANDRULES = "select * from iotid";

	// 烟用材料编码 第1部分：烟用材料分类代码与产品代码(10)
	public static final String SELECT_TABACCOMATERIALS = "select * from tobaccomaterials where code=?";

	// 粮食信息分类与编码 粮食贸易业务统计分类与代码(14)
	public static final String SELECT_FOODTRADE = "select * from foodtradestatistics where code=?";

	// 粮食信息分类与编码 粮食仓储业务统计分类与代码(16)
	public static final String SELECT_GRAINSTOREHOUSE = "select * from grainstorehouse where code=?";

	// 粮食信息分类与编码 储粮病虫害分类与代码(17)
	public static final String SELECT_GRAINSDISEASES = "select * from grainsdiseases where code=?";

	// 粮食信息分类与编码 粮食加工(18)
	public static final String SELECT_FOODECONOMY = "select * from grainstechnicaleconomy where code=?";

	// 粮食信息分类与编码 粮食加工第1部分：加工作业分类与代码(19)
	public static final String SELECT_GRAINSPROCESS = "select * from grainsprocess where code=?";

	// 粮食信息分类与编码 粮食仓储第3部分：器材分类与代码(20)
	public static final String SELECT_GRAINSEQUIPMENT = "select * from grainsequipment where code=?";

	// 粮食信息分类与编码 粮食仓储第2部分：粮情检测分类与代码(21)
	public static final String SELECT_GRAINCONDITIONDETECTION = "select * from grainconditiondetection where code=?";

	// 粮食信息分类与编码 粮食仓储第1部分：仓储作业分类与代码(22)
	public static final String SELECT_GRAINSSMARTWMS = "select * from grainsSmartWMS where code =?";

	// 粮食信息分类与编码 粮食检验第2部分：质量标准分类与代码(26)
	public static final String SELECT_GRIANQUALITYSTANDARD = "select * from grainsqualitystandard where code=?";

	// 计量器具命名与分类编码(32)
	public static final String SELECT_MEASURINGINSTRUMENT = "select * from measuringinstrument where code=?";

	// 粮食信息分类与编码 粮食检验 第1部分：指标分类与代码(27)
	public static final String SELECT_GRAINSINDEX = "select * from grainsindex where code=?";

	// 粮食信息分类与编码 粮食及加工产品分类与代码(28)
	public static final String SELECT_GRAINSINFORMATION = "select * from grainsinformation where code=?";

	// 粮食信息分类与编码 粮食属性分类与代码(29)
	public static final String SELECT_GRAINSATTRIBUTE = "select * from grainsattribute where code=?";

	// select the first 7 numbers of a phone number
	public static final String SELECT_PHONENUMBER = "select * from phonenumber where code=?";

	// select the first 2 characters of a normal vehicle NO
	public static final String SELECT_NORMALVEHICLENO = "select * from vehiclenonormal where code=?";

	// select the first 2 characters of a army vehicle NO
	public static final String SELECT_ARMYVEHICLENO = "select * from vehiclenoarmy where code=?";

	// select the first 2 characters of a WJ vehicle NO
	public static final String SELECT_WJVEHICLENO = "select * from vehiclenowj where code=?";

	// 粮食信息分类与编码 粮食行政、事业机构及社会团体分类与代码(31)
	public static final String SELECT_GRAINSADMINISTRATIVE = "select * from grainsadministrative where code=?";

	// 建筑产品分类和代码(34)
	public static final String SELECT_CONSTRUCTIONPRODUCTS = "select * from constructionproducts where code=?";

	// 导航电子地图数据分类与编码(45)
	public static final String SELECT_ELECTRONICMAP = "select * from electronicmap where code=?";

	// 地理信息分类与编码规则(56)
	public static final String SELECT_GEOGRAPHICINFORMATION = "select * from geographicinformation where code=?";

	// 纺织面料编码化纤部分(64)
	public static final String SELECT_TETILEFABRICNAME = "select * from textilefabricnamecode where code=?";

	// 纺织面料属性代码(64)X1X2
	public static final String SELECT_PROPERTIESMAINMATERIAL = "select * from propertiesmainmaterial where code=?";

	// 纺织面料属性代码(64)非织造布X1X2
	public static final String SELECT_PROPERTIESMAIN = "select * from propertiesmain where code=?";

	// 纺织面料属性代码(64)纤维特征 X3X4
	public static final String SELECT_PROPERTIERFIBERCHARACTERS = "select * from propertiesfibercharacteristics where code=?";

	// 纺织面料属性代码(64)X7X8纤网固结方式
	public static final String SELECT_PROPERTIESMIX = "select * from propertiesmixed where code=?";

	// 纺织面料属性代码(64)X9X10 01-19 99
	public static final String SELECT_PROPERTIESFABRIC = "select * from propertiesfabric where code=?";

	// 纺织面料属性代码(64)X11X12
	public static final String SELECT_PROPERTIESDYEING = "select * from propertiesdyeingandfinishing where code=?";

	// 面向装备制造业产品全生命周期工艺知识第2部分(65)
	public static final String SELECT_MANUFACTURINGPROCESS = "select * from generalmanufacturingprocess where code=?";

	// 全国主要产品分类与代码第2部分 不可运输产品(712)
	public static final String SELECT_UNTRANSPORTABLEPRODUCT = "select * from untransportableproduct where code=?";

	// 全国主要产品分类与代码第2部分 不可运输产品后3位(712)
	public static final String SELECT_LASTTHREEUNTRANSPORTABLEPRODUCT = "select * from untransportableproduct where length(code)=5 and code like ?";

	// 道路交通信息采集信息分类与编码(77)
	public static final String SELECT_TRAFFICINFORMATIONCOLLECTION = "select * from trafficinformationcollection where code=?";

	// 烟草行业工商统计数据元第2部分 代码集(202)
	public static final String SELECT_TABACCOORGANIZATION = "select * from tobaccoorganization where code=?";

	// 烟叶代码第5部分烟叶颜色代码(204)
	public static final String SELECT_TABACCOLEAFCOLOR = "select * from tobaccoleafcolor where code=?";

	// 烟叶代码第2部分烟叶形态代码(207)
	public static final String SELECT_TABACCOLEAFFORM = "select * from tobaccoleafform where code=?";

	// 烟叶代码第1部分烟叶分类与代码(208)
	public static final String SELECT_TABACCOLEAFCLASS = "select * from tobaccoleafclass where code=?";

	// 儿童大便性状代码(213)
	public static final String SELECT_CHILDRENEXCREMENT = "select * from childrenexcrement where code=?";

	// 饮酒频率代码(214)
	public static final String SELECT_DRINKINGFREQUENCY = "select * from drinkingfrequency where code=?";

	// 饮酒种类代码(214)
	public static final String SELECT_DRINKINGCLASS = "select * from drinkingclass where code=?";

	// 身体活动频率代码(214)
	public static final String SELECT_PHYSICALACTIVITYFREQUENCY = "select * from physicalactivityfrequency where code=?";

	// 妊娠终止方式代码表(215)
	public static final String SELECT_TERMINATIONOFPREGNENCY = "select * from terminationofpregnancy where code=?";

	// 分娩方式代码(215)
	public static final String SELECT_MODEOFPRODUCTION = "select * from modeofproduction where code=?";

	// 分娩地点类别代码(215)
	public static final String SELECT_DILIVERYPLACE = "select * from deliveryplace where code=?";

	// 卫生信息数据元值域代码第17部分：卫生管理(218)
	public static final String SELECT_HEALTHSUPERVISIONOBJECT = "select * from healthsupervisionobject where code=?";

	// 交通工具代码(219)
	public static final String SELECT_COMMUNICATIONCODE = "select * from communicationmediacode where code=?";

	// 卫生监督机构人员编制类别代码(220)
	public static final String SELECT_HYGIENEAGENCYPERSONNEL = "select * from hygieneagencypersonnel where code=?";

	// 卫生监督机构职工类别代码(220)
	public static final String SELECT_WORKERHEALTHSUPERVISION = "select * from workerhealthsupervision where code=?";

	// 殡葬设施分类的一条记录
	public static final String SELECT_FUNERALSERVICE = "select * from funeralservice where code=?";

	// 殡葬设施用品的一条记录
	public static final String SELECT_FUNERALFACILITIES = "select * from funeralfacilities where code=?";

	// 殡葬设施用品的一条记录
	public static final String SELECT_SUPPLIES = "select * from funeralsupplies where code=?";

	// 268中央党政机关
	public static final String SELECT_PORTTARIFF268 = "select * from TheCenteralPartyCommitte where code=?";

	// 270自然灾害
	public static final String SELECT_PORTTARIFF270 = "select * from Naturaldisaster where code=?";

	// 275物流作业货物
	public static final String SELECT_PORTTARIFF275 = "select * from Logisticsoperation where code=?";

	// 276废弃物品
	public static final String SELECT_PORTTARIFF276 = "select * from Wasteproducts where code=?";

	// 280中央党政机关
	public static final String SELECT_PORTTARIFF280 = "select * from TheCenteralPartyCommitte where code=?";

	// 281-珠宝玉石及金属产品分类代码编制方法 查表数据库
	public static final String SELECT_PORTTARIFF281 = "select * from JadejewelryClass where code=?";

	// 281-珠宝玉石及金属材质分类代码编制方法 查表数据库
	public static final String SELECT_PORTTARIFFMa281 = "select * from JadejewelryMaterialclassif where code=?";

	// 282-——信息安全技术代码编制方法 查表数据库
	public static final String SELECT_PORTTARIFFMa282 = "select * from InformationSafe where code=?";

	// 284-社会经济目标分类和代码表 查表数据库
	public static final String SELECT_PORTTARIFFMa284 = "select * from goalsocialeconomic where code=?";

	// 287_物流信息分类
	public static final String SELECT_PORTTARIFFMa285 = "select * from LogisticsInf where code=?";

	// 287_服装分类
	public static final String SELECT_PORTTARIFFMa287 = "select * from clothesclass where code=?";

	// 288_服装名字分类
	public static final String SELECT_PORTTARIFFMa288 = "select * from ClothesName where code=?";

	// 191_医药器械分类
	public static final String SELECT_PORTTARIFFMa191 = "select * from Pharmacequipment where code=?";

	// 395_消防信息代码
	public static final String SELECT_PORTTARIFF395 = "select * from FireInfomation  where code=?";

	// 399_消防信息代码
	public static final String SELECT_PORTTARIFF399 = "select * from FireInfowatersupply  where code=?";

	// 403_消防信息代码
	public static final String SELECT_PORTTARIFF403 = "select * from FireInfocamp  where code=?";

	// 409_消防信息代码
	public static final String SELECT_PORTTARIFF409 = "select * from FireInfotainass  where code=?";

	// 410
	public static final String SELECT_OFFICIALPOSITION = "select *from officialposition where code=?";

	// CoastalAdminAreaId
	public static final String SELECT_COASTALADMINAREAID = "select * from CoastalAdminAreaId where code=?";

	// infectiousDieases code
	public static final String SELECT_INFECTIOUSDISEASES = "select * from Infectiousdiseases where code=?";

	// WirtschaftsTypCode
	public static final String SELECT_WIRTSCHAFTSTYPCODE = "select * from WirtschaftsTypCode where code=?";

	// 农药剂型名称及代码(305)
	public static final String SELECT_PESTICIDECODE = "select * from PesticideFormulationCode where code=?";

	// 乘用车尺寸代码(306)
	public static final String SELECT_PASSENGERCARCODE = "select * from passengerCarCode where code=?";

	// 地名分类与类别代码编制规则(309)
	public static final String SELECT_GEOGRAPHICALCODE = "select * from GeographicalCode where code=?";

	// 国际贸易运输船舶名称及代码编制原则(312)
	public static final String SELECT_INTERNATIONALSHIP = "select * from InternationalShipCode where code=?";

	// wt
	public static final String SELECT_ROADTRANSPORTATION21 = "select * from roadtransportation21 where code=?";

	public static final String SELECT_ROADTRANSPORTATION22 = "select * from roadtransportation22 where code=?";

	public static final String SELECT_ROADTRANSPORTATION32 = "select * from roadtransportation32 where code=?";

	public static final String SELECT_ROADTRANSPORTATION50 = "select * from roadtransportation50 where code=?";

	public static final String SELECT_ROADTRANSPORTATION53 = "select * from roadtransportation53 where code=?";

	public static final String SELECT_ROADTRANSPORTATION5 = "select * from roadtransportation5 where code=?";

	public static final String SELECT_ROADTRANSPORTATION41 = "select * from roadtransportation41 where code=?";

	public static final String SELECT_ROADTRANSPORTATION63 = "select * from roadtransportation63 where code=?";

	public static final String SELECT_ROADTRANSPORTATION64 = "select * from roadtransportation64 where code=?";

	public static final String SELECT_HIGHWAYTRANSPORTATION4B1 = "select * from highwaytransportation4b1 where code=?";

	public static final String SELECT_HIGHWAYTRANSPORTATION4B7 = "select * from highwaytransportation4b7 where code=?";

	public static final String SELECT_HIGHWAYTRANSPORTATION4B9 = "select * from highwaytransportation4b9 where code=?";

	public static final String SELECT_HIGHWAYTRANSPORTATION4C3 = "select * from highwaytransportation4c3 where code=?";

	public static final String SELECT_PORTTARIFF3 = "select * from porttariff3 where code=?";

	public static final String SELECT_PORTTARIFF4 = "select * from porttariff4 where code=?";

	public static final String SELECT_PORTTARIFF9 = "select * from porttariff9 where code=?";

	public static final String SELECT_PORTTARIFF25 = "select * from porttariff25 where code=?";

	public static final String SELECT_PORTTARIFF26 = "select * from porttariff26 where code=?";

	public static final String SELECT_PORTTARIFF10 = "select * from porttariff10 where code=?";

	public static final String SELECT_MACHINERY2 = "select * from machinery2 where code=?";

	public static final String SELECT_HIGHWAYMAINTENANCE4 = "select * from highwaymaintenance4 where code=?";

	public static final String SELECT_HIGHWAYMAINTENANCE3 = "select * from highwaymaintenance3 where code=?";

	public static final String SELECT_MACHINERY3 = "select * from machinery3 where code=?";

	public static final String SELECT_MACHINERY4 = "select * from machinery4 where code=?";

	public static final String SELECT_MACHINERY5 = "select * from machinery5 where code=?";

	public static final String SELECT_MACHINERY6 = "select * from machinery6 where code=?";

	public static final String SELECT_MACHINERY7 = "select * from machinery7 where code=?";

	public static final String SELECT_MACHINERY8 = "select * from machinery8 where code=?";

	public static final String SELECT_MACHINERY9 = "select * from machinery9 where code=?";

	public static final String SELECT_MACHINERY10 = "select * from machinery10 where code=?";

	public static final String SELECT_HIGHWAYTRANSPORTATION4C6 = "select * from highwaytransportation4c6 where code=?";

	public static final String SELECT_WATERWAYTRANSPORTATION = "select * from waterwaytransportation where code=?";

	public static final String SELECT_HIGHWAYTRANSPORTATION4B10 = "select * from highwaytransportation4b10 where code=?";

	public static final String SELECT_HIGHWAYTRANSPORTATION = "select * from highwaytransportation where code=?";

	public static final String SELECT_ROADTRANSPORTATION60 = "select * from roadtransportation60 where code=?";

	public static final String SELECT_PORT = "select * from port where code=?";

	public static final String SELECT_SECURITYACCOUNTERMENTS = "select * from securityaccounterments where code=?";

	public static final String SELECT_SPECIALVEHICLE = "select * from specialvehicle where code=?";

	public static final String SELECT_CIVILAVIATION = "select * from civilaviation where code=?";

	// 山脉山峰名称代码(297)

	public static final String SELECT_MOUNTAINRANGEANDPEAKNAME = "select * from mountainrangeandpeakname where code=?";

	// 知识产权文献与信息分类及代码(298)
	public static final String SELECT_INTELLECTUALPROPERTY = "select * from intellectualproperty where code=?";

	// 民用航空业信息分类与代码 (340)
	public static final String SELECT_CLASSIFICATIONOFCIVILAVIATION = "select * from classificationofcivilaviation where code=?";

	// 高等学校本科、专科专业名称代码(328)
	public static final String SELECT_NORMALANDSHORTCYCLESPECIALITY = "select * from normalandshortcyclespeciality where code=?";

	// 船舶维修保养体系 第二部分(337)
	public static final String SELECT_MAINTENANCESYSTEMPTWO = "select * from maintenancesystemptwo where code=?";

	// 国际贸易合同代码(326)
	public static final String SELECT_COUNTRYREGIONCODE1 = "select * from countryregioncode where twocharcode=?";

	public static final String SELECT_FIRST2CHARSOFADMINDIVISION = "select * from admindivision where code=?";

	// 电力科技成果分类与代码(784)
	public static final String SELECT_ELECTRICPOWER = "select * from electricpower where code=?";

	// 全国电网名称代码(785)
	public static final String SELECT_POWERGRID = "select * from powergrid where code=?";

	// 电力行业单位类别代码(787)
	public static final String SELECT_ELECTRICPOWERINDUSTRY = "select * from electricpowerindustry where code=?";

	// 电力地理信息系统图形符号分类与代码(788)
	public static final String SELECT_ELECTRICPOWERGEOGRAPHY = "select * from electricpowergeography where code=?";

	// 电压等级代码(789)
	public static final String SELECT_VOLTAGECLASS = "select * from voltageclass where code=?";

	// 电力物资编码 第二部分 机电产品(909)
	public static final String SELECT_POWERGOODSP2 = "select * from powergoodsp2 where code=?";

	// Specifications for feature classification and codes of fundamental
	// geographic information
	public static final String SELECT_GEOGRAPHICINFO = "select * from GeographicInfoCode where code=?";

	// Classification and code for the hazardous and harmful factors in process
	public static final String SELECT_HARMFULFACTOR = "select * from HarmfulFactor where code =?";

	// code for railway stations of the People's Republic of China(366)
	public static final String SELECT_RAILWAYSTATIONCODE = "select * from RailwayStationCode where code =?";

	// Classification and codes for forestry resources -tree diseases(347)
	public static final String SELECT_TREEDISEASE = "select * from TreeDiseaseCode where code=?";

	// Classification and code for island navigation ship(314-1)
	public static final String SELECT_NAVIGATIONSHIP = "select * from NavigationShip where code =?";

	// Travel documents coded
	public static final String SELECT_TRAVLEDOCUMENT = "select * from TravleDocumentCode where code=?";

	// 列管单位代码(474)
	public static final String SELECT_PROVINCEADMINCODE = "select * from provinceadmincode where code=?";

	public static final String SELECT_ADMINDIVISION1 = "select * from admindivision1 where code=?";

	// 910
	public static final String SELECT_POWERMATERIALS44 = "select * from powermaterials44 where code=?";

	public static final String SELECT_POWERMATERIALS45 = "select * from powermaterials45 where code=?";

	public static final String SELECT_POWERMATERIALS46 = "select * from powermaterials46 where code=?";

	public static final String SELECT_POWERMATERIALS47 = "select * from powermaterials47 where code=?";

	public static final String SELECT_POWERMATERIALS49 = "select * from powermaterials49 where code=?";

	public static final String SELECT_POWERMATERIALS50 = "select * from powermaterials50 where code=?";

	public static final String SELECT_POWERMATERIALS51 = "select * from powermaterials51 where code=?";

	public static final String SELECT_POWERMATERIALS52 = "select * from powermaterials52 where code=?";

	public static final String SELECT_POWERMATERIALS53 = "select * from powermaterials53 where code=?";

	public static final String SELECT_POWERMATERIALS54 = "select * from powermaterials54 where code=?";

	// 509互联网网上服务营业场所——第五部分fdl
	public static final String SELECT_PORTTARIFF509 = "select * from InternetWebService where code=?";

	// 核元素编码 fdl
	public static final String SELECT_PORTNuclearelements = "select * from Nuclearelements where code=?";

	// 核元素编码——国家代码 fdl
	public static final String SELECT_PORTNuclearelementNation = "select * from NuclearelementNation where code=?";

	// Function: 汽车产品零部件边编码规则fdl
	public static final String SELECT_PORTCarProductCompnent = "select * from CarProductCompnent where code=?";

	// Function: TCL金能电池编码规则fdl
	public static final String SELECT_PORTTCLBatteryProduct = "select * from TCLBatteryProduct where code=?";

	// Function: TCL金能电池编码规则fdl
	public static final String SELECT_PORTProductCode = "select * from ProductCode where code=?";

	// 商品条码 应用标识符（632）
	public static final String SELECT_BARCODEFORCOMMODITY = "select * from barcodeforcommodity where code=?";

	// 757,author:wt
	public static final String SELECT_HIGHWAYDATABASE17 = "select * from highwaydatabase17 where code=?";

	public static final String SELECT_HIGHWAYDATABASE46 = "select * from highwaydatabase46 where code=?";

	public static final String SELECT_HIGHWAYDATABASE47 = "select * from highwaydatabase47 where code=?";

	public static final String SELECT_HIGHWAYDATABASE71 = "select * from highwaydatabase71 where code=?";

	// 中国石油天然气总公司企、事业单位代码(763)
	public static final String SELECT_GASSCOMPANY = "select * from gasscompany where code=?";

	// wt
	public static final String SELECT_HYDROLOGICDATA = "select *from hydrologicdata where code=?";

	public static final String SELECT_MEATANDVEGETABLE = "select *from meatandvegetable where code=?";

	// Function: 森林类型编码规则fdl
	public static final String SELECT_PORTForestTypes = "select * from ForestTypes where code=?";

	// 700陆生野生动物疫病分类
	public static final String SELECT_ANIMIALDISEASE700 = "select *from Animaldisease where code=?";

	// 698全国卫生行业医疗器械、仪器设备分类
	public static final String SELECT_MEDICALINSTRUMENT = "select *from medicalInstrument where code=?";

	// 728中医疾病分类
	public static final String SELECT_TCMDISEASE = "select *from tcmdisease where code=?";

	// 728(2)中医病症分类
	public static final String SELECT_TCMFEATURE = "select *from tcmfeature where code=?";

	// 706,708地质矿物大类分类选词范围
	public static final String SELECT_DZCLASSIIFY = "select *from dzclassify where code=?";

	// 710地质矿物大类分类选词范围
	public static final String SELECT_DZCLASSIFY710 = "select *from dzclassify710 where code=?";

	public static final String SELECT_TEST="select * from test";
	
	//add one to PriorProbabilityX
	public static final String ADD_ONE_TO_PRIORPROBABILITY0 = "UPDATE iotid_copy SET priorProbability0 = priorProbability0+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY1 = "UPDATE iotid_copy SET priorProbability1 = priorProbability1+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY2 = "UPDATE iotid_copy SET priorProbability2 = priorProbability2+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY3 = "UPDATE iotid_copy SET priorProbability3 = priorProbability3+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY4 = "UPDATE iotid_copy SET priorProbability4 = priorProbability4+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY5 = "UPDATE iotid_copy SET priorProbability5 = priorProbability5+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY6 = "UPDATE iotid_copy SET priorProbability6 = priorProbability6+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY7 = "UPDATE iotid_copy SET priorProbability7 = priorProbability7+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY8 = "UPDATE iotid_copy SET priorProbability8 = priorProbability8+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY9 = "UPDATE iotid_copy SET priorProbability9 = priorProbability9+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY10 = "UPDATE iotid_copy SET priorProbability10 = priorProbability10+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY11 = "UPDATE iotid_copy SET priorProbability11 = priorProbability11+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY12 = "UPDATE iotid_copy SET priorProbability12 = priorProbability12+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY13 = "UPDATE iotid_copy SET priorProbability13 = priorProbability13+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY14 = "UPDATE iotid_copy SET priorProbability14 = priorProbability14+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY15 = "UPDATE iotid_copy SET priorProbability15 = priorProbability15+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY16 = "UPDATE iotid_copy SET priorProbability16 = priorProbability16+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY17 = "UPDATE iotid_copy SET priorProbability17 = priorProbability17+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY18 = "UPDATE iotid_copy SET priorProbability18 = priorProbability18+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY19 = "UPDATE iotid_copy SET priorProbability19 = priorProbability19+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY20 = "UPDATE iotid_copy SET priorProbability20 = priorProbability20+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY21 = "UPDATE iotid_copy SET priorProbability21 = priorProbability21+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY22 = "UPDATE iotid_copy SET priorProbability22 = priorProbability22+1 WHERE id = ?";
	public static final String ADD_ONE_TO_PRIORPROBABILITY23 = "UPDATE iotid_copy SET priorProbability23 = priorProbability23+1 WHERE id = ?";


	// 获得URL地址ַ
	public static String getURLParam(String paramName) {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		String url = request.getContextPath();
		String parameter = request.getParameter(paramName);
		return parameter;
	}

	// 修改标准ID为名称
	public static HashMap<String, Double> replaceIotId(
			HashMap<String, Double> map) {
		HashMap<String, Double> newMap = new HashMap<String, Double>();
		Iterator iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next().toString();
			RecoDao dao = new RecoDao();
			String name = dao.getIDDetail(key);
			newMap.put(name, map.get(key));
		}
		return newMap;
	}
}
