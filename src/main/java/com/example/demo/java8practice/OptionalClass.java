package com.example.demo.java8practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
	
		Integer i=null;
		Optional<Integer> o=Optional.ofNullable(i);
		System.out.println(o.orElse(0));
		

	}
}
