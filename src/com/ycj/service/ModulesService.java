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
	
	List<Map<String, Object>> selectModulesTreeYang();

}
