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
	
	/**
	 * YangChuanJIn 在删除用户时删除中间表的记录
	 * @param Staff_ID
	 * @return
	 */
	Integer deleteStaffRolesStaff_IDYang(Integer Staff_ID);
}
