package com.ycj.dao;

import com.ycj.entity.Staff;

public interface StaffMapper {
	/**
	 * 用户登录时，根据用户的用户名和密码进行查找
	 * @param users  查询参数
	 * @return 返回这个用户的信息
	 */
	Staff selectByCheckStaff(Staff Staff);
	/**
	 * 查询用户名是否正确
	 * @param Staff_name
	 * @return
	 */
	Staff selectByStaff_Name(String Staff_name);
	/**
	 * 查询密码是否正确
	 * @param Staff_password
	 * @return
	 */
	Staff selectByStaff_password(String Staff_password);
	/**
	 * 修改错误次数
	 * @return
	 */
	Integer updateByStaff_PsdWrong(String Staff_name);
	/**
	 * 修改登录时间
	 * @return
	 */
	Integer updateByStaff_Time(Integer staff_id);
}
