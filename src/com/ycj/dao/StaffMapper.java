package com.ycj.dao;

import com.ycj.entity.Staff;

public interface StaffMapper {
	/**
	 * �û���¼ʱ�������û����û�����������в���
	 * @param users  ��ѯ����
	 * @return ��������û�����Ϣ
	 */
	Staff selectByCheckStaff(Staff Staff);

}
