package nju.software.appraisal.data.DAO;

import java.util.List;

import nju.software.appraisal.data.dataobject.Pcr;

public interface PcrDAO extends BaseDAO<Pcr> {
	
	/**
	 * 得到所有的评查人
	 * @return
	 */
	List<Pcr> getAllPcr();
	/**
	 * 根据角色获取评查人
	 * @param jsbh
	 * @return
	 */
	List<Pcr> getPcrByJs(int jsbh);
	/**
	 * 根据姓名获取评查人
	 * @param xm
	 * @return
	 */
	Pcr getPcrByXm(String xm);
}
