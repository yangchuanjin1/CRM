package com.ycj.service;

import com.ycj.entity.Rolemodules;

public interface RolemodulesService {
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
