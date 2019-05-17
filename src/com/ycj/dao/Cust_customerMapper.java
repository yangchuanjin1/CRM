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
    List<Asker> selectAskers();
    
    /**
     * 修改学生
     * @param cust_customer
     * @return
     */
    int updateCust_customer(Cust_customer cust_customer);
    
    int selectCount(Cust_customer cust_customer);
    
    int updateCust_customergenzhong(Cust_customer cust_customer);
    
    int insertCust_customer(Cust_customer cust_customer);
    /**
     * 删除
     * @param cust_ID
     * @return
     */
    int deleteCust_customer(int cust_ID);
    /**
     * 添加跟踪
     * @param communicate_record 跟踪记录表
     * @return
     */
    int insertCommunicate_record(Communicate_record communicate_record);
    
}
