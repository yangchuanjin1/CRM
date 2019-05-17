package com.ycj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ycj.Util.TreeModel;
import com.ycj.entity.Modules;

public interface ModulesService {
	/**
	 * ��ѯÿ�����µ�ģ��
	 * @param staffid  �û����
	 * @return
	 */
	List<Map<String, Object>> selectMuestree(Integer staffid);
	/**
	 * ��ѯ����ģ��
	 * @return
	 */
	List<Map<String, Object>> selectModulesTreeYang();
	/**
	 * ���
	 * @param modules
	 * @return
	 */
	Integer insertModulesYang(Modules modules);
	/**
	 *YangChuanJin ɾ��ģ���ģ���ɫ�м�������  
	 * @param modulesId
	 * @return
	 */
	Integer deleteModulesandRolesYang(Integer modulesId);
	/**
	 * ɾ��ģ��
	 * @param modulesId
	 * @return
	 */
	Integer deleteModulesYang(Integer modulesId);
	/**
	 * YangChuanJin    ��ѯ���ģ���Ƿ��з�����˽�ɫ
	 * @param modulesId
	 * @return
	 */
	Integer selectRolesModules(Integer modulesId);
	/**
	 * �޸�
	 * @param modules
	 * @return
	 */
	Integer updateModulesYang(Modules modules);
	/**
	 * ����id��ѯһ������
	 * @param modulesId
	 * @return
	 */
	Modules selectModulesAndmodulesidYang(Integer modulesId);
	/**
	 * ��ѯ����ģ���ÿ����ɫ�µ�����ģ��
	 * @param rolesId
	 * @return
	 */
	List<Modules> selectModulesRolesYang(Integer rolesId);
	/**
	 * ��ѯ����ģ��
	 * @return
	 */
	List<Modules> selectRolesModulesYang();

	
	/**
	 * YangChuanJin  ����ɫ����Ȩ�޲�ѯ����ģ���ѡ�н�ɫӵ�е�
	 * @param rolesId
	 * @return
	 */
	List<Map<String, Object>> selectModulesRolesYang1(Integer rolesId);
}
