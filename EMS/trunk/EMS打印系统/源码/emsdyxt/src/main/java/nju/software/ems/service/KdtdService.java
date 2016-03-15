/**
 * 
 */
package nju.software.ems.service;

import java.util.Date;
import java.util.List;

import nju.software.ems.service.model.KdModel;

/**
 * @author 徐鑫源 xxy
 *
 * 2015-1-21 上午10:27:11 Admin
 */
public interface KdtdService {

	/**
	 * 获取未打印的快递信息列表
	 * @return
	 */
	public List<KdModel> getWdy();
	
	/**
	 * 获取快递信息
	 * @param kdid
	 * @return
	 */
	public KdModel getKdtd(int kdid);
	
	/**
	 * 根据打印日期（scrq）获取已打印的快递信息列表
	 * @param scrqFormer
	 * @param scrqLatter
	 * @return
	 */
	public List<KdModel> getYdy(Date scrqFormer, Date scrqLatter);
	
	/**
	 * 保存快递套打信息
	 * 如果kdid>0表示修改相应kdid的项
	 * 如果kdid<=0表示新增
	 * @param kd
	 * @return
	 */
	public boolean saveKdtd(KdModel kd);
	
	/**
	 * 打印快递，更新状态
	 * @param kdid
	 * @return
	 */
	public boolean printKd(int kdid);
	
	/**
	 * 快递送达，通过快递单号更新快递状态
	 * @param kdid
	 * @return
	 */
	public boolean recievedKdByEms(String kddh);
	
	/**
	 * 快递送达，通过kdid更新快递状态
	 * @param kdid
	 * @return
	 */
	public boolean recievedKdByKdid(int kdid);
	
	/**
	 * 删除快递单信息
	 * @param kdid
	 * @return
	 */
	public boolean deleteKdByKdid(int kdid);

	/**
	 * 获取投递中的快递
	 * @param qsrq
	 * @param jsrq
	 * @return
	 */
	public List<KdModel> getTdz(Date qsrq, Date jsrq);

	/**
	 * 获取已送达的快递
	 * @param qsrq
	 * @param jsrq
	 * @return
	 */
	public List<KdModel> getYsd(Date qsrq, Date jsrq);

	/**
	 * @param qsrq
	 * @param jsrq
	 * @param czr
	 * @param ah
	 * @param sjr
	 * @return
	 */
	public List<KdModel> search(Date qsrq, Date jsrq, String czr, String ah,
			String sjr);
}
