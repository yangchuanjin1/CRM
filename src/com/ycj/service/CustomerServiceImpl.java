package com.ycj.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.Cust_customerMapper;
import com.ycj.entity.Asker;
import com.ycj.entity.Communicate_record;
import com.ycj.entity.Cust_customer;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenyeJiang;
import com.ycj.entity.Staff;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private Cust_customerMapper cust_customerMapper;
	/*
	 * @Autowired private FenYe<Cust_customer> fenYe;
	 */
	
	@Override
	/**
	 * 妯＄硦鏌ヨ鎵�鏈夌敤鎴凤紝浠ュ強鐢ㄦ埛鎬绘潯鏁�
	 */
	public FenYe<Cust_customer> selectCust_customers(FenYe<Cust_customer> fenYe) {
		fenYe.setRows(cust_customerMapper.selectCust_customers(fenYe));
		fenYe.setTotal(cust_customerMapper.selectCount(fenYe));
		return fenYe;
	}

	@Override
	public int updateCust_customer(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		return cust_customerMapper.updateCust_customer(cust_customer);
	}

	@Override
	public int insertCust_customer(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		return cust_customerMapper.insertCust_customer(cust_customer);
	}

	@Override
	public int deleteCust_customer(int cust_ID) {
		return cust_customerMapper.deleteCust_customer(cust_ID);
	}
	
	@Override
	public Asker selectAskers(int asker_ID) {
		// TODO Auto-generated method stub
		return cust_customerMapper.selectAskers(asker_ID);
		
	}
<<<<<<< HEAD

=======
>>>>>>> f759ac6ade6cf03169d3db94142dd183c552d83c
	
	/**
	 * fanxiangbin
	 * 
	 * 	咨询师
	 */
<<<<<<< HEAD

	/**
	 * fanxiangbin
	 * 
	 * 	咨询师
	 */

	public FenyeJiang selectCust_customer(FenyeJiang fenye) {
		List<Cust_customer> selectAllCust_customer = cust_customerMapper.selectAllCust_customer(fenye);
		int selectCountCust_customer = cust_customerMapper.selectCountCust_customer(fenye);
		fenye.setRows(selectAllCust_customer);
		fenye.setTotal(selectCountCust_customer);
		return fenye;

	}

	@Override
	public int insertCust_customerJ(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		int insertCust_customerJ = cust_customerMapper.insertCust_customerJ(cust_customer);
		return insertCust_customerJ;
		
	}

	@Override
	public int insertCommunicate_record(Communicate_record communicate_record) {
		// TODO Auto-generated method stub
		return 0;
	}
=======
	
	public FenYe<Cust_customer> selectCust_customersFan(FenYe<Cust_customer> fenYe) {
		fenYe.setRows(cust_customerMapper.selectCust_customersFan(fenYe));
		fenYe.setTotal(cust_customerMapper.selectCountFan(fenYe));
		return fenYe;
	}
>>>>>>> f759ac6ade6cf03169d3db94142dd183c552d83c

	@Override
	public Staff selectStaffFan(String Staff_Name) {
		// TODO Auto-generated method stub
		return cust_customerMapper.selectStaffFan(Staff_Name);
	}
	

	@Override
	public int updateCust_customergenzhongFan(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertCust_customerFan(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCust_customerFan(int cust_ID) {
		// TODO Auto-generated method stub
		return 0;
	}
<<<<<<< HEAD

=======
	
	/**
	 * fanxiangbin
	 * 
	 * 	咨询师
	 */

	public FenyeJiang selectCust_customer(FenyeJiang fenye) {
		List<Cust_customer> selectAllCust_customer = cust_customerMapper.selectAllCust_customer(fenye);
		int selectCountCust_customer = cust_customerMapper.selectCountCust_customer(fenye);
		fenye.setRows(selectAllCust_customer);
		fenye.setTotal(selectCountCust_customer);
		return fenye;

	}

	@Override
	public int insertCust_customerJ(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		int insertCust_customerJ = cust_customerMapper.insertCust_customerJ(cust_customer);
		return insertCust_customerJ;
		
	}

	@Override
	public int insertCommunicate_record(Communicate_record communicate_record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FenYe<Cust_customer> selectCust_customers(Cust_customer cust_customer) {
		// TODO Auto-generated method stub
		return null;
	}

	
>>>>>>> f759ac6ade6cf03169d3db94142dd183c552d83c
	/*
	 * public FenYe<Cust_customer> selectCust_customersFan(Cust_customer
	 * cust_customer) {
	 * cust_customer.setPage((cust_customer.getPage()-1)*cust_customer.getRows());
	 * cust_customer.setRows(cust_customer.getRows());
	 * fenYe.setRows((cust_customerMapper.selectCust_customersFan(cust_customer)));
	 * fenYe.setTotal(cust_customerMapper.selectCountFan(cust_customer));
	 * System.out.println(fenYe+"fhgfjghkhj"); return fenYe; }
	 * 
	 * @Override public int updateCust_customergenzhongFan(Cust_customer
	 * cust_customer) { // TODO Auto-generated method stub return 0; }
	 * 
	 * @Override public int insertCust_customerFan(Cust_customer cust_customer) { //
	 * TODO Auto-generated method stub return 0; }
	 * 
	 * @Override public int deleteCust_customerFan(int cust_ID) { // TODO
	 * Auto-generated method stub return 0; }
	 * 
	 * @Override public int insertCommunicate_record(Communicate_record
	 * communicate_record) { // TODO Auto-generated method stub return 0; }
	 * 
	 */
	
	/**
	 * fanxiangbin
	 * 
	 * 	鍜ㄨ甯�
	 */
}
