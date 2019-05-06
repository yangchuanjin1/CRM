package com.ycj.entity;
//客户流失表

import java.util.Date;

public class Cust_lost {
	private Integer Lost_ID;//客户流失编号
	private Integer Lost_cust_ID;//客户编号
	private Integer Lost_Staff_ID;//负责客户的员工
	private Date Lost_data;//客户流失时间
	private String Lost_delay;//采取的措施
	private String Lost_reson;//流失原因
	private String Lost_status;//客户流失状态（0.预警2.暂缓流失3.确认流失）
	public Integer getLost_ID() {
		return Lost_ID;
	}
	public void setLost_ID(Integer lost_ID) {
		Lost_ID = lost_ID;
	}
	public Integer getLost_cust_ID() {
		return Lost_cust_ID;
	}
	public void setLost_cust_ID(Integer lost_cust_ID) {
		Lost_cust_ID = lost_cust_ID;
	}
	public Integer getLost_Staff_ID() {
		return Lost_Staff_ID;
	}
	public void setLost_Staff_ID(Integer lost_Staff_ID) {
		Lost_Staff_ID = lost_Staff_ID;
	}
	public Date getLost_data() {
		return Lost_data;
	}
	public void setLost_data(Date lost_data) {
		Lost_data = lost_data;
	}
	public String getLost_delay() {
		return Lost_delay;
	}
	public void setLost_delay(String lost_delay) {
		Lost_delay = lost_delay;
	}
	public String getLost_reson() {
		return Lost_reson;
	}
	public void setLost_reson(String lost_reson) {
		Lost_reson = lost_reson;
	}
	public String getLost_status() {
		return Lost_status;
	}
	public void setLost_status(String lost_status) {
		Lost_status = lost_status;
	}
	

}
