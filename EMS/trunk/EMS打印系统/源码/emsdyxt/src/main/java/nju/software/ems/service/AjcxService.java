package nju.software.ems.service;

import java.sql.SQLException;
import java.util.List;

import nju.software.ems.service.model.BaseCaseModel;
import nju.software.ems.service.model.QueryModel;

public interface AjcxService {
	
	/**
	 * ��ѯ����
	 * @param vo ��ѯmodel
	 * @return ���������İ����б�
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws SQLException
	 */
	public List<BaseCaseModel> getSearchResult(QueryModel vo) throws IllegalArgumentException, IllegalAccessException, SQLException;
	
	/**
	 * ��ѯָ��������ŵİ�����Ϣ
	 * @param ajxh �������
	 * @return ������Ϣ
	 */
	public BaseCaseModel getAjxxByAjxh(int ajxh);

}
