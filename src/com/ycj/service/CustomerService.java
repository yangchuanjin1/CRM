package com.ycj.service;

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.Communicate_record;
import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenyeJiang;
import com.ycj.entity.Staff;

public interface CustomerService {
	//查询所有
	FenYe<Cust_customer> selectCust_customers(FenYe<Cust_customer> fenYe);
<<<<<<< HEAD

=======
	//鏌ヨ鎵�鏈�
	FenYe<Cust_customer> selectCust_customers(Cust_customer cust_customer);
	  
>>>>>>> f759ac6ade6cf03169d3db94142dd183c552d83c
	Asker selectAskers(int asker_ID);
	
	int updateCust_customer(Cust_customer cust_customer);
    
    int insertCust_customer(Cust_customer cust_customer);
    
    int deleteCust_customer(int cust_ID);
    /**
     * 跟踪
     * @param communicate_record 跟踪记录表
     * @return
     */
    int insertCommunicate_record(Communicate_record communicate_record);
    
    
    
    
  //fanxiangbin
    FenYe<Cust_customer> selectCust_customersFan(FenYe<Cust_customer> fenYe);
    
    Staff selectStaffFan(String Staff_Name);

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
