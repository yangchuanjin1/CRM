package com.ycj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.AskerMapper;
import com.ycj.entity.Asker;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenYeYang;
@Service
public class AskerServiceImpl implements AskerService{
	@Autowired
    private AskerMapper askerMapper ;
	@Autowired
    private FenYe<Asker> fenYe ;
	/*public FenYe<Asker> selectAskers(Asker asker) {
		asker.setPage((asker.getPage()-1)*asker.getRows());
		asker.setRows(asker.getRows());
		List<Asker> seleAskers = askerMapper.seleAskers(asker);
		int selectCount = askerMapper.selectCount(asker);
		fenYe.setTotal(selectCount);
		fenYe.setRows(seleAskers);
		return fenYe;
	}*/
	
	public List<Asker> seleAskers() {
		// TODO Auto-generated method stub
		return askerMapper.selectAskers();
	}
	@Override
	public FenYe<Asker> selectAskers(Asker asker) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	/**
	 * YangChuanJin 分页带条件查询所有 查询总条数
	 */
	@Override
	public FenYeYang selectAskerAllAndCount(FenYeYang fenYeYang) {
		Integer selectCount = askerMapper.selectCount(fenYeYang);
		List<Asker> seleAskers = askerMapper.seleAskers(fenYeYang);
		fenYeYang.setTotal(selectCount);
		fenYeYang.setRows(seleAskers);
		return fenYeYang;
	}


	/**
	 * 添加
	 */
	public Integer insertAsker(Asker asker) {
		Integer insertAsker = askerMapper.insertAsker(asker);
		return insertAsker;
	}

}
