package com.ycj.dao;

import java.util.List;

import com.ycj.entity.Roles;
import com.ycj.entity.Staff;
import com.ycj.entity.Staffroles;

public interface StaffMapper {
	/**
	 * �û���¼ʱ�������û����û�����������в���
	 * @param users  ��ѯ����
	 * @return ��������û�����Ϣ
	 */
	
	  Staff selectByCheckStaff(Staff Staff);
	  
	  List<Roles> seleRoles();
	  
	  List<Staff> selectStaffs(Staff staff);
	  
	  int selectCount(Staff staff);
	  
	/*
	 * int insertStaff(Staff staff); Integer insertRole(Staffroles staffroles); int
	 * updateStaff(Staff staff);
	 * 
	 * int deleteStaff(int Staff_ID);
	 */
	 
}
