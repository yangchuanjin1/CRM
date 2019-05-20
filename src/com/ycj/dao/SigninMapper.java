package com.ycj.dao;
//ǩ����

import java.util.List;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Signin;
import com.ycj.entity.Staff;

public interface SigninMapper {

	
	/**
	 * YangChuanJin   ��Ա����¼��ʱ��ǩ��
	 * @param Staff_ID
	 * @return
	 */
	Integer insertSigninYang(Integer Staff_ID);
	/**
	 * YangChuanJin  ��ҳ��������ѯ��������
	 * @param signin
	 * @return
	 */
	List<Signin> selectSiginAllYang(FenYeYang fenYeYang);
	/**
	 * YangChuanJin   ��ѯ������
	 * @param fenYeYang
	 * @return
	 */
	Integer selectSigninCountYang(FenYeYang fenYeYang);

}
