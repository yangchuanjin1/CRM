package com.ycj.dao;
//ģ���

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;

import com.ycj.entity.Modules;

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

}
