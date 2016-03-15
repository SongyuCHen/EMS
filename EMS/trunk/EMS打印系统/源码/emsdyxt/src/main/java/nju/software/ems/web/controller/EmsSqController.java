package nju.software.ems.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nju.software.ems.biz.vo.KdtdVO;
import nju.software.ems.service.KdtdService;
import nju.software.ems.service.convertor.KdtdConvertor;
import nju.software.ems.service.model.KdModel;
import nju.software.ems.util.StringUtil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmsSqController {
	private KdtdService kdtdService;
	
	@RequestMapping(value = "/sqkdd.do", method = RequestMethod.GET)
	public String sqkdd(HttpServletRequest request,HttpServletResponse response, ModelMap model)
			throws Exception {
		return "mainframe/sqkdd";
	}
	
	@RequestMapping(value = "/bckdd.do", method = RequestMethod.POST)
	public String bckdd(HttpServletRequest request,HttpServletResponse response, ModelMap model)
			throws Exception {
		String urlStr = request.getHeader("Referer");
		List<KdtdVO> kdtdVOs = convertRequestDataToVos(request);
		List<KdModel> kdModels = KdtdConvertor.vosToModels(kdtdVOs);
		for (KdModel kdModel : kdModels) {
			kdtdService.saveKdtd(kdModel);
		}
		return "redirect:showWdy.do";
	}
	
	@RequestMapping(value = "/getDetail.do", method = RequestMethod.GET)
	public String ckkdd(HttpServletRequest request,HttpServletResponse response, ModelMap model)
			throws Exception {
		String kdid = request.getParameter("kdid");
		String ydy = request.getParameter("ydy");
		int isYdy = 0;
		if(StringUtil.isEmpty(kdid))
			return "redirect:showWdy.do";
		KdModel kdModel = kdtdService.getKdtd(Integer.parseInt(kdid));
		model.addAttribute("kddxx", kdModel);
		if(!StringUtil.isEmpty(ydy)) 
			isYdy=1;
		model.addAttribute("isYdy", isYdy);
		return "mainframe/kddxx";
	}
	
	

	/**
	 * 将request中data数据转换成vo数据
	 * @param request
	 * @return
	 */
	protected List<KdtdVO> convertRequestDataToVos(HttpServletRequest request)
	{
		List<KdtdVO> kdtdVOs = new ArrayList<KdtdVO>();
		String[] ah = request.getParameterValues("ah");
		String[] sjrxm = request.getParameterValues("sjrxm");
		String[] yddh = request.getParameterValues("yddh");
		String[] dwmc = request.getParameterValues("dwmc");
		String[] zzdh = request.getParameterValues("zzdh");
		String[] bgdh = request.getParameterValues("bgdh");
		String[] sjrdz = request.getParameterValues("sjrdz");
		String[] yzbm = request.getParameterValues("yzbm");
		String[] jjnr = request.getParameterValues("jjnr");
		String[] jjrdh = request.getParameterValues("jjrdh");
		String[] jjrxm = request.getParameterValues("jjrxm");
		String[] kdid = request.getParameterValues("kdid");
		String[] kddh = request.getParameterValues("kddh");
		String[] wsmc = request.getParameterValues("wsmc");
		
		if(ah ==null || ah.length == 0)
			return kdtdVOs;
		
		for(int cnt =0 ; cnt < ah.length ; ++ cnt)
		{
			KdtdVO vo = new KdtdVO();
			vo.setAh(ah[cnt]);
			vo.setSjrxm(sjrxm[cnt]);
			vo.setYddh(yddh[cnt]);
			vo.setDwmc(dwmc[cnt]);
			vo.setZzdh(zzdh[cnt]);
			vo.setBgdh(bgdh[cnt]);
			vo.setSjrdz(sjrdz[cnt]);
			vo.setYzbm(yzbm[cnt]);
			
			//将网页中的内容转换成数据库中内容
//			String[] wsnr = jjnr[cnt].split(",");
//			
//			int dataVal = 1;
//			for (String str : wsnr) {
//				if(StringUtil.isEmpty(str))
//					continue;
//				JJNREnum jjenum = JJNREnum.valueOf(str);
//				if(jjenum != null)
//					dataVal *= jjenum.getVal();
//			}
			
			vo.setJjnr(String.valueOf(jjnr[cnt]));
			vo.setWsmc(wsmc[cnt]);
			vo.setJjrdh(jjrdh[cnt]);
			vo.setJjrxm(jjrxm[cnt]);
			vo.setKddh(kddh[cnt]);
			
			//快递ID另外处理
			if(kdid !=null && kdid.length > cnt)
				vo.setKdid(kdid[cnt]);
			
			kdtdVOs.add(vo);
		}
		
		return kdtdVOs;
	}

	public void setKdtdService(KdtdService kdtdService) {
		this.kdtdService = kdtdService;
	}

}
