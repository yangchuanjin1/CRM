package com.ycj.service;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;

public interface RolesService {
	/**
	 * ��ҳ��������ѯ�������Ͳ�ѯ������
	 * @param fenYeYang
	 * @return
	 */
	FenYeYang selectByRolesAndCoount(FenYeYang fenYeYang);
	/**
	 * ���
	 * @param roles
	 * @return
	 */
	Integer insetRolesYang(Roles roles);
	/**
	 * ɾ��
	 * @param RolesId
	 * @return
	 */
	Integer deleteRolesYang(Integer RolesId);
	
}
