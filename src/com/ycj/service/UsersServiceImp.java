package com.ycj.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ycj.dao.UsersMapper;
import com.ycj.entity.Users;
@Service
public class UsersServiceImp implements UsersService {
	@Autowired
	private UsersMapper usersMapper;
	
	public Users selectByCheckUsers(Users users) {
		Users selectByCheckUsers = usersMapper.selectByCheckUsers(users);
		System.out.println(selectByCheckUsers+"qqqqqqqq");
		return selectByCheckUsers;
	}

}
