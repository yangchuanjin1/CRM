package com.ycj.dao;

import com.ycj.entity.Staffroles;

//�û���ɫ�м��
public interface StaffrolesMapper {
	/**
	 * ���    Ϊ�û���ӽ�ɫ
	 * @param staffroles
	 * @return
	 */
	Integer insertStaffRolesAndYang(Staffroles staffroles);
	/**
	 * ���    ���м��ɾ���û��ͽ�ɫ
	 * @param staffroles
	 * @return
	 */
	Integer deleteStaffRolesAndYang(Staffroles staffroles);
}
