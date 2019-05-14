package com.ycj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;
import com.ycj.service.CustomerServiceImpl;
@Controller
public class Cust_customerController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	@RequestMapping(value="/selectCust_customers",method=RequestMethod.POST)
	@ResponseBody
	public FenYe<Cust_customer> selectCust_customers(Cust_customer cust_customer) {
			return customerServiceImpl.selectCust_customers(cust_customer);
		}
}
