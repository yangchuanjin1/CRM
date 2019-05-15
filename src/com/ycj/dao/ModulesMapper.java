package com.ycj.dao;
//模块表

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;

import com.ycj.entity.Modules;
import com.ycj.entity.Roles;

public interface ModulesMapper {
	/**
	 * 查询每个用户下的模块
	 * @param staffid  用户编号
	 * @return
	 */
	List<Modules> selectMuesTree(Integer staffid);
	//,@Param("moduleid")Integer moduleid
	List<Modules> selectmoduct(@Param("staffid")Integer staffid);
	/**
	 * 查询所有模块
	 * @return
	 */
	List<Modules> selectModulesTree();
	/**
	 * 添加
	 * @param modules
	 * @return
	 */
	Integer insertModulesYang(Modules modules);
	/**
	 * 删除操作
	 * @param modulesId
	 * @return
	 */
	Integer deleteModulesYang(Integer modulesId);
	/**
	 * 修改操作
	 * @param modules
	 * @return
	 */
	Integer updateModulesYang(Modules modules);
	/**
	 * 根据id查询模块
	 * @param modulesId
	 * @return
	 */
	Modules selectModulesAndmodulesidYang(Integer modulesId);
	/**
	 * 查询每个角色下的所有模块
	 * @param roles
	 * @return
	 */
	List<Modules> selectModulesRolesYang(Integer roles);

}
