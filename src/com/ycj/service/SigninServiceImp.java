package com.ycj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.SigninMapper;
import com.ycj.entity.FenYeYang;
import com.ycj.entity.Signin;
@Service
public class SigninServiceImp implements SigninService {
	@Autowired
	private SigninMapper signinMapper;
	
	
	
	/**
	 * YangChuanJin   在员工登录的时候签到
	 */
	public Integer insertSigninYang(Integer Staff_ID) {
		Integer insertSigninYang = signinMapper.insertSigninYang(Staff_ID);
		return insertSigninYang;
	}



	/**
	 * YangChuanJin  分页带条件查询所有数据和查询总条数
	 */
	public FenYeYang selectSiginAllandCountYang(FenYeYang fenYeYang) {
		List<Signin> selectSiginAllYang = signinMapper.selectSiginAllYang(fenYeYang);
		Integer selectSigninCountYang = signinMapper.selectSigninCountYang(fenYeYang);
		fenYeYang.setTotal(selectSigninCountYang);
		fenYeYang.setRows(selectSiginAllYang);
		return fenYeYang;
	}

}
