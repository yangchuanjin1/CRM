package com.ycj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.RolemodulesMapper;
import com.ycj.entity.Rolemodules;
@Service
public class RolemodulesServiceImp implements RolemodulesService {
	@Autowired
	private RolemodulesMapper rolemodulesMapper;

	@Override
	public Integer delectRolesModules(Integer rolesId) {
		Integer delectRolesModules = rolemodulesMapper.delectRolesModules(rolesId);
		return delectRolesModules;
	}

	@Override
	public Integer insertRolesModulesYang(Rolemodules rolemodules) {
		Integer insertRolesModulesYang = rolemodulesMapper.insertRolesModulesYang(rolemodules);
		return insertRolesModulesYang;
	}

}
