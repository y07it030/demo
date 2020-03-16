package com.example.demo.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class CouponBean {

@Value("${startDate}")
private LocalDate startDate;
@Value("${endDate}")
private LocalDate endDate;
@Value("${coupon}")
private String coupon;
	
	
	
	  public CouponBean() {
	  
	  }
	 
	public CouponBean(String coupon,LocalDate startDate,LocalDate endDate)
	{
		super();
		this.coupon=coupon;
		this.startDate=startDate;
		this.endDate=endDate;
	} 
	

	public LocalDate getStartDate() {
		return startDate;
	}

	public String getCouponsList() {
		return coupon;
	}

	public void setCouponsList(String coupon) {
		this.coupon = coupon;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	

	public List<CouponBean> getAllCouponsFromProperties() {
		List<CouponBean> ai=new ArrayList<CouponBean>();
		CouponBean b=new CouponBean();
		b.setStartDate(startDate);
		b.setEndDate(endDate);
		b.setCouponsList(coupon);
		ai.add(b);
	return ai;
	}
	
	
	
}
