package ua.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


public class LoginController {
	@RequestMapping(value="/login")
	
	public String showLogin() {
	 return "loginPage";
	 
	}
	 
	@RequestMapping(value="/logout")
	public String login(Model model) {
	 SecurityContextHolder.getContext().setAuthentication(null);
	return "redirect:/";
	

}
}
