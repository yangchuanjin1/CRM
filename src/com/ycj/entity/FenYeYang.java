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
	
//	签到查询条件

	private Integer signln_status;
	private String sBack_date;
	private String eBack_date;
	private String sSignIn_date;
	private String eSignIn_date;
	
	
	
	private String zixunshiName;
	
	
	
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
	public Integer getSignln_status() {
		return signln_status;
	}
	public void setSignln_status(Integer signln_status) {
		this.signln_status = signln_status;
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
	public String getZixunshiName() {
		return zixunshiName;
	}
	public void setZixunshiName(String zixunshiName) {
		this.zixunshiName = zixunshiName;
	}

	
}
