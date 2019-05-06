package com.ycj.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Staff {
	private Integer Staff_ID;//编号，主键，不为空自增
	private String Staff_Name;//登录名称
	private String Staff_Password;//登录密码
	private String Staff_IsLockout;//是否锁定
	private String Staff_Time;//最后一次登录时间
	private String Staff_CreatTime;//账户创建时间
	private Integer Staff_PsdWrong;//密码错误次数
	private String Staff_LockTime;//被锁定的时间
	private String Staff_ProtectEmail;//密保邮箱
	private String Staff_ProtecMtel;//密保手机号
	private List<Roles> roles;
	public Integer getStaff_ID() {
		return Staff_ID;
	}
	public void setStaff_ID(Integer staff_ID) {
		Staff_ID = staff_ID;
	}
	public String getStaff_Name() {
		return Staff_Name;
	}
	public void setStaff_Name(String staff_Name) {
		Staff_Name = staff_Name;
	}
	public String getStaff_Password() {
		return Staff_Password;
	}
	public void setStaff_Password(String staff_Password) {
		Staff_Password = staff_Password;
	}
	public String getStaff_IsLockout() {
		return Staff_IsLockout;
	}
	public void setStaff_IsLockout(String staff_IsLockout) {
		Staff_IsLockout = staff_IsLockout;
	}
	public String getStaff_Time() {
		return Staff_Time;
	}
	public void setStaff_Time(String staff_Time) {
		Staff_Time = staff_Time;
	}
	public String getStaff_CreatTime() {
		return Staff_CreatTime;
	}
	public void setStaff_CreatTime(String staff_CreatTime) {
		Staff_CreatTime = staff_CreatTime;
	}
	public Integer getStaff_PsdWrong() {
		return Staff_PsdWrong;
	}
	public void setStaff_PsdWrong(Integer staff_PsdWrong) {
		Staff_PsdWrong = staff_PsdWrong;
	}
	public String getStaff_LockTime() {
		return Staff_LockTime;
	}
	public void setStaff_LockTime(String staff_LockTime) {
		Staff_LockTime = staff_LockTime;
	}
	public String getStaff_ProtectEmail() {
		return Staff_ProtectEmail;
	}
	public void setStaff_ProtectEmail(String staff_ProtectEmail) {
		Staff_ProtectEmail = staff_ProtectEmail;
	}
	public String getStaff_ProtecMtel() {
		return Staff_ProtecMtel;
	}
	public void setStaff_ProtecMtel(String staff_ProtecMtel) {
		Staff_ProtecMtel = staff_ProtecMtel;
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	
	

}
