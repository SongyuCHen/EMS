package nju.software.ems.service;

import java.util.List;

import nju.software.ems.service.model.BmModel;
import nju.software.ems.service.model.DmbModel;
import nju.software.ems.service.model.FyModel;

public interface DmService {
	
	/**
	 * ��ȡ��Ժ���еĲ���
	 * @return
	 */
	public List<BmModel> getFybm();
	
	/**
	 * ��������źʹ����ŵõ�ĳ����Ժ�ĸ��Դ���
	 * 
	 * @param lbbh �����
	 * @param dmbh ���
	 * @return DmModel
	 */
	public DmbModel getDmByLbbhAndDmms(String lbbh, String dmbh);
	
	/**
	 * ��������Ÿ��Դ���
	 * @param lbbh �����
	 * @return
	 */
	public List<DmbModel> getDmByLbbh(String lbbh);
	
	/**
	 * ��ȡ��ǰ��Ժ�������Ϣ
	 * @return ��Ժ��Ϣ
	 */
	public FyModel getFyxx();

}
