package nju.software.ems.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class DisableUrlSessionFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if (!(request instanceof HttpServletRequest)) {
			chain.doFilter(request, response);
			return;
		}
//		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		/*if (httpRequest.isRequestedSessionIdFromURL()) {
			HttpSession session = httpRequest.getSession();
			if (session != null)
				session.invalidate();
		}*/
		HttpServletResponseWrapper wrappedResponse = new HttpServletResponseWrapper(
				httpResponse) {
			public String encodeRedirectUrl(String url) {
				int index1=url.indexOf(";jsessionid");
				if(index1>=0){
					int index2=url.indexOf("?");
					return url.substring(0, index1)+url.substring(index2);
				}
				return url;
			}

			public String encodeRedirectURL(String url) {
				//
				int index1=url.indexOf(";jsessionid");
				if(index1>=0){
					int index2=url.indexOf("?");
					return url.substring(0, index1)+url.substring(index2);
				}
				return url;
			}

			public String encodeUrl(String url) {
				int index1=url.indexOf(";jsessionid");
				if(index1>=0){
					int index2=url.indexOf("?");
					return url.substring(0, index1)+url.substring(index2);
				}
				return url;
			}

			public String encodeURL(String url) {
				int index1=url.indexOf(";jsessionid");
				if(index1>=0){
					int index2=url.indexOf("?");
					return url.substring(0, index1)+url.substring(index2);
				}
				return url;
			}
		};
		chain.doFilter(request, wrappedResponse);
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
}
