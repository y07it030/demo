package com.example.demo.java8practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.*;

public class ParallelStreams {

	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> ai=li.stream()
				.parallel().map(number ->number+1).collect(Collectors.toList());
		ai.forEach(lx->{ try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println(lx);});
		
		
	}
	
}
