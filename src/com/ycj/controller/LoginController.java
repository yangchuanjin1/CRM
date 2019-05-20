package com.ycj.controller;


import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.Util.MD5;
import com.ycj.Util.Result;
import com.ycj.entity.Roles;
import com.ycj.entity.Staff;
import com.ycj.service.LoginService;
import com.ycj.service.SigninService;


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
	@ResponseBody
	public String loginUsers(HttpServletRequest request,String Staff_Password,String Staff_Name,String kaptcha,HttpServletResponse response) {
		HttpSession session = request.getSession();//����session
		staff.setStaff_Name(Staff_Name);
		System.out.println(Staff_Name+"jfhljghdjf");
		staff.setStaff_Password(MD5.MD5jia(Staff_Password));
		System.out.println(Staff_Password+"jkfdhgfudjghrejhdgrtuyejgrdbuydh");
        String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        Staff staffcha = loginService.selectByCheckUsers(staff);
      //��request�л�ȡ����Cookie
        //�ж���֤���Ƿ���ͬ
        if(code.equals(kaptcha)) {
        	if(staffcha!=null) {//�жϲ�ѯ���û���Ϣ�Ƿ�Ϊ��
        		if(staffcha.getStaff_IsLockout().equals("1")) {//�ж��û��Ƿ�����
        			return Result.toClient(false, "���û��ѱ�����������ϵ����Ա���н���");
        		}else {
        			System.out.println(1111);
        			loginService.updateByStaff_Time(staffcha.getStaff_ID());
        			request.getSession().setAttribute("Staff_ID", staffcha.getStaff_ID());
        			request.getSession().setAttribute("Staff_Name", staffcha.getStaff_Name());
        			return Result.toClient(true, "��½�ɹ�");
        		}
        	}
        	if(staff.getStaff_Name()!=null) {
        		Staff byStaff_Name = loginService.selectByStaff_Name(staff.getStaff_Name());
        		if(byStaff_Name==null) {
        			return Result.toClient(false, "�û������벻��ȷ");
        		}
        	}
        	if(staff.getStaff_Password()!=null) {
        		Staff staff_password = loginService.selectByStaff_password(staff.getStaff_Password());
        		if(staff_password==null) {
        			loginService.updateByStaff_PsdWrong(staff.getStaff_Name());
        			return Result.toClient(false, "�������벻��ȷ");
        		}
        	}
        }
        	return Result.toClient(false, "��֤�벻��ȷ");
        
        	
        
	}
}
