package com.example.demo.java8practice;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import java.util.*;

public class tuplesusingstreams {

	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		List<Integer> ai = Arrays.asList(1, 3, 2, 4, 5, 6, 8, 7, 0, 9, 1, 4, 0);// (0,9)(1,8)(2,7),(3,6)(4,5)
		ai.forEach(System.out::print);
		ai.forEach(i->System.out.println(i));
		List<Integer> li = ai.stream().distinct().sorted().collect(Collectors.toList());
		first: for (int i : li) {
			second: for (int j : li) {
				if (i + j == 9) {
					if (!hm.containsKey(j) && !hm.containsKey(i)) {
						hm.put(i, j);
					}
				}
			}
		}
		hm.keySet().forEach(key ->{
		System.out.println(hm.get(key)+""+key);
		});

	}

}
