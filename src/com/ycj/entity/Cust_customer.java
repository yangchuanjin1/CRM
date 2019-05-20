package com.ycj.entity;

import java.util.Date;

import org.springframework.stereotype.Component;
//锟酵伙拷锟斤拷
@Component
public class Cust_customer {
	private Integer Cust_ID;//客户编号
	private String Cust_Name;//客户名称
	private Integer Cust_Age;//客户年龄
	private String Cust_Gender;//客户（男女）1
	private String  Cust_Telephone;//客户电话
	private String Cust_Education;//客户学历(未知，大专，高中，中专，初中，本科，其它)
	private String Cust_state;//客户状态（上学、下学）
	private String Cust_channel;//客户来源渠道
	private String Cust_website;//客户来源网站（其它，职英B站，高考站，职英A站）
	private String Cust_QQ;//客户QQ
	private String Cust_WeChat;//客户微信
	private String Cust_mailbox;//客户邮箱
	private String Cust_Creationtime;//客户创建的时间
	
	private String Cust_Course;//课程方向
	private Integer Cust_Scoring;//客户的质量
	private Integer Cust_Revisit;//是否回访（0.未回访1.回访）
	private String Cust_RevisitDays;//回访时间
	
	private Integer Cust_Door;//是否上门（0.上门1.未上门）
	private String Cust_Doortime;//上门时间
	
	private Integer Cust_Pay;//是否缴费（0.缴费1.未交费）
	private String Cust_Paytime;//缴费时间
	
	private Double Cust_money;//缴费金额
	private Integer Cust_Refund;//是否退费（0.是1.否）
	private String Cust_Refundreason;//退费原因
	private Integer Cust_entry;//是否进班（0.是1.否）p-
	private String Cust_entrytime;//进班时间
	
	private String Cust_notes;//进班备注
	private String Cust_Region;//客户所在地区
	private Integer Cust_preparation;//是否报备（0.是1.否）
	private Integer Cust_youxiao;//是否有效（0.是1.否）
	private String Cust_zaixianbeizhu;//在线备注（0.是1.否）
	private String Cust_laiyuanguanjianzi;//来源关键词（0.是1.否）
	private Integer Cust_Asker_ID;//咨询师编号

	private String Cust_quyu;//来源区域
	private String Cust_guanzhu;//学员关注
	private String Cust_laiyuanbumen;//来源部门
	
	private String Cust_wuxiaoyuanyin; //无效原因
	private Double Cust_dingjin;//定金金额
	private String Cust_dingjinDay;//定金时间
	private String Cust_askerbeizhu;//咨询师备注

	
	
	
	private String Cust_askerName;
	
	
	public String getCust_askerName() {
		return Cust_askerName;
	}
	
	
	
	



