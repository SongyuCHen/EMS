//package nju.software.appraisal.interceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.apache.struts2.StrutsStatics;
//
//import com.opensymphony.xwork2.ActionContext;
//import com.opensymphony.xwork2.ActionInvocation;
//import com.opensymphony.xwork2.interceptor.Interceptor;
//
//public class AccessInterceptor implements Interceptor {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	
//
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//		System.out.println("Access interceptor destroy");
//	}
//
//	@Override
//	public void init() {
//		// TODO Auto-generated method stub
//		System.out.println("Access interceptor init");
//	}
//
//	@Override
//	public String intercept(ActionInvocation invocation) throws Exception {
//		// TODO Auto-generated method stub
//		ActionContext actionContext = invocation.getInvocationContext();
//		HttpServletRequest request= (HttpServletRequest) actionContext.get(StrutsStatics.HTTP_REQUEST);
//
//		HttpSession session = request.getSession();
//		String resultString = invocation.invoke();
//		
//		return resultString;
//		
//	}
//
//}
