package com.ycj.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class FenYe<T> {
	
   private Integer page;
   private Integer pagesize;
   private Integer total;
   private List<T> rows;
   
   private Cust_customer cust_customer ;
   
   
   private String minCust_Creationtime;//客户创建的时间
   private String maxCust_Creationtime;//客户创建的时间
   
   private String minCust_RevisitDays;//回访时间
	private String maxCust_RevisitDays;//回访时间
	
	private String minCust_Doortime;//上门时间
	private String maxCust_Doortime;//上门时间
	
	private String minCust_Paytime;//缴费时间
	private String maxCust_Paytime;//缴费时间
	
	private String minCust_entrytime;//进班时间
	private String maxCust_entrytime;//进班时间
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public String getMinCust_Creationtime() {
		return minCust_Creationtime;
	}
	public void setMinCust_Creationtime(String minCust_Creationtime) {
		this.minCust_Creationtime = minCust_Creationtime;
	}
	public String getMaxCust_Creationtime() {
		return maxCust_Creationtime;
	}
	public void setMaxCust_Creationtime(String maxCust_Creationtime) {
		this.maxCust_Creationtime = maxCust_Creationtime;
	}
	public String getMinCust_RevisitDays() {
		return minCust_RevisitDays;
	}
	public void setMinCust_RevisitDays(String minCust_RevisitDays) {
		this.minCust_RevisitDays = minCust_RevisitDays;
	}
	public String getMaxCust_RevisitDays() {
		return maxCust_RevisitDays;
	}
	public void setMaxCust_RevisitDays(String maxCust_RevisitDays) {
		this.maxCust_RevisitDays = maxCust_RevisitDays;
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
	public String getMinCust_Paytime() {
		return minCust_Paytime;
	}
	public void setMinCust_Paytime(String minCust_Paytime) {
		this.minCust_Paytime = minCust_Paytime;
	}
	public String getMaxCust_Paytime() {
		return maxCust_Paytime;
	}
	public void setMaxCust_Paytime(String maxCust_Paytime) {
		this.maxCust_Paytime = maxCust_Paytime;
	}
	public String getMinCust_entrytime() {
		return minCust_entrytime;
	}
	public void setMinCust_entrytime(String minCust_entrytime) {
		this.minCust_entrytime = minCust_entrytime;
	}
	public String getMaxCust_entrytime() {
		return maxCust_entrytime;
	}
	public void setMaxCust_entrytime(String maxCust_entrytime) {
		this.maxCust_entrytime = maxCust_entrytime;
	}
	
	public Cust_customer getCust_customer() {
		return cust_customer;
	}
	public void setCust_customer(Cust_customer cust_customer) {
		this.cust_customer = cust_customer;
	}
	@Override
	public String toString() {
		return "FenYe [page=" + page + ", pagesize=" + pagesize + ", total=" + total + ", rows=" + rows
				+ ", cust_customer=" + cust_customer + ", minCust_Creationtime=" + minCust_Creationtime
				+ ", maxCust_Creationtime=" + maxCust_Creationtime + ", minCust_RevisitDays=" + minCust_RevisitDays
				+ ", maxCust_RevisitDays=" + maxCust_RevisitDays + ", minCust_Doortime=" + minCust_Doortime
				+ ", maxCust_Doortime=" + maxCust_Doortime + ", minCust_Paytime=" + minCust_Paytime
				+ ", maxCust_Paytime=" + maxCust_Paytime + ", minCust_entrytime=" + minCust_entrytime
				+ ", maxCust_entrytime=" + maxCust_entrytime + "]";
	}
	
   
    
   
   
}
