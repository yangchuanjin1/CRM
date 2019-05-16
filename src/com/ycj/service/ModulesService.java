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
	 *YangChuanJin 删除模块和模块角色中间表的数据  
	 * @param modulesId
	 * @return
	 */
	Integer deleteModulesandRolesYang(Integer modulesId);
	/**
	 * 删除模块
	 * @param modulesId
	 * @return
	 */
	Integer deleteModulesYang(Integer modulesId);
	/**
	 * YangChuanJin    查询这个模块是否有分配给了角色
	 * @param modulesId
	 * @return
	 */
	Integer selectRolesModules(Integer modulesId);
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
	List<Modules> selectModulesRolesYang(Integer rolesId);
	/**
	 * 查询所有模块
	 * @return
	 */
	List<Modules> selectRolesModulesYang();

	
	/**
	 * YangChuanJin  给角色分配权限查询所有模块和选中角色拥有的
	 * @param rolesId
	 * @return
	 */
	List<Map<String, Object>> selectModulesRolesYang1(Integer rolesId);
}
