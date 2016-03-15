package nju.software.ems.biz;

import java.util.List;

import nju.software.ems.biz.vo.AjjbxxVO;
import nju.software.ems.biz.vo.AjxxcxVO;

public interface AjxxcxManager {
	
	/**
	 * ��ѯ������Ϣ
	 * @param vo ������Ϣ��ѯ����vo
	 * @return ���������İ�����Ϣ�Լ���������Ϣ
	 */
	public List<AjjbxxVO> getAjjbxxByAjxxcxVO(AjxxcxVO vo);
	
	/**
	 * ��ѯ������Ϣ
	 * @param ajxh �������
	 * @return ������Ϣ�Լ���������Ϣ
	 */
	public AjjbxxVO getAjjbxxVOByAjxh(int ajxh);
}
