package com.ycj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.FenYe;
import com.ycj.entity.Roles;
import com.ycj.entity.Signin;
import com.ycj.entity.Staff;
import com.ycj.entity.Staffroles;
import com.ycj.service.StaffService;
@Controller
public class StaffControll {
	@Autowired
	private StaffService staffService;
	
	
	  @RequestMapping(value="/selectStaffs",method=RequestMethod.POST)
	  @ResponseBody 
	  public FenYe<Staff> selectStaffs(Staff staff,Roles roles,Signin signin) {
		  staff.setSignin(signin);
	      staff.setRoles(roles); 
	  return staffService.selectStaffs(staff); }
	/*
	 * @RequestMapping(value="/selectRoles",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public List<Roles> seleRoles() { return
	 * staffService.seleRoles(); }
	 * 
	 * @RequestMapping(value="/insertStaff",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public int insertStaff(Staff staff,Roles roles) {
	 * staff.setRoles(roles); return staffService.insertStaff(staff); }
	 * 
	 * @RequestMapping(value="/updateStaff",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public int updateStaff(Staff staff) { return
	 * staffService.updateStaff(staff); }
	 * 
	 * @RequestMapping(value="/deleteStaff",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public int deleteStaff(int Staff_ID) { return
	 * staffService.deleteStaff(Staff_ID); }
	 * 
	 * @RequestMapping(value="/insertroleId",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public int insertRole(Staffroles staffroles) { return
	 * staffService.insertRole(staffroles); }
	 */
}
