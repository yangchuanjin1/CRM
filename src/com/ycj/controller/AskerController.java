package com.ycj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycj.entity.Asker;
import com.ycj.entity.FenYe;
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
}
