/**
 * 
 */
package nju.software.ems.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nju.software.ems.service.DmService;
import nju.software.ems.service.KdtdService;
import nju.software.ems.service.model.FyModel;
import nju.software.ems.service.model.KdModel;
import nju.software.ems.service.model.UserContext;
import nju.software.ems.util.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 徐鑫源 xxy 该controller用于快递单列表的显示，包括显示未打印列表和已打印记录 未打印是全部显示 已打印记录通过时间查询
 *         2015-1-22 下午03:33:17 Admin
 */
@Controller
public class EmsListController {

	@Resource
	private KdtdService kdtdService;
	private DmService dmService;

	@RequestMapping(value = "/showWdy.do", method = RequestMethod.GET)
	public String showWdy(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		UserContext userContext = (UserContext) request.getSession()
				.getAttribute("userContext");
		List<KdModel> wdyList = kdtdService.getWdy();
		model.addAttribute("wdyList", wdyList);
		model.addAttribute("userContext", userContext);
		return "mainframe/wdy";
	}

	@RequestMapping(value = "/delete.aj", method = RequestMethod.POST)
	public String delete(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String wdyListStr = request.getParameter("kdidList");
		if (!StringUtil.isEmpty(wdyListStr)) {
			String wdyList[] = wdyListStr.split(";");
			for (String kdidStr : wdyList) {
				int kdid = Integer.parseInt(kdidStr);
				kdtdService.deleteKdByKdid(kdid);
			}
		}
		List<KdModel> wdyList = kdtdService.getWdy();
		model.addAttribute("wdyList", wdyList);
		return "mainframe/wdy";
	}

	@RequestMapping(value = "/preview.aj", method = RequestMethod.GET)
	public String preivew(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String wdyListStr = request.getParameter("kdidList");
		List<KdModel> ddyList = new ArrayList<KdModel>();
		if (!StringUtil.isEmpty(wdyListStr)) {
			String wdyList[] = wdyListStr.split(";");
			for (String kdidStr : wdyList) {
				int kdid = Integer.parseInt(kdidStr);
				ddyList.add(kdtdService.getKdtd(kdid));
			}
		}
		FyModel fyModel = dmService.getFyxx();
		String tmpStr = fyModel.getFymc().substring(0, fyModel.getFymc().length()-4);
		fyModel.setFymc(tmpStr);
		model.addAttribute("fyModel", fyModel);
		model.addAttribute("ddyList", ddyList);
		return "mainframe/preview";
	}

	@RequestMapping(value = "/printed.aj", method = RequestMethod.POST)
	public String printed(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String wdyListStr = request.getParameter("kdidList");
		if (!StringUtil.isEmpty(wdyListStr)) {
			String wdyList[] = wdyListStr.split(";");
			for (String kdidStr : wdyList) {
				int kdid = Integer.parseInt(kdidStr);
				kdtdService.printKd(kdid);
			}
		}
		List<KdModel> wdyList = kdtdService.getWdy();
		model.addAttribute("wdyList", wdyList);
		return "mainframe/wdy";
	}

	@RequestMapping(value = "/showYdy.do", method = RequestMethod.GET)
	public String showYdy(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		Date end = nju.software.ems.util.DateUtil.addDays(new Date(), 1);
		Date start = nju.software.ems.util.DateUtil.addMonths(end, -1);
		List<KdModel> ydyList = kdtdService.getYdy(start, end);
		model.addAttribute("ydyList", ydyList);
		model.addAttribute("end", nju.software.ems.util.DateUtil.format(end, "yyyy-MM-dd"));
		model.addAttribute("start", nju.software.ems.util.DateUtil.format(start, "yyyy-MM-dd"));
		return "mainframe/ydy";
	}

	@RequestMapping(value = "/getYdy.do", method = RequestMethod.POST)
	public String searchYdy(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String qsrqStr = request.getParameter("qsrq");
		String jsrqStr = request.getParameter("jsrq");
		Date qsrq = DateUtil.parseYYYYMMDDDate(qsrqStr);
		Date jsrq = DateUtil.parseYYYYMMDDDate(jsrqStr);
		List<KdModel> ydyList = kdtdService.getYdy(qsrq, jsrq);
		model.addAttribute("ydyList", ydyList);
		model.addAttribute("start", qsrqStr);
		model.addAttribute("end", jsrqStr);
		return "mainframe/ydy";
	}
	
	@RequestMapping(value = "/showCxtj.do", method = RequestMethod.GET)
	public String showCxtj(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		Date end = nju.software.ems.util.DateUtil.addDays(new Date(), 1);
		Date start = nju.software.ems.util.DateUtil.addMonths(end, -1);
		model.addAttribute("end", nju.software.ems.util.DateUtil.format(end, "yyyy-MM-dd"));
		model.addAttribute("start", nju.software.ems.util.DateUtil.format(start, "yyyy-MM-dd"));
		return "mainframe/cxtj";
	}
	
	@RequestMapping(value = "/getCxtj.do", method = RequestMethod.POST)
	public String getCxtj(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String qsrqStr = request.getParameter("qsrq");
		String jsrqStr = request.getParameter("jsrq");
		Date qsrq = DateUtil.parseYYYYMMDDDate(qsrqStr);
		Date jsrq = DateUtil.parseYYYYMMDDDate(jsrqStr);
		String czr = request.getParameter("czr");
		String sjr = request.getParameter("sjr");
		String ah = request.getParameter("ah");
		model.addAttribute("czr", czr);
		model.addAttribute("sjr", sjr);
		model.addAttribute("ah", ah);
		if(StringUtil.isEmpty(czr))	
			czr = "%";
		else
			czr = "%"+czr+"%";
		if(StringUtil.isEmpty(ah))	
			ah = "%";
		else
			ah = "%"+ah+"%";
		if(StringUtil.isEmpty(sjr))	
			sjr = "%";
		else
			sjr = "%"+sjr+"%";
		List<KdModel> kdList = kdtdService.search(qsrq, jsrq, czr, ah, sjr);
		model.addAttribute("ydyList", kdList);
		model.addAttribute("start", qsrqStr);
		model.addAttribute("end", jsrqStr);
		return "mainframe/cxtj";
	}

	public KdtdService getKdtdService() {
		return kdtdService;
	}

	public void setKdtdService(KdtdService kdtdService) {
		this.kdtdService = kdtdService;
	}

	public DmService getDmService() {
		return dmService;
	}

	public void setDmService(DmService dmService) {
		this.dmService = dmService;
	}

}
