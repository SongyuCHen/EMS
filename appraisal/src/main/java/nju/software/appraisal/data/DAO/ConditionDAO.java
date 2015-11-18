package nju.software.appraisal.data.DAO;

import java.util.List;

import nju.software.appraisal.data.dataobject.Condition;

public interface ConditionDAO extends BaseDAO<Condition> {
	/**
	 * 根据评查编号获取评查筛选条件
	 * @param pcbh
	 * @return
	 */
	List<Condition> getConditionsByPcbh(int pcbh);

}
