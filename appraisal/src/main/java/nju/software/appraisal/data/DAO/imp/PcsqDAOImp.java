package nju.software.appraisal.data.DAO.imp;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import nju.software.appraisal.data.DAO.PcsqDAO;
import nju.software.appraisal.data.dataobject.Pcsq;

public class PcsqDAOImp extends BaseDaoImp<Pcsq> implements PcsqDAO {	

	@Override
	public Pcsq getPcsqByPcbh(int pcbh) {
		// TODO Auto-generated method stub
		return this.get("from Pcsq where pcbh=?", new Object[]{pcbh});
	}

	@Override
	public Pcsq getPcsqByMc(String pcmc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pcsq> getPcsqByDate(Date kssj, Date jssj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pcsq> getPcsqByZt(String pczt) {
		// TODO Auto-generated method stub
		return null;
	}

}
