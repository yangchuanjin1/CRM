package com.ycj.service;

import com.ycj.entity.Staffroles;

public interface StaffrolesService {
	
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
	/**
	 * YangChuanJIn ��ɾ���û�ʱɾ���м��ļ�¼
	 * @param Staff_ID
	 * @return
	 */
	Integer deleteStaffRolesStaff_IDYang(Integer Staff_ID);

}
