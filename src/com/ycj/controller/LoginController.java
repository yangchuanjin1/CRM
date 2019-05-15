package com.ycj.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Roles;
import com.ycj.entity.Staff;
import com.ycj.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@Autowired
	private Staff staff;
	/**
	 * ǰ̨��¼controller
	 * @param users
	 * @param request
	 * @return
	 */

	@RequestMapping(value="/loginStaff",method=RequestMethod.POST)
	public String loginUsers(HttpServletRequest request,Model model,@RequestParam("kaptcha")String kaptcha,@RequestParam("yes")String yes) {
		HttpSession session = request.getSession();  
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		/*String y = request.getParameter("y");*/
		System.out.println(yes+"������Y��");
		staff.setStaff_Name(un);
		staff.setStaff_Password(pwd);
        String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        Staff staffcha = loginService.selectByCheckUsers(staff);
        System.out.println(staff.getStaff_Name());
        System.out.println(kaptcha);
        //�ж���֤���Ƿ���ͬ
        if(code.equals(kaptcha)) {
        	if(staffcha!=null) {//�жϲ�ѯ���û���Ϣ�Ƿ�Ϊ��
        		if(staffcha.getStaff_IsLockout().equals("1")) {//�ж��û��Ƿ�����
        			model.addAttribute("mesg", "���û��ѱ�����������ϵ����Ա���н���");
        			return "Login";
        			
        		}else {
        			request.getSession().setAttribute("Staff_ID", staffcha.getStaff_ID());//���û�id�浽session����
        			request.getSession().setAttribute("Staff_Name", un);
        			return "index";
        		}
        	}else {
        		model.addAttribute("mesg", "�û������������벻��ȷ");
        		return "Login";
        	}
        }else {
        	model.addAttribute("mesg", "��֤�벻��ȷ");
        	return "Login";
        }
	}
}