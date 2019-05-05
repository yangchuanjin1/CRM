package com.ycj.dao;

import java.util.List;

import com.ycj.entity.Users;

public interface UsersMapper {
	/**
	 * 用户登录时，根据用户的用户名和密码进行查找
	 * @param users  查询参数
	 * @return 返回这个用户的信息
	 */
	Users selectByCheckUsers(Users users);

}
