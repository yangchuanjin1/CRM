package com.ycj.service;

import java.util.List;

import com.ycj.entity.Staff;

public interface LoginService {
	/**
	 * 登录页面，判断用户是否登陆成功的业务层接口
	 * @param users 用户名和密码
	 * @return
	 */
	Staff selectByCheckUsers(Staff staff);
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
