/**
 * 
 */
package nju.software.ems.service;

import java.util.Date;
import java.util.List;

import nju.software.ems.service.model.KdModel;

/**
 * @author ����Դ xxy
 *
 * 2015-1-21 ����10:27:11 Admin
 */
public interface KdtdService {

	/**
	 * ��ȡδ��ӡ�Ŀ����Ϣ�б�
	 * @return
	 */
	public List<KdModel> getWdy();
	
	/**
	 * ��ȡ�����Ϣ
	 * @param kdid
	 * @return
	 */
	public KdModel getKdtd(int kdid);
	
	/**
	 * ���ݴ�ӡ���ڣ�scrq����ȡ�Ѵ�ӡ�Ŀ����Ϣ�б�
	 * @param scrqFormer
	 * @param scrqLatter
	 * @return
	 */
	public List<KdModel> getYdy(Date scrqFormer, Date scrqLatter);
	
	/**
	 * �������״���Ϣ
	 * ���kdid>0��ʾ�޸���Ӧkdid����
	 * ���kdid<=0��ʾ����
	 * @param kd
	 * @return
	 */
	public boolean saveKdtd(KdModel kd);
	
	/**
	 * ��ӡ��ݣ�����״̬
	 * @param kdid
	 * @return
	 */
	public boolean printKd(int kdid);
	
	/**
	 * ����ʹͨ����ݵ��Ÿ��¿��״̬
	 * @param kdid
	 * @return
	 */
	public boolean recievedKdByEms(String kddh);
	
	/**
	 * ����ʹͨ��kdid���¿��״̬
	 * @param kdid
	 * @return
	 */
	public boolean recievedKdByKdid(int kdid);
	
	/**
	 * ɾ����ݵ���Ϣ
	 * @param kdid
	 * @return
	 */
	public boolean deleteKdByKdid(int kdid);

	/**
	 * ��ȡͶ���еĿ��
	 * @param qsrq
	 * @param jsrq
	 * @return
	 */
	public List<KdModel> getTdz(Date qsrq, Date jsrq);

	/**
	 * ��ȡ���ʹ�Ŀ��
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
