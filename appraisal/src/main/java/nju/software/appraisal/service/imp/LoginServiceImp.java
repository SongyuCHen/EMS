package nju.software.appraisal.service.imp;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import nju.software.appraisal.data.DAO.PubXtglYhbDAO;
import nju.software.appraisal.data.dataobject.PubXtglYhb;
import nju.software.appraisal.service.DmbService;
import nju.software.appraisal.service.LoginService;
import nju.software.appraisal.service.model.UserContext;
@Service("loginService")
public class LoginServiceImp implements LoginService {

	@Resource
	private PubXtglYhbDAO yhbDAO;
	@Resource
	private DmbService dmbService;
	@Override
	public UserContext login(String username, String password) {
		// TODO Auto-generated method stub
		PubXtglYhb user = yhbDAO.get("from PubXtglYhb where yhdm=? and yhkl=?", new Object[]{username,password});
		UserContext userContext = new UserContext();
		if(user != null){
			userContext.setYhbh(user.getYhbh());
			userContext.setBmbh(user.getYhbm());
			String bmmc = dmbService.getDmms("USR206-99", user.getYhbm());
			userContext.setBmmc(bmmc);
			userContext.setName(user.getYhmc());
//			userContext.setRole(role);
			userContext.setYhsf(user.getYhsf());
			return userContext;
		}else {
			return null;
		}
		
	}

}
