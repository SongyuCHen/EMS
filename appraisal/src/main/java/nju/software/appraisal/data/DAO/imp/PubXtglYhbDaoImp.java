package nju.software.appraisal.data.DAO.imp;


import java.util.List;

import org.springframework.stereotype.Repository;

import nju.software.appraisal.data.DAO.PubXtglYhbDAO;
import nju.software.appraisal.data.dataobject.PubXtglYhb;
import nju.software.appraisal.service.model.UserContext;

@Repository("pubXtglYhbDao")
public class PubXtglYhbDaoImp extends BaseDaoImp<PubXtglYhb> implements PubXtglYhbDAO{

	@Override
	public PubXtglYhb checkin(String username, String password) {
		// TODO Auto-generated method stub
		PubXtglYhb yhb = this.get("from PubXtglYhb where yhdm=? and yhkl=?", new Object[]{username,password});
		return yhb;
	}

	@Override
	public List<PubXtglYhb> getXtglYhListByBmdmList(List<String> bmbhList) {
		// TODO Auto-generated method stub
		if(bmbhList!=null &&bmbhList.size()>0){
			StringBuffer bmbhs = new StringBuffer();
			for(String bmbh:bmbhList){
				bmbhs.append("'".concat(bmbh).concat("',"));
			}
			bmbhs.replace(bmbhs.length()-2, bmbhs.length()-1, ")");
			String hql = "from PubXtglYhb where yhbm in("+bmbhs;
			List<PubXtglYhb> yhbs = this.find(hql);
			return yhbs;
		}else {
			return null;
		}	
	}

	

	@Override
	public PubXtglYhb getXtglYhListByyhmc(String yhmc) {
		// TODO Auto-generated method stub
		PubXtglYhb yhb = this.get("from PubXtglYhb where yhmc=?", new Object[]{yhmc});
		return yhb;
	}

	@Override
	public PubXtglYhb getByYhbh(int yhbh) {
		// TODO Auto-generated method stub
		PubXtglYhb yhb = this.get("from PubXtglYhb where yhbh=?", new Object[]{yhbh});
		return yhb;
	}

	@Override
	public List<PubXtglYhb> getAllYhList() {
		// TODO Auto-generated method stub
		List<PubXtglYhb> yhbs = this.find("from PubXtglYhb");
		return yhbs;
	}



}
