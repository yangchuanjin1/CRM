package com.ycj.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ģ���
public class Modules {
	private Integer Modules_ID;//ģ����
	private String Modules_Name;//ģ������
	private Integer Modules_ParentId;//��ģ������
	private String Modules_Path;//ģ��·��
	private Integer Modules_Weight;//Ȩ��
	private String Modules_Ops;//Ԥ���ֶ�
	private Integer Modules_Int0;//Ԥ���ֶ�
	private Map<String, Object> attributes = new HashMap<String, Object>();// ��ӵ��ڵ���Զ�������
    private List<Modules> children; //�ӽڵ�����
    private boolean check;
	public Map<String, Object> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	public List<Modules> getChildren() {
		return children;
	}
	public void setChildren(List<Modules> children) {
		this.children = children;
	}
	public Integer getModules_ID() {
		return Modules_ID;
	}
	public void setModules_ID(Integer modules_ID) {
		Modules_ID = modules_ID;
	}
	public String getModules_Name() {
		return Modules_Name;
	}
	public void setModules_Name(String modules_Name) {
		Modules_Name = modules_Name;
	}
	public Integer getModules_ParentId() {
		return Modules_ParentId;
	}
	public void setModules_ParentId(Integer modules_ParentId) {
		Modules_ParentId = modules_ParentId;
	}
	public String getModules_Path() {
		return Modules_Path;
	}
	public void setModules_Path(String modules_Path) {
		Modules_Path = modules_Path;
	}
	public Integer getModules_Weight() {
		return Modules_Weight;
	}
	public void setModules_Weight(Integer modules_Weight) {
		Modules_Weight = modules_Weight;
	}
	public String getModules_Ops() {
		return Modules_Ops;
	}
	public void setModules_Ops(String modules_Ops) {
		Modules_Ops = modules_Ops;
	}
	public Integer getModules_Int0() {
		return Modules_Int0;
	}
	public void setModules_Int0(Integer modules_Int0) {
		Modules_Int0 = modules_Int0;
	}
	
	
	public boolean getCheck() {
		return check;
	}
	public void setCheck(boolean b) {
		this.check = b;
	}
	@Override
	public String toString() {
		return "Modules [Modules_ID=" + Modules_ID + ", Modules_Name=" + Modules_Name + ", Modules_ParentId="
				+ Modules_ParentId + ", Modules_Path=" + Modules_Path + ", Modules_Weight=" + Modules_Weight
				+ ", Modules_Ops=" + Modules_Ops + ", Modules_Int0=" + Modules_Int0 + ", attributes=" + attributes
				+ ", children=" + children + "]";
	}
	

}
