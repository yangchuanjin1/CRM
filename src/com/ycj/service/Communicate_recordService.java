package com.ycj.service;

import com.ycj.entity.Communicate_record;
import com.ycj.entity.FenYe;

public interface Communicate_recordService {
   FenYe<Communicate_record> selectCommunicate_record(Communicate_record communicate_record);
   
   /**
    * 跟踪
    * @param communicate_record 跟踪记录表
    * @return
    */
   int insertCommunicate_recordFan(Communicate_record communicate_record);
}
