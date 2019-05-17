package com.ycj.dao;
//锟酵伙拷锟斤拷

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.Communicate_record;
import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenyeJiang;

public interface Cust_customerMapper {
    List<Cust_customer> selectCust_customers(Cust_customer cust_customer);
    /**
     * 鏌ヨ鎵�鏈夊挩璇㈠笀
     * @return
     */
    Asker selectAskers(int asker_ID);
    
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
     * 娣诲姞璺熻釜
     * @param communicate_record 璺熻釜璁板綍琛�
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
    
    	 //姜亚龙
    	  
        /**
         *   查询总数据
        * @param fenye
        * @return
        */
       List<Cust_customer> selectAllCust_customer(FenyeJiang fenye);
      /**
          * 查询总条数
        * @param fenye
        * @return
        */
       int selectCountCust_customer(FenyeJiang fenye);  
        //添加
       /**
        * 
        * @param cust_customer
        * @return
        */
       int insertCust_customerJ(Cust_customer cust_customer);

}
