/**
 * 
 */
package nju.software.ems.web.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nju.software.ems.service.DmService;
import nju.software.ems.service.KdtdService;
import nju.software.ems.service.model.KdModel;
import nju.software.ems.service.model.UserContext;
import nju.software.ems.util.StringUtil;

import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * @author 徐鑫源 xxy
 *
 * 2015-3-10 下午04:07:40 Admin
 */
@Controller
public class SdxxController {
	@Resource
	private KdtdService kdtdService;
	private DmService dmService;
	
	@RequestMapping(value = "/showTdz.do", method = RequestMethod.GET)
	public String showTdz(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		Date end = nju.software.ems.util.DateUtil.addDays(new Date(), 1);
		Date start = nju.software.ems.util.DateUtil.addMonths(end, -1);
		List<KdModel> ydyList = kdtdService.getTdz(start, end);
		model.addAttribute("ydyList", ydyList);
		model.addAttribute("end", nju.software.ems.util.DateUtil.format(end, "yyyy-MM-dd"));
		model.addAttribute("start", nju.software.ems.util.DateUtil.format(start, "yyyy-MM-dd"));
		return "mainframe/tdz";
	}
	
	@RequestMapping(value = "/showPl.do", method = RequestMethod.GET)
	public String showPl(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		Date end = nju.software.ems.util.DateUtil.addDays(new Date(), 1);
		Date start = nju.software.ems.util.DateUtil.addMonths(end, -1);
		List<KdModel> ydyList = kdtdService.getTdz(start, end);
		model.addAttribute("ydyList", ydyList);
		model.addAttribute("end", nju.software.ems.util.DateUtil.format(end, "yyyy-MM-dd"));
		model.addAttribute("start", nju.software.ems.util.DateUtil.format(start, "yyyy-MM-dd"));
		return "mainframe/pldr";
	}
	
	@RequestMapping(value = "/getTdz.do", method = RequestMethod.POST)
	public String searchTdz(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String qsrqStr = request.getParameter("qsrq");
		String jsrqStr = request.getParameter("jsrq");
		Date qsrq = DateUtil.parseYYYYMMDDDate(qsrqStr);
		Date jsrq = DateUtil.parseYYYYMMDDDate(jsrqStr);
		List<KdModel> ydyList = kdtdService.getTdz(qsrq, jsrq);
		model.addAttribute("ydyList", ydyList);
		model.addAttribute("start", qsrqStr);
		model.addAttribute("end", jsrqStr);
		return "mainframe/tdz";
	}
	
	@RequestMapping(value = "/showYsd.do", method = RequestMethod.GET)
	public String showYsd(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		Date end = nju.software.ems.util.DateUtil.addDays(new Date(), 1);
		Date start = nju.software.ems.util.DateUtil.addMonths(end, -1);
		List<KdModel> ydyList = kdtdService.getYsd(start, end);
		model.addAttribute("ydyList", ydyList);
		model.addAttribute("end", nju.software.ems.util.DateUtil.format(end, "yyyy-MM-dd"));
		model.addAttribute("start", nju.software.ems.util.DateUtil.format(start, "yyyy-MM-dd"));
		return "mainframe/ysd";
	}
	
	@RequestMapping(value = "/getYsd.do", method = RequestMethod.POST)
	public String searchYsd(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String qsrqStr = request.getParameter("qsrq");
		String jsrqStr = request.getParameter("jsrq");
		Date qsrq = DateUtil.parseYYYYMMDDDate(qsrqStr);
		Date jsrq = DateUtil.parseYYYYMMDDDate(jsrqStr);
		List<KdModel> ydyList = kdtdService.getYsd(qsrq, jsrq);
		model.addAttribute("ydyList", ydyList);
		model.addAttribute("start", qsrqStr);
		model.addAttribute("end", jsrqStr);
		return "mainframe/ysd";
	}
	
	@RequestMapping(value = "/sd.do", method = RequestMethod.GET)
	public String sd(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String kdid = request.getParameter("kdid");
		if(StringUtil.isEmpty(kdid))
			return "redirect:showTdz.do";
		KdModel kdModel = kdtdService.getKdtd(Integer.parseInt(kdid));
		model.addAttribute("kddxx", kdModel);
		return "mainframe/kddsdxx";
	}
	
	@RequestMapping(value = "/kdhzUpload.do", method = RequestMethod.POST)
	public void upload(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws IOException,
			ServletException {
		String kdid = request.getParameter("kdid");
		String ischange = request.getParameter("isup");
		if (!StringUtil.isEmpty(kdid)&&"y".equals(ischange)) {

			KdModel kdModel = kdtdService.getKdtd(Integer.parseInt(kdid));
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			// 得到上传文件
			MultipartFile mFile = multipartRequest.getFile("uploadfile");

			byte[] kdhz = mFile.getBytes();
			kdModel.setKdhz(kdhz);
			kdtdService.recievedKdByKdid(Integer.parseInt(kdid));
			kdtdService.saveKdtd(kdModel);
		}

		response.sendRedirect("sd.do");
		return;
	}
	
	@RequestMapping(value = "/showKdhz.aj", method = RequestMethod.GET)
	public void showKdhz(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws IOException {
		String kdid = request.getParameter("kdid");
		KdModel kdModel = kdtdService.getKdtd(Integer.parseInt(kdid));
		byte[] buffer = null;
		buffer = kdModel.getKdhz();
		response.setContentType("image/jpeg");
		response.addHeader("Content-Disposition", "inline; filename=1.jpg");
		OutputStream outStream = response.getOutputStream();
		int length = buffer.length;
		outStream.write(buffer, 0, length);
		outStream.flush();
		outStream.close();
	}
}
