package com.example.demo.Controller;


import java.lang.annotation.Target;

import javax.servlet.ServletContext;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.CustomerBean;

@Controller
public class FirstControllerProgramAlongWithBootStrap {
	
	@GetMapping("/login")
	public String displayLogin()
	{
		
		return "login-main";
	}

	@GetMapping("/credentials")
	public String displayDetails(@RequestParam String inputEmail,@RequestParam String inputPassword, Model model )
	{
		System.out.println(inputEmail+""+inputPassword);
		model.addAttribute("inputEmail", inputEmail);
		model.addAttribute("inputPassword", inputPassword);
		model.addAttribute("customerBean",new CustomerBean());
		return "welcome-message";
	}
}