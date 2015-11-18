package nju.software.appraisal.data.DAO.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import nju.software.appraisal.data.DAO.ConditionDAO;
import nju.software.appraisal.data.dataobject.Condition;
@Repository("conditionDAO")
public class ConditionDAOImp extends BaseDaoImp<Condition> implements ConditionDAO {

	@Override
	public List<Condition> getConditionsByPcbh(int pcbh) {
		// TODO Auto-generated method stub
		return this.find("from Condition where pcbh=?", new Object[]{pcbh});
	}

}
