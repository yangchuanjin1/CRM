package com.ycj.dao;
//锟斤拷询师锟斤拷dao锟接匡拷

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.FenYeYang;

public interface AskerMapper {
	/**
	 * YangChuanJin 分页带条件查询所有
	 * @param fenYeYang
	 * @return
	 */
   List<Asker> seleAskers(FenYeYang fenYeYang);
   
   List<Asker> selectAskers();
   /**
    * YangChuanJin  查询总条数
    * @param fenYeYang
    * @return
    */
   Integer selectCount(FenYeYang fenYeYang);
   
   /**
    * 添加
    * @param asker
    * @return
    */
   Integer insertAsker(Asker asker);
   
   int updateAsker(Asker asker);
   
   int deleteAsker(int asker_ID);
   
}
