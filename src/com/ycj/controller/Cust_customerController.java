package com.ycj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Asker;
import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenyeJiang;
import com.ycj.entity.Staff;
import com.ycj.service.CustomerService;
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
	//娣诲姞
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
	@RequestMapping(value="/updateCust_customer",method=RequestMethod.POST)
	@ResponseBody
	public int updateCust_customer(Cust_customer cust_customer) {
		System.out.println("123132654+65+636526");
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
	 * 	鍜ㄨ甯�
	 */
	
	@RequestMapping(value="/selectCust_customersFan",method=RequestMethod.POST)
	@ResponseBody
	public FenYe<Cust_customer> selectCust_customersFan(Cust_customer cust_customer,Asker asker,Staff staff) {
		cust_customer.setAsker(asker);
		cust_customer.setStaff(staff); 
	
		return customerService.selectCust_customersFan(cust_customer);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    //	添加
	@RequestMapping(value="/insertCust_customerJiang",method=RequestMethod.POST)
	@ResponseBody
	public int insertCust_customerJ(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		int insertCust_customerJ = customerService.insertCust_customerJ(cust_customer);
		
		return insertCust_customerJ;
	}
	//查询
	@RequestMapping(value="/selectCust_customer",method=RequestMethod.POST)
	@ResponseBody
	public FenyeJiang selectCust_customer(int page,int rows,String Cust_Name,String Cust_Telephone,String Cust_QQ,String minCust_Doortime,String maxCust_Doortime) {
		// TODO Auto-generated method stub
		FenyeJiang fenye=new FenyeJiang();
		fenye.setCust_Name(Cust_Name);
		fenye.setCust_Telephone(Cust_Telephone);
		fenye.setMaxCust_Doortime(maxCust_Doortime);
		fenye.setMinCust_Doortime(minCust_Doortime);
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		fenye.setCust_QQ(Cust_QQ);
		FenyeJiang selectPro = customerService.selectCust_customer(fenye);
		return selectPro;
	}
	
	
	
	
	
	
	

}
