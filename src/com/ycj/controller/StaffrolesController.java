package com.ycj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Staffroles;
import com.ycj.service.StaffrolesService;

@Controller
public class StaffrolesController {
	
	@Autowired
	private StaffrolesService staffrolesService;
	
	@RequestMapping(value="/insertStaffRolesAddYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer insertStaffRolesAddYang(Staffroles staffroles) {
		System.out.println(staffroles.getSR_RolesID());
		System.out.println(staffroles.getSR_RolesID());
		Integer insertStaffRolesAndYang = staffrolesService.insertStaffRolesAndYang(staffroles);
		System.out.println(insertStaffRolesAndYang+"111111111111");
		return insertStaffRolesAndYang;
	}
	@RequestMapping(value="/deleteStaffRolesDelYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer deleteStaffRolesDelYang(Staffroles staffroles) {
		Integer deleteStaffRolesAndYang = staffrolesService.deleteStaffRolesAndYang(staffroles);
		return deleteStaffRolesAndYang;
	}

}
