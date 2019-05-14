package com.ycj.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.StaffMapper;
import com.ycj.entity.FenYe;
import com.ycj.entity.Roles;
import com.ycj.entity.Staff;
import com.ycj.entity.Staffroles;
@Service
public class StaffServiceImpl implements StaffService{
	@Resource
    private StaffMapper staffMapper;
	@Autowired
    private FenYe<Staff> fenYe;
	
	  @Override public FenYe<Staff> selectStaffs(Staff staff) {
	  staff.setPage((staff.getPage()-1)*staff.getRows());
	  staff.setRows(staff.getRows()); List<Staff> selectStaffs =
	  staffMapper.selectStaffs(staff); int selectCount =
	  staffMapper.selectCount(staff);
	  fenYe.setTotal(selectCount);
	  fenYe.setRows(selectStaffs); return fenYe; }
	  
	/*
	 * @Override public List<Roles> seleRoles() {
	 * System.out.println("service"+staffMapper.seleRoles()); return
	 * staffMapper.seleRoles(); }
	 * 
	 * @Override public int insertStaff(Staff staff) { // TODO Auto-generated method
	 * stub return staffMapper.insertStaff(staff); }
	 * 
	 * @Override public int updateStaff(Staff staff) { // TODO Auto-generated method
	 * stub return staffMapper.updateStaff(staff); }
	 * 
	 * @Override public int deleteStaff(int Staff_ID) { // TODO Auto-generated
	 * method stub return staffMapper.deleteStaff(Staff_ID); }
	 * 
	 * @Override public Integer insertRole(Staffroles staffroles) { // TODO
	 * Auto-generated method stub return staffMapper.insertRole(staffroles); }
	 * 
	 */

}
