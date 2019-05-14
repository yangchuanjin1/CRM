package com.ycj.service;

import java.util.List;

import com.ycj.entity.FenYe;
import com.ycj.entity.Roles;
import com.ycj.entity.Staff;
import com.ycj.entity.Staffroles;

public interface StaffService {
	
	  FenYe<Staff> selectStaffs(Staff staff);
	  
	/*
	 * List<Roles> seleRoles();
	 * 
	 * int insertStaff(Staff staff);
	 * 
	 * int updateStaff(Staff staff);
	 * 
	 * int deleteStaff(int Staff_ID);
	 * 
	 * Integer insertRole(Staffroles staffroles);
	 */
	 
	 
}
