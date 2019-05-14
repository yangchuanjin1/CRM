package com.ycj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycj.dao.AskerMapper;
import com.ycj.entity.Asker;
import com.ycj.entity.FenYe;
@Service
public class AskerServiceImpl implements AskerService{
	@Autowired
    private AskerMapper askerMapper ;
	@Autowired
    private FenYe<Asker> fenYe ;
	@Override
	public FenYe<Asker> selectAskers(Asker asker) {
		asker.setPage((asker.getPage()-1)*asker.getRows());
		asker.setRows(asker.getRows());
		List<Asker> seleAskers = askerMapper.seleAskers(asker);
		int selectCount = askerMapper.selectCount(asker);
		fenYe.setTotal(selectCount);
		fenYe.setRows(seleAskers);
		return fenYe;
	}

}
