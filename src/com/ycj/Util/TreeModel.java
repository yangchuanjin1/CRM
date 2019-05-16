package com.ycj.Util;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class TreeModel {
    private int id;                              //id
    private String text;                      //��������                      //״̬ closed-����open-��
    private ArrayList<TreeModel> children;      //�ӽڵ㣬�ӽڵ���0��������������������                    //�㼶       ���㼶Ϊ1
    private boolean checked;
    private int m_parentid;                      //���ڵ�   ���ڵ�Ϊ0
    private String m_path;
	public TreeModel(int id, String text, ArrayList<TreeModel> children, Boolean checked, int m_parentid,
			String m_path) {
		super();
		this.id = id;
		this.text = text;
		this.children = children;
		this.checked = checked;
		this.m_parentid = m_parentid;
		this.m_path = m_path;
	}
	public TreeModel() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public ArrayList<TreeModel> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<TreeModel> children) {
		this.children = children;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public int getM_parentid() {
		return m_parentid;
	}
	public void setM_parentid(int m_parentid) {
		this.m_parentid = m_parentid;
	}
	public String getM_path() {
		return m_path;
	}
	public void setM_path(String m_path) {
		this.m_path = m_path;
	}
	@Override
	public String toString() {
		return "TreeModel [id=" + id + ", text=" + text + ", children=" + children + ", checked=" + checked
				+ ", m_parentid=" + m_parentid + ", m_path=" + m_path + "]";
	}
	
	
	
    
   
}

