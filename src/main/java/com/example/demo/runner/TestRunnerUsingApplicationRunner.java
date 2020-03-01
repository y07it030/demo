package com.example.demo.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class TestRunnerUsingApplicationRunner implements ApplicationRunner {
	// Differ between CL and AR is AR can give list of optional and non optional
	// values separately.
	@Override
	public void run(ApplicationArguments args) {
		args.getNonOptionArgs().forEach(System.out::println);
		args.getOptionNames().forEach(names -> {
			System.out.println(names);
			args.getOptionValues(names).forEach(System.out::println);
		});
	}
}
