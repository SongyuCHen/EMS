package nju.software.ems.biz;

import java.util.List;

import nju.software.ems.biz.vo.AjjbxxVO;
import nju.software.ems.biz.vo.AjxxcxVO;

public interface AjxxcxManager {
	
	/**
	 * 查询案件信息
	 * @param vo 案件信息查询条件vo
	 * @return 符合条件的案件信息以及当事人信息
	 */
	public List<AjjbxxVO> getAjjbxxByAjxxcxVO(AjxxcxVO vo);
	
	/**
	 * 查询案件信息
	 * @param ajxh 案件序号
	 * @return 案件信息以及当事人信息
	 */
	public AjjbxxVO getAjjbxxVOByAjxh(int ajxh);
}
