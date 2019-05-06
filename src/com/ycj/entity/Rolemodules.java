package com.ycj.entity;
//模块和角色中间表
public class Rolemodules {
	private Integer RM_ID;//编号
	private Integer RM_RolesID;//角色编号
	private Integer RM_ModulesID;//功能模块编号
	public Integer getRM_ID() {
		return RM_ID;
	}
	public void setRM_ID(Integer rM_ID) {
		RM_ID = rM_ID;
	}
	public Integer getRM_RolesID() {
		return RM_RolesID;
	}
	public void setRM_RolesID(Integer rM_RolesID) {
		RM_RolesID = rM_RolesID;
	}
	public Integer getRM_ModulesID() {
		return RM_ModulesID;
	}
	public void setRM_ModulesID(Integer rM_ModulesID) {
		RM_ModulesID = rM_ModulesID;
	}
	

}
