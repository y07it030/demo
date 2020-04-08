package com.example.demo.bean;

import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.demo.interfaces.UserProfileDAO;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

@Component
public class CouponsBusiness {


@Qualifier("userProfileQualifer")
@Autowired
	UserProfileDAO udao;
    CouponBean cb;
public CouponsBusiness()
{
	
}
	 public void setUdao(UserProfileDAO udao) { this.udao = udao; }

	public int couponsList(List<CouponBean> actualCouponsList) {
		int expiryWithInDays = 6;//udao.getExpiryDate();
		System.out.println("expdays"+expiryWithInDays);
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
