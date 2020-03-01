package com.example.demo.bean;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Timer;

import org.springframework.stereotype.Component;

@Component
public class ThreadsDemoClass extends Thread {
	
	@Override
	public void run()
	{
//		ThreadPoolExecutor te=(ThreadPoolExecutor)Executors.newFixedThreadPool(2);
		ScheduledThreadPoolExecutor te=new ScheduledThreadPoolExecutor(2);
	 //    te.scheduleWithFixedDelay(new Task(),5,5,TimeUnit.SECONDS);
      
}
	

	public static void main(String[] args) {
		
		ThreadsDemoClass tc=new ThreadsDemoClass();
		tc.start();
		/*Thread T =new Thread(new Task());
		T.start();*/
//new Thread(()->for());
	}
}

class Task implements Runnable {
	
	@Override 
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Task : "+i);
		}
	}

}
