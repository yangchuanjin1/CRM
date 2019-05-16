package com.ycj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ycj.Util.TreeModel;
import com.ycj.entity.Modules;

public interface ModulesService {
	/**
	 * 查询每个用下的模块
	 * @param staffid  用户编号
	 * @return
	 */
	List<Map<String, Object>> selectMuestree(Integer staffid);
	/**
	 * 查询所有模块
	 * @return
	 */
	List<Map<String, Object>> selectModulesTreeYang();
	/**
	 * 添加
	 * @param modules
	 * @return
	 */
	Integer insertModulesYang(Modules modules);
	/**
	 * 删除
	 * @param modulesId
	 * @return
	 */
	Integer deleteModulesYang(Integer modulesId);
	/**
	 * 修改
	 * @param modules
	 * @return
	 */
	Integer updateModulesYang(Modules modules);
	/**
	 * 根据id查询一条数据
	 * @param modulesId
	 * @return
	 */
	Modules selectModulesAndmodulesidYang(Integer modulesId);
	/**
	 * 查询所有模块和每个角色下的所有模块
	 * @param rolesId
	 * @return
	 */
	ArrayList<TreeModel> selectModulesRolesYang(Integer rolesId);
	/**
	 * 查询所有模块
	 * @return
	 */
	ArrayList<TreeModel> selectRolesModulesYang();

}
