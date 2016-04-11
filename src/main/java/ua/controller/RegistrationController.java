package ua.controller;


import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.Orders;
import com.entity.User;
import com.service.UserService;

public class RegistrationController {
	@Autowired
	private UserService userService;
	@InitBinder
	protected void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(User.class, new UserEditor(userService));
	}
	@ModelAttribute("orders")
	public User setOrders(){
		User orders = new User();
		orders.setOrders(new Orders());
		return orders;
	}
	
	
	
	@RequestMapping("/registration")
	public String showRegistration(){
		return "registration";
	}
	
	
	@RequestMapping(value="/registration/orders", method = RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){
	if(bindingResult.hasErrors()){
		return "registration";
	}
	userService.save(user);
	return "redirect:/";
	}
	@RequestMapping(value= "/registration/orders", method=RequestMethod.POST)
	public String saveOrders(@Valid @ModelAttribute("orders") User orders, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "registration";
			}
		userService.save(orders);
		return "redirect:/";
	
	}
	
	

}
