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

	@Override
	public Staff selectByStaff_Name(String Staff_name) {
		
		return staffMapper.selectByStaff_Name(Staff_name);
	}

	@Override
	public Staff selectByStaff_password(String Staff_password) {
		return staffMapper.selectByStaff_password(Staff_password);
	}

	@Override
	public Integer updateByStaff_PsdWrong(String Staff_name) {
		return staffMapper.updateByStaff_PsdWrong(Staff_name);
	}

	@Override
	public Integer updateByStaff_Time(Integer staff_id) {
		return staffMapper.updateByStaff_Time(staff_id);
	}

}
