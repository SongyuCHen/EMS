/**
 * 
 */
package nju.software.ems.service.convertor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sun.security.krb5.internal.tools.Ktab;

import nju.software.ems.biz.vo.KdtdVO;
import nju.software.ems.data.daoobject.KdtdDO;
import nju.software.ems.service.model.KdModel;
import nju.software.ems.util.DateUtil;
import nju.software.ems.util.StringUtil;

/**
 * @author –ÏˆŒ‘¥ xxy
 * 
 *         2015-1-21 …œŒÁ11:07:41 Admin
 */
public class KdtdConvertor {
	public static KdModel doToModel(KdtdDO kdDO) {
		return new KdModel(kdDO.getKdid(), kdDO.getAh(), kdDO.getSjrxm(),
				kdDO.getYddh(), kdDO.getZzdh(), kdDO.getBgdh(), kdDO.getDwmc(),
				kdDO.getSjrdz(), kdDO.getYzbm(), kdDO.getJjnr(),
				kdDO.getJjrdh(), kdDO.getJjrxm(), kdDO.getScrq(),
				kdDO.getSdrq(), kdDO.getKddh(), kdDO.getDyrq(), kdDO.getWsmc(), kdDO.getKdhz());
	}
	
	public static KdtdDO modelToDO(KdModel kdModel) {
		return new KdtdDO(kdModel.getKdid(), kdModel.getAh(), kdModel.getSjrxm(),
				kdModel.getYddh(), kdModel.getZzdh(), kdModel.getBgdh(), kdModel.getDwmc(),
				kdModel.getSjrdz(), kdModel.getYzbm(), kdModel.getJjnr(),
				kdModel.getJjrdh(), kdModel.getJjrxm(), kdModel.getScrq(),
				kdModel.getSdrq(), kdModel.getKddh(), kdModel.getDyrq(), kdModel.getWsmc(), kdModel.getKdhz());
	}
	
	public static List<KdModel> doToModel(List<KdtdDO> kdDOs) {
		List<KdModel> models = new ArrayList<KdModel>();
		for(KdtdDO kdDO : kdDOs) {
			models.add(new KdModel(kdDO.getKdid(), kdDO.getAh(), kdDO.getSjrxm(),
				kdDO.getYddh(), kdDO.getZzdh(), kdDO.getBgdh(), kdDO.getDwmc(),
				kdDO.getSjrdz(), kdDO.getYzbm(), kdDO.getJjnr(),
				kdDO.getJjrdh(), kdDO.getJjrxm(), kdDO.getScrq(),
				kdDO.getSdrq(), kdDO.getKddh(), kdDO.getDyrq(), kdDO.getWsmc(), kdDO.getKdhz()));
			
		}
		return models;
	}
	
	public static List<KdModel> vosToModels(List<KdtdVO> vos)
	{
		List<KdModel> models = new ArrayList<KdModel>();
		for (KdtdVO kdtdVO : vos)
			models.add(voToModel(kdtdVO));
		return models;
	}
	
	public static KdModel voToModel(KdtdVO vo)
	{
		KdModel model = new KdModel();
		if(StringUtil.isEmpty(vo.getKdid()))
			model.setKdid(-1);
		else
			model.setKdid(Integer.parseInt(vo.getKdid()));
		model.setAh(vo.getAh());
		model.setSjrxm(vo.getSjrxm());
		model.setYddh(vo.getYddh());
		model.setZzdh(vo.getZzdh());
		model.setBgdh(vo.getBgdh());
		model.setDwmc(vo.getDwmc());
		model.setSjrdz(vo.getSjrdz());
		model.setYzbm(vo.getYzbm());
		model.setJjnr(StringUtil.isEmpty(vo.getJjnr()) ? null : Integer.parseInt(vo.getJjnr()));
		model.setJjrdh(vo.getJjrdh());
		model.setJjrxm(vo.getJjrxm());
		model.setScrq(vo.getScrq() == null ? new Date() : DateUtil.parse(vo.getScrq(), DateUtil.webFormat));
		model.setWsmc(vo.getWsmc());
		model.setKddh(vo.getKddh());
		return model;
	}
}
