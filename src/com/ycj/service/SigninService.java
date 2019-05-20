package com.ycj.service;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Signin;
import com.ycj.entity.Staff;

public interface SigninService {
	/**
	 * YangChuanJin   ��Ա����¼��ʱ��ǩ��
	 * @param Staff_ID
	 * @return
	 */
	Integer insertSigninYang(Integer Staff_ID);
	/**
	 * YangChuanJin  ��ҳ��������ѯ�������ݺͲ�ѯ������
	 * @param signin
	 * @return
	 */
	FenYeYang selectSiginAllandCountYang(FenYeYang fenYeYang);
	
}
