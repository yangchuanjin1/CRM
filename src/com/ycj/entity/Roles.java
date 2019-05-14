package com.ycj.entity;


import org.springframework.stereotype.Component;
//��ɫ��
@Component
public class Roles {
	private Integer RolesId;
	private String RolesName;
	private Staff staffs;
	private Staffroles staffroles;
	
	public Staffroles getStaffroles() {
		return staffroles;
	}
	public void setStaffroles(Staffroles staffroles) {
		this.staffroles = staffroles;
	}
	private Integer page;
	private Integer rows;
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	public Staff getStaffs() {
		return staffs;
	}
	public void setStaffs(Staff staffs) {
		this.staffs = staffs;
	}
	public Integer getRolesId() {
		return RolesId;
	}
	public void setRolesId(Integer rolesId) {
		RolesId = rolesId;
	}
	public String getRolesName() {
		return RolesName;
	}
	public void setRolesName(String rolesName) {
		RolesName = rolesName;
	}
	@Override
	public String toString() {
		return "Roles [RolesId=" + RolesId + ", RolesName=" + RolesName + "]";
	}
	

}
