package com.ycj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.Communicate_recordMapper;
import com.ycj.entity.Communicate_record;
import com.ycj.entity.FenYe;
@Service
public class Communicate_recordServiceImpl implements Communicate_recordService{
	@Autowired
	private Communicate_recordMapper communicate_recordMapper;
	@Autowired
	private FenYe<Communicate_record> fenYe;
	@Override
	public FenYe<Communicate_record> selectCommunicate_record(Communicate_record communicate_record) {
		communicate_record.setPage((communicate_record.getPage()-1)*communicate_record.getRows());
		communicate_record.setRows(communicate_record.getRows());
		 List<Communicate_record> selectCommunicate_recordMappers = communicate_recordMapper.selectCommunicate_recordMappers(communicate_record);
		Integer selectCount = communicate_recordMapper.selectCount(communicate_record);
		fenYe.setTotal(selectCount);
		fenYe.setRows(selectCommunicate_recordMappers);
		return fenYe;
	}
	public int insertCommunicate_recordFan(Communicate_record communicate_record) {
		// TODO Auto-generated method stub
		return communicate_recordMapper.insertCommunicate_recordFan(communicate_record);
	}
}
