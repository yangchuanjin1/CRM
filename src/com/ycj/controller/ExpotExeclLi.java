package com.ycj.controller;


import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.ycj.Util.ExportUtils;
import com.ycj.entity.Cust_customer;


/*@Controller*/
public class ExpotExeclLi {
	@RequestMapping(value="/exportForm",method=RequestMethod.POST)
	public void exportForm(HttpServletResponse res,String stulist ,String fields){
		Gson gson=new Gson();
		final ObjectMapper mapper = new ObjectMapper();
	    
		//鑾峰彇杈撳嚭娴佹帴鏀舵暟鎹緭鍑哄嚭鍘�
		try {
			List<Cust_customer> listll = mapper.readValue(stulist, new TypeReference<List<Cust_customer>>(){});
			//List<Cust_customer> list=gson.fromJson(stulist,new TypeToken<List<Cust_customer>>(){}.getType());
		/*	System.out.println("list"+listll);*/
			String fileName = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) +".xls";
			res.setContentType("application/octet-stream; charset=utf-8");
			res.setHeader("Content-Disposition", "attachment;fileName="+fileName);
			HSSFWorkbook wb=new HSSFWorkbook();
			HSSFSheet sheet=wb.createSheet("sheet0");
			ExportUtils.outputHeaders(fields.split(","), sheet);
			ExportUtils.outputColumns(fields.split(","), listll, sheet);
			ServletOutputStream stream = res.getOutputStream();
			wb.write(stream);
			stream.flush();
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
