package com.ycj.dao;
//������¼��

import java.util.List;

import com.ycj.entity.Communicate_record;

public interface Communicate_recordMapper {
   List<Communicate_record> selectCommunicate_recordMappers(Communicate_record Communicate_record);
 
   Integer selectCount(Communicate_record communicate_record);
}
