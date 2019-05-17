package com.ycj.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.StaffMapper;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenYeYang;
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
	  
	 /**
	  * ���  ��ҳ��������ѯ�������ݺͲ�ѯ������
	  */
		public FenYeYang selectStaffAllCountYang(FenYeYang fenYeYang) {
		  Integer selectStaffCountYang = staffMapper.selectStaffCountYang(fenYeYang);
		  List<Staff> selectStaffAllYang = staffMapper.selectStaffAllYang(fenYeYang);
		  fenYeYang.setTotal(selectStaffCountYang);
		  fenYeYang.setRows(selectStaffAllYang);
			return fenYeYang;
		}



	/**
	 * ���   ���
	 */
	public Integer insertStaffYang(Staff staff) {
		Integer insetStaffYang = staffMapper.insetStaffYang(staff);
		return insetStaffYang;
	}



	/**
	 * ���     �޸�
	 */
	public Integer updateStaffYang(Staff staff) {
		Integer updateStaffYang = staffMapper.updateStaffYang(staff);
		return updateStaffYang;
	}


	/**
	 * ���     �����û�
	 */
	public Integer updateStaffJieIsLockoutYang(Integer staffId) {
		Integer updateStaffJieIsLockoutYang = staffMapper.updateStaffJieIsLockoutYang(staffId);
		return updateStaffJieIsLockoutYang;
	}



	/**
	 * ���     �����û�
	 */
	public Integer updateStaffSuoIsLockoutYang(Integer staffId) {
		Integer updateStaffSuoIsLockoutYang = staffMapper.updateStaffSuoIsLockoutYang(staffId);
		return updateStaffSuoIsLockoutYang;
	}



	/**
	 * ���   �����ܱ�
	 */
	public Integer updateStaffMiBaoYang(Staff staff) {
		Integer updateStaffMiBaoYang = staffMapper.updateStaffMiBaoYang(staff);
		return updateStaffMiBaoYang;
	}



	/**
	 * ���   ��ѯ�޸�����ʱ����ľ������Ƿ���ȷ
	 */
	public Integer selectStaffMiMaPasswordYang(Staff staff) {
		Integer selectStaffMiMaPasswordYang = staffMapper.selectStaffMiMaPasswordYang(staff);
		return selectStaffMiMaPasswordYang;
	}



	/**
	 * ���    �޸�����
	 */
	public Integer updateStaffMiMaPasswordYang(Staff staff) {
		Integer updateStaffMiMaPasswordYang = staffMapper.updateStaffMiMaPasswordYang(staff);
		return updateStaffMiMaPasswordYang;
	}



	/**
	 * YangChuanJin   ��ѯҪ��ӵ��û����Ƿ����
	 */
	public Integer selectStaffNameYang(String Staff_Name) {
		Integer selectStaffNameYang = staffMapper.selectStaffNameYang(Staff_Name);
		return selectStaffNameYang;
	}



	/**
	 * YangChuanJin   ɾ���û�
	 */
	public Integer deleteStaff_IdYang(Integer Staff_ID) {
		Integer deleteStaff_IdYang = staffMapper.deleteStaff_IdYang(Staff_ID);
		return deleteStaff_IdYang;
	}



	/**
	 * YangChuanJin    ��ѯ������ѯʦ��Ա��
	 */
	public List<Staff> selectStaffAndAsker() {
		List<Staff> selectStaffAndAsker = staffMapper.selectStaffAndAsker();
		return selectStaffAndAsker;
	}
	  
	  

}
