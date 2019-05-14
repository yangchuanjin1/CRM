package com.ycj.service;

import com.ycj.entity.Asker;
import com.ycj.entity.FenYe;

public interface AskerService {
	
   FenYe<Asker> selectAskers(Asker asker);
}
