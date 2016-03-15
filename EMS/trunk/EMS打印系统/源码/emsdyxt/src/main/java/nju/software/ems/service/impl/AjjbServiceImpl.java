package nju.software.ems.service.impl;

import nju.software.ems.data.dao.AjJbDao;
import nju.software.ems.service.AjjbService;
import nju.software.ems.service.model.BaseCaseModel;

public class AjjbServiceImpl implements AjjbService{
	private AjJbDao ajJbDao;

	public BaseCaseModel getAjjbxxByAjxh(int ajxh) {
		// TODO Auto-generated method stub
		return new BaseCaseModel(ajJbDao.findByAjxh(ajxh));
	}

	public AjJbDao getAjJbDao() {
		return ajJbDao;
	}

	public void setAjJbDao(AjJbDao ajJbDao) {
		this.ajJbDao = ajJbDao;
	}

}
