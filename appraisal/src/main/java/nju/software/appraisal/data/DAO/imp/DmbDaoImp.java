package nju.software.appraisal.data.DAO.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import nju.software.appraisal.data.DAO.DmbDAO;
import nju.software.appraisal.data.dataobject.Dmb;

@Repository("dmbDao")
public class DmbDaoImp extends BaseDaoImp<Dmb> implements DmbDAO {

	@Override
	public String getDmms(String lbbh, String dmbh) {
		// TODO Auto-generated method stub
		Dmb dmb = this.get("from Dmb where lbbh=? and dmbh=?", new Object[]{lbbh,dmbh});
		if(dmb == null){
			return "";
		}else {
			return dmb.getDmms();
		}
	}

	@Override
	public List<Dmb> getDmbListByDmbhLike(String lbbh, String dmbh, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dmb> getDmbList(String lbbh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dmb getDmbBybh(String lbbh, String dmbh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dmb getDmbByms(String lbbh, String dmms) {
		// TODO Auto-generated method stub
		return null;
	}

}
