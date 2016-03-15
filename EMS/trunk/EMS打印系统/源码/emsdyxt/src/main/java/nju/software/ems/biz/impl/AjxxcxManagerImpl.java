package nju.software.ems.biz.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nju.software.ems.biz.AjxxcxManager;
import nju.software.ems.biz.vo.AjjbxxVO;
import nju.software.ems.biz.vo.AjxxcxVO;
import nju.software.ems.convert.AjxxcxConvort;
import nju.software.ems.service.AjcxService;
import nju.software.ems.service.DsrjbxxService;
import nju.software.ems.service.model.BaseCaseModel;
import nju.software.ems.service.model.DsrJbxxModel;

public class AjxxcxManagerImpl implements AjxxcxManager {
	
	private static final Logger log = LoggerFactory.getLogger(AjxxcxManagerImpl.class);
	
	private AjcxService ajcxService;
	private DsrjbxxService dsrjbxxService;

	public List<AjjbxxVO> getAjjbxxByAjxxcxVO(AjxxcxVO vo) {
		// TODO Auto-generated method stub
		List<AjjbxxVO> vos = new ArrayList<AjjbxxVO>();
		try {
			List<BaseCaseModel> baseCaseModels = ajcxService.getSearchResult(AjxxcxConvort.AjxxcxToQueryModel(vo));
			for (BaseCaseModel baseCaseModel : baseCaseModels) {
//				List<DsrJbxxModel> dsrJbxxModels = dsrjbxxService.getAllDsrjbxxByAjxh((int)baseCaseModel.getAjxh());
//				if(dsrJbxxModels.size() == 0)      //该案件没有当事人信息
//				{
					AjjbxxVO newVo = AjxxcxConvort.BaseCaseModelToAjjbxxVO(baseCaseModel);
					vos.add(newVo);
//				}
//				else                               //存在当事人信息
//					for (DsrJbxxModel dsrJbxxModel : dsrJbxxModels) {
//						AjjbxxVO newVo = AjxxcxConvort.BaseCaseModelToAjjbxxVO(baseCaseModel);
//						newVo.updateDsrxx(dsrJbxxModel);
//						vos.add(newVo);
//					}
			}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
		}
		return vos;
	}
	
	public AjjbxxVO getAjjbxxVOByAjxh(int ajxh) {
		// TODO Auto-generated method stub
		BaseCaseModel baseCaseModel = ajcxService.getAjxxByAjxh(ajxh);
		AjjbxxVO newVo = AjxxcxConvort.BaseCaseModelToAjjbxxVO(baseCaseModel);
		List<DsrJbxxModel> dsrJbxxModels = dsrjbxxService.getAllDsrjbxxByAjxh((int)baseCaseModel.getAjxh());
		for (DsrJbxxModel dsrJbxxModel : dsrJbxxModels)
			newVo.updateDsrxx(dsrJbxxModel);
		return newVo;
		
	}

	public void setAjcxService(AjcxService ajcxService) {
		this.ajcxService = ajcxService;
	}

	public void setDsrjbxxService(DsrjbxxService dsrjbxxService) {
		this.dsrjbxxService = dsrjbxxService;
	}

}
