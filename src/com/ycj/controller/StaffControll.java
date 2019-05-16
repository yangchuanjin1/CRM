package com.ycj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.Util.MD5;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenYeYang;
import com.ycj.entity.Roles;
import com.ycj.entity.Signin;
import com.ycj.entity.Staff;
import com.ycj.entity.Staffroles;
import com.ycj.service.StaffService;
@Controller
public class StaffControll {
	@Autowired
	private StaffService staffService;
	@Autowired 
	private Staff staff;
	
	  @RequestMapping(value="/selectStaffs",method=RequestMethod.POST)
	  @ResponseBody 
	  public FenYe<Staff> selectStaffs(Staff staff) { 
	  return staffService.selectStaffs(staff); }
	/*
	 * @RequestMapping(value="/selectRoles",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public List<Roles> seleRoles() { return
	 * staffService.seleRoles(); }
	 * 
	 * @RequestMapping(value="/insertStaff",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public int insertStaff(Staff staff,Roles roles) {
	 * staff.setRoles(roles); return staffService.insertStaff(staff); }
	 * 
	 * @RequestMapping(value="/updateStaff",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public int updateStaff(Staff staff) { return
	 * staffService.updateStaff(staff); }
	 * 
	 * @RequestMapping(value="/deleteStaff",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public int deleteStaff(int Staff_ID) { return
	 * staffService.deleteStaff(Staff_ID); }
	 * 
	 * @RequestMapping(value="/insertroleId",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public int insertRole(Staffroles staffroles) { return
	 * staffService.insertRole(staffroles); }
	 */
	  /**
	   * ���  ��ҳ��������ѯ�������ݺͲ�ѯ������
	   * @param page
	   * @param rows
	   * @param fenYeYang
	   * @return
	   */
	  @RequestMapping(value="/selectStaffCountYang",method=RequestMethod.POST)
	  @ResponseBody
	  public FenYeYang selectStaffCountYang(Integer page,Integer rows,FenYeYang fenYeYang) {
		  fenYeYang.setPage((page-1)*rows);
		  fenYeYang.setPageSize(rows);
		  FenYeYang selectStaffAllCountYang = staffService.selectStaffAllCountYang(fenYeYang);
		  return selectStaffAllCountYang;
	  }
	  /**
	   * ���   ���
	   * @param staff
	   * @return
	   */
	  @RequestMapping(value="/insertStaffYang",method=RequestMethod.POST)
	  @ResponseBody
	  public Integer insertStaffYang(Staff staff) {
		  Integer insertStaffYang = staffService.insertStaffYang(staff);
		  return insertStaffYang;
	  }
	  /**
	   * ���      �޸�
	   * @param staff
	   * @return
	   */
	  @RequestMapping(value="/updateStaffYang",method=RequestMethod.POST)
	  @ResponseBody
	  public Integer updateStaffYang(Staff staff) {
		  System.out.println(staff.getStaff_Name()+"�û���");
		  Integer updateStaffYang = staffService.updateStaffYang(staff);
		  return updateStaffYang;
	  }
	  /**
	   * ���      �����û�
	   * @param staff
	   * @return
	   */
	  @RequestMapping(value="/updateStaffJieYang",method=RequestMethod.POST)
	  @ResponseBody
	  public Integer updateStaffJieYang(Integer staffId) {
		  Integer updateStaffJieIsLockoutYang = staffService.updateStaffJieIsLockoutYang(staffId);
		  return updateStaffJieIsLockoutYang;
	  }
	  /**
	   * ���      �����û�
	   * @param staff
	   * @return
	   */
	  @RequestMapping(value="/updateStaffSuoYang",method=RequestMethod.POST)
	  @ResponseBody
	  public Integer updateStaffSuoYang(Integer staffId) {
		  Integer updateStaffSuoIsLockoutYang = staffService.updateStaffSuoIsLockoutYang(staffId);
		  return updateStaffSuoIsLockoutYang;
	  }
	  /**
		 * ���   �����ܱ�
		 */
	  @RequestMapping(value="/updateStaffMiBaoYang",method=RequestMethod.POST)
	  @ResponseBody
	  public Integer updateStaffMiBaoYang(Staff staff) {
		  Integer updateStaffMiBaoYang = staffService.updateStaffMiBaoYang(staff);
		  System.out.println(updateStaffMiBaoYang);
		  return updateStaffMiBaoYang;
	  }
	  /**
	   * ���   ��ѯ�û��޸�����ʱ����ľ������Ƿ���ȷ
	   * @param staff
	   * @return
	   */
	  @RequestMapping(value="/selectStaffMiMaPassYang",method=RequestMethod.POST)
	  @ResponseBody
	  public Integer selectStaffMiMaPassYang(Integer Staff_ID,String Staff_Password) {
		  staff.setStaff_Password(MD5.MD5jia(Staff_Password));
		  staff.setStaff_ID(Staff_ID);
		  Integer selectStaffMiMaPasswordYang = staffService.selectStaffMiMaPasswordYang(staff);
		  return selectStaffMiMaPasswordYang;
	  }
	  /**
	   * ���    �޸�����
	   * @param staff
	   * @return
	   */
	  @RequestMapping(value="/updateStaffMiMaPassYang",method=RequestMethod.POST)
	  @ResponseBody
	  public Integer updateStaffMiMaPassYang(Integer Staff_ID,String Staff_Password) {
		  staff.setStaff_Password(MD5.MD5jia(Staff_Password));
		  staff.setStaff_ID(Staff_ID);
		  Integer updateStaffMiMaPasswordYang = staffService.updateStaffMiMaPasswordYang(staff);
		  return updateStaffMiMaPasswordYang;
	  }
	  /**
	   * YangChuanJin   ��ѯҪ��ӵ��û����Ƿ����
	   * @param Staff_Name
	   * @return
	   */
	  @RequestMapping(value="/selectStaffNamrYang",method=RequestMethod.POST)
	  @ResponseBody
	  public Integer selectStaffNamrYang(String Staff_Name) {
		  Integer selectStaffNameYang = staffService.selectStaffNameYang(Staff_Name);
		  return selectStaffNameYang;
	  }
}
