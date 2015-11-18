package nju.software.appraisal.data.DAO;

import java.util.List;

import nju.software.appraisal.data.dataobject.PcOption;

public interface PcOptionDAO extends BaseDAO<PcOption> {
	
	/**
	 * ��������Ż�ȡ����������Ŀ
	 * @param pcbh
	 * @return
	 */
	List<PcOption> getOptionByPcbh(int pcbh);

}
