package com.ycj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.RolesMapper;
import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;
@Service
public class RolesServiceImp implements RolesService {
	
	@Autowired
	private RolesMapper rolesmapper;
	/**
	 * ��ҳ��������ѯ���ݺͲ�ѯ��������
	 */
	public FenYeYang selectByRolesAndCoount(FenYeYang fenYeYang) {
		List<Roles> rolesAll = rolesmapper.selectByRolesAll(fenYeYang);
		Integer rolesCount = rolesmapper.selectByRolesCount(fenYeYang);
		fenYeYang.setRows(rolesAll);
		fenYeYang.setTotal(rolesCount);
		return fenYeYang;
	}

	/**
	 * ���
	 */
	public Integer insetRolesYang(Roles roles) {
		Integer rolesYang = rolesmapper.insertByRolesYang(roles);
		return rolesYang;
	}


	/**
	 * ɾ��
	 */
	public Integer deleteRolesYang(Integer RolesId) {
		Integer deleteRolesYang = rolesmapper.deleteRolesYang(RolesId);
		return deleteRolesYang;
	}

}
