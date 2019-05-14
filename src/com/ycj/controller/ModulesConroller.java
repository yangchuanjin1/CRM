package com.ycj.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Modules;
import com.ycj.service.ModulesService;

@Controller
public class ModulesConroller {
	@Autowired
	private ModulesService modulesService;
	@RequestMapping(value="/selectMenuTrees")
	@ResponseBody
	public List<Map<String,Object>> selectMenuTrees(Integer staffid) {
		List<Map<String,Object>> muestree = modulesService.selectMuestree(staffid);
		System.out.println(muestree+"muestree");
		return muestree;
	}
	
	@RequestMapping(value="/selectMenuTreesYangAll")
	@ResponseBody
	public List<Map<String,Object>> selectMenuTreesYangAll() {
		List<Map<String,Object>> modulesTreeYang = modulesService.selectModulesTreeYang();
		System.out.println(modulesTreeYang+"muestree");
		return modulesTreeYang;
	}
}
