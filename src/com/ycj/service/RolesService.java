package com.ycj.service;

import java.util.List;

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
	/**
	 * �޸�
	 * @param roles
	 * @return
	 */
	Integer updateRolesYang(Roles roles);
	
	
	/**
	 * ���     ��ѯ���н�ɫ
	 * @return
	 */
	List<Roles> selectStaffRolesYang();
	/**
	 * ���    ��ѯһ���û��µĽ�ɫ
	 * @param StaffId
	 * @return
	 */
	List<Roles> seleseStaffRolesRolesIdYang(Integer StaffId);
	
}
