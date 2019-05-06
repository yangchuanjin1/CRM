package com.ycj.dao;

import com.ycj.entity.Staff;

public interface StaffMapper {
	/**
	 * 用户登录时，根据用户的用户名和密码进行查找
	 * @param users  查询参数
	 * @return 返回这个用户的信息
	 */
	Staff selectByCheckStaff(Staff Staff);

}
