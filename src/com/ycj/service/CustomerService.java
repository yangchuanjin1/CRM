package com.ycj.service;

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.Communicate_record;
import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenyeJiang;

public interface CustomerService {
	//鏌ヨ鎵�鏈�
	FenYe<Cust_customer> selectCust_customers(Cust_customer cust_customer);
	  
	Asker selectAskers(int asker_ID);
	
	int updateCust_customer(Cust_customer cust_customer);
    
    int insertCust_customer(Cust_customer cust_customer);
    
    int deleteCust_customer(int cust_ID);
    
    
  //fanxiangbin
    FenYe<Cust_customer> selectCust_customersFan(Cust_customer cust_customer);

	int updateCust_customergenzhongFan(Cust_customer cust_customer);
	    
	int insertCust_customerFan(Cust_customer cust_customer);
	    
	int deleteCust_customerFan(int cust_ID);


	//fanxiangbin
	/**
	 * 查询数据
	 * @param fenye
	 * @return
	 */
	FenyeJiang selectCust_customer(FenyeJiang fenye);
	/**
	 * 添加
	 * @param Cust_customer
	 * @return
	 */
	int insertCust_customerJ(Cust_customer cust_customer);

}
