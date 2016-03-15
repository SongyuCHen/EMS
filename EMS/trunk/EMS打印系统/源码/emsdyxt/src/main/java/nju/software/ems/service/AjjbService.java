package nju.software.ems.service;

import nju.software.ems.service.model.BaseCaseModel;

public interface AjjbService {
	
	/**
	 * 根据案件序号获取案件信息
	 * @param ajxh 案件序号
	 * @return 案件信息
	 */
	public BaseCaseModel getAjjbxxByAjxh(int ajxh);

}
