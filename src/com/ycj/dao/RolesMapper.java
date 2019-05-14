package com.ycj.dao;
//��ɫ��

import java.util.List;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;

public interface RolesMapper {
	/**
	 * ��ҳ��������ѯ����
	 * @param fenYeYang
	 * @return
	 */
	List<Roles> selectByRolesAll(FenYeYang fenYeYang);
	/**
	 * ��ѯ������
	 * @param fenYeYang
	 * @return
	 */
	Integer selectByRolesCount(FenYeYang fenYeYang);
	/**
	 * ���
	 * @param roles
	 * @return
	 */
	Integer insertByRolesYang(Roles roles);
	/**
	 * ɾ��
	 * @param RolesId
	 * @return
	 */
	Integer deleteRolesYang(Integer RolesId);

}
