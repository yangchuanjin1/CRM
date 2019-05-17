package com.ycj.entity;

import java.util.Date;

import org.springframework.stereotype.Component;
//锟酵伙拷锟斤拷
@Component
public class Cust_customer {
	private Integer Cust_ID;//瀹㈡埛缂栧彿
	private String Cust_Name;//瀹㈡埛鍚嶇О
	private Integer Cust_Age;//瀹㈡埛骞撮緞
	private String Cust_Gender;//瀹㈡埛锛堢敺濂筹級1
	private String  Cust_Telephone;//瀹㈡埛鐢佃瘽
	private String Cust_Education;//瀹㈡埛瀛﹀巻(鏈煡锛屽ぇ涓擄紝楂樹腑锛屼腑涓擄紝鍒濅腑锛屾湰绉戯紝鍏跺畠)
	private String Cust_state;//瀹㈡埛鐘舵�侊紙涓婂銆佷笅瀛︼級
	private String Cust_channel;//瀹㈡埛鏉ユ簮娓犻亾
	private String Cust_website;//瀹㈡埛鏉ユ簮缃戠珯锛堝叾瀹冿紝鑱岃嫳B绔欙紝楂樿�冪珯锛岃亴鑻盇绔欙級
	private String Cust_QQ;//瀹㈡埛QQ
	private String Cust_WeChat;//瀹㈡埛寰俊
	private String Cust_mailbox;//瀹㈡埛閭
	private String Cust_Creationtime;//瀹㈡埛鍒涘缓鐨勬椂闂�
	private String minCust_Creationtime;//瀹㈡埛鍒涘缓鐨勬椂闂�
	private String maxCust_Creationtime;//瀹㈡埛鍒涘缓鐨勬椂闂�
	private String Cust_Course;//璇剧▼鏂瑰悜
	private Integer Cust_Scoring;//瀹㈡埛鐨勮川閲�
	private Integer Cust_Revisit;//鏄惁鍥炶锛�0.鏈洖璁�1.鍥炶锛�
	private String Cust_RevisitDays;//鍥炶鏃堕棿
	private String minCust_RevisitDays;//鍥炶鏃堕棿
	private String maxCust_RevisitDays;//鍥炶鏃堕棿
	private Integer Cust_Door;//鏄惁涓婇棬锛�0.涓婇棬1.鏈笂闂級
	private String Cust_Doortime;//涓婇棬鏃堕棿
	private String minCust_Doortime;//涓婇棬鏃堕棿
	private String maxCust_Doortime;//涓婇棬鏃堕棿
	private Integer Cust_Pay;//鏄惁缂磋垂锛�0.缂磋垂1.鏈氦璐癸級
	private String Cust_Paytime;//缂磋垂鏃堕棿
	private String minCust_Paytime;//缂磋垂鏃堕棿
	private String maxCust_Paytime;//缂磋垂鏃堕棿
	private Double Cust_money;//缂磋垂閲戦
	private Integer Cust_Refund;//鏄惁閫�璐癸紙0.鏄�1.鍚︼級
	private String Cust_Refundreason;//閫�璐瑰師鍥�
	private Integer Cust_entry;//鏄惁杩涚彮锛�0.鏄�1.鍚︼級p-
	private String Cust_entrytime;//杩涚彮鏃堕棿
	private String minCust_entrytime;//杩涚彮鏃堕棿
	private String maxCust_entrytime;//杩涚彮鏃堕棿
	private String Cust_notes;//杩涚彮澶囨敞
	private String Cust_Region;//瀹㈡埛鎵�鍦ㄥ湴鍖�
	private Integer Cust_preparation;//鏄惁鎶ュ锛�0.鏄�1.鍚︼級
	private Integer Cust_youxiao;//鏄惁鏈夋晥锛�0.鏄�1.鍚︼級
	
	private String Cust_zaixianbeizhu;//鍦ㄧ嚎澶囨敞锛�0.鏄�1.鍚︼級
	private String Cust_laiyuanguanjianzi;//鏉ユ簮鍏抽敭璇嶏紙0.鏄�1.鍚︼級
	private Integer Cust_Asker_ID;//鍜ㄨ甯堢紪鍙�
	
	private String Cust_quyu;//来源区域
	private String Cust_guanzhu;//学员关注
	private String Cust_laiyuanbumen;//来源部门
	
	private String Cust_wuxiaoyuanyin; //无效原因
	private Double Cust_dingjin;//定金金额
	private String Cust_dingjinDay;//定金时间
	private String Cust_askerbeizhu;//咨询师备注

	
	private String Cust_quyu;//来源区域
	private String Cust_guanzhu;//学员关注
	private String Cust_laiyuanbumen;//来源部门
	
	private String Cust_wuxiaoyuanyin; //无效原因
	private Double Cust_dingjin;//定金金额
	private String Cust_dingjinDay;//定金时间
	private String Cust_askerbeizhu;//咨询师备注
	
	
	
	private Asker asker;
	
	private Staff staff;
	