	public void setCust_askerName(String cust_askerName) {
		Cust_askerName = cust_askerName;
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



	public String getCust_Creationtime() {
		return Cust_Creationtime;
	}



	public void setCust_Creationtime(String cust_Creationtime) {
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



	public Integer getCust_Revisit() {
		return Cust_Revisit;
	}



	public void setCust_Revisit(Integer cust_Revisit) {
		Cust_Revisit = cust_Revisit;
	}



	public String getCust_RevisitDays() {
		return Cust_RevisitDays;
	}



	public void setCust_RevisitDays(String cust_RevisitDays) {
		Cust_RevisitDays = cust_RevisitDays;
	}



	public Integer getCust_Door() {
		return Cust_Door;
	}



	public void setCust_Door(Integer cust_Door) {
		Cust_Door = cust_Door;
	}



	public String getCust_Doortime() {
		return Cust_Doortime;
	}



	public void setCust_Doortime(String cust_Doortime) {
		Cust_Doortime = cust_Doortime;
	}



	public Integer getCust_Pay() {
		return Cust_Pay;
	}



	public void setCust_Pay(Integer cust_Pay) {
		Cust_Pay = cust_Pay;
	}



	public String getCust_Paytime() {
		return Cust_Paytime;
	}



	public void setCust_Paytime(String cust_Paytime) {
		Cust_Paytime = cust_Paytime;
	}



	public Double getCust_money() {
		return Cust_money;
	}



	public void setCust_money(Double cust_money) {
		Cust_money = cust_money;
	}



	public Integer getCust_Refund() {
		return Cust_Refund;
	}



	public void setCust_Refund(Integer cust_Refund) {
		Cust_Refund = cust_Refund;
	}



	public String getCust_Refundreason() {
		return Cust_Refundreason;
	}



	public void setCust_Refundreason(String cust_Refundreason) {
		Cust_Refundreason = cust_Refundreason;
	}



	public Integer getCust_entry() {
		return Cust_entry;
	}



	public void setCust_entry(Integer cust_entry) {
		Cust_entry = cust_entry;
	}



	public String getCust_entrytime() {
		return Cust_entrytime;
	}



	public void setCust_entrytime(String cust_entrytime) {
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



	public Integer getCust_preparation() {
		return Cust_preparation;
	}



	public void setCust_preparation(Integer cust_preparation) {
		Cust_preparation = cust_preparation;
	}



	public Integer getCust_youxiao() {
		return Cust_youxiao;
	}



	public void setCust_youxiao(Integer cust_youxiao) {
		Cust_youxiao = cust_youxiao;
	}



	public String getCust_zaixianbeizhu() {
		return Cust_zaixianbeizhu;
	}



	public void setCust_zaixianbeizhu(String cust_zaixianbeizhu) {
		Cust_zaixianbeizhu = cust_zaixianbeizhu;
	}



	public String getCust_laiyuanguanjianzi() {
		return Cust_laiyuanguanjianzi;
	}



	public void setCust_laiyuanguanjianzi(String cust_laiyuanguanjianzi) {
		Cust_laiyuanguanjianzi = cust_laiyuanguanjianzi;
	}



	public Integer getCust_Asker_ID() {
		return Cust_Asker_ID;
	}



	public void setCust_Asker_ID(Integer cust_Asker_ID) {
		Cust_Asker_ID = cust_Asker_ID;
	}



	public String getCust_quyu() {
		return Cust_quyu;
	}



	public void setCust_quyu(String cust_quyu) {
		Cust_quyu = cust_quyu;
	}



	public String getCust_guanzhu() {
		return Cust_guanzhu;
	}



	public void setCust_guanzhu(String cust_guanzhu) {
		Cust_guanzhu = cust_guanzhu;
	}



	public String getCust_laiyuanbumen() {
		return Cust_laiyuanbumen;
	}



	public void setCust_laiyuanbumen(String cust_laiyuanbumen) {
		Cust_laiyuanbumen = cust_laiyuanbumen;
	}



	public String getCust_wuxiaoyuanyin() {
		return Cust_wuxiaoyuanyin;
	}



	public void setCust_wuxiaoyuanyin(String cust_wuxiaoyuanyin) {
		Cust_wuxiaoyuanyin = cust_wuxiaoyuanyin;
	}



	public Double getCust_dingjin() {
		return Cust_dingjin;
	}



	public void setCust_dingjin(Double cust_dingjin) {
		Cust_dingjin = cust_dingjin;
	}



	public String getCust_dingjinDay() {
		return Cust_dingjinDay;
	}



	public void setCust_dingjinDay(String cust_dingjinDay) {
		Cust_dingjinDay = cust_dingjinDay;
	}



	public String getCust_askerbeizhu() {
		return Cust_askerbeizhu;
	}



	public void setCust_askerbeizhu(String cust_askerbeizhu) {
		Cust_askerbeizhu = cust_askerbeizhu;
	}



	@Override
	public String toString() {
		return "Cust_customer [Cust_ID=" + Cust_ID + ", Cust_Name=" + Cust_Name + ", Cust_Age=" + Cust_Age
				+ ", Cust_Gender=" + Cust_Gender + ", Cust_Telephone=" + Cust_Telephone + ", Cust_Education="
				+ Cust_Education + ", Cust_state=" + Cust_state + ", Cust_channel=" + Cust_channel + ", Cust_website="
				+ Cust_website + ", Cust_QQ=" + Cust_QQ + ", Cust_WeChat=" + Cust_WeChat + ", Cust_mailbox="
				+ Cust_mailbox + ", Cust_Creationtime=" + Cust_Creationtime + ", Cust_Course=" + Cust_Course
				+ ", Cust_Scoring=" + Cust_Scoring + ", Cust_Revisit=" + Cust_Revisit + ", Cust_RevisitDays="
				+ Cust_RevisitDays + ", Cust_Door=" + Cust_Door + ", Cust_Doortime=" + Cust_Doortime + ", Cust_Pay="
				+ Cust_Pay + ", Cust_Paytime=" + Cust_Paytime + ", Cust_money=" + Cust_money + ", Cust_Refund="
				+ Cust_Refund + ", Cust_Refundreason=" + Cust_Refundreason + ", Cust_entry=" + Cust_entry
				+ ", Cust_entrytime=" + Cust_entrytime + ", Cust_notes=" + Cust_notes + ", Cust_Region=" + Cust_Region
				+ ", Cust_preparation=" + Cust_preparation + ", Cust_youxiao=" + Cust_youxiao + ", Cust_zaixianbeizhu="
				+ Cust_zaixianbeizhu + ", Cust_laiyuanguanjianzi=" + Cust_laiyuanguanjianzi + ", Cust_Asker_ID="
				+ Cust_Asker_ID + ", Cust_quyu=" + Cust_quyu + ", Cust_guanzhu=" + Cust_guanzhu + ", Cust_laiyuanbumen="
				+ Cust_laiyuanbumen + ", Cust_wuxiaoyuanyin=" + Cust_wuxiaoyuanyin + ", Cust_dingjin=" + Cust_dingjin
				+ ", Cust_dingjinDay=" + Cust_dingjinDay + ", Cust_askerbeizhu=" + Cust_askerbeizhu + "]";
	}
	
}
