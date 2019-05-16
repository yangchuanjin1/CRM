package com.ycj.service;

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.FenYe;

public interface AskerService {
	
   FenYe<Asker> selectAskers(Asker asker);
   
   List<Asker> seleAskers();
   
}
