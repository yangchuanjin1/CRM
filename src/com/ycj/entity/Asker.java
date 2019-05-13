package com.ycj.entity;

import org.springframework.stereotype.Component;

//��ѯʦ��
@Component
public class Asker {
	private Integer Asker_ID;//��ѯʦ���
	private String Asker_Name;//��ѯʦ����
	private Integer Asker_Staff_ID;//Ա�����
	private Integer Asker_Weight;//Ȩ��
	private Staff staff;//员工
	
	public Integer getAsker_ID() {
		return Asker_ID;
	}
	public void setAsker_ID(Integer asker_ID) {
		Asker_ID = asker_ID;
	}
	public String getAsker_Name() {
		return Asker_Name;
	}
	public void setAsker_Name(String asker_Name) {
		Asker_Name = asker_Name;
	}
	public Integer getAsker_Staff_ID() {
		return Asker_Staff_ID;
	}
	public void setAsker_Staff_ID(Integer asker_Staff_ID) {
		Asker_Staff_ID = asker_Staff_ID;
	}
	public Integer getAsker_Weight() {
		return Asker_Weight;
	}
	public void setAsker_Weight(Integer asker_Weight) {
		Asker_Weight = asker_Weight;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	

}
