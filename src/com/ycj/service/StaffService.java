package com.ycj.service;

import java.util.List;

import com.ycj.entity.FenYe;
import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;
import com.ycj.entity.Staff;
import com.ycj.entity.Staffroles;

public interface StaffService {
	
	  FenYe<Staff> selectStaffs(Staff staff);
	  
	/*
	 * List<Roles> seleRoles();
	 * 
	 * int insertStaff(Staff staff);
	 * 
	 * int updateStaff(Staff staff);
	 * 
	 * int deleteStaff(int Staff_ID);
	 * 
	 * Integer insertRole(Staffroles staffroles);
	 */
	  /**
	   * ���  ��ҳ��������ѯ�������ݺͲ�ѯ������
	   * @param fenYeYang
	   * @return
	   */
	  FenYeYang selectStaffAllCountYang(FenYeYang fenYeYang);
	  /**
	   *  ���   ���
	   * @param staff
	   * @return
	   */
	  Integer insertStaffYang(Staff staff);
	  /**
	   * ���     �޸�
	   * @param staff
	   * @return
	   */
	  Integer updateStaffYang(Staff staff);
	  /**
	   * ���      �����û�
	   * @param staffId
	   * @return
	   */
	  Integer updateStaffJieIsLockoutYang(Integer staffId);
	  /**
	   * ���      �����û�
	   * @param staffId
	   * @return
	   */
	  Integer updateStaffSuoIsLockoutYang(Integer staffId);
	  /**
		 * ���   �����ܱ�
		 * @param staff
		 * @return
		 */
		Integer updateStaffMiBaoYang(Staff staff);
		/**
		 * ���   ��ѯ�޸�����ʱ����ľ������Ƿ���ȷ
		 * @param staff
		 * @return
		 */
		Integer selectStaffMiMaPasswordYang(Staff staff);
		/**
		 * ���    �޸�����
		 * @param staff
		 * @return
		 */
		Integer updateStaffMiMaPasswordYang(Staff staff);
		/**
		 * YangChuanJin   ��ѯҪ��ӵ��û����Ƿ����
		 * @param Staff_Name
		 * @return
		 */
		Integer selectStaffNameYang(String Staff_Name);
		/**
		 * YangChuanJin   ɾ���û�
		 * @param Staff_ID
		 * @return
		 */
		Integer deleteStaff_IdYang(Integer Staff_ID);
	 
		/**
		 * YangChuanJin    ��ѯ������ѯʦ��Ա��
		 * @return
		 */
		List<Staff> selectStaffAndAsker();
}
