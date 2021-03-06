package com.ycj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;
import com.ycj.service.RolesService;

@Controller
public class RolesController {
	@Autowired
	private RolesService rolesService;
	//分页带条件查询所有数据和查询总条数
	@RequestMapping(value="/selectRolesAll",method=RequestMethod.POST)
	@ResponseBody
	public FenYeYang selectRolesAll(Integer page,Integer rows,String rolesName) {
		FenYeYang fenYeYang=new FenYeYang();
		fenYeYang.setPage((page-1)*rows);
		fenYeYang.setPageSize(rows);
		fenYeYang.setRolesName(rolesName);
		FenYeYang andCoount = rolesService.selectByRolesAndCoount(fenYeYang);
		return andCoount;
	}
	
	//添加
	@RequestMapping(value="/insertRolesYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer insertRolesYang(Roles roles) {
		Integer rolesYang = rolesService.insetRolesYang(roles);
		return rolesYang;
	}
	//YangChuanJin 删除角色表  和 删除用户与角色中间表的数据
	@RequestMapping(value="/deletectRolesYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer deletectRolesYang(Integer RolesId) {
		Integer deleteRolesYang = rolesService.deleteRolesYang(RolesId);
		return deleteRolesYang;
	}
	/**
	 * 杨传锦    查询这个角色是否有用户在使用这个角色
	 * @param RolesId
	 * @return
	 */
	@RequestMapping(value="/selectRolesStaff",method=RequestMethod.POST)
	@ResponseBody
	public Integer selectRolesStaff(Integer RolesId) {
		Integer selectRolesStaffYang = rolesService.selectRolesStaffYang(RolesId);
		return selectRolesStaffYang;
	}
	
	//修改
	
	@RequestMapping(value="/updateRolesYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer updateRolesYang(Roles roles) {
		Integer updateRolesYang = rolesService.updateRolesYang(roles);
		return updateRolesYang;
	}
	/**
	 * 杨传锦    查询一个用户下的角色
	 * @param StaffId
	 * @return
	 */
	@RequestMapping(value="/selectStaffRolesIdYang",method=RequestMethod.POST)
	@ResponseBody
	public List<Roles> selectStaffRolesIdYang(Integer StaffId){
		List<Roles> seleseStaffRolesRolesIdYang = rolesService.seleseStaffRolesRolesIdYang(StaffId);
		return seleseStaffRolesRolesIdYang;
	}
	/**
	 * 杨传锦     查询所有角色
	 * @return
	 */
	@RequestMapping(value="/selectStaffRolesYang",method=RequestMethod.POST)
	@ResponseBody
	public List<Roles> selectStaffRolesYang(){
		List<Roles> selectStaffRolesYang = rolesService.selectStaffRolesYang();
		return selectStaffRolesYang;
	}
}
