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
	public FenYe<Cust_customer> selectCust_customers(FenYe<Cust_customer> fenYe,Cust_customer cust_customer,Integer page,Integer rows) {
		fenYe.setPage((page-1)*rows);
		fenYe.setPagesize(rows);
		fenYe.setCust_customer(cust_customer);
	  return customerService.selectCust_customers(fenYe);
		}
	//添加
	@RequestMapping(value="/insertCust_customer",method=RequestMethod.POST)
	@ResponseBody
	public int insertCust_customer(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		
		return customerService.insertCust_customer(cust_customer);
	}
	@RequestMapping(value="/insertCommunicate_record",method=RequestMethod.POST)
	@ResponseBody
	public int insertCommunicate_record(Communicate_record communicate_record) {
		return customerService.insertCommunicate_record(communicate_record);
	}
	@RequestMapping(value="/updateCust_customer",method=RequestMethod.POST)
	@ResponseBody
	public int updateCust_customer(Cust_customer cust_customer) {
		return customerService.updateCust_customer(cust_customer);
	}
	@RequestMapping(value="/deleteCust_customer",method=RequestMethod.POST)
	@ResponseBody
	public int deleteCust_customer(int cust_ID) {
		// TODO Auto-generated method stub
		return customerService.deleteCust_customer(cust_ID);
	}

	/*
	 * @RequestMapping(value="/selectAskers",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public List<Asker> selectAskers() { return
	 * customerService.selectAskers(); }
	 */
	
	/**
	 * 	fanxiangbin
	 * 
	 * 	咨询师
	 */
	
	@RequestMapping(value="/selectCust_customersFan",method=RequestMethod.POST)
	@ResponseBody
	public FenYe<Cust_customer> selectCust_customersFan(Cust_customer cust_customer) {
		
	
		return customerService.selectCust_customersFan(cust_customer);
	}
}
