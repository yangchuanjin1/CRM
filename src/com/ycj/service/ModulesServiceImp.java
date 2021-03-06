package com.ycj.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.aspectj.weaver.tools.GeneratedClassHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.Util.TreeModel;
import com.ycj.Util.TreeNode;
import com.ycj.controller.ModulesConroller;
import com.ycj.dao.ModulesMapper;
import com.ycj.entity.Modules;
import com.ycj.entity.Roles;
@Service
public class ModulesServiceImp implements ModulesService {
	@Autowired
	private ModulesMapper modulesMapper;
	@Override
	public List<Map<String, Object>> selectMuestree(Integer staffid) {
		List<Modules> selectMuesTree = modulesMapper.selectMuesTree(staffid);
		
		List<Map<String, Object>> maps1=new ArrayList<Map<String,Object>>();
		
		for (int i = 0; i < selectMuesTree.size(); i++) {
			Map<String, Object> map1=new HashMap<String, Object>();
			if(selectMuesTree.get(i).getModules_ParentId()==0) {
				map1.put("id", selectMuesTree.get(i).getModules_ID());
				map1.put("text", selectMuesTree.get(i).getModules_Name());
				map1.put("modules_Path", selectMuesTree.get(i).getModules_Path());
				map1.put("children", chidren(selectMuesTree.get(i),staffid));
				maps1.add(map1);
			}
		}
		return maps1;
	}

	public List<Map<String, Object>> chidren(Modules modules,Integer staffid){
		List<Modules> selectmodules = modulesMapper.selectmoduct(staffid);
		
		List<Map<String, Object>> maps=new ArrayList<Map<String,Object>>();
		
		for (int i = 0; i < selectmodules.size(); i++) {
			Map<String, Object> map=new HashMap<String, Object>();
			if(selectmodules.get(i).getModules_ParentId()==modules.getModules_ID()) {
				map.put("id", selectmodules.get(i).getModules_ID());
				map.put("text", selectmodules.get(i).getModules_Name());
				map.put("modules_Path", selectmodules.get(i).getModules_Path());
				map.put("children", chidren(selectmodules.get(i),staffid)); 
				maps.add(map);
			}
		}
		System.out.println(maps+"maps");
		return maps;
	}

	
	public List<Map<String, Object>> selectModulesTreeYang() {
		List<Modules> modulesTree = modulesMapper.selectModulesTree();
		
		List<Map<String, Object>> maps1=new ArrayList<Map<String,Object>>();
		for (int i = 0; i < modulesTree.size(); i++) {
			Map<String, Object> map=new HashMap<String, Object>();
			if(modulesTree.get(i).getModules_ParentId()==0) {
				map.put("id", modulesTree.get(i).getModules_ID());
				map.put("text", modulesTree.get(i).getModules_Name());
				map.put("modules_Path", modulesTree.get(i).getModules_Path());
				map.put("modules_Weight", modulesTree.get(i).getModules_Weight());
				map.put("children", chidrenall(modulesTree.get(i))); 
				maps1.add(map);
			}
		}
		return maps1;
	}

	private List<Map<String, Object>> chidrenall(Modules modules) {
		List<Modules> modulesTree = modulesMapper.selectModulesTree();
		
		List<Map<String, Object>> maps=new ArrayList<Map<String,Object>>();
		for (int i = 0; i < modulesTree.size(); i++) {
			Map<String, Object> map=new HashMap<String, Object>();
			if(modulesTree.get(i).getModules_ParentId()==modules.getModules_ID()) {
				map.put("id", modulesTree.get(i).getModules_ID());
				map.put("text", modulesTree.get(i).getModules_Name());
				map.put("modules_Path", modulesTree.get(i).getModules_Path());
				map.put("modules_Weight", modulesTree.get(i).getModules_Weight());
				map.put("children", chidrenall(modulesTree.get(i)));
				maps.add(map);
			}
		}
		return maps;
	}

