package com.example.demo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.demo.runner.TestCouponsValidity;
import com.example.demo.runner.TestUserProfileRunner;



@RunWith(Suite.class)
@SuiteClasses({TestUserProfileRunner.class,TestCouponsValidity.class})
public class TestingSuite {

}
