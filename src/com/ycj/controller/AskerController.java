package com.ycj.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Asker;
import com.ycj.entity.FenYe;
import com.ycj.entity.FenYeYang;
import com.ycj.entity.Signin;
import com.ycj.entity.Staff;
import com.ycj.service.AskerService;
@Controller
public class AskerController {
	@Autowired
	private AskerService askerService;
	@RequestMapping(value="selectAsker",method=RequestMethod.POST)
	@ResponseBody
	public FenYe<Asker> selectAskers(Asker asker,Staff staff) {
		asker.setStaff(staff);
		FenYe<Asker> selectAskers = askerService.selectAskers(asker);
		return selectAskers;
	}
	@RequestMapping(value="selectAskers",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> seleAskers() {
		List<Asker> selectAskers = askerService.seleAskers();
		List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<selectAskers.size();i++) {
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("id", selectAskers.get(i).getAsker_ID());
			map.put("text", selectAskers.get(i).getStaff().getStaff_Name());
			list.add(map);
		}
		return list;
	}
	
	
	/**
	 * YangChuanJIn    分页带条件输出数据和总条数
	 */
	@RequestMapping(value="/selectAskerAllCountYang",method=RequestMethod.POST)
	@ResponseBody
	public FenYeYang selectAskerAllCountYangChuanJin(Integer page,Integer rows,FenYeYang fenYeYang) {
		fenYeYang.setPage((page-1)*rows);
		fenYeYang.setPageSize(rows);
		FenYeYang selectAskerAllAndCount = askerService.selectAskerAllAndCount(fenYeYang);
		return selectAskerAllAndCount;
	}
	/**
	 * 添加
	 * @param asker
	 * @return
	 */
	@RequestMapping(value="/insertAskerYang",method=RequestMethod.POST)
	@ResponseBody
	public Integer insertAskerYang(Asker asker) {
		Integer insertAsker = askerService.insertAsker(asker);
		return insertAsker;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
