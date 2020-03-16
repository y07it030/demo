package com.example.demo.java8practice;

import java.lang.annotation.Retention;
import java.lang.annotation.*;

@RepeatableAnnotation
@RepeatableAnnotation
class harsha
{
	
}

@Repeatable(Repeats.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RepeatableAnnotation
{
	
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Repeats
{
	RepeatableAnnotation[] value();
}

