package com.ycj.service;

import com.ycj.entity.Communicate_record;
import com.ycj.entity.FenYe;

public interface Communicate_recordService {
   FenYe<Communicate_record> selectCommunicate_record(Communicate_record communicate_record);
}
