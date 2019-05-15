package com.ycj.service;

import com.ycj.entity.Staffroles;

public interface StaffrolesService {
	
	/**
	 * 杨传锦    为用户添加角色
	 * @param staffroles
	 * @return
	 */
	Integer insertStaffRolesAndYang(Staffroles staffroles);
	/**
	 * 杨传锦    在中间表删除用户和角色
	 * @param staffroles
	 * @return
	 */
	Integer deleteStaffRolesAndYang(Staffroles staffroles);

}
