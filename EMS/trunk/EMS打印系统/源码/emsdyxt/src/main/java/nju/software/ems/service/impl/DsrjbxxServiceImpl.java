package nju.software.ems.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nju.software.ems.data.dao.AjJbDao;
import nju.software.ems.data.dao.DmbDao;
import nju.software.ems.data.dao.DsrDwDao;
import nju.software.ems.data.dao.DsrGrDao;
import nju.software.ems.data.dao.DsrJbDao;
import nju.software.ems.data.dao.DsrXpJgDao;
import nju.software.ems.data.daoobject.AjJbDO;
import nju.software.ems.data.daoobject.DmbDO;
import nju.software.ems.data.daoobject.DsrDwDO;
import nju.software.ems.data.daoobject.DsrGrDO;
import nju.software.ems.data.daoobject.DsrJbDO;
import nju.software.ems.data.daoobject.DsrXpJgDO;
import nju.software.ems.service.DmService;
import nju.software.ems.service.DsrjbxxService;
import nju.software.ems.service.model.DmbModel;
import nju.software.ems.service.model.DsrJbxxModel;
import nju.software.ems.util.StringUtil;

public class DsrjbxxServiceImpl implements DsrjbxxService {
	
	private DsrJbDao dsrJbDao;   //当事人基本信息Dao
	private DsrDwDao dsrDwDao;   //当事人单位基本信息Dao
	private DsrGrDao dsrGrDao;   //当事人个人基本信息Dao
	private DsrXpJgDao dsrXpJgDao;    //当事人行政机关基本信息Dao
	private DmService dmService;
	private AjJbDao ajJbDao;
	
	public List<DsrJbxxModel> getAllDsrjbxxByAjxh(int ajxh) {
		// TODO Auto-generated method stub
		List<DsrJbxxModel> dsrJbxxModels = new ArrayList<DsrJbxxModel>();
		
		List<DsrJbDO> dsrJbDOs = dsrJbDao.getDsrByAjxh(ajxh);  //所有当事人列表
		
		List<DmbModel> dsrlbList = dmService.getDmByLbbh("FBS0002-TM");   //加快匹配速度
		Map<String, String> dsrlbMap = new HashMap<String, String>();
		for (DmbModel dmbModel : dsrlbList)
			dsrlbMap.put(dmbModel.getDmbh(), dmbModel.getDmms());
		
		//获取当事人详细信息
		for (DsrJbDO dsrJbDO : dsrJbDOs) {
			DsrJbxxModel dsrJbxxModel = new DsrJbxxModel();
			dsrJbxxModel.setAjxh(ajxh);
			dsrJbxxModel.setDsrbh(dsrJbDO.getDsrbh());
			dsrJbxxModel.setDsrjc(dsrJbDO.getDsrjc());
			dsrJbxxModel.setDsrlb(dsrJbDO.getDsrlb());
			dsrJbxxModel.setDsrlbms(dsrlbMap.get(dsrJbDO.getDsrlb()));
			dsrJbxxModels.add(dsrJbxxModel);
		}
		return dsrJbxxModels;
	}
	
	public DsrJbxxModel getDsrXxxxByAjxhAndDsrBhAndLbbh(int ajxh, int dsrbh,
			String lbbh) {
		// TODO Auto-generated method stub
		return generateDsrJbxxModel(dsrJbDao.findById(ajxh, dsrbh));
	}

	public DsrJbxxModel getDsrXxxxByAjxhAndDsrBh(int ajxh, int dsrbh) {
		// TODO Auto-generated method stub
		return generateDsrJbxxModel(dsrJbDao.findById(ajxh, dsrbh));
	}
	
	/**
	 * 将当事人DO的信息转换成model信息
	 * @param dsrJbDO 当事人DO
	 * @return model信息
	 */
	protected DsrJbxxModel generateDsrJbxxModel(DsrJbDO dsrJbDO) {
		if(dsrJbDO == null)
			return new DsrJbxxModel();
		DsrJbxxModel dsrJbxxModel = new DsrJbxxModel();
		int ajxh = dsrJbDO.getAjxh();
		int dsrbh = dsrJbDO.getDsrbh();
		String lbbh = dsrJbDO.getDsrlb();
		AjJbDO ajJbDO = ajJbDao.findByAjxh(ajxh);
		if(ajJbDO != null)
			dsrJbxxModel.setAh(ajJbDO.getAh());
		dsrJbxxModel.setAjxh(ajxh);
		dsrJbxxModel.setDsrbh(dsrbh);
		if(StringUtil.equals(lbbh, "1")) //获取个人当事人
		{
			DsrGrDO dsrGrDO = dsrGrDao.findById(ajxh, dsrbh);
			dsrJbxxModel.setXm(dsrGrDO.getXm() == null ? dsrJbDO.getDsrjc() : dsrGrDO.getXm());
			dsrJbxxModel.setDz(dsrGrDO.getDz());
			dsrJbxxModel.setYb(dsrGrDO.getYb());
			dsrJbxxModel.setLxdh(dsrGrDO.getDh());
			dsrJbxxModel.setDxgzhm(dsrGrDO.getDh());
		}
		else if(StringUtil.equals(lbbh, "2"))  //获取单位当事人
		{
			DsrDwDO dsrDwDO = dsrDwDao.findById(ajxh, dsrbh);
			dsrJbxxModel.setXm(dsrDwDO.getDwmc() == null ? dsrJbDO.getDsrjc() : dsrDwDO.getDwmc());
			dsrJbxxModel.setDwmc(dsrDwDO.getDwmc());
			dsrJbxxModel.setDz(dsrDwDO.getDz());
			dsrJbxxModel.setLxdh(dsrDwDO.getLxdh());
			dsrJbxxModel.setYb(dsrDwDO.getYb());
			dsrJbxxModel.setDxgzhm(dsrDwDO.getDh());
		}
		else if(StringUtil.equals(lbbh, "3"))  //获取机关当事人
		{
			DsrXpJgDO dsrXpJgDO = dsrXpJgDao.findById(ajxh, dsrbh);
			dsrJbxxModel.setXm(dsrXpJgDO.getJgmc() == null ? dsrJbDO.getDsrjc() : dsrXpJgDO.getJgmc());
			dsrJbxxModel.setDwmc(dsrXpJgDO.getJgmc());
			dsrJbxxModel.setGzdw(dsrXpJgDO.getJgmc());
			dsrJbxxModel.setDxgzhm(dsrXpJgDO.getDh());
			dsrJbxxModel.setLxdh(dsrXpJgDO.getDh());
			dsrJbxxModel.setYb(dsrXpJgDO.getYb());
			dsrJbxxModel.setDz(dsrXpJgDO.getDz());
		}
		else    //there is a dirty data in database
			return null;
		return dsrJbxxModel;
	}


	public void setDsrJbDao(DsrJbDao dsrJbDao) {
		this.dsrJbDao = dsrJbDao;
	}

	public void setDsrDwDao(DsrDwDao dsrDwDao) {
		this.dsrDwDao = dsrDwDao;
	}

	public void setDsrGrDao(DsrGrDao dsrGrDao) {
		this.dsrGrDao = dsrGrDao;
	}

	public void setDsrXpJgDao(DsrXpJgDao dsrXpJgDao) {
		this.dsrXpJgDao = dsrXpJgDao;
	}

	public void setDmService(DmService dmService) {
		this.dmService = dmService;
	}

	public void setAjJbDao(AjJbDao ajJbDao) {
		this.ajJbDao = ajJbDao;
	}

}
