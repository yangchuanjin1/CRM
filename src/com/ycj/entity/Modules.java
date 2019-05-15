package com.ycj.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//模块表
public class Modules {
	private Integer Modules_ID;//模块编号
	private String Modules_Name;//模块名称
	private Integer Modules_ParentId;//父模块名称
	private String Modules_Path;//模块路径
	private Integer Modules_Weight;//权重
	private String Modules_Ops;//预留字段
	private Integer Modules_Int0;//预留字段
	private Map<String, Object> attributes = new HashMap<String, Object>();// 添加到节点的自定义属性
    private List<Modules> children; //子节点数据
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
