package com.example.demo.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.bean.CouponBean;
import com.example.demo.bean.CouponsBusiness;
import com.example.demo.bean.DemoBean;
import com.example.demo.bean.ThreadsDemoClass;
import com.example.demo.bean.UserProfile;
//import com.example.demo.designpatterns.SingleTon;
import com.example.demo.java8practice.Java8Practice1;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired 
	DemoBean dbean;
	@Autowired 
	CouponsBusiness cb;
	@Autowired
	ApplicationContext ctx;
	@Autowired
	UserProfile up;
	@Autowired
	CouponBean c;
/*	@Autowired
	SingleTon st;*/
	/*@Autowired 
	TestRunnerUsingApplicationRunner tr;*/
	@Autowired
	Java8Practice1 j8p;
	@Autowired 
	ThreadsDemoClass td;

	@Override
	public void run(String... args)
	{
		 List<CouponBean> ai=new ArrayList<CouponBean>();
		dbean=(DemoBean) ctx.getBean("demoBean",DemoBean.class);
		dbean.sayHello();
		
		up=(UserProfile) ctx.getBean("userProfile",UserProfile.class);
		up.UserProfileSuggestion("Vishnu","Vardhan");
		
	    cb=(CouponsBusiness)ctx.getBean("couponsBusiness",CouponsBusiness.class);
        ai.add(new CouponBean("Coupon1",LocalDate.of(2020,02,18),LocalDate.of(2020,02,12))); //6
		ai.add(new CouponBean("Coupon2",LocalDate.of(2020,02,24),LocalDate.of(2020,02,12)));//6
		ai.add(new CouponBean("Coupon3",LocalDate.of(2020,02,24),LocalDate.of(2020,02,12)));//6
		ai.add(new CouponBean("Coupon4",LocalDate.of(2020,02,24),LocalDate.of(2020,02,12))); //12
		Integer i=cb.couponsList(ai);System.out.println(i);
		
		c=ctx.getBean("couponBean",CouponBean.class);
		Iterator k=c.getAllCouponsFromProperties().iterator();
		while(k.hasNext())
		{
			c=(CouponBean)k.next();
			System.out.println(c.getStartDate() + " "+ c.getEndDate()+" "+c.getCouponsList());
		}
		
		td=ctx.getBean("threadsDemoClass",ThreadsDemoClass.class);
       td.main(args);
       
       //singleton
     /*  st=ctx.getBean("singleTon",SingleTon.class);
       st.main(args); */
       
       //ApplicationRunner
     /*  tr=ctx.getBean("testRunnerUsingApplicationRunner",TestRunnerUsingApplicationRunner.class);
       tr.run(null); */
       
       //Java8
       j8p=ctx.getBean("java8Practice1",Java8Practice1.class);
       j8p.main(args);
       
	}
	
}
