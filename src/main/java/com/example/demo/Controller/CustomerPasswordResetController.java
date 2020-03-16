package com.example.demo.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.bean.CustomerBean;

@Controller
public class CustomerPasswordResetController {
	JavaMailSenderImpl mailSenderImpl;
	SimpleMailMessage mimeMessage;
	MimeMessageHelper mimeMessageHelper;

	@GetMapping("/reset")
	public String resetPassword(@Valid @ModelAttribute("cust") CustomerBean customerBean, BindingResult br, Model m) throws MessagingException, IOException {
		if (customerBean.getPassword().equals(customerBean.getConfirmpassword()) && !br.hasErrors()) {

			return "login-main";
		} else {

			/*
			 * mailSenderImpl=new JavaMailSenderImpl(); mimeMessage=new SimpleMailMessage();
			 * mimeMessage.setTo("guttikondaharshavardhan@gmail.com");
			 * mimeMessage.setSubject("Hello this is my practice mail");
			 * mimeMessage.setText("You done it");
			 */
			/*
			 * mimeMessage =mailSenderImpl.createMimeMessage(); mimeMessageHelper=new
			 * MimeMessageHelper(mimeMessage, true);
			 * mimeMessageHelper.setTo("guttikondaharshavardhan@gmail.com");
			 * mimeMessageHelper.setText("Hello this is my practice mail");
			 * FileSystemResource fsr=new
			 * FileSystemResource("C:\\Users\\home\\Desktop\\pass.txt");
			 * mimeMessageHelper.addAttachment("hai",fsr);
			 */
			/* mailSenderImpl.send(mimeMessage); */

			return "welcome-message";
		}
	}

	@PostMapping("/upload")
	public String upload(@ModelAttribute("cust") CustomerBean customerBean,@RequestParam("file") MultipartFile file) throws IOException {
		byte[] bytes = file.getBytes();
		Path p = Paths.get("C:\\Users\\home\\Desktop\\hello");
		Files.write(p, bytes);
		System.out.println("FileSuccessfully Uploaded");
		return "welcome-message";
	}

}
