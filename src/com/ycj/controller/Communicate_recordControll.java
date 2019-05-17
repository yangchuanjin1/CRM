package com.ycj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Asker;
import com.ycj.entity.Communicate_record;
import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;
import com.ycj.entity.Staff;
import com.ycj.service.Communicate_recordService;
import com.ycj.service.CustomerService;
@Controller
public class Communicate_recordControll {
	@Autowired
	private Communicate_recordService communicate_recordService;
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value="selectCommunicate_record",method=RequestMethod.POST)
	@ResponseBody
	public FenYe<Communicate_record> selectCommunicate_record(Communicate_record communicate_record,Staff staff,Cust_customer cust_customer) {
		communicate_record.setCust_customer(cust_customer);
		communicate_record.setStaff(staff);
		return communicate_recordService.selectCommunicate_record(communicate_record);
	}
	@RequestMapping(value="insertCommunicate_recordFan",method=RequestMethod.POST)
	@ResponseBody
	public int insertCommunicate_recordFan(Communicate_record communicate_record) {
		Asker Asker_Staff_ID = customerService.selectAskers(communicate_record.getComm_Staff_ID());
		Asker_Staff_ID.getAsker_Staff_ID();
		System.out.println("-----------------------------------------");
		System.out.println(Asker_Staff_ID.getAsker_Staff_ID());
		communicate_record.setComm_Staff_ID(Asker_Staff_ID.getAsker_Staff_ID());
		return communicate_recordService.insertCommunicate_recordFan(communicate_record);
		
	}
}
