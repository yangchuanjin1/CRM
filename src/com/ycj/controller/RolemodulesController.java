package com.ycj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Rolemodules;
import com.ycj.service.RolemodulesService;

@Controller
public class RolemodulesController {
	@Autowired
	private RolemodulesService rolemodulesService;
	
	@RequestMapping(value="/insertAnddeleteYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer insertAnddeleteYang(String parentIds,Integer rolesId) {
		
		rolemodulesService.delectRolesModules(rolesId);
		String[] arr=parentIds.split(",");
		Rolemodules rolemodules=new Rolemodules();
		rolemodules.setRM_RolesID(rolesId);
		Integer s=0;
		for (int i = 0; i < arr.length; i++) {
			rolemodules.setRM_ModulesID(Integer.parseInt(arr[i]));
			s= rolemodulesService.insertRolesModulesYang(rolemodules);
		}
		
		return s;
	}
	

}
