package com.example.demo.java8practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.annotation.Configuration;

import com.sun.tools.javac.code.Attribute.RetentionPolicy;

public class Streams {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1, 4, 5, 6, 2, 8);
		List<Integer> ai = li.stream().filter((Integer number) -> number < 6).collect(Collectors.toList());
		ai.forEach(number1 -> {
			System.out.println(number1);
		});

		Set<Integer> s = new HashSet(Arrays.asList(1, 4, 5, 6, 2, 8));
		List<Integer> aix = s.stream().filter((Integer number3) -> number3 < 6).collect(Collectors.toList());
		aix.forEach(number2 -> {
			System.out.println(number2);
		});
		
		//sorint using stream
		
		List<Integer> sortList=Arrays.asList(9,32,735,22,435);
		List<Integer> sortedList=sortList.stream().parallel().
				sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> sortList1=Arrays.asList(9,32,735,22,435);
		List<Integer> sortedList1=sortList1.stream().parallel().
			sorted((e2,e1)->e1-e2).collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> sortList2=Arrays.asList(9,32,735,22,435,735,22);
		List<Integer> k= sortList2.stream().parallel().
			sorted((e2,e1)->e1-e2).distinct().collect(Collectors.toList());
		System.out.println(k);
		
		

	}
}
