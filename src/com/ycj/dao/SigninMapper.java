package com.ycj.dao;
//签到表

import java.util.List;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Signin;

public interface SigninMapper {
	/**
	 * YangChuanJin   在员工登录的时候签到
	 * @param Staff_ID
	 * @return
	 */
	Integer insertSigninYang(Integer Staff_ID);
	/**
	 * YangChuanJin  分页带条件查询所有数据
	 * @param signin
	 * @return
	 */
	List<Signin> selectSiginAllYang(FenYeYang fenYeYang);
	/**
	 * YangChuanJin   查询总条数
	 * @param fenYeYang
	 * @return
	 */
	Integer selectSigninCountYang(FenYeYang fenYeYang);

}
