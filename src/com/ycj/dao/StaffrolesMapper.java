package com.ycj.dao;

import com.ycj.entity.Staffroles;

//用户角色中间表
public interface StaffrolesMapper {
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
