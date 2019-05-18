package com.ycj.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class FenyeJiang {

	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<Cust_customer> rows;
	private String Cust_Name;
	private String Cust_Telephone;
	private String Cust_QQ;
	private String minCust_Doortime;//开始上门时间
	private String maxCust_Doortime;//结束上门时间
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
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<Cust_customer> getRows() {
		return rows;
	}
	public void setRows(List<Cust_customer> rows) {
		this.rows = rows;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public String getCust_Telephone() {
		return Cust_Telephone;
	}
	public void setCust_Telephone(String cust_Telephone) {
		Cust_Telephone = cust_Telephone;
	}
	
	public String getMinCust_Doortime() {
		return minCust_Doortime;
	}
	public void setMinCust_Doortime(String minCust_Doortime) {
		this.minCust_Doortime = minCust_Doortime;
	}
	public String getMaxCust_Doortime() {
		return maxCust_Doortime;
	}
	public void setMaxCust_Doortime(String maxCust_Doortime) {
		this.maxCust_Doortime = maxCust_Doortime;
	}
	public String getCust_QQ() {
		return Cust_QQ;
	}
	public void setCust_QQ(String cust_QQ) {
		Cust_QQ = cust_QQ;
	}
	
}
