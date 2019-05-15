package com.ycj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.StaffrolesMapper;
import com.ycj.entity.Staffroles;
@Service
public class StaffrolesServiceImp implements StaffrolesService {
	
	@Autowired
	private StaffrolesMapper staffrolesMapper;
	@Override
	public Integer insertStaffRolesAndYang(Staffroles staffroles) {
		Integer insertStaffRolesAndYang = staffrolesMapper.insertStaffRolesAndYang(staffroles);
		return insertStaffRolesAndYang;
	}

	@Override
	public Integer deleteStaffRolesAndYang(Staffroles staffroles) {
		Integer deleteStaffRolesAndYang = staffrolesMapper.deleteStaffRolesAndYang(staffroles);
		return deleteStaffRolesAndYang;
	}

}
