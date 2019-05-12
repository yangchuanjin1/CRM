package com.ycj.Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * ��¼������
 * @author YangChuanJin
 *implements HandlerInterceptor
 */
public class LoginInterceptor  {

	//controllerִ�к�����ͼ���غ���ô˷���
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	//controllerִ�к�δ������ͼǰ���ô˷���
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	// controllerִ��ǰ���ô˷���
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("Ԥ����....");
		//����ǵ�¼ҳ�������
		if(request.getRequestURI().indexOf("Login.jsp")>=0){
			return true;
		}
		//��ȡsession����
		HttpSession session = request.getSession();
		//����û��ѵ�¼Ҳ����
		if(session.getAttribute("user")!=null){
			return true;
		}
		//�û�û�е�¼��ս����¼ҳ��
		/*response.sendRedirect(request.getContextPath()+"/Login.jsp");*/
		request.getRequestDispatcher("/WEB-INF/JspPage/Login.jsp").forward(request, response);
		return false;
	}

}
