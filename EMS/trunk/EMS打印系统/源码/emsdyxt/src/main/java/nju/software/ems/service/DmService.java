package nju.software.ems.service;

import java.util.List;

import nju.software.ems.service.model.BmModel;
import nju.software.ems.service.model.DmbModel;
import nju.software.ems.service.model.FyModel;

public interface DmService {
	
	/**
	 * 获取法院所有的部门
	 * @return
	 */
	public List<BmModel> getFybm();
	
	/**
	 * 根据类别编号和代码编号得到某个法院的个性代码
	 * 
	 * @param lbbh 类别编号
	 * @param dmbh 编号
	 * @return DmModel
	 */
	public DmbModel getDmByLbbhAndDmms(String lbbh, String dmbh);
	
	/**
	 * 根据类别编号个性代码
	 * @param lbbh 类别编号
	 * @return
	 */
	public List<DmbModel> getDmByLbbh(String lbbh);
	
	/**
	 * 获取当前法院的相关信息
	 * @return 法院信息
	 */
	public FyModel getFyxx();

}
