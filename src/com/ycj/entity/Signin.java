package com.ycj.entity;
//签锟斤拷锟斤拷



public class Signin {
	private Integer signIn_ID;//签锟斤拷锟斤拷锟�
	private String SignIn_date;//签锟斤拷时锟斤拷
	private String Back_date;//签锟斤拷时锟斤拷
	private Integer Sign_StaffID;//员锟斤拷锟斤拷锟�
	private Integer Signln_status;
	/*维护的员工对象*/
	private Staff staff;
	
	private String sSignIn_date;//签锟斤拷时锟斤拷
	private String eSignIn_date;//签锟斤拷时锟斤拷
	
	private String sBack_date;//签锟斤拷时锟斤拷
	private String eBack_date;//签锟斤拷时锟斤拷
	
	
	public String getsSignIn_date() {
		return sSignIn_date;
	}
	public void setsSignIn_date(String sSignIn_date) {
		this.sSignIn_date = sSignIn_date;
	}
	public String geteSignIn_date() {
		return eSignIn_date;
	}
	public void seteSignIn_date(String eSignIn_date) {
		this.eSignIn_date = eSignIn_date;
	}
	public String getsBack_date() {
		return sBack_date;
	}
	public void setsBack_date(String sBack_date) {
		this.sBack_date = sBack_date;
	}
	public String geteBack_date() {
		return eBack_date;
	}
	public void seteBack_date(String eBack_date) {
		this.eBack_date = eBack_date;
	}
	public Integer getSignln_status() {
		return Signln_status;
	}
	public void setSignln_status(Integer signln_status) {
		Signln_status = signln_status;
	}
	public Integer getSignIn_ID() {
		return signIn_ID;
	}
	public void setSignIn_ID(Integer signIn_ID) {
		this.signIn_ID = signIn_ID;
	}
	
	public String getSignIn_date() {
		return SignIn_date;
	}
	public void setSignIn_date(String signIn_date) {
		SignIn_date = signIn_date;
	}
	public String getBack_date() {
		return Back_date;
	}
	public void setBack_date(String back_date) {
		Back_date = back_date;
	}
	public Integer getSign_StaffID() {
		return Sign_StaffID;
	}
	public void setSign_StaffID(Integer sign_StaffID) {
		Sign_StaffID = sign_StaffID;
	}
	
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	@Override
	public String toString() {
		return "Signin [signIn_ID=" + signIn_ID + ", SignIn_date=" + SignIn_date + ", Back_date=" + Back_date
				+ ", Sign_StaffID=" + Sign_StaffID + ", Signln_status=" + Signln_status + ", sSignIn_date="
				+ sSignIn_date + ", eSignIn_date=" + eSignIn_date + ", sBack_date=" + sBack_date + ", eBack_date="
				+ eBack_date + "]";
	}
	

}
