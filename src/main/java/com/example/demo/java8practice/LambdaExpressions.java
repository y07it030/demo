package com.example.demo.java8practice;


 class LambdaExpression   {
	 int balance=100;
	public synchronized  void withdraw(int amount) throws InterruptedException
	{
		if(amount>balance)
			{
			System.out.println("going to wait");
			wait();
			}
		System.out.println("wait resumed fnds loaded");
		balance=balance-amount;
		System.out.println("balance remaining"+balance);
		
	}
	
	public synchronized void deposit(int amount)
	{
		balance=balance+amount;
		notify();
	}
 }

	public class LambdaExpressions extends Thread  {
	public static void main(String[] args) {
		LambdaExpression le=new LambdaExpression();
	new Thread()
	{
		public void run()
		{
			try {
				le.withdraw(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}.start();
	new Thread()
	{
		public void run()
		{
			try {
				le.deposit(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}.start();
	}
	}
	
	
	
	
	

