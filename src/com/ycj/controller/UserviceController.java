package com.ycj.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Roles;
import com.ycj.entity.Staff;
import com.ycj.service.UsersService;


@Controller
public class UserviceController {
	/*
	 * @Autowired private UsersService usersService;
	 * 
	 * @RequestMapping(value="/loginUsers",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public Staff loginUsers(Staff users) {
	 * System.out.println(users.getStaff_Name());
	 * System.out.println(users.getStaff_Password()); Staff selectByCheckUsers =
	 * usersService.selectByCheckUsers(users);
	 * System.out.println(selectByCheckUsers); List<Roles>
	 * roles=selectByCheckUsers.getRoles(); for (int i = 0; i < roles.size(); i++) {
	 * System.out.println(roles.get(i).getRolesName()); } return null; }
	 */
}
