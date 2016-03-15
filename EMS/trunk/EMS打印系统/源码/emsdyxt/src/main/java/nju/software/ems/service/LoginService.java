/**
 * 
 */
package nju.software.ems.service;

import nju.software.ems.service.model.UserContext;

/**
 * 登陆
 * @author 徐鑫源 xxy
 *
 * 2015-1-21 下午02:46:17 Admin
 */
public interface LoginService {
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @param role 0:法院人员 1:临时用户
	 * @return
	 */
	public UserContext login(String username,String password,String role);
}

