package com.ycj.entity;

import java.util.Date;
//������¼��
public class Communicate_record {
	private Integer Comm_ID;//��¼���
	private Integer Comm_cust_ID;//�ͻ����
	private Integer Comm_Staff_ID;//Ա�����
	private Date Comm_date;//������ʱ��
	private String Comm_way;//������ʱ��
	private String comm_title;//���ݸ�Ҫ
	private String comm_detail;//������ϸ��Ϣ
	private String comm_nextdate;
	
	
	public String getComm_nextdate() {
		return comm_nextdate;
	}
	public void setComm_nextdate(String comm_nextdate) {
		this.comm_nextdate = comm_nextdate;
	}
	public Integer getComm_ID() {
		return Comm_ID;
	}
	public void setComm_ID(Integer comm_ID) {
		Comm_ID = comm_ID;
	}
	public Integer getComm_cust_ID() {
		return Comm_cust_ID;
	}
	public void setComm_cust_ID(Integer comm_cust_ID) {
		Comm_cust_ID = comm_cust_ID;
	}
	public Integer getComm_Staff_ID() {
		return Comm_Staff_ID;
	}
	public void setComm_Staff_ID(Integer comm_Staff_ID) {
		Comm_Staff_ID = comm_Staff_ID;
	}
	public Date getComm_date() {
		return Comm_date;
	}
	public void setComm_date(Date comm_date) {
		Comm_date = comm_date;
	}
	public String getComm_way() {
		return Comm_way;
	}
	public void setComm_way(String comm_way) {
		Comm_way = comm_way;
	}
	public String getComm_title() {
		return comm_title;
	}
	public void setComm_title(String comm_title) {
		this.comm_title = comm_title;
	}
	public String getComm_detail() {
		return comm_detail;
	}
	public void setComm_detail(String comm_detail) {
		this.comm_detail = comm_detail;
	}
	

}
