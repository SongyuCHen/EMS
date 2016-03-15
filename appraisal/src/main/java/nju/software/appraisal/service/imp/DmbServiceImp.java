package nju.software.appraisal.service.imp;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import nju.software.appraisal.data.DAO.DmbDAO;
import nju.software.appraisal.data.dataobject.Dmb;
import nju.software.appraisal.service.DmbService;
import org.springframework.cache.annotation.Cacheable;
@Service("dmbService")
public class DmbServiceImp implements DmbService{

	@Resource
	private DmbDAO dmbDao;
	
	
	@Cacheable(value="DM_CACHE")
	public String getDmms(String lbbh, String dmbh) {
		// TODO Auto-generated method stub
		return dmbDao.getDmms(lbbh, dmbh);
	}

	@Override
	@Cacheable(value="DM_CACHE")
	public List<Dmb> getDmbListByDmbhLike(String lbbh, String dmbh, int type) {
		// TODO Auto-generated method stub
		return dmbDao.getDmbListByDmbhLike(lbbh, dmbh, type);
	}

	@Override
	@Cacheable(value="DM_CACHE")
	public List<Dmb> getDmbList(String lbbh) {
		// TODO Auto-generated method stub
		return dmbDao.getDmbList(lbbh);
	}


	@Override
	@Cacheable(value="DM_CACHE")
	public Dmb getDmbBybh(String lbbh, String dmbh) {
		// TODO Auto-generated method stub
		return dmbDao.getDmbBybh(lbbh, dmbh);
	}

	@Override
	@Cacheable(value="DM_CACHE")
	public Dmb getDmbByms(String lbbh, String dmms) {
		// TODO Auto-generated method stub
		return dmbDao.getDmbByms(lbbh, dmms);
	}


	
}
