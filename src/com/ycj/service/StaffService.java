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
	   * 杨传锦  分页带条件查询所有数据和查询总条数
	   * @param fenYeYang
	   * @return
	   */
	  FenYeYang selectStaffAllCountYang(FenYeYang fenYeYang);
	  /**
	   *  杨传锦   添加
	   * @param staff
	   * @return
	   */
	  Integer insertStaffYang(Staff staff);
	  /**
	   * 杨传锦     修改
	   * @param staff
	   * @return
	   */
	  Integer updateStaffYang(Staff staff);
	  /**
	   * 杨传锦      解锁用户
	   * @param staffId
	   * @return
	   */
	  Integer updateStaffJieIsLockoutYang(Integer staffId);
	  /**
	   * 杨传锦      锁定用户
	   * @param staffId
	   * @return
	   */
	  Integer updateStaffSuoIsLockoutYang(Integer staffId);
	  /**
		 * 杨传锦   设置密保
		 * @param staff
		 * @return
		 */
		Integer updateStaffMiBaoYang(Staff staff);
		/**
		 * 杨传锦   查询修改密码时输入的旧密码是否正确
		 * @param staff
		 * @return
		 */
		Integer selectStaffMiMaPasswordYang(Staff staff);
		/**
		 * 杨传锦    修改密码
		 * @param staff
		 * @return
		 */
		Integer updateStaffMiMaPasswordYang(Staff staff);
		/**
		 * YangChuanJin   查询要添加的用户名是否存在
		 * @param Staff_Name
		 * @return
		 */
		Integer selectStaffNameYang(String Staff_Name);
		/**
		 * YangChuanJin   删除用户
		 * @param Staff_ID
		 * @return
		 */
		Integer deleteStaff_IdYang(Integer Staff_ID);
	 
		/**
		 * YangChuanJin    查询不是咨询师的员工
		 * @return
		 */
		List<Staff> selectStaffAndAsker();
}
