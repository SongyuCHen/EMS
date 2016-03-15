package nju.software.ems.convert;

import java.util.ArrayList;
import java.util.List;

import nju.software.ems.biz.vo.AjjbxxVO;
import nju.software.ems.biz.vo.AjxxcxVO;
import nju.software.ems.service.model.BaseCaseModel;
import nju.software.ems.service.model.QueryModel;

public class AjxxcxConvort {
	
	/**
	 * ���ύ�İ�����ѯ��Ϣת��querymodel
	 * @param vo  ������ѯ��Ϣ
	 * @return ��ѯmodel
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
	 * ������������Ϣmodelת���ɰ���������ϢVO
	 * @param model ����������Ϣmodel
	 * @return ����������ϢVO
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
	 * ������������Ϣmodelת���ɰ���������ϢVO
	 * @param models ����������Ϣmodels
	 * @return ����������ϢVOs
	 */
	public static List<AjjbxxVO>  BCModelListToAjjbxxVOs(List<BaseCaseModel> models)
	{
		List<AjjbxxVO> vos = new ArrayList<AjjbxxVO>();
		for (BaseCaseModel baseCaseModel : models)
			vos.add(BaseCaseModelToAjjbxxVO(baseCaseModel));
		return vos;
	}

}
