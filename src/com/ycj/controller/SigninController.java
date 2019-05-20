package com.ycj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Signin;
import com.ycj.entity.Staff;
import com.ycj.service.SigninService;

import javafx.scene.control.Alert;

@Controller
public class SigninController {
	@Autowired
	private SigninService signinService;
	
	/**
	 * Ա��ǩ��
	 * @param Staff_ID
	 * @return
	 */
	@RequestMapping(value="/insertSigninYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer insertSigninYang(Integer Staff_ID) {
		Integer insertSigninYang = signinService.insertSigninYang(Staff_ID);
		return insertSigninYang;
	}
	/**
	 * YangChuanJin  ��ҳ��������ѯ�������ݺͲ�ѯ������
	 */
	@RequestMapping(value="/selectSigninAllandCount",method=RequestMethod.POST)
	@ResponseBody
	public FenYeYang selectSigninAllandCount(Integer page,Integer rows,FenYeYang fenYeYang) {
		System.out.println(fenYeYang.getSignln_status());
		fenYeYang.setPage((page-1)*rows);
		fenYeYang.setPageSize(rows);
		FenYeYang selectSiginAllandCountYang = signinService.selectSiginAllandCountYang(fenYeYang);
		return selectSiginAllandCountYang;
	}

}
