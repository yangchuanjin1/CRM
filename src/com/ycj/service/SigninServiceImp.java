package com.ycj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.SigninMapper;
import com.ycj.entity.FenYeYang;
import com.ycj.entity.Signin;
import com.ycj.entity.Staff;
@Service
public class SigninServiceImp implements SigninService {
	@Autowired
	private SigninMapper signinMapper;
	
	
	
	/**
	 * YangChuanJin   ��Ա����¼��ʱ��ǩ��
	 */
	public Integer insertSigninYang(Integer Staff_ID) {
		Integer insertSigninYang = signinMapper.insertSigninYang(Staff_ID);
		return insertSigninYang;
	}



	/**
	 * YangChuanJin  ��ҳ��������ѯ�������ݺͲ�ѯ������
	 */
	public FenYeYang selectSiginAllandCountYang(FenYeYang fenYeYang) {
		List<Signin> selectSiginAllYang = signinMapper.selectSiginAllYang(fenYeYang);
		Integer selectSigninCountYang = signinMapper.selectSigninCountYang(fenYeYang);
		fenYeYang.setTotal(selectSigninCountYang);
		fenYeYang.setRows(selectSiginAllYang);
		return fenYeYang;
	}



}
