package com.ycj.service;

import java.util.List;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Signin;

public interface SigninService {
	/**
	 * YangChuanJin   在员工登录的时候签到
	 * @param Staff_ID
	 * @return
	 */
	Integer insertSigninYang(Integer Staff_ID);
	/**
	 * YangChuanJin  分页带条件查询所有数据和查询总条数
	 * @param signin
	 * @return
	 */
	FenYeYang selectSiginAllandCountYang(FenYeYang fenYeYang);

}
