package nju.software.appraisal.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;










import net.sf.json.JSONObject;
import nju.software.appraisal.service.model.CheckTaskModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class StartCheckController {
	/**
	 * searchAJ
	 * 
	 * t0：index
	 * t1:案号
	 * t2:当事人
	 * t3:案由
	 * t4:立案日期
	 * t5:结案日期
	 * t6:承办人
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/search_aj.do", method = RequestMethod.POST)
	public Object search_aj(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws IOException {
		List<CheckTaskModel> modelList = new ArrayList<CheckTaskModel>();
		modelList.add(new CheckTaskModel( 1,"（2013）临刑初字第146号", "安永得","抢劫", new Date(2015, 1, 25), new Date(2015, 1, 26), "曹永德"));
		modelList.add(new CheckTaskModel( 2,"（2013）临刑初字第146号", "安永得","抢劫", new Date(2015, 1, 25), new Date(2015, 1, 26), "曹永德"));
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out;
		out = response.getWriter();
		
		JSONObject json=new JSONObject();
		json.accumulate("personalHistoryList", modelList);
		
		out.println(json.toString());
		out.flush();
		out.close();

		return modelList;
	}
}
