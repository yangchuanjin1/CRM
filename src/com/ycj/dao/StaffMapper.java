package com.ycj.dao;

import java.util.List;

import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;
import com.ycj.entity.Staff;
import com.ycj.entity.Staffroles;

public interface StaffMapper {
	/**
	 * 锟矫伙拷锟斤拷录时锟斤拷锟斤拷锟斤拷锟矫伙拷锟斤拷锟矫伙拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷胁锟斤拷锟�
	 * @param users  锟斤拷询锟斤拷锟斤拷
	 * @return 锟斤拷锟斤拷锟斤拷锟斤拷没锟斤拷锟斤拷锟较�
	 */
	
	  
	  List<Roles> seleRoles();
	  
	  List<Staff> selectStaffs(Staff staff);
	  
	  int selectCount(Staff staff);
	  
	/*
	 * int insertStaff(Staff staff); Integer insertRole(Staffroles staffroles); int
	 * updateStaff(Staff staff);
	 * 
	 * int deleteStaff(int Staff_ID);
	 */
	 

	Staff selectByCheckStaff(Staff Staff);
	/**
	 * 锟斤拷询锟矫伙拷锟斤拷锟角凤拷锟斤拷确
	 * @param Staff_name
	 * @return
	 */
	Staff selectByStaff_Name(String Staff_name);
	/**
	 * 锟斤拷询锟斤拷锟斤拷锟角凤拷锟斤拷确
	 * @param Staff_password
	 * @return
	 */
	Staff selectByStaff_password(String Staff_password);
	/**
	 * 锟睫改达拷锟斤拷锟斤拷锟�
	 * @return
	 */
	Integer updateByStaff_PsdWrong(String Staff_name);
	/**
	 * 锟睫改碉拷录时锟斤拷
	 * @return
	 */
	Integer updateByStaff_Time(Integer staff_id);
	
	/**
	 * 杨传锦         分页带条件查询所有员工
	 * @param fenYeYang
	 * @return
	 */
	List<Staff> selectStaffAllYang(FenYeYang fenYeYang);
	/**
	 * 杨传锦     查询总条数
	 * @param fenYeYang
	 * @return
	 */
	Integer selectStaffCountYang(FenYeYang fenYeYang);
	/**
	 * 添加
	 * @param staff
	 * @return
	 */
	Integer insetStaffYang(Staff staff);
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
	 * 杨传锦    锁定用户
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
	
}
