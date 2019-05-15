package com.ycj.dao;
//角色表

import java.util.List;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;

public interface RolesMapper {
	/**
	 * 分页带条件查询所有
	 * @param fenYeYang
	 * @return
	 */
	List<Roles> selectByRolesAll(FenYeYang fenYeYang);
	/**
	 * 查询总条数
	 * @param fenYeYang
	 * @return
	 */
	Integer selectByRolesCount(FenYeYang fenYeYang);
	/**
	 * 添加
	 * @param roles
	 * @return
	 */
	Integer insertByRolesYang(Roles roles);
	/**
	 * 删除
	 * @param RolesId
	 * @return
	 */
	Integer deleteRolesYang(Integer RolesId);
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
