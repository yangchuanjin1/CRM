package com.ycj.dao;
//�ͻ���

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.Communicate_record;
import com.ycj.entity.Cust_customer;

public interface Cust_customerMapper {
    List<Cust_customer> selectCust_customers(Cust_customer cust_customer);
    /**
     * 查询所有咨询师
     * @return
     */
    Asker selectAskers(int asker_ID);
    
    int selectCount(Cust_customer cust_customer);
    
    int updateCust_customergenzhong(Cust_customer cust_customer);
    
    int insertCust_customer(Cust_customer cust_customer);
    
    int deleteCust_customer(int cust_ID);
    /**
     * 添加跟踪
     * @param communicate_record 跟踪记录表
     * @return
     */
    int insertCommunicate_record(Communicate_record communicate_record);
    
    
    //fanxiangbin
    	List<Cust_customer> selectCust_customersFan(Cust_customer cust_customer);
    
    	int selectCountFan(Cust_customer cust_customer);
    	    
    	int updateCust_customergenzhongFan(Cust_customer cust_customer);
    	    
    	int insertCust_customerFan(Cust_customer cust_customer);
    	    
    	int deleteCust_customerFan(int cust_ID);
    
    
    //fanxiangbin
    
}
