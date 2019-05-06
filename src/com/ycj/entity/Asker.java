package com.ycj.entity;
//咨询师表
public class Asker {
	private Integer Asker_ID;//咨询师编号
	private String Asker_Name;//咨询师名称
	private Integer Asker_Staff_ID;//员工编号
	private Integer Asker_Weight;//权重
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
	

}
