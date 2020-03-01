package com.example.demo.bean;

import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.demo.interfaces.UserProfileDAO;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

@Component
public class CouponsBusiness {

	
	UserProfileDAO udao;
	CouponBean cb;

	/*
	 * public void setUdao(UserProfileDAO udao) { this.udao = udao; }
	 */
public CouponsBusiness()
{
	
}
	public CouponsBusiness(UserProfileDAO udao) {
		super();
		this.udao = udao;
	}

	public Integer couponsList(List<CouponBean> actualCouponsList) {
		int expiryWithInDays = 6;//udao.getExpiryDate();
		int numberOfValidCoupons = 0;
		List<CouponBean> expiredCoupons = new ArrayList();
		List<CouponBean> validCoupons = new ArrayList();
		for (int i = 1; i < actualCouponsList.size(); i++) {

			cb = (CouponBean) actualCouponsList.get(i);
			Period period = Period.between(cb.getEndDate(), cb.getStartDate());
			
			if (expiryWithInDays < period.getDays()) {
				expiredCoupons.add(actualCouponsList.get(i));
			}

		}
	

		actualCouponsList.removeAll(expiredCoupons);
		numberOfValidCoupons = actualCouponsList.size();

		return numberOfValidCoupons;
	}

}
