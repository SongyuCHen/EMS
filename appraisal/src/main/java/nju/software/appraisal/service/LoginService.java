package nju.software.appraisal.service;

import nju.software.appraisal.service.model.UserContext;



/**
 * µÇÂ¼·þÎñ
 * @author wzq
 *
 */
public interface LoginService {
	/**
	 * µÇÂ¼
	 * @param username
	 * @param password
	 * @param fydm
	 * @return
	 */
	public UserContext login(String username,String password);
}
