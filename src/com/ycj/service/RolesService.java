package com.ycj.service;

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
	 * 删除
	 * @param RolesId
	 * @return
	 */
	Integer deleteRolesYang(Integer RolesId);
	
}
