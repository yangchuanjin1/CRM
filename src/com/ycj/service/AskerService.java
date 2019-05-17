package com.ycj.service;

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenYeYang;

public interface AskerService {
	
   FenYe<Asker> selectAskers(Asker asker);
   
   List<Asker> seleAskers();
   /**
    * YangChuanJin ��ҳ��������ѯ���� ��ѯ������
    * @param fenYeYang
    * @return
    */
   FenYeYang selectAskerAllAndCount(FenYeYang fenYeYang);
   
   /**
    * ���
    * @param asker
    * @return
    */
   Integer insertAsker(Asker asker);
   
}
