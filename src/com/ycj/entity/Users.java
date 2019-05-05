package com.ycj.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Users {
	private Integer UsersID;
	private String LoginName;
	private String Passwords;
	private Integer IsLockout;
	private String LastLoginTime;
	private Integer PsdWrongTime;
	private String LockTime;
	private String ProtectEMail;
	private String ProtectMtel;
	private List<Roles> roles;
	public Integer getUsersID() {
		return UsersID;
	}
	public void setUsersID(Integer usersID) {
		UsersID = usersID;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	public String getPasswords() {
		return Passwords;
	}
	
	public void setPasswords(String passwords) {
		Passwords = passwords;
	}
	public Integer getIsLockout() {
		return IsLockout;
	}
	public void setIsLockout(Integer isLockout) {
		IsLockout = isLockout;
	}
	public String getLastLoginTime() {
		return LastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		LastLoginTime = lastLoginTime;
	}
	public Integer getPsdWrongTime() {
		return PsdWrongTime;
	}
	public void setPsdWrongTime(Integer psdWrongTime) {
		PsdWrongTime = psdWrongTime;
	}
	public String getLockTime() {
		return LockTime;
	}
	public void setLockTime(String lockTime) {
		LockTime = lockTime;
	}
	public String getProtectEMail() {
		return ProtectEMail;
	}
	public void setProtectEMail(String protectEMail) {
		ProtectEMail = protectEMail;
	}
	public String getProtectMtel() {
		return ProtectMtel;
	}
	public void setProtectMtel(String protectMtel) {
		ProtectMtel = protectMtel;
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Users [UsersID=" + UsersID + ", LoginName=" + LoginName + ", Passwords=" + Passwords + ", IsLockout="
				+ IsLockout + ", LastLoginTime=" + LastLoginTime + ", PsdWrongTime=" + PsdWrongTime + ", LockTime="
				+ LockTime + ", ProtectEMail=" + ProtectEMail + ", ProtectMtel=" + ProtectMtel + ", roles=" + roles
				+ "]";
	}
	

}
