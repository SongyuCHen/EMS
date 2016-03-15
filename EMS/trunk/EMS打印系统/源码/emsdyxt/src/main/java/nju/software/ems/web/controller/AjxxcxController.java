package nju.software.ems.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nju.software.ems.biz.AjxxcxManager;
import nju.software.ems.biz.vo.AjjbxxVO;
import nju.software.ems.biz.vo.AjxxcxVO;
import nju.software.ems.biz.vo.KdtdVO;
import nju.software.ems.service.AjjbService;
import nju.software.ems.service.DmService;
import nju.software.ems.service.DsrjbxxService;
import nju.software.ems.service.model.BmModel;
import nju.software.ems.service.model.DmbModel;
import nju.software.ems.service.model.DsrJbxxModel;
import nju.software.ems.util.StringUtil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AjxxcxController {
	
	private AjxxcxManager ajxxcxManager;   //案件信息查询manager
	private DsrjbxxService dsrjbxxService;  //当事人基本信息service
	private DmService dmService;
	private AjjbService ajjbService;
	
	/**
	 * 案件信息查询
	 * @param request
	 * @param response
	 * @param model
	 * @param ajxxcxVO
	 * @param result
	 * @throws Exception
	 */
	@RequestMapping(value = "/ajxxcx.aj", method = RequestMethod.GET)
	public String ajxxcx(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			@ModelAttribute AjxxcxVO ajxxcxVO, BindingResult result)
			throws Exception {
		List<AjjbxxVO> vos = ajxxcxManager.getAjjbxxByAjxxcxVO(ajxxcxVO);
		model.addAttribute("ajsm", vos.size());
		model.addAttribute("ajxxs", vos);
		return "pop/ajxxcxjg";
	}
	
	@RequestMapping(value = "/ajcxdsrxx.aj", method = RequestMethod.GET)
	public String ajdsrxxcx(HttpServletRequest request,HttpServletResponse response, ModelMap model)
			throws Exception {
		String ajxhs = request.getParameter("ajxhs");
		if(StringUtil.isEmpty(ajxhs))
			return null;
		String[] ajxhArr = ajxhs.split(",");
		
		List<AjjbxxVO> ajjbxxVOs = new ArrayList<AjjbxxVO>();
		
		//获取指定案件序号的当事人
		for (String ajxh : ajxhArr)
			ajjbxxVOs.add(ajxxcxManager.getAjjbxxVOByAjxh(Integer.parseInt(ajxh)));
		
		model.addAttribute("ajdsrxxs", ajjbxxVOs);
		
		return "pop/ajdsrxxjg";
	}
	
	/**
	 * 根据用户提交的案件序号以及当事人编号生成快递单中收件人信息
	 * @param request contains data like (ajxh,dsrbh&ajxh,dsrbh&)
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/kddcss.do", method = RequestMethod.GET)
	public String kddcss(HttpServletRequest request, HttpServletResponse response, ModelMap model)
	{
		String dsrxxs = request.getParameter("dsrxx");
		if(StringUtil.isEmpty(dsrxxs))
			return null;
		String[] dsrxx = dsrxxs.split("&");
		List<DsrJbxxModel> dsrJbxxModels = new ArrayList<DsrJbxxModel>();
		for (String string : dsrxx) {
			String[] dsr = string.split(",");
			if(dsr.length < 2 && dsr.length > 0)   //数据格式存在错误
			{
				if (StringUtil.isNum(dsr[0])) {
					DsrJbxxModel modelnew = new DsrJbxxModel();
					modelnew.setAh(ajjbService.getAjjbxxByAjxh(Integer.parseInt(dsr[0])).getAh());
					dsrJbxxModels.add(modelnew);
				}
			}
			else if(dsr.length == 2)
				if(StringUtil.isNum(dsr[0]) && StringUtil.isNum(dsr[1]))     //生成当事人信息
					dsrJbxxModels.add(dsrjbxxService.getDsrXxxxByAjxhAndDsrBh(Integer.parseInt(dsr[0]), Integer.parseInt(dsr[1])));
		}
		//将当事人装换添加到快递单信息中
		List<KdtdVO> kdvos = new ArrayList<KdtdVO>();
		for (DsrJbxxModel dsrJbxxModel : dsrJbxxModels) {
			KdtdVO vo = new KdtdVO();
			vo.addSjr(dsrJbxxModel);
			kdvos.add(vo);
		}
		
		model.addAttribute("kdtdxxs", kdvos);
		
		return "mainframe/yjdsrsqkdd";
	}
	
	@RequestMapping(value = "/ajxxcxui.aj", method = RequestMethod.GET)
	public String getAjxxcxui(HttpServletRequest request, HttpServletResponse response, ModelMap model)
	{
		List<BmModel> dmbModels = dmService.getFybm();
		model.addAttribute("bmxx", dmbModels);
		Date end = nju.software.ems.util.DateUtil.addDays(new Date(), 1);
		Date start = nju.software.ems.util.DateUtil.addYears(end, -1);
		model.addAttribute("end", nju.software.ems.util.DateUtil.format(end, "yyyy-MM-dd"));
		model.addAttribute("start", nju.software.ems.util.DateUtil.format(start, "yyyy-MM-dd"));
		return "pop/ajxxcx";
	}

	
	
	public void setAjxxcxManager(AjxxcxManager ajxxcxManager) {
		this.ajxxcxManager = ajxxcxManager;
	}

	public void setDsrjbxxService(DsrjbxxService dsrjbxxService) {
		this.dsrjbxxService = dsrjbxxService;
	}

	public void setDmService(DmService dmService) {
		this.dmService = dmService;
	}

	public void setAjjbService(AjjbService ajjbService) {
		this.ajjbService = ajjbService;
	}

}
