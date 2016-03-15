package nju.software.ems.service.impl;

import java.util.List;

import nju.software.ems.data.dao.DmbDao;
import nju.software.ems.data.daoobject.DmbDO;
import nju.software.ems.service.DmService;
import nju.software.ems.service.convertor.DmbConvertor;
import nju.software.ems.service.model.BmModel;
import nju.software.ems.service.model.DmbModel;
import nju.software.ems.service.model.FyModel;

public class DmServiceImpl implements DmService {
	
	private DmbDao dmbDao;

	public void setDmbDao(DmbDao dmbDao) {
		this.dmbDao = dmbDao;
	}

	public List<BmModel> getFybm() {
		// TODO Auto-generated method stub
		List<DmbDO> dmbDOs = dmbDao.getFybm();
		return  DmbConvertor.bmsToModels(dmbDOs);
	}

	public DmbModel getDmByLbbhAndDmms(String lbbh, String dmbh) {
		// TODO Auto-generated method stub
		DmbDO dmbDO = dmbDao.findById(lbbh, dmbh);
		if (dmbDO == null) {
			return null;
		}
		return DmbConvertor.dmToModel(dmbDO);
	}

	public List<DmbModel> getDmByLbbh(String lbbh) {
		// TODO Auto-generated method stub
		List<DmbDO> dmbDOs = dmbDao.findByLbbh(lbbh);
		return DmbConvertor.dmsToModels(dmbDOs);
	}

	public FyModel getFyxx() {
		// TODO Auto-generated method stub
		DmbDO dmbDO = dmbDao.findById("系统缺省", "法院名称");
		return DmbConvertor.dmbDoToFyModel(dmbDO);
	}

}
