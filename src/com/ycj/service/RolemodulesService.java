package com.ycj.service;

import com.ycj.entity.Rolemodules;

public interface RolemodulesService {
	/**
	 * YangChuanJin   ɾ���˽�ɫ�µ�����ģ��
	 * @param rolesId
	 * @return
	 */
	Integer delectRolesModules(Integer rolesId);
	/**
	 * YangChuanJin   Ϊ��ɫ���ģ��
	 * @param rolemodules
	 * @return
	 */
	Integer insertRolesModulesYang(Rolemodules rolemodules);

}
