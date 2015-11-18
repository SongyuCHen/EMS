package nju.software.appraisal.dynamicds;

import javax.servlet.http.HttpServletRequest;

public class ChangeDataSource {

	public static void changeDataSource(HttpServletRequest request){
		String fydm = (String)request.getSession().getAttribute("fydm");
		CustomerContextHolder.setCustomerType(DataSourceMap.getDataSourceKey(fydm));
	}
}
