package com.ycj.dao;
//������¼��

import java.util.List;

import com.ycj.entity.Communicate_record;

public interface Communicate_recordMapper {
	List<Communicate_record> selectCommunicate_record(Communicate_record communicate_record);

	int selectCommunicate_recordCount(Communicate_record communicate_record);

	int updateCommunicate_record(Communicate_record communicate_record);
	
	int insertCommunicate_record(Communicate_record communicate_record);
	
	int deleteCommunicate_record(int Comm_ID);
}
