package nju.software.ems.service;

import java.util.List;

import nju.software.ems.service.model.DsrJbxxModel;

public interface DsrjbxxService {
	
	/**
	 * ���ݰ�����Ż�ù��ڸð��������е�����
	 * @param ajxh �������
	 * @return ���е������б�
	 */
	public List<DsrJbxxModel> getAllDsrjbxxByAjxh(int ajxh);
	
	/**
	 * ���ݰ�����ţ������˱�ţ�����������ȡ��������ϸ��Ϣ
	 * @param ajxh �������
	 * @param dsrbh �����˱�� 
	 * @param lbbh �����
	 * @return ָ����������ϸ��Ϣ
	 */
	public DsrJbxxModel getDsrXxxxByAjxhAndDsrBhAndLbbh(int ajxh , int dsrbh , String lbbh);
	
	/**
	 * ���ݰ�����ţ������˱�Ż�ȡ��������ϸ��Ϣ
	 * @param ajxh �������
	 * @param dsrbh �����˱�� 
	 * @return ָ����������ϸ��Ϣ
	 */
	public DsrJbxxModel getDsrXxxxByAjxhAndDsrBh(int ajxh , int dsrbh);

}
