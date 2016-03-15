package nju.software.ems.convert;

import java.util.ArrayList;
import java.util.List;

import nju.software.ems.biz.vo.AjjbxxVO;
import nju.software.ems.biz.vo.AjxxcxVO;
import nju.software.ems.service.model.BaseCaseModel;
import nju.software.ems.service.model.QueryModel;

public class AjxxcxConvort {
	
	/**
	 * 将提交的案件查询信息转成querymodel
	 * @param vo  案件查询信息
	 * @return 查询model
	 */
	public static QueryModel AjxxcxToQueryModel(AjxxcxVO vo)
	{
		QueryModel model = new QueryModel();
		model.setAh(vo.getAh());
		model.setBmdm(vo.getBmmc());
		model.setAjmc(vo.getAjmc());
		model.setCbrxm(vo.getCbr());
		model.setRqStart(vo.getQsrq());
		model.setRqEnd(vo.getJsrq());
		return model;
	}
	
	/**
	 * 将案件基本信息model转换成案件基本信息VO
	 * @param model 案件基本信息model
	 * @return 案件基本信息VO
	 */
	public static AjjbxxVO BaseCaseModelToAjjbxxVO(BaseCaseModel model)
	{
		AjjbxxVO ajjbxxVO = new AjjbxxVO();
		ajjbxxVO.setAh(model.getAh());
		ajjbxxVO.setAjxh(model.getAjxh());
		ajjbxxVO.setAjmc(model.getAjmc());
		ajjbxxVO.setBaspt(model.getBasptmc());
		return ajjbxxVO;
	}
	
	
	/**
	 * 将案件基本信息model转换成案件基本信息VO
	 * @param models 案件基本信息models
	 * @return 案件基本信息VOs
	 */
	public static List<AjjbxxVO>  BCModelListToAjjbxxVOs(List<BaseCaseModel> models)
	{
		List<AjjbxxVO> vos = new ArrayList<AjjbxxVO>();
		for (BaseCaseModel baseCaseModel : models)
			vos.add(BaseCaseModelToAjjbxxVO(baseCaseModel));
		return vos;
	}

}
