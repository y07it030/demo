package com.example.demo.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class TestRunnerUsingApplicationRunner implements ApplicationRunner {

	@Override

	public void run(ApplicationArguments args) {
		args.getNonOptionArgs().forEach(name -> System.out.println(name));
		args.getOptionNames().forEach(name -> {
			System.out.println(name);
			args.getOptionValues(name).forEach(optionValue -> System.out.println(optionValue));

		});

	}

}
