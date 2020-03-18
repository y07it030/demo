package com.example.demo.java8practice;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.lang.Nullable;

public class StreamsAndOptional {
public static void main(String[] args) {
	
	
	Integer i=10;
	Optional<Integer> o=Optional.ofNullable(i);
	System.out.println(o.orElse(0));
}
}
