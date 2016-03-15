package nju.software.ems.service;

import java.sql.SQLException;
import java.util.List;

import nju.software.ems.service.model.BaseCaseModel;
import nju.software.ems.service.model.QueryModel;

public interface AjcxService {
	
	/**
	 * 查询案件
	 * @param vo 查询model
	 * @return 符合条件的案件列表
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws SQLException
	 */
	public List<BaseCaseModel> getSearchResult(QueryModel vo) throws IllegalArgumentException, IllegalAccessException, SQLException;
	
	/**
	 * 查询指定案件序号的案件信息
	 * @param ajxh 案件序号
	 * @return 案件信息
	 */
	public BaseCaseModel getAjxxByAjxh(int ajxh);

}
