package com.ycj.service;

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenYeYang;

public interface AskerService {
	
   FenYe<Asker> selectAskers(Asker asker);
   
   List<Asker> seleAskers();
   /**
    * YangChuanJin 分页带条件查询所有 查询总条数
    * @param fenYeYang
    * @return
    */
   FenYeYang selectAskerAllAndCount(FenYeYang fenYeYang);
   
   /**
    * 添加
    * @param asker
    * @return
    */
   Integer insertAsker(Asker asker);
   
}
