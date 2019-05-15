package com.ycj.service;

import java.util.List;

import com.ycj.entity.Staff;

public interface LoginService {
	/**
	 * ��¼ҳ�棬�ж��û��Ƿ��½�ɹ���ҵ���ӿ�
	 * @param users �û���������
	 * @return
	 */
	Staff selectByCheckUsers(Staff staff);
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
