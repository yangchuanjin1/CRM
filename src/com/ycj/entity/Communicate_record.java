package com.ycj.entity;

<<<<<<< HEAD

import org.springframework.stereotype.Component;
//������¼��
@Component
=======
import java.util.Date;
//������¼��
>>>>>>> 27dbf327342df5ddfb0f0ed6029a0962ebd05633
public class Communicate_record {
	private Integer Comm_ID;//��¼���
	private Integer Comm_cust_ID;//�ͻ����
	private Integer Comm_Staff_ID;//Ա�����
<<<<<<< HEAD
	private String  Comm_date;//������ʱ��
	private Integer Comm_way;//������ʱ��
	private String comm_title;//���ݸ�Ҫ
	private String comm_detail;//������ϸ��Ϣ
    private Integer comm_huifang;
    
    private String comm_endData;
    
    private String scomm_endData;
	private String ecomm_endData;
	private String sComm_date;
	private String eComm_date;
	
	private Integer page;
	private Integer rows;
	
	
	
	public String getComm_endData() {
		return comm_endData;
	}
	public void setComm_endData(String comm_endData) {
		this.comm_endData = comm_endData;
	}
	public String getScomm_endData() {
		return scomm_endData;
	}
	public void setScomm_endData(String scomm_endData) {
		this.scomm_endData = scomm_endData;
	}
	public String getEcomm_endData() {
		return ecomm_endData;
	}
	public void setEcomm_endData(String ecomm_endData) {
		this.ecomm_endData = ecomm_endData;
	}
	public Integer getComm_huifang() {
		return comm_huifang;
	}
	public void setComm_huifang(Integer comm_huifang) {
		this.comm_huifang = comm_huifang;
	}
	private Staff staff;
	private Cust_customer cust_customer;
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Cust_customer getCust_customer() {
		return cust_customer;
	}
	public void setCust_customer(Cust_customer cust_customer) {
		this.cust_customer = cust_customer;
	}
	
	
	
	public String getComm_date() {
		return Comm_date;
	}
	public void setComm_date(String comm_date) {
		Comm_date = comm_date;
	}
	public String getsComm_date() {
		return sComm_date;
	}
	public void setsComm_date(String sComm_date) {
		this.sComm_date = sComm_date;
	}
	public String geteComm_date() {
		return eComm_date;
	}
	public void seteComm_date(String eComm_date) {
		this.eComm_date = eComm_date;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
=======
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
>>>>>>> 27dbf327342df5ddfb0f0ed6029a0962ebd05633
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
	
	public Integer getComm_way() {
		return Comm_way;
	}
	public void setComm_way(Integer comm_way) {
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
