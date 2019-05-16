package com.ycj.controller;

import java.util.List;

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
import com.ycj.service.CustomerService;
import com.ycj.service.CustomerServiceImpl;
@Controller
public class Cust_customerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value="/selectCust_customers",method=RequestMethod.POST)
	@ResponseBody
	public FenYe<Cust_customer> selectCust_customers(Cust_customer cust_customer,Asker asker,Staff staff) {
		cust_customer.setAsker(asker);
		cust_customer.setStaff(staff); 
	  return customerService.selectCust_customers(cust_customer);
		}
	//添加
	@RequestMapping(value="/insertCust_customer",method=RequestMethod.POST)
	@ResponseBody
	public int insertCust_customer(Cust_customer cust_customer,Asker asker,Staff staff) {
		// TODO Auto-generated method stub
		cust_customer.setAsker(asker);
		cust_customer.setStaff(staff); 
		return customerService.insertCust_customer(cust_customer);
	}
	@RequestMapping(value="/insertCommunicate_record",method=RequestMethod.POST)
	@ResponseBody
	public int insertCommunicate_record(Communicate_record communicate_record) {
		return customerService.insertCommunicate_record(communicate_record);
	}
	/*
	 * @RequestMapping(value="/selectAskers",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public List<Asker> selectAskers() { return
	 * customerService.selectAskers(); }
	 */
}
