package com.ycj.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Staff {
	private Integer Staff_ID;//��ţ���������Ϊ������
	private String Staff_Name;//��¼����
	private String Staff_Password;//��¼����
	private String Staff_IsLockout;//�Ƿ�����
	private String Staff_Time;//���һ�ε�¼ʱ��
	private String Staff_CreatTime;//�˻�����ʱ��
	private Integer Staff_PsdWrong;//����������
	private String Staff_LockTime;//��������ʱ��
	private String Staff_ProtectEmail;//�ܱ�����
	private String Staff_ProtecMtel;//�ܱ��ֻ���
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
