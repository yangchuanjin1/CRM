package com.ycj.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ycj.dao.StaffMapper;
import com.ycj.entity.Staff;
@Service
public class UsersServiceImp implements UsersService {
	@Autowired
	private StaffMapper usersMapper;
	
	public Staff selectByCheckUsers(Staff users) {
		Staff selectByCheckUsers = usersMapper.selectByCheckStaff(users);
		System.out.println(selectByCheckUsers+"qqqqqqqq");
		return selectByCheckUsers;
	}

}
