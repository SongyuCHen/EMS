package nju.software.appraisal.dynamicds;

import java.util.ArrayList;
import java.util.List;

import nju.software.appraisal.service.model.PubFyModel;
import nju.software.appraisal.util.StringUtil;

/**
 */


/**
 * 数据源Enum
 * @author zym
 * 
 */
public enum DataSourceEnum {
	/**
	 * 高院集中库 
	 */
	DEFAULT("000000","Default","高院集中库 "),
	
	/**
	 * 天津高院
	 */
	TJGY("120000 200","Tjgy","天津市高级人民法院"),
	/**
	 * 天津一中院
	 */
	TJYZY("120100 210","Tjyzy","天津市第一中级人民法院 "),
	/**
	 * 天津二中院
	 */
	TJEZY("120200 220","Tjezy","天津市第二中级人民法院 "),
	/**
	 * 天津海事法院
	 */
	TJHSFY("960200 230","Tjhsfy","天津海事法院 "),
	/**
	 * 天津和平法院
	 */
	TJHPFY("120101 211","Tjhpfy","天津市和平区人民法院 "),
	/**
	 * 天津南开法院
	 */
	TJNKFY("120104 212","Tjnkfy","天津市南开区人民法院 "),
	/**
	 * 天津河北法院
	 */
	TJHBFY("120105 213","Tjhbfy","天津市河北区人民法院 "),
	/**
	 * 天津红桥法院
	 */
	TJHQFY("120106 214","Tjhqfy","天津市红桥区人民法院 "),
	/**
	 * 天津西青法院
	 */
	TJXQFY("120107 215","Tjxqfy","天津市西青区人民法院 "),
	/**
	 * 天津北辰法院
	 */
	TJBCFY("120108 216","Tjbcfy","天津市北辰区人民法院 "),
	/**
	 * 天津河东法院
	 */
	TJHDFY("120202 221","Tjhdfy","天津市河东区人民法院 "),
	
	/**
	 * 天津河西法院
	 */
	TJHXFY("120203 222","Tjhxfy","天津市河西区人民法院 "),
	
	/**
	 * 天津塘沽法院
	 */
	TJTGFY("120204 223","Tjtgfy","天津市塘沽区人民法院 "),
	
	/**
	 * 天津汉沽法院
	 */
	TJHGFY("120205 224","Tjhgfy","天津市汉沽区人民法院 "),
	
	/**
	 * 天津大港法院
	 */
	TJDGFY("120206 225","Tjdgfy","天津市大港区人民法院"),
	
	/**
	 * 天津东丽法院
	 */
	TJDLFY("120207 226","Tjdlfy","天津市东丽区人民法院"),
	
	/**
	 * 天津津南法院
	 */
	TJJNFY("120208 227","Tjjnfy","天津市津南区人民法院"),
	
	/**
	 * 天津宁河法院
	 */
	TJNHFY("120221 228","Tjnhfy","天津市宁河区人民法院 "),
	
	/**
	 * 天津武清法院
	 */
	TJWQFY("120222 217","Tjwqfy","天津市武清区人民法院"),
	
	/**
	 * 天津静海法院
	 */
	TJJHFY("120223 218","Tjjhfy","天津市静海区人民法院"),
	
	/**
	 * 天津宝坻法院
	 */
	TJBDFY("120224 219","Tjbdfy","天津市宝坻区人民法院"),
	
	/**
	 * 天津蓟县法院
	 */
	TJJXFY("120225 21A","Tjjxfy","天津市蓟县人民法院"),
	/**
	 * 天津开发区人民法院
	 */
	TJKFQFY("120241 229","Tjkfqfy","功能区审判区"),
	/**
	 * 天津滨海新区法院
	 */
	TJBHXQFY("120242 22A","Tjbhxqfy","天津市滨海新区人民法院 "),
	/**
	 * 天津铁路法院
	 */
	TJTLFY("920103 132","Tjtlfy","天津铁路法院")
	;
	
	
	String fydm;
	
	String source;
	
	String fymc;

	/**
	 * @param fydm
	 * @param source
	 */
	private DataSourceEnum(String fydm, String source, String fymc) {
		this.fydm = fydm;
		this.source = source;
		this.fymc = fymc;
	}
	
	public static String getFydmBySource(String source){
		for (DataSourceEnum src : DataSourceEnum.values()) {
			if (StringUtil.equals(source, src.getSource())) {
				return src.getFydm();
			}
		}
		return "";
	}

	public static List<PubFyModel> getALlFydmFymc() {
		List<PubFyModel> list= new ArrayList<PubFyModel>();
		for (DataSourceEnum src : DataSourceEnum.values()) {
			if(!"000000".equals(src.getFydm()))
				list.add(new PubFyModel(src.getFydm(), src.getFymc()));
		}
		return list;
	}
	/**
	 * @return the fydm
	 */
	public String getFydm() {
		return fydm;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	
	/**
	 * @return the fymc
	 */
	public String getFymc() {
		return fymc;
	}
}
