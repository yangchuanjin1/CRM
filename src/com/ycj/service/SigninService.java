package com.ycj.service;

import java.util.List;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Signin;

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
