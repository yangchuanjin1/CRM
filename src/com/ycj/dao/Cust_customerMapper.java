package com.ycj.dao;
//�ͻ���

import java.util.List;

import com.ycj.entity.Cust_customer;

public interface Cust_customerMapper {
    List<Cust_customer> selectCust_customers(Cust_customer cust_customer);
    
    int selectCount(Cust_customer cust_customer);
    
    int updateCust_customer(Cust_customer cust_customer);
    
    int insertCust_customer(Cust_customer cust_customer);
    
    int deleteCust_customer(int cust_ID);
    
}
