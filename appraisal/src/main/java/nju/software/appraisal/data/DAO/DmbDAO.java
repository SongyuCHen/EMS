package nju.software.appraisal.data.DAO;

import java.util.List;

import nju.software.appraisal.data.dataobject.Dmb;

public interface DmbDAO extends BaseDAO<Dmb>{
	/**
	 * 根据类别编号和代码编号获取代码描述
	 * @param lbbh
	 * @param dmbh
	 * @return
	 */
	public String getDmms(String lbbh,String dmbh);
	

	
	/**
	 * 根据类别编号和代码编号获取代码列表
	 * @param lbbh
	 * @param dmbh
	 * @param type 0:%XX%, 1:XX%, 2:%XX
	 * @return
	 */
	public List<Dmb> getDmbListByDmbhLike(String lbbh,String dmbh,int type);
	
	/**
	 * 根据类别编号获取代码表List
	 * @param lbbh
	 * @return List &lt;Dmb&gt;
	 */
	public List<Dmb> getDmbList(String lbbh);

	
	/**
	 * 根据类别编号和代码编号返回dmbDo
	 * @param lbbh
	 * @param dmbh
	 * @return
	 */
	public Dmb getDmbBybh(String lbbh, String dmbh);
	
	/**
	 * 根据类别编号和代码描述返回dmbDo
	 * @param lbbh
	 * @param dmms
	 * @return
	 */
	public Dmb getDmbByms(String lbbh, String dmms);
}
