package com.example.demo.runner;


import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.stereotype.Component;

import com.example.demo.bean.CouponBean;
import com.example.demo.bean.CouponsBusiness;
import com.example.demo.interfaces.UserProfileDAO;

@Component
@RunWith(MockitoJUnitRunner.class)
public class TestCouponsValidity {
	
	private static List<CouponBean> couponList;
	
	
	@Mock
	UserProfileDAO udao;

	@InjectMocks
	CouponsBusiness cb=new CouponsBusiness();
	
	@BeforeClass
	public static void beforeClass()
	{
		couponList=new ArrayList<CouponBean>();
	}
	@Before
	public void before()
	{
	
		couponList.add(new CouponBean("Coupon1",LocalDate.of(2020,02,18),LocalDate.of(2020,02,12))); //6
		couponList.add(new CouponBean("Coupon2",LocalDate.of(2020,02,24),LocalDate.of(2020,02,12)));//6
		couponList.add(new CouponBean("Coupon3",LocalDate.of(2020,02,24),LocalDate.of(2020,02,12)));//6
		couponList.add(new CouponBean("Coupon4",LocalDate.of(2020,02,24),LocalDate.of(2020,02,12))); //12
	}

	@Test
	public void testCouponsValidity()
	{

	Mockito.when(udao.getExpiryDate()).thenReturn(6);
		assertEquals(1,cb.couponsList(couponList));
	}
	@After
	public void after()
	{
		cb=null;
	}
	@AfterClass 
	public static void  afterClass()
	{
		couponList=null;
	}
}
