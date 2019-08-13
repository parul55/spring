package com.zensar.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@PostMapping("/validing")
	public String validate(User user,ModelMap map){
		if(user.getUsername().equals("parul")&& (user.getPassword().equals("currentuser"))){
			map.addAttribute("user",user);
			return "success";
		}
		else{
			map.addAttribute("LogonERROR","Wrong Details");
			return "login";
		}
		
	}
}
