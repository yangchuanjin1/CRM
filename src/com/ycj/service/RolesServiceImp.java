package com.ycj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.RolesMapper;
import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;
@Service
public class RolesServiceImp implements RolesService {
	
	@Autowired
	private RolesMapper rolesmapper;
	/**
	 * 分页带条件查询数据和查询你总条数
	 */
	public FenYeYang selectByRolesAndCoount(FenYeYang fenYeYang) {
		List<Roles> rolesAll = rolesmapper.selectByRolesAll(fenYeYang);
		Integer rolesCount = rolesmapper.selectByRolesCount(fenYeYang);
		fenYeYang.setRows(rolesAll);
		fenYeYang.setTotal(rolesCount);
		return fenYeYang;
	}

	/**
	 * 添加
	 */
	public Integer insetRolesYang(Roles roles) {
		Integer rolesYang = rolesmapper.insertByRolesYang(roles);
		return rolesYang;
	}


	/**
	 * 删除角色表  和 删除用户与角色中间表的数据
	 */
	public Integer deleteRolesYang(Integer RolesId) {
		Integer deleteRolesYang = rolesmapper.deleteRolesYang(RolesId);
		Integer delectStaffRolesYang = rolesmapper.delectStaffRolesYang(RolesId);
		
		return deleteRolesYang+delectStaffRolesYang;
	}

	/**
	 * 修改
	 */
	public Integer updateRolesYang(Roles roles) {
		Integer updateRolesYang = rolesmapper.updateRolesYang(roles);
		return updateRolesYang;
	}

/**
 * 杨传锦     查询所有角色
 */
	public List<Roles> selectStaffRolesYang() {
		List<Roles> selectStaffRolesYang = rolesmapper.selectStaffRolesYang();
		return selectStaffRolesYang;
	}

	/**
	 * 杨传锦     查询一个用户下的所有角色
	 */
	public List<Roles> seleseStaffRolesRolesIdYang(Integer StaffId) {
		List<Roles> seleseStaffRolesRolesIdYang = rolesmapper.seleseStaffRolesRolesIdYang(StaffId);
		return seleseStaffRolesRolesIdYang;
	}

	/**
	 * 杨传锦    查询这个角色是否有用户在使用这个角色
	 */
	public Integer selectRolesStaffYang(Integer RolesId) {
		Integer selectRolesStaffYang = rolesmapper.selectRolesStaffYang(RolesId);
		return selectRolesStaffYang;
	}

}
