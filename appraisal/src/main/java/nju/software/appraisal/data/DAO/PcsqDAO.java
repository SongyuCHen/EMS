package nju.software.appraisal.data.DAO;

import java.sql.Date;
import java.util.List;

import nju.software.appraisal.data.dataobject.Pcsq;

public interface PcsqDAO extends BaseDAO<Pcsq> {
	/**
	 * 根据评查编号获取评查申请
	 * @param pcbh
	 * @return
	 */
	Pcsq getPcsqByPcbh(int pcbh);
	/**
	 * 根据评查名称获取评查申请
	 * @param pcmc
	 * @return
	 */
	Pcsq getPcsqByMc(String pcmc);
	/**
	 * 根据申请时间获取评查申请
	 * @param kssj
	 * @param jssj
	 * @return
	 */
	List<Pcsq> getPcsqByDate(Date kssj,Date jssj);
	/**
	 * 根据评查状态获取评查申请
	 * @param pczt
	 * @return
	 */
	List<Pcsq> getPcsqByZt(String pczt);

}
