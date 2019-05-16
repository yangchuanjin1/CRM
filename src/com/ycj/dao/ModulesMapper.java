package com.ycj.dao;
//Ä£ï¿½ï¿½ï¿½

import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.ycj.entity.Modules;
import com.ycj.entity.Roles;

public interface ModulesMapper {
	/**
	 * ï¿½ï¿½Ñ¯Ã¿ï¿½ï¿½ï¿½Ã»ï¿½ï¿½Âµï¿½Ä£ï¿½ï¿½
	 * @param staffid  ï¿½Ã»ï¿½ï¿½ï¿½ï¿½
	 * @return
	 */
	List<Modules> selectMuesTree(Integer staffid);
	//,@Param("moduleid")Integer moduleid
	List<Modules> selectmoduct(@Param("staffid")Integer staffid);
	/**
	 * ï¿½ï¿½Ñ¯ï¿½ï¿½ï¿½ï¿½Ä£ï¿½ï¿½
	 * @return
	 */
	List<Modules> selectModulesTree();
	/**
	 * ï¿½ï¿½ï¿½
	 * @param modules
	 * @return
	 */
	Integer insertModulesYang(Modules modules);
	/**
	 * É¾ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
	 * @param modulesId
	 * @return
	 */
	Integer deleteModulesYang(Integer modulesId);
	/**
	 * ï¿½Þ¸Ä²ï¿½ï¿½ï¿½
	 * @param modules
	 * @return
	 */
	Integer updateModulesYang(Modules modules);
	/**
	 * ï¿½ï¿½ï¿½ï¿½idï¿½ï¿½Ñ¯Ä£ï¿½ï¿½
	 * @param modulesId
	 * @return
	 */
	Modules selectModulesAndmodulesidYang(Integer modulesId);
	/**
	 * ²éÑ¯Ã¿¸ö½ÇÉ«ÏÂµÄËùÓÐÄ£¿é
	 * @param roles
	 * @return
	 */
	List<Modules> selectModulesRolesYang(Integer roles);

}
