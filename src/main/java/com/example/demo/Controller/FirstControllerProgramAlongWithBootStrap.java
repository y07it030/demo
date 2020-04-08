package com.example.demo.Controller;


import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.JPA.MyEntity;
import com.example.demo.JPA.ServiceDataJPA;
import com.example.demo.bean.CustomerBean;

@Controller
public class FirstControllerProgramAlongWithBootStrap {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	ServiceDataJPA serviceJPA;
	@GetMapping("/login")
	public String displayLogin()
	{
		return "login-main";
	}
	
	@GetMapping("/getData")
public String getPageData(@RequestParam(value="PageIndex",defaultValue = "0") int PageIndex,Model model)
{
		Page<MyEntity>  page=serviceJPA.getTheJpaDbDetails(PageIndex);
		int curPage=page.getNumber();
	
		boolean previous=page.hasPrevious();
		boolean next=page.hasNext();
		System.out.println(previous);
		System.out.println(next);
		System.out.println(curPage);
		
		List<MyEntity> lisPage = page.getContent();
        Map hm=new HashMap();
        CustomerBean c=new CustomerBean();
		for(int i=0;i<lisPage.size();i++)
		{
			hm.put(lisPage.get(i).getId(),lisPage.get(i).getName());
			c.setDbDetails(hm);
		}
		System.out.println("Inside service"+c.getDbDetails());
		model.addAttribute("cust",c);
		model.addAttribute("previous",previous);
		model.addAttribute("next",next);
		model.addAttribute("curPage",curPage);
		return "login-info";
}
	@GetMapping("/credentials")
	public String displayDetails(@RequestParam String inputEmail,@RequestParam String inputPassword, Model model )
	{
		
		
		System.out.println(inputEmail+""+inputPassword);
		model.addAttribute("inputEmail", inputEmail);
		model.addAttribute("inputPassword", inputPassword);

		
		model.addAttribute("cust",new CustomerBean());
		return "welcome-message";
	}
}
