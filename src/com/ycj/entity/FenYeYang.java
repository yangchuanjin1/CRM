package com.ycj.entity;

import java.util.List;

public class FenYeYang {
	private Integer page;
	private Integer pageSize;
	private List<?> rows;
	private Integer total;
	
	private String rolesName;
	
	private String staff_Name;
	private String minstaff_CreatTime;
	private String maxstaff_CreatTime;
	private String Staff_IsLockout;
	
	
	
	
	
	public String getStaff_Name() {
		return staff_Name;
	}
	public void setStaff_Name(String staff_Name) {
		this.staff_Name = staff_Name;
	}
	public String getMinstaff_CreatTime() {
		return minstaff_CreatTime;
	}
	public void setMinstaff_CreatTime(String minstaff_CreatTime) {
		this.minstaff_CreatTime = minstaff_CreatTime;
	}
	public String getMaxstaff_CreatTime() {
		return maxstaff_CreatTime;
	}
	public void setMaxstaff_CreatTime(String maxstaff_CreatTime) {
		this.maxstaff_CreatTime = maxstaff_CreatTime;
	}
	public String getStaff_IsLockout() {
		return Staff_IsLockout;
	}
	public void setStaff_IsLockout(String staff_IsLockout) {
		Staff_IsLockout = staff_IsLockout;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getRolesName() {
		return rolesName;
	}
	public void setRolesName(String rolesName) {
		this.rolesName = rolesName;
	}

}
