/**
 * 
 */
package nju.software.ems.service;

import nju.software.ems.service.model.UserContext;

/**
 * ��½
 * @author ����Դ xxy
 *
 * 2015-1-21 ����02:46:17 Admin
 */
public interface LoginService {
	/**
	 * ��¼
	 * @param username
	 * @param password
	 * @param role 0:��Ժ��Ա 1:��ʱ�û�
	 * @return
	 */
	public UserContext login(String username,String password,String role);
}

