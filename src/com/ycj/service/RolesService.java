package com.ycj.service;

import java.util.List;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;

public interface RolesService {
	/**
	 * 分页带条件查询中条数和查询总条数
	 * @param fenYeYang
	 * @return
	 */
	FenYeYang selectByRolesAndCoount(FenYeYang fenYeYang);
	/**
	 * 添加
	 * @param roles
	 * @return
	 */
	Integer insetRolesYang(Roles roles);
	/**
	 * 删除角色表  和 删除用户与角色中间表的数据
	 * @param RolesId
	 * @return
	 */
	Integer deleteRolesYang(Integer RolesId);
	/**
	 * 杨传锦    查询这个角色是否有用户在使用这个角色
	 * @param RolesId
	 * @return
	 */
	Integer selectRolesStaffYang(Integer RolesId);
	/**
	 * 修改
	 * @param roles
	 * @return
	 */
	Integer updateRolesYang(Roles roles);
	
	
	/**
	 * 杨传锦     查询所有角色
	 * @return
	 */
	List<Roles> selectStaffRolesYang();
	/**
	 * 杨传锦    查询一个用户下的角色
	 * @param StaffId
	 * @return
	 */
	List<Roles> seleseStaffRolesRolesIdYang(Integer StaffId);
	
}
