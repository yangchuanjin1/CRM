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

}
