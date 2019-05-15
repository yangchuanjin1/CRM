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
	 * ��ѯ�û����Ƿ���ȷ
	 * @param Staff_name
	 * @return
	 */
	Staff selectByStaff_Name(String Staff_name);
	/**
	 * ��ѯ�����Ƿ���ȷ
	 * @param Staff_password
	 * @return
	 */
	Staff selectByStaff_password(String Staff_password);
	/**
	 * �޸Ĵ������
	 * @return
	 */
	Integer updateByStaff_PsdWrong(String Staff_name);
	/**
	 * �޸ĵ�¼ʱ��
	 * @return
	 */
	Integer updateByStaff_Time(Integer staff_id);
}
