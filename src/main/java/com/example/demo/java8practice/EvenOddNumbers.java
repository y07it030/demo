package com.example.demo.java8practice;

import java.math.BigInteger;

public class EvenOddNumbers {
	public void sortArrays()
	{
		int[] x ={3,2,1,4,5};
		int temp = 0;
		for (int i = 0; i <x.length; i++) {

			for (int j = i + 1; j < x.length; j++) {
				
				if (x[i] < x[j])
				  temp = x[i];
				  x[i] = x[j];
			 	  x[j] = temp;
			}

		}
		for (int c = 0; c < x.length; c++) {
			System.out.println(x[c]);
		}
	}
	public static void main(String[] args) {
		EvenOddNumbers eo=new EvenOddNumbers();
		eo.sortArrays();
		int a = 5;
		 System.out.println((a & 1) == 0 ? "Even" : "Odd");
		int n = 0;
		while (n++ != 100) {
			BigInteger bigNumber = new BigInteger(String.valueOf(n));
			boolean flag = bigNumber.isProbablePrime(1);
			if (flag) {
				System.out.println(n);
			}

		}

		

	}
}
