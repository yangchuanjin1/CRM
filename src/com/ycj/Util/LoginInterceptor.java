package com.ycj.Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录拦截器
 * @author YangChuanJin
 *implements HandlerInterceptor
 */
public class LoginInterceptor  {

	//controller执行后且视图返回后调用此方法
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	//controller执行后但未返回视图前调用此方法
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	// controller执行前调用此方法
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("预处理....");
		//如果是登录页面则放行
		if(request.getRequestURI().indexOf("Login.jsp")>=0){
			return true;
		}
		//获取session对象
		HttpSession session = request.getSession();
		//如果用户已登录也放行
		if(session.getAttribute("user")!=null){
			return true;
		}
		//用户没有登录挑战到登录页面
		/*response.sendRedirect(request.getContextPath()+"/Login.jsp");*/
		request.getRequestDispatcher("/WEB-INF/JspPage/Login.jsp").forward(request, response);
		return false;
	}

}
