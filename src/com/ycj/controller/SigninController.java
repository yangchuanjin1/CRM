package com.ycj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.FenYeYang;
import com.ycj.service.SigninService;

@Controller
public class SigninController {
	@Autowired
	private SigninService signinService;
	/**
	 * 员工签到
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
	 * YangChuanJin  分页带条件查询所有数据和查询总条数
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
