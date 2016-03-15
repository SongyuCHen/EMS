package nju.software.ems.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nju.software.ems.biz.AjxxcxManager;
import nju.software.ems.biz.vo.AjjbxxVO;
import nju.software.ems.biz.vo.AjxxcxVO;
import nju.software.ems.data.dao.DsrDwDao;
import nju.software.ems.service.AjcxService;
import nju.software.ems.service.DmService;
import nju.software.ems.service.model.FyModel;
import nju.software.ems.service.model.QueryModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class testwork {
	
	AjcxService ajcxService;
	DsrDwDao dsrDwDao;
	AjxxcxManager ajxxcxManager;
	DmService dmService;
	
	@RequestMapping(value="/test.do",method=RequestMethod.GET)
	public String hello(HttpServletRequest request, HttpServletResponse response, ModelMap model){
//		QueryModel vo = new QueryModel();
//		System.out.println(dsrDwDao.findById(11, 2).getAjxh());
//		vo.setBmdm("06");
//		vo.setRqStart("2014-12-12");
		
//		AjxxcxVO vo = new AjxxcxVO();
//		vo.setBmmc("06");
//		vo.setQsrq("2014-12-12");
//		
//		List<AjjbxxVO> vos = ajxxcxManager.getAjjbxxByAjxxcxVO(vo);
//		for (AjjbxxVO ajjbxxVO : vos) {
//			System.out.println(ajjbxxVO.getDsrlx() + "   " + ajjbxxVO.getDsrmc());
//		}
		
		FyModel fyModel = dmService.getFyxx();
		System.out.println(fyModel.getFymc());
		System.out.println(fyModel.getFyyb());
	
		
		return null;
		
	}

	public void setAjcxService(AjcxService ajcxService) {
		this.ajcxService = ajcxService;
	}

	public void setDsrDwDao(DsrDwDao dsrDwDao) {
		this.dsrDwDao = dsrDwDao;
	}

	public void setAjxxcxManager(AjxxcxManager ajxxcxManager) {
		this.ajxxcxManager = ajxxcxManager;
	}

	public void setDmService(DmService dmService) {
		this.dmService = dmService;
	}
}
