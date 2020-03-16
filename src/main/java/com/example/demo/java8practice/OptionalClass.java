package com.example.demo.java8practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
public static void main(String[] args) {
String str=null;

Optional<String> oi=Optional.ofNullable(str);


	str=oi.orElse("The value is null so use me");
	System.out.println(str);


}
}
