package com.ycj.dao;

import com.ycj.entity.Rolemodules;

//ģ��ͽ�ɫ�м��
public interface RolemodulesMapper {
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
