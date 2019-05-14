package com.ycj.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class FenYe<T> {
   private Integer total;
   private List<T> rows;
public Integer getTotal() {
	return total;
}
public void setTotal(Integer total) {
	this.total = total;
}

public List<T> getRows() {
	return rows;
}
public void setRows(List<T> rows) {
	this.rows = rows;
}
@Override
public String toString() {
	return "FenYe [total=" + total + ", rows=" + rows + "]";
}
   
   
   
}
