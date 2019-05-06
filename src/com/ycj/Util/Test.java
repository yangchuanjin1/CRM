package com.ycj.Util;

import java.util.List;

import com.ycj.entity.Staff;
import com.ycj.service.UsersService;
import com.ycj.service.UsersServiceImp;

public class Test {
	public static void main(String[] args) {
		UsersService service=new UsersServiceImp();
		Staff users=new Staff();
		users.setStaff_Name("Ñî´«½õ");
		users.setStaff_Password("123456");
		Staff selectByCheckUsers = service.selectByCheckUsers(users);
		System.out.println(selectByCheckUsers);
	}

}
