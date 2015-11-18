package nju.software.appraisal.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import nju.software.appraisal.data.DAO.DmbDAO;
import nju.software.appraisal.data.DAO.PubXtglYhbDAO;
import nju.software.appraisal.data.dataobject.PubXtglYhb;
import nju.software.appraisal.service.PubXtglYhbService;
import nju.software.appraisal.service.model.UserContext;

@Service("pubXtglYhbService")
public class PubXtglYhbServiceImp implements PubXtglYhbService {
	
	@Resource
	private PubXtglYhbDAO pubXtglYhbDao;
	@Resource
	private DmbDAO dmbDao;

	@Override
	public PubXtglYhb checkin(String username, String password) {
		// TODO Auto-generated method stub
		return pubXtglYhbDao.checkin(username, password);
	}

	@Override
	public List<PubXtglYhb> getXtglYhListByBmdmList(List<String> bmbhList) {
		// TODO Auto-generated method stub
		//需要在PubXtglYhbDao中特例化方法
		return pubXtglYhbDao.getXtglYhListByBmdmList(bmbhList);
	}

	
	

	

	@Override
	public List<UserContext> getAllYhList() {
		// TODO Auto-generated method stub
		//需要在PubXtglYhbDao中特例化方法
		List<UserContext> userList = new ArrayList<UserContext>();
		List<PubXtglYhb> yhList = pubXtglYhbDao.getAllYhList();
		String bmmc = "";
		for(PubXtglYhb yhb:yhList){
			UserContext user = new UserContext();
			user.setBmbh(yhb.getYhbm());
			bmmc = dmbDao.getDmms("USR206-99", yhb.getYhbm());
			user.setBmmc(bmmc);
			user.setName(yhb.getYhmc());
			user.setPassword(yhb.getYhkl());
			user.setYhsf(yhb.getYhsf());
			user.setYhbh(yhb.getYhbh());
			userList.add(user);
		}
		return userList;
	}

	@Override
	public String getYhbmmcByyhbh(Integer yhbh) {
		// TODO Auto-generated method stub
		//尽量减少连表查询，使用多次查询
		PubXtglYhb yhb = pubXtglYhbDao.getByYhbh(yhbh);
		String bmmc = dmbDao.getDmms("USR206-99", yhb.getYhbm());
		return bmmc;
	}

	@Override
	public PubXtglYhb getXtglYhListByyhmc(String yhmc) {
		// TODO Auto-generated method stub
		return pubXtglYhbDao.get("from PubXtglYhb where YHMC=? and YHSF in ('政治部主任','庭长','主任','副主任')", new Object[]{yhmc});
	}

	

	@Override
	public PubXtglYhb getByYhbh(int yhbh) {
		// TODO Auto-generated method stub
		return pubXtglYhbDao.getByYhbh(yhbh);
	}



}
