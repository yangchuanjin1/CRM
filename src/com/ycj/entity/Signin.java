package com.ycj.entity;
//ǩ����

import java.util.Date;

public class Signin {
	private Integer signIn_ID;//ǩ�����
	private Date SignIn_date;//ǩ��ʱ��
	private Date Back_date;//ǩ��ʱ��
	private Integer Sign_StaffID;//Ա�����
	public Integer getSignIn_ID() {
		return signIn_ID;
	}
	public void setSignIn_ID(Integer signIn_ID) {
		this.signIn_ID = signIn_ID;
	}
	public Date getSignIn_date() {
		return SignIn_date;
	}
	public void setSignIn_date(Date signIn_date) {
		SignIn_date = signIn_date;
	}
	public Date getBack_date() {
		return Back_date;
	}
	public void setBack_date(Date back_date) {
		Back_date = back_date;
	}
	public Integer getSign_StaffID() {
		return Sign_StaffID;
	}
	public void setSign_StaffID(Integer sign_StaffID) {
		Sign_StaffID = sign_StaffID;
	}
	

}
