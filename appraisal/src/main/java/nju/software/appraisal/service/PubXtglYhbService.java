package nju.software.appraisal.service;

import java.util.List;

import nju.software.appraisal.data.dataobject.PubXtglYhb;
import nju.software.appraisal.service.model.UserContext;

public interface PubXtglYhbService {
	
	/**
	 * 登陆
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public PubXtglYhb checkin(String username,String password);
	
	/**
	 * 通过部门编号列表查询用户
	 */
	public List<PubXtglYhb> getXtglYhListByBmdmList(List<String> bmbhList);


	
	/**
	 * 获取所有用户列表
	 * 
	 * @return
	 */
	public List<UserContext> getAllYhList();
	
	/**
	 * 根据用户编号获取用户部门名称
	 * 
	 * @param yhbh
	 * @return
	 */
	public String getYhbmmcByyhbh(Integer yhbh);
	
	/**
	 * 
	 * @param bmbhList
	 * @return
	 */
	public PubXtglYhb getXtglYhListByyhmc(String yhmc);

	
	/**
	 * 徐鑫源 通过用户编号得到用户
	 * 
	 * @param bmbh
	 * @param filter
	 * @return
	 */
	public PubXtglYhb getByYhbh(int yhbh);

	
}
