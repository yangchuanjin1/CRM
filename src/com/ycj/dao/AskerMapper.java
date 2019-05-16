package com.ycj.dao;
//��ѯʦ��dao�ӿ�

import java.util.List;

import com.ycj.entity.Asker;

public interface AskerMapper {
	
   List<Asker> seleAskers(Asker asker);
   
   List<Asker> selectAskers();
   
   int selectCount(Asker asker);
   
   
   int insertAsker(Asker asker);
   
   int updateAsker(Asker asker);
   
   int deleteAsker(int asker_ID);
   
}
