package nju.software.appraisal.data.DAO;

import java.util.List;

import nju.software.appraisal.data.dataobject.PcAj;

public interface PcAjDAO extends BaseDAO<PcAj> {
	/**
	 * ��������Ż�ȡ���鰸��
	 * @param pcbh
	 * @return
	 */
	List<PcAj> getPcAjByPcbh(int pcbh);
	/**
	 * ��������ź���Ա��Ż�ȡĳ������ĳ�˷��䵽�İ���
	 * @param pcbh
	 * @param rybh
	 * @return
	 */
	List<PcAj>  getPcaAjByPcbhRybh(int pcbh,int rybh);

	/**
	 * �����Ա��Ż�ȡĳ����������а����б�
	 * @param rybh
	 * @return
	 */
	List<PcAj> getPcajByRybh(int rybh);
	

}
