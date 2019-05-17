package com.ycj.dao;

import com.ycj.entity.Rolemodules;

//模块和角色中间表
public interface RolemodulesMapper {
	/**
	 * YangChuanJin   删除此角色下的所有模块
	 * @param rolesId
	 * @return
	 */
	Integer delectRolesModules(Integer rolesId);
	/**
	 * YangChuanJin   为角色添加模块
	 * @param rolemodules
	 * @return
	 */
	Integer insertRolesModulesYang(Rolemodules rolemodules);

}