	/**
	 * 添加
	 */
	public Integer insertModulesYang(Modules modules) {
		Integer insertmodulesYang = modulesMapper.insertModulesYang(modules);
		return insertmodulesYang;
	}
	/**
	 * 删除模块
	 */
	public Integer deleteModulesYang(Integer modulesId) {
		Integer deleteModulesYang = modulesMapper.deleteModulesYang(modulesId);
		return deleteModulesYang;
	}
	/**
	 * YangChuanJin 删除模块和模块角色中间表的数据  
	 */
	public Integer deleteModulesandRolesYang(Integer modulesId) {
		Integer deleteModulesYang = modulesMapper.deleteModulesYang(modulesId);
		Integer deleteRolesModules = modulesMapper.deleteRolesModules(modulesId);
		return deleteModulesYang+deleteRolesModules;
	}

	/**
	 * 修改
	 */
	public Integer updateModulesYang(Modules modules) {
		Integer updateModulesYang = modulesMapper.updateModulesYang(modules);
		return updateModulesYang;
	}

	/**
	 * 根据id查询一条数据
	 */
	public Modules selectModulesAndmodulesidYang(Integer modulesId) {
		Modules selectModulesAndmodulesidYang = modulesMapper.selectModulesAndmodulesidYang(modulesId);
		return selectModulesAndmodulesidYang;
	}

	
	/*public List<Map<String, Object>> selectModulesRolesYang(Integer rolesId) {
		
		return null;
	}*/
	
	
	public List<Modules> selectModulesRolesYang(Integer rolesId) {
			List<Modules> mod=modulesMapper.selectModulesRolesYang(rolesId);
			
			   
			return mod;	
		}

	/**
	 * 查询所有模块
	 */
	public List<Modules> selectRolesModulesYang() {
		List<Modules> selectModulesTree = modulesMapper.selectModulesTree();
		return selectModulesTree;
	}

	/**
	 * YangChuanJin    查询这个模块是否有分配给了角色
	 */
	public Integer selectRolesModules(Integer modulesId) {
		Integer selectRolesModules = modulesMapper.selectRolesModules(modulesId);
		return selectRolesModules;
	}

	
	
	/**
	 * YangChuanJin  给角色分配权限查询所有模块和选中角色拥有的
	 */
	public List<Map<String, Object>> selectModulesRolesYang1(Integer rolesId) {
		List<Modules> selectModulesTree = modulesMapper.selectModulesTree();
		List<Map<String, Object>> maps1=new ArrayList<Map<String,Object>>();
		for (int i = 0; i < selectModulesTree.size(); i++) {
			Map<String, Object> map=new HashMap<String, Object>();
			if(selectModulesTree.get(i).getModules_ParentId()==0) {
				map.put("id", selectModulesTree.get(i).getModules_ID());
				map.put("text", selectModulesTree.get(i).getModules_Name());
				map.put("modules_Path", selectModulesTree.get(i).getModules_Path());
				map.put("modules_Weight", selectModulesTree.get(i).getModules_Weight());
				map.put("children", chidrenall(selectModulesTree.get(i),rolesId)); 
				maps1.add(map);
			}
		}
		return maps1;
	}

	private List<Map<String, Object>> chidrenall(Modules modules,Integer rolesId) {
		System.out.println("杨传锦 77777777777777777777777");
		List<Modules> modulesTree = modulesMapper.selectModulesTree();
		List<Modules> modulesTree1 = modulesMapper.selectModulesRolesYang(rolesId);
		List<Map<String, Object>> maps=new ArrayList<Map<String,Object>>();
		for (int i = 0; i < modulesTree.size(); i++) {
			Map<String, Object> map=new HashMap<String, Object>();
			if(modulesTree.get(i).getModules_ParentId()==modules.getModules_ID()) {
				map.put("id", modulesTree.get(i).getModules_ID());
				map.put("text", modulesTree.get(i).getModules_Name());
				map.put("modules_Path", modulesTree.get(i).getModules_Path());
				map.put("modules_Weight", modulesTree.get(i).getModules_Weight());
				for (int j = 0; j < modulesTree1.size(); j++) {
					if(modulesTree1.get(j).getModules_ID()==modulesTree.get(i).getModules_ID()) {
						System.out.println("杨传锦 77777777777755555555777777");
						/*xuanzhong=true;*/
						map.put("checked", true);
					}else {
						map.put("checked", false);
					}
				}
				map.put("children", chidrenall(modulesTree.get(i)));
				maps.add(map);
			}
		}
		return maps;
	}
	
	
	
	
	
	
	
	
}
