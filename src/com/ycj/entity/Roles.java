package com.ycj.entity;

import org.springframework.stereotype.Component;
//½ÇÉ«±í
@Component
public class Roles {
	private Integer RolesId;
	private String RolesName;
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
