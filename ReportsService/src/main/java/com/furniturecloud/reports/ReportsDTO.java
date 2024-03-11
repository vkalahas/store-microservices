package com.furniturecloud.reports;

import java.util.Date;

public class ReportsDTO {
	Orders[] orders;
	Date first;
	Date last;
	public Orders[] getOrders() {
		return orders;
	}
	public void setOrders(Orders[] orders) {
		this.orders = orders;
	}
	public Date getFirst() {
		return first;
	}
	public void setFirst(Date first) {
		this.first = first;
	}
	public Date getLast() {
		return last;
	}
	public void setLast(Date last) {
		this.last = last;
	}
	

}
