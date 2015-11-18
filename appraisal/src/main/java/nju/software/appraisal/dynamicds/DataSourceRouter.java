package nju.software.appraisal.dynamicds;

import nju.software.appraisal.util.PropertiesUtil;



public class DataSourceRouter {
	
	/**
	 * 切换到指定Fydm数据库
	 * @param fydm
	 */
	public static void routerTo(String fydm) {
		//System.out.println(1+""+CustomerContextHolder.getCustomerType());
		if(CustomerContextHolder.getCustomerType() == null || ! CustomerContextHolder.getCustomerType().equals(fydm)){
			CustomerContextHolder.setCustomerType(DataSourceMap
					.getDataSourceKey(fydm));
		}
		//System.out.println(2+""+CustomerContextHolder.getCustomerType());
	}
	
	/**
	 * 切换到本院数据源
	 * @param fydm
	 */
	public static void routerToDefault() {
		//切换回本院数据源 
		CustomerContextHolder.setCustomerType(DataSourceMap
				.getDataSourceKey(PropertiesUtil.getCurrentFydm()));
	}
}
