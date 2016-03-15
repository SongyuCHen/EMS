package nju.software.ems.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nju.software.ems.service.model.UserContext;
import nju.software.ems.util.StringUtil;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 访问拦截器
 * 
 * @author zym
 * 
 */
public class AccessInterceptor extends HandlerInterceptorAdapter {
	private static final Logger log = Logger.getLogger(AccessInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		String requestURI = request.getRequestURI();
		String toLogin = request.getRequestURL().toString();
		String doName = request.getServletPath();
		if(StringUtil.contains(doName, "WEB-INF")){
			return true;
		}
		String cannotAccess = toLogin.substring(0,
				toLogin.length() - doName.length())
				+ "/login.do";
		UserContext user = (UserContext) request.getSession().getAttribute(
				"userContext");
		if (user == null) {
			if (requestURI.endsWith("/login.do")||requestURI.endsWith("/test.do") 
					|| requestURI.indexOf("gateway.do")>=0 || requestURI.endsWith("/jzsmLogin.do")
					|| requestURI.indexOf("qrcode")>=0 || requestURI.endsWith("/dsrjydj.do")) {
				return true;
			} else {
				log.warn("错误的访问页面。requestURI:" + requestURI);
				response.sendRedirect(cannotAccess);
				return false;
			}
		} else {
			return true;
		}
	}

}
