package com.ycj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.Cust_customerMapper;
import com.ycj.entity.Communicate_record;
import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private Cust_customerMapper cust_customerMapper;
	@Autowired 
	private FenYe<Cust_customer> fenYe;
	
	@Override
	/**
	 * 模糊查询所有用户，以及用户总条数
	 */
	public FenYe<Cust_customer> selectCust_customers(Cust_customer cust_customer) {
		
		cust_customer.setPage((cust_customer.getPage()-1)*cust_customer.getRows());
		cust_customer.setRows(cust_customer.getRows());
		fenYe.setRows(cust_customerMapper.selectCust_customers(cust_customer));
		fenYe.setTotal(cust_customerMapper.selectCount(cust_customer));
		return fenYe;
	}

	@Override
	public int updateCust_customer(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertCust_customer(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		return cust_customerMapper.insertCust_customer(cust_customer);
	}

	@Override
	public int deleteCust_customer(int cust_ID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertCommunicate_record(Communicate_record communicate_record) {
		
		return cust_customerMapper.insertCommunicate_record(communicate_record);
	}

}
