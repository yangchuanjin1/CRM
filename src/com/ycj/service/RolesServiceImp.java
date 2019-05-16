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
	 * ɾ����ɫ��  �� ɾ���û����ɫ�м�������
	 */
	public Integer deleteRolesYang(Integer RolesId) {
		Integer deleteRolesYang = rolesmapper.deleteRolesYang(RolesId);
		Integer delectStaffRolesYang = rolesmapper.delectStaffRolesYang(RolesId);
		
		return deleteRolesYang+delectStaffRolesYang;
	}

	/**
	 * �޸�
	 */
	public Integer updateRolesYang(Roles roles) {
		Integer updateRolesYang = rolesmapper.updateRolesYang(roles);
		return updateRolesYang;
	}

/**
 * ���     ��ѯ���н�ɫ
 */
	public List<Roles> selectStaffRolesYang() {
		List<Roles> selectStaffRolesYang = rolesmapper.selectStaffRolesYang();
		return selectStaffRolesYang;
	}

	/**
	 * ���     ��ѯһ���û��µ����н�ɫ
	 */
	public List<Roles> seleseStaffRolesRolesIdYang(Integer StaffId) {
		List<Roles> seleseStaffRolesRolesIdYang = rolesmapper.seleseStaffRolesRolesIdYang(StaffId);
		return seleseStaffRolesRolesIdYang;
	}

	/**
	 * ���    ��ѯ�����ɫ�Ƿ����û���ʹ�������ɫ
	 */
	public Integer selectRolesStaffYang(Integer RolesId) {
		Integer selectRolesStaffYang = rolesmapper.selectRolesStaffYang(RolesId);
		return selectRolesStaffYang;
	}

}
