package com.ycj.dao;
//ģ���

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;

import com.ycj.entity.Modules;
import com.ycj.entity.Roles;

public interface ModulesMapper {
	/**
	 * ��ѯÿ���û��µ�ģ��
	 * @param staffid  �û����
	 * @return
	 */
	List<Modules> selectMuesTree(Integer staffid);
	//,@Param("moduleid")Integer moduleid
	List<Modules> selectmoduct(@Param("staffid")Integer staffid);
	/**
	 * ��ѯ����ģ��
	 * @return
	 */
	List<Modules> selectModulesTree();
	/**
	 * ���
	 * @param modules
	 * @return
	 */
	Integer insertModulesYang(Modules modules);
	/**
	 * ɾ������
	 * @param modulesId
	 * @return
	 */
	Integer deleteModulesYang(Integer modulesId);
	/**
	 * �޸Ĳ���
	 * @param modules
	 * @return
	 */
	Integer updateModulesYang(Modules modules);
	/**
	 * ����id��ѯģ��
	 * @param modulesId
	 * @return
	 */
	Modules selectModulesAndmodulesidYang(Integer modulesId);
	/**
	 * ��ѯÿ����ɫ�µ�����ģ��
	 * @param roles
	 * @return
	 */
	List<Modules> selectModulesRolesYang(Integer roles);

}
