package com.ycj.service;

import java.util.List;
import java.util.Map;

import com.ycj.entity.Modules;

public interface ModulesService {
	/**
	 * 查询每个用下的模块
	 * @param staffid  用户编号
	 * @return
	 */
	List<Map<String, Object>> selectMuestree(Integer staffid);
	
	List<Map<String, Object>> selectModulesTreeYang();

}
