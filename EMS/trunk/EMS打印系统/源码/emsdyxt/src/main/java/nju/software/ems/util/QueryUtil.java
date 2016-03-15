package nju.software.ems.util;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import nju.software.ems.service.model.CaseQueryModel;
import nju.software.ems.service.model.CaseResultModel;
import nju.software.ems.service.model.Query;
import nju.software.ems.service.model.Result;



/**
 * ������ѯ������
 * 
 * @author Admin
 *
 */
public class QueryUtil {
	public static String getCaseQuerySql(CaseQueryModel model, CaseResultModel result) throws IllegalArgumentException, IllegalAccessException {
		Class clazz = model.getClass();
		
		Set<String> tables = new HashSet<String>();	//�����ѯ������漰�ı�
		String whereCondition = "";
		/*
		 * �����ѯ�����where�Ӿ䲿��
		 */
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			Object value = field.get(model);
			if (value != null && !"".equals(value)) {
				Query annotation = field.getAnnotation(Query.class);
				String table = annotation.table();
				tables.add(table);
				String sql = "";
				if (field.getType().getName().equals("java.lang.Boolean")) {
					if ((Boolean)value == true) {
						sql = annotation.sqlY();
					} else {
						sql = annotation.sqlN();
					}
				} else {
					sql = annotation.sqlY();
					sql = sql.replaceAll("\\?", (String)value);
				}
				
				whereCondition += sql;
				
			}
			
		}
		
		/*
		 * �����ѯ�����select�Ӿ�
		 */
		String selectCondtion = "select distinct ";
		Class resultClazz = result.getClass();
		Field[] resultFields = resultClazz.getFields();
		for(Field field : resultFields) {
			Result annotation = field.getAnnotation(Result.class);
			String table = annotation.table();
			tables.add(table);
			String column = annotation.column();
			selectCondtion += table + "." + column + ",";
		}
		if (selectCondtion.endsWith(",")) {
			selectCondtion = selectCondtion.substring(0, selectCondtion.length()-1);
		}
		
		/*
		 * ��������where�Ӿ�,���ϸ���֮��Ĺ���
		 */

		if (whereCondition.endsWith("and ")) {
			whereCondition = whereCondition.substring(0, whereCondition.length()-4);
		}
		
		/*
		 * �����ѯ����е�from�Ӿ�
		 */
		String fromCondition = "PUB_AJ_JB ";
		if (tables.size() > 1) {
			Object[] tablesArr = (Object[])tables.toArray();
			for (int i = 0 ; i < tablesArr.length  ; i++) {
				if(tablesArr[i].equals("PUB_AJ_JB")){
					continue;
				}else{
					fromCondition+= "left join " + tablesArr[i] + " on PUB_AJ_JB.AJXH = "+tablesArr[i]+".AJXH ";
				}
			}
		}
//		Iterator it = tables.iterator();
//		while(it.hasNext()) {
//			fromCondition += it.next() + ","; 
//		}
//		if (fromCondition.endsWith(",")) {
//			fromCondition = fromCondition.substring(0, fromCondition.length()-1);
//		}
		
		String sql = selectCondtion + " from " + fromCondition + " where " + whereCondition;
//		System.out.println(sql);
	
		return sql;
	}
}
