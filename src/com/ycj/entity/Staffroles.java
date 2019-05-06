package com.ycj.entity;
//用户角色中间表
public class Staffroles {
	private Integer SR_ID;//编号
	private Integer SR_StaffID;//用户编号
	private Integer SR_RolesID;//角色编号
	public Integer getSR_ID() {
		return SR_ID;
	}
	public void setSR_ID(Integer sR_ID) {
		SR_ID = sR_ID;
	}
	public Integer getSR_StaffID() {
		return SR_StaffID;
	}
	public void setSR_StaffID(Integer sR_StaffID) {
		SR_StaffID = sR_StaffID;
	}
	public Integer getSR_RolesID() {
		return SR_RolesID;
	}
	public void setSR_RolesID(Integer sR_RolesID) {
		SR_RolesID = sR_RolesID;
	}
	

}
