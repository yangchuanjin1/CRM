package com.ycj.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ycj.dao.StaffMapper;
import com.ycj.entity.Staff;
@Service
public class LoginServiceImp implements LoginService {
	@Autowired
	private StaffMapper staffMapper;
	
	public Staff selectByCheckUsers(Staff staff) {
		Staff selectByCheckUsers = staffMapper.selectByCheckStaff(staff);
		System.out.println(selectByCheckUsers+"qqqqqqqq");
		return selectByCheckUsers;
	}

}
