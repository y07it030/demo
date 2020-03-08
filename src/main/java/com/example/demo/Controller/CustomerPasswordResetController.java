package com.example.demo.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.CustomerBean;

@Component
@RequestMapping("/admin")
public class CustomerPasswordResetController {
	@GetMapping(value="/reset")
	public String resetPassword(@Valid @ModelAttribute("customerBean") CustomerBean customerBean, BindingResult br, Model m)
	{
		m.addAttribute("customerBean");
		if(customerBean.getPassword().equals(customerBean.getConfirmpassword()) && !br.hasErrors() )
			return "login-main";
		else
			return "welcome-message";	
	}
	

	

}
