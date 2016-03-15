package nju.software.ems.service;

import java.util.List;

import nju.software.ems.service.model.DsrJbxxModel;

public interface DsrjbxxService {
	
	/**
	 * 根据案件序号获得关于该案件的所有当事人
	 * @param ajxh 案件序号
	 * @return 所有当事人列表
	 */
	public List<DsrJbxxModel> getAllDsrjbxxByAjxh(int ajxh);
	
	/**
	 * 根据案件序号，当事人编号，当事人类别获取当事人详细信息
	 * @param ajxh 案件序号
	 * @param dsrbh 当事人编号 
	 * @param lbbh 类别编号
	 * @return 指定当事人详细信息
	 */
	public DsrJbxxModel getDsrXxxxByAjxhAndDsrBhAndLbbh(int ajxh , int dsrbh , String lbbh);
	
	/**
	 * 根据案件序号，当事人编号获取当事人详细信息
	 * @param ajxh 案件序号
	 * @param dsrbh 当事人编号 
	 * @return 指定当事人详细信息
	 */
	public DsrJbxxModel getDsrXxxxByAjxhAndDsrBh(int ajxh , int dsrbh);

}
