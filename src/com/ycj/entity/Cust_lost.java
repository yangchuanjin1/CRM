package com.ycj.entity;
//�ͻ���ʧ��

import java.util.Date;

public class Cust_lost {
	private Integer Lost_ID;//�ͻ���ʧ���
	private Integer Lost_cust_ID;//�ͻ����
	private Integer Lost_Staff_ID;//����ͻ���Ա��
	private Date Lost_data;//�ͻ���ʧʱ��
	private String Lost_delay;//��ȡ�Ĵ�ʩ
	private String Lost_reson;//��ʧԭ��
	private String Lost_status;//�ͻ���ʧ״̬��0.Ԥ��2.�ݻ���ʧ3.ȷ����ʧ��
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
