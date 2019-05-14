package com.ycj.dao;
//模块表

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;

import com.ycj.entity.Modules;

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

}
