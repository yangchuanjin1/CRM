package com.ycj.dao;

import java.util.List;

import com.ycj.entity.Staff;

public interface UsersMapper {
	/**
	 * �û���¼ʱ�������û����û�����������в���
	 * @param users  ��ѯ����
	 * @return ��������û�����Ϣ
	 */
	Staff selectByCheckUsers(Staff users);

}
