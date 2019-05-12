package com.ycj.entity;

import java.util.Date;
//�ͻ���
public class Cust_customer {
	private Integer Cust_ID;//�ͻ����
	private String Cust_Name;//�ͻ�����
	private Integer Cust_Age;//�ͻ�����
	private String Cust_Gender;//�ͻ�����
	private String  Cust_Telephone;//�ͻ��绰
	private String Cust_Education;//�ͻ�ѧ��
	private String Cust_state;//�ͻ���ѧ��״̬����ѧ����ѧ��
	private String Cust_channel;//�ͻ�����Դ����
	private String Cust_website;//�ͻ�����Դ��վ
	private String Cust_QQ;//�ͻ�QQ
	private String Cust_WeChat;//�ͻ�΢�ź�
	private String Cust_mailbox;//�ͻ�����
	private Date Cust_Creationtime;//�ͻ�������ʱ��
	private String Cust_Course;//�ͻ��Ŀγ̷���
	private Integer Cust_Scoring;//�ͻ�������
	private String Cust_Revisit;//�Ƿ�طã�0.δ�ط�1.�طã�
	private Date Cust_RevisitDays;//�ط�ʱ��
	private String Cust_Door;//�Ƿ����ţ�0.����1.δ���ţ�
	private Date Cust_Doortime;//����ʱ��
	private String Cust_Pay;//�Ƿ�ɷѣ�0.�ɷ�1.δ���ѣ�
	private Date Cust_Paytime;//�ɷ�ʱ��
	private Double Cust_money;//�ɷѽ��
	private String Cust_Refund;//�Ƿ��˷ѣ�0.��1.��
	private String Cust_Refundreason;//�˷�ԭ��
	private String Cust_entry;//�Ƿ���ࣨ0.��1.��
	private Date Cust_entrytime;//����ʱ��
	private String Cust_notes;//���౸ע
	private String Cust_Region;//�ͻ����ڵ���
	private String Cust_preparation;//�Ƿ񱨱���0.��1.��
	private Integer Cust_Asker_ID;//��ѯʦ���
	
	
	private Cust_customer cust_customer;
	private Integer page;
	private Integer rows;
	
	public Cust_customer getCust_customer() {
		return cust_customer;
	}
	public void setCust_customer(Cust_customer cust_customer) {
		this.cust_customer = cust_customer;
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
	}
	public Integer getCust_ID() {
		return Cust_ID;
	}
	public void setCust_ID(Integer cust_ID) {
		Cust_ID = cust_ID;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public Integer getCust_Age() {
		return Cust_Age;
	}
	public void setCust_Age(Integer cust_Age) {
		Cust_Age = cust_Age;
	}
	public String getCust_Gender() {
		return Cust_Gender;
	}
	public void setCust_Gender(String cust_Gender) {
		Cust_Gender = cust_Gender;
	}
	public String getCust_Telephone() {
		return Cust_Telephone;
	}
	public void setCust_Telephone(String cust_Telephone) {
		Cust_Telephone = cust_Telephone;
	}
	public String getCust_Education() {
		return Cust_Education;
	}
	public void setCust_Education(String cust_Education) {
		Cust_Education = cust_Education;
	}
	public String getCust_state() {
		return Cust_state;
	}
	public void setCust_state(String cust_state) {
		Cust_state = cust_state;
	}
	public String getCust_channel() {
		return Cust_channel;
	}
	public void setCust_channel(String cust_channel) {
		Cust_channel = cust_channel;
	}
	public String getCust_website() {
		return Cust_website;
	}
	public void setCust_website(String cust_website) {
		Cust_website = cust_website;
	}
	public String getCust_QQ() {
		return Cust_QQ;
	}
	public void setCust_QQ(String cust_QQ) {
		Cust_QQ = cust_QQ;
	}
	public String getCust_WeChat() {
		return Cust_WeChat;
	}
	public void setCust_WeChat(String cust_WeChat) {
		Cust_WeChat = cust_WeChat;
	}
	public String getCust_mailbox() {
		return Cust_mailbox;
	}
	public void setCust_mailbox(String cust_mailbox) {
		Cust_mailbox = cust_mailbox;
	}
	public Date getCust_Creationtime() {
		return Cust_Creationtime;
	}
	public void setCust_Creationtime(Date cust_Creationtime) {
		Cust_Creationtime = cust_Creationtime;
	}
	public String getCust_Course() {
		return Cust_Course;
	}
	public void setCust_Course(String cust_Course) {
		Cust_Course = cust_Course;
	}
	public Integer getCust_Scoring() {
		return Cust_Scoring;
	}
	public void setCust_Scoring(Integer cust_Scoring) {
		Cust_Scoring = cust_Scoring;
	}
	public String getCust_Revisit() {
		return Cust_Revisit;
	}
	public void setCust_Revisit(String cust_Revisit) {
		Cust_Revisit = cust_Revisit;
	}
	public Date getCust_RevisitDays() {
		return Cust_RevisitDays;
	}
	public void setCust_RevisitDays(Date cust_RevisitDays) {
		Cust_RevisitDays = cust_RevisitDays;
	}
	public String getCust_Door() {
		return Cust_Door;
	}
	public void setCust_Door(String cust_Door) {
		Cust_Door = cust_Door;
	}
	public Date getCust_Doortime() {
		return Cust_Doortime;
	}
	public void setCust_Doortime(Date cust_Doortime) {
		Cust_Doortime = cust_Doortime;
	}
	public String getCust_Pay() {
		return Cust_Pay;
	}
	public void setCust_Pay(String cust_Pay) {
		Cust_Pay = cust_Pay;
	}
	public Date getCust_Paytime() {
		return Cust_Paytime;
	}
	public void setCust_Paytime(Date cust_Paytime) {
		Cust_Paytime = cust_Paytime;
	}
	public Double getCust_money() {
		return Cust_money;
	}
	public void setCust_money(Double cust_money) {
		Cust_money = cust_money;
	}
	public String getCust_Refund() {
		return Cust_Refund;
	}
	public void setCust_Refund(String cust_Refund) {
		Cust_Refund = cust_Refund;
	}
	public String getCust_Refundreason() {
		return Cust_Refundreason;
	}
	public void setCust_Refundreason(String cust_Refundreason) {
		Cust_Refundreason = cust_Refundreason;
	}
	public String getCust_entry() {
		return Cust_entry;
	}
	public void setCust_entry(String cust_entry) {
		Cust_entry = cust_entry;
	}
	public Date getCust_entrytime() {
		return Cust_entrytime;
	}
	public void setCust_entrytime(Date cust_entrytime) {
		Cust_entrytime = cust_entrytime;
	}
	public String getCust_notes() {
		return Cust_notes;
	}
	public void setCust_notes(String cust_notes) {
		Cust_notes = cust_notes;
	}
	public String getCust_Region() {
		return Cust_Region;
	}
	public void setCust_Region(String cust_Region) {
		Cust_Region = cust_Region;
	}
	public String getCust_preparation() {
		return Cust_preparation;
	}
	public void setCust_preparation(String cust_preparation) {
		Cust_preparation = cust_preparation;
	}
	public Integer getCust_Asker_ID() {
		return Cust_Asker_ID;
	}
	public void setCust_Asker_ID(Integer cust_Asker_ID) {
		Cust_Asker_ID = cust_Asker_ID;
	}
	

}
