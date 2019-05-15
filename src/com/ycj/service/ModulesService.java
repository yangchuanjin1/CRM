package com.ycj.service;

import java.util.List;
import java.util.Map;

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
	 * ɾ��
	 * @param modulesId
	 * @return
	 */
	Integer deleteModulesYang(Integer modulesId);
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

}
