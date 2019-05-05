package com.ycj.service;

import java.util.List;

import com.ycj.entity.Users;

public interface UsersService {
	/**
	 * 登录页面，判断用户是否登陆成功的业务层接口
	 * @param users 用户名和密码
	 * @return
	 */
	Users selectByCheckUsers(Users users);

}
