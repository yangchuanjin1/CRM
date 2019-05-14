package com.ycj.service;

import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;

public interface CustomerService {
	//查询所有
	FenYe<Cust_customer> selectCust_customers(Cust_customer cust_customer);
	
	int updateCust_customer(Cust_customer cust_customer);
    
    int insertCust_customer(Cust_customer cust_customer);
    
    int deleteCust_customer(int cust_ID);
}
