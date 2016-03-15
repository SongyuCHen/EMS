/**
 * 
 */
package nju.software.ems.web.controller;

import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import nju.software.ems.service.LoginService;
import nju.software.ems.service.model.UserContext;
import nju.software.ems.util.StringUtil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ����Դ xxy
 * 
 *         2015-1-21 ����05:45:14 Admin
 */
@Controller
public class LoginController {
	@Resource
	LoginService loginService;

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginGateway(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// role(�û���ɫ)��"0":��Ժ��Ա;"1":��ʱ�û�;
		String role = request.getParameter("role");
		if (StringUtil.isBlank(username) || StringUtil.isBlank(password)) {
			model.addAttribute("errorMessage", "�������������");
			return "login";
		}
		if(StringUtil.isBlank(role)) {
			role="0";	// Ĭ�Ϸ�Ժ��Ա
		}
		UserContext context = loginService.login(username, password, role);
		if (null == context) {
			model.addAttribute("errorMessage", "��¼ʧ��");
			return "login";
		}
		request.getSession().setAttribute("userContext", context);
		return "redirect:/showWdy.do";
	}

	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		// ���session�е�����
		HttpSession session = request.getSession();
		for (@SuppressWarnings("rawtypes")
		Enumeration e = session.getAttributeNames(); e.hasMoreElements();) {
			String var = e.nextElement().toString();
			if (session.getAttribute(var) != null) {
				session.removeAttribute(var);
			}
		}
		return "login";
	}
}
