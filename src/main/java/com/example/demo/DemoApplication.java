package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@PropertySource("classpath:harsha_env.properties")
public class DemoApplication extends WebMvcConfigurerAdapter {
	
	@Override
	 public void addViewControllers (ViewControllerRegistry registry) {
	      RedirectViewControllerRegistration r =
	                registry.addRedirectViewController("/*", "./login");
	  }
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