	private Integer page;
	private Integer rows;
	
	
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

	
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
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
	public String getMinCust_Creationtime() {
		return minCust_Creationtime;
	}
	public void setMinCust_Creationtime(String minCust_Creationtime) {
		this.minCust_Creationtime = minCust_Creationtime;
	}
	public String getMaxCust_Creationtime() {
		return maxCust_Creationtime;
	}
	public void setMaxCust_Creationtime(String maxCust_Creationtime) {
		this.maxCust_Creationtime = maxCust_Creationtime;
	}
	public String getMinCust_RevisitDays() {
		return minCust_RevisitDays;
	}
	public void setMinCust_RevisitDays(String minCust_RevisitDays) {
		this.minCust_RevisitDays = minCust_RevisitDays;
	}
	public String getMaxCust_RevisitDays() {
		return maxCust_RevisitDays;
	}
	public void setMaxCust_RevisitDays(String maxCust_RevisitDays) {
		this.maxCust_RevisitDays = maxCust_RevisitDays;
	}
	public String getMinCust_Doortime() {
		return minCust_Doortime;
	}
	public void setMinCust_Doortime(String minCust_Doortime) {
		this.minCust_Doortime = minCust_Doortime;
	}
	public String getMaxCust_Doortime() {
		return maxCust_Doortime;
	}
	public void setMaxCust_Doortime(String maxCust_Doortime) {
		this.maxCust_Doortime = maxCust_Doortime;
	}
	public String getMinCust_Paytime() {
		return minCust_Paytime;
	}
	public void setMinCust_Paytime(String minCust_Paytime) {
		this.minCust_Paytime = minCust_Paytime;
	}
	public String getMaxCust_Paytime() {
		return maxCust_Paytime;
	}
	public void setMaxCust_Paytime(String maxCust_Paytime) {
		this.maxCust_Paytime = maxCust_Paytime;
	}
	public String getMinCust_entrytime() {
		return minCust_entrytime;
	}
	public void setMinCust_entrytime(String minCust_entrytime) {
		this.minCust_entrytime = minCust_entrytime;
	}
	public String getMaxCust_entrytime() {
		return maxCust_entrytime;
	}
	public void setMaxCust_entrytime(String maxCust_entrytime) {
		this.maxCust_entrytime = maxCust_entrytime;
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
	public Integer getCust_Asker_ID() {
		return Cust_Asker_ID;
	}
	public void setCust_Asker_ID(Integer cust_Asker_ID) {
		Cust_Asker_ID = cust_Asker_ID;
	}
	public Asker getAsker() {
		return asker;
	}
	public void setAsker(Asker asker) {
		this.asker = asker;
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
	@Override
	public String toString() {
		return "Cust_customer [Cust_ID=" + Cust_ID + ", Cust_Name=" + Cust_Name + ", Cust_Age=" + Cust_Age
				+ ", Cust_Gender=" + Cust_Gender + ", Cust_Telephone=" + Cust_Telephone + ", Cust_Education="
				+ Cust_Education + ", Cust_state=" + Cust_state + ", Cust_channel=" + Cust_channel + ", Cust_website="
				+ Cust_website + ", Cust_QQ=" + Cust_QQ + ", Cust_WeChat=" + Cust_WeChat + ", Cust_mailbox="
				+ Cust_mailbox + ", Cust_Creationtime=" + Cust_Creationtime + ", minCust_Creationtime="
				+ minCust_Creationtime + ", maxCust_Creationtime=" + maxCust_Creationtime + ", Cust_Course="
				+ Cust_Course + ", Cust_Scoring=" + Cust_Scoring + ", Cust_Revisit=" + Cust_Revisit
				+ ", Cust_RevisitDays=" + Cust_RevisitDays + ", minCust_RevisitDays=" + minCust_RevisitDays
				+ ", maxCust_RevisitDays=" + maxCust_RevisitDays + ", Cust_Door=" + Cust_Door + ", Cust_Doortime="
				+ Cust_Doortime + ", minCust_Doortime=" + minCust_Doortime + ", maxCust_Doortime=" + maxCust_Doortime
				+ ", Cust_Pay=" + Cust_Pay + ", Cust_Paytime=" + Cust_Paytime + ", minCust_Paytime=" + minCust_Paytime
				+ ", maxCust_Paytime=" + maxCust_Paytime + ", Cust_money=" + Cust_money + ", Cust_Refund=" + Cust_Refund
				+ ", Cust_Refundreason=" + Cust_Refundreason + ", Cust_entry=" + Cust_entry + ", Cust_entrytime="
				+ Cust_entrytime + ", minCust_entrytime=" + minCust_entrytime + ", maxCust_entrytime="
				+ maxCust_entrytime + ", Cust_notes=" + Cust_notes + ", Cust_Region=" + Cust_Region
				+ ", Cust_preparation=" + Cust_preparation + ", Cust_youxiao=" + Cust_youxiao + ", Cust_zaixianbeizhu="
				+ Cust_zaixianbeizhu + ", Cust_laiyuanguanjianzi=" + Cust_laiyuanguanjianzi + ", Cust_Asker_ID="
				+ Cust_Asker_ID + ", asker=" + asker + ", staff=" + staff + ", page=" + page + ", rows=" + rows + "]";
	}
	
	

}
