package com.ycj.dao;
//��ѯʦ��dao�ӿ�

import java.util.List;

import com.ycj.entity.Asker;
import com.ycj.entity.FenYeYang;

public interface AskerMapper {
	/**
	 * YangChuanJin ��ҳ��������ѯ����
	 * @param fenYeYang
	 * @return
	 */
   List<Asker> seleAskers(FenYeYang fenYeYang);
   
   List<Asker> selectAskers();
   /**
    * YangChuanJin  ��ѯ������
    * @param fenYeYang
    * @return
    */
   Integer selectCount(FenYeYang fenYeYang);
   
   /**
    * ���
    * @param asker
    * @return
    */
   Integer insertAsker(Asker asker);
   
   int updateAsker(Asker asker);
   
   int deleteAsker(int asker_ID);
   
}
