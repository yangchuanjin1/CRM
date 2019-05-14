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

import com.ycj.Util.Result;
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
	 * 前台登录controller
	 * @param users
	 * @param request
	 * @return
	 */

	@RequestMapping(value="/loginStaff",method=RequestMethod.POST)
	@ResponseBody
	public String loginUsers(HttpServletRequest request,Staff staff,String kaptcha,HttpServletResponse response) {
		HttpSession session = request.getSession();//声明session
        String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        Staff staffcha = loginService.selectByCheckUsers(staff);
        System.out.println(staff.getStaff_Name());
        System.out.println(staff.getStaff_Password());
        System.out.println(kaptcha);
      //从request中获取所有Cookie
        //判断验证码是否相同
        if(code.equals(kaptcha)) {
        	/*if(staff.getStaff_Name()!=null) {
        		Staff byStaff_Name = loginService.selectByStaff_Name(staff.getStaff_Name());
        		if(byStaff_Name==null) {
        			return Result.toClient(false, "用户名输入不正确");
        		}
        	}*/
//        	if(staff.getStaff_Password()!=null) {
//        		Staff staff_password = loginService.selectByStaff_password(staff.getStaff_Password());
//        		if(staff_password==null) {
//        			loginService.updateByStaff_PsdWrong(staff.getStaff_Name());
//        			return Result.toClient(false, "密码输入不正确");
//        		}
//        	}else {
//        		return Result.toClient(false, "请输入密码");
//        	}
        	if(staffcha!=null) {//判断查询的用户信息是否为空
        		if(staffcha.getStaff_IsLockout().equals("1")) {//判断用户是否锁定
        			return Result.toClient(false, "此用户已被锁定，请联系管理员进行解锁");
        		}else {
        			System.out.println(1111);
        			/*loginService.updateByStaff_Time(staffcha.getStaff_ID());*/
        			request.getSession().setAttribute("Staff_ID", staffcha.getStaff_ID());
        			request.getSession().setAttribute("Staff_Name", staffcha.getStaff_Name());
        			return Result.toClient(true, "登陆成功");
        		}
        	}
        	if(staff.getStaff_Name()!=null) {
        		Staff byStaff_Name = loginService.selectByStaff_Name(staff.getStaff_Name());
        		if(byStaff_Name==null) {
        			return Result.toClient(false, "用户名输入不正确");
        		}
        	}
        	if(staff.getStaff_Password()!=null) {
        		Staff staff_password = loginService.selectByStaff_password(staff.getStaff_Password());
        		if(staff_password==null) {
        			loginService.updateByStaff_PsdWrong(staff.getStaff_Name());
        			return Result.toClient(false, "密码输入不正确");
        		}
        	}
        }
        	return Result.toClient(false, "验证码不正确");
        
        	
        
	}
}
