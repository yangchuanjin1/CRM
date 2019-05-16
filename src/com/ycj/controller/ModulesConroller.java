package com.ycj.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.Util.Result;
import com.ycj.Util.TreeModel;
import com.ycj.Util.TreeNode;
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
		return modulesTreeYang;
	}
	//添加
	@RequestMapping(value="/insertModulesYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer insertModulesYang(Modules modules) {
		Integer insertModulesYang = modulesService.insertModulesYang(modules);
		return insertModulesYang;
	}
	//删除
	@RequestMapping(value="/deleteModulesYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer deleteModulesYang(Integer Modules_ID) {
		Integer deleteModulesYang = modulesService.deleteModulesYang(Modules_ID);
		return deleteModulesYang;
	}
	/**
	 * 杨传锦     修改模块
	 * @param modules
	 * @return
	 */
	@RequestMapping(value="/updateModulesYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer updateModulesYang(Modules modules) {
		Integer updateModulesYang = modulesService.updateModulesYang(modules);
		return updateModulesYang;
	}
	
	
	
	//根据id查询一条数据
	@RequestMapping(value="selectModulesAndModulesIdYang",method=RequestMethod.POST)
	@ResponseBody
	public String selectModulesAndModulesIdYang(Integer modulesId) {
		System.out.println(modulesId);
		Modules selectModulesAndmodulesidYang = modulesService.selectModulesAndmodulesidYang(modulesId);
		System.out.println(Result.toClient(true, selectModulesAndmodulesidYang));
		return Result.toClient(true, selectModulesAndmodulesidYang);
	}
	
	
	
	
	@RequestMapping(value="selectModulesRolesYang",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<TreeModel> selectModulesRolesYang(Integer RolesId) {
		ArrayList<TreeModel> selectRolesModulesYang = modulesService.selectRolesModulesYang();
		ArrayList<TreeModel> selectModulesRolesYang = modulesService.selectModulesRolesYang(RolesId);
		System.out.println(selectRolesModulesYang+"all");
		System.out.println(selectModulesRolesYang+"private");
		return TreeNode.checkTree(selectRolesModulesYang, selectModulesRolesYang);
		
	}
}
