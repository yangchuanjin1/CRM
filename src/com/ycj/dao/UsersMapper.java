package com.ycj.dao;

import java.util.List;

import com.ycj.entity.Users;

public interface UsersMapper {
	/**
	 * �û���¼ʱ�������û����û�����������в���
	 * @param users  ��ѯ����
	 * @return ��������û�����Ϣ
	 */
	Users selectByCheckUsers(Users users);

}
