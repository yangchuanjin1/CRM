package com.ycj.dao;
//������¼��

import java.util.List;
<<<<<<< HEAD

import com.ycj.entity.Communicate_record;

public interface Communicate_recordMapper {
   List<Communicate_record> selectCommunicate_recordMappers(Communicate_record Communicate_record);
 
   Integer selectCount(Communicate_record communicate_record);
=======

import com.ycj.entity.Communicate_record;

public interface Communicate_recordMapper {
	List<Communicate_record> selectCommunicate_record(Communicate_record communicate_record);

	int selectCommunicate_recordCount(Communicate_record communicate_record);

	int updateCommunicate_record(Communicate_record communicate_record);
	
	int insertCommunicate_record(Communicate_record communicate_record);
	
	int deleteCommunicate_record(int Comm_ID);
>>>>>>> 27dbf327342df5ddfb0f0ed6029a0962ebd05633
}
