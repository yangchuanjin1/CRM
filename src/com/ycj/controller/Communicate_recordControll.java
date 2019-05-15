package com.ycj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Communicate_record;
import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;
import com.ycj.entity.Staff;
import com.ycj.service.Communicate_recordService;
@Controller
public class Communicate_recordControll {
	@Autowired
	private Communicate_recordService communicate_recordService;
	@RequestMapping(value="selectCommunicate_record",method=RequestMethod.POST)
	@ResponseBody
	public FenYe<Communicate_record> selectCommunicate_record(Communicate_record communicate_record,Staff staff,Cust_customer cust_customer) {
		return communicate_recordService.selectCommunicate_record(communicate_record);
	}
}
