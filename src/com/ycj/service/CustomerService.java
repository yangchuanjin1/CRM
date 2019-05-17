package com.ycj.service;

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.Communicate_record;
import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;

public interface CustomerService {
	//查询所有
	FenYe<Cust_customer> selectCust_customers(Cust_customer cust_customer);
	  
	List<Asker> selectAskers();
	
	int updateCust_customer(Cust_customer cust_customer);
    
    int insertCust_customer(Cust_customer cust_customer);
    
    int deleteCust_customer(int cust_ID);
    /**
     * 跟踪
     * @param communicate_record 跟踪记录表
     * @return
     */
    int insertCommunicate_record(Communicate_record communicate_record);
    
    
}
