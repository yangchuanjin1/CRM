package com.ycj.dao;
//������¼��

import java.util.List;

import com.ycj.entity.Communicate_record;



public interface Communicate_recordMapper {
	List<Communicate_record> selectCommunicate_recordMappers(Communicate_record communicate_record);

	int selectCount(Communicate_record communicate_record);

	int updateCommunicate_record(Communicate_record communicate_record);
	
	int insertCommunicate_record(Communicate_record communicate_record);
	
	int deleteCommunicate_record(int Comm_ID);
	
	//fanxiangbin 
	
	int insertCommunicate_recordFan(Communicate_record communicate_record);
	
	
	//fanxiangbin
	
}
