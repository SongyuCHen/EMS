package nju.software.ems.service.impl;

import java.util.List;

import nju.software.ems.data.dao.DmbDao;
import nju.software.ems.data.dao.XtglYhbDao;
import nju.software.ems.data.daoobject.XtglYhbDO;
import nju.software.ems.service.LoginService;
import nju.software.ems.service.model.UserContext;
import nju.software.ems.util.StringUtil;


public class LoginServiceImpl implements LoginService {
	XtglYhbDao xtglYhbDao;
	DmbDao dmbDao;
	
	public UserContext login(String username, String password, String role) {
		if(StringUtil.isEmpty(username) || StringUtil.isEmpty(password) || StringUtil.isEmpty(role))
			return null;
		List<XtglYhbDO> xtglYhbList =xtglYhbDao.findByYhdm(username);
		if(null!=xtglYhbList && xtglYhbList.size()==1) {
			XtglYhbDO yhb = xtglYhbList.get(0);
			if(StringUtil.equals(yhb.getYhkl(), password)) {
				UserContext context=new UserContext();
				context.setYhbh(yhb.getYhbh()==null?0:yhb.getYhbh());
				context.setBmbh(yhb.getYhbm()==null?"":yhb.getYhbm().trim());
				context.setRole(role.trim());
				context.setName(yhb.getYhmc()==null?"":yhb.getYhmc().trim());
				context.setYhsf(yhb.getYhsf()==null?"":yhb.getYhsf().trim());
				context.setBmmc(dmbDao.getDmms("USR206-99", context.getBmbh()));
				context.setPassword(password.trim());
				return context;
			}
		}
		return null;
	}

	public XtglYhbDao getXtglYhbDao() {
		return xtglYhbDao;
	}

	public void setXtglYhbDao(XtglYhbDao xtglYhbDao) {
		this.xtglYhbDao = xtglYhbDao;
	}

	public DmbDao getDmbDao() {
		return dmbDao;
	}

	public void setDmbDao(DmbDao dmbDao) {
		this.dmbDao = dmbDao;
	}

	
}
