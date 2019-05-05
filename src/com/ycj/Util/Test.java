package com.ycj.Util;

import java.util.List;

import com.ycj.entity.Users;
import com.ycj.service.UsersService;
import com.ycj.service.UsersServiceImp;

public class Test {
	public static void main(String[] args) {
		UsersService service=new UsersServiceImp();
		Users users=new Users();
		users.setLoginName("Ñî´«½õ");
		users.setPasswords("123456");
		Users selectByCheckUsers = service.selectByCheckUsers(users);
		System.out.println(selectByCheckUsers);
	}

}
