package com.ycj.entity;

import java.util.List;

public class FenYe<T> {
   private Integer total;
   private List<Cust_customer> rows;
public Integer getTotal() {
	return total;
}
public void setTotal(Integer total) {
	this.total = total;
}
public List<Cust_customer> getRows() {
	return rows;
}
public void setRows(List<Cust_customer> rows) {
	this.rows = rows;
}
@Override
public String toString() {
	return "FenYe [total=" + total + ", rows=" + rows + "]";
}
   
   
   
}
