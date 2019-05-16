package com.ycj.dao;
//模锟斤拷锟�

import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.ycj.entity.Modules;

public interface ModulesMapper {
	/**
	 * 锟斤拷询每锟斤拷锟矫伙拷锟铰碉拷模锟斤拷
	 * @param staffid  锟矫伙拷锟斤拷锟�
	 * @return
	 */
	List<Modules> selectMuesTree(Integer staffid);
	//,@Param("moduleid")Integer moduleid
	List<Modules> selectmoduct(@Param("staffid")Integer staffid);
	/**
	 * 锟斤拷询锟斤拷锟斤拷模锟斤拷
	 * @return
	 */
	List<Modules> selectModulesTree();
	/**
	 * 锟斤拷锟�
	 * @param modules
	 * @return
	 */
	Integer insertModulesYang(Modules modules);
	/**
	 * 删锟斤拷锟斤拷锟斤拷
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
	 * YangChuanJin  删除模块和角色表中的数据
	 * @param modulesId
	 * @return
	 */
	Integer deleteRolesModules(Integer modulesId);
	/**
	 * 锟睫改诧拷锟斤拷
	 * @param modules
	 * @return
	 */
	Integer updateModulesYang(Modules modules);
	/**
	 * 锟斤拷锟斤拷id锟斤拷询模锟斤拷
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
