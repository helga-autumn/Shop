package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BuyerService;


@Controller

public class BuyerController {
	@Autowired
	private BuyerService buyerService;
	@RequestMapping("/Buyer")
	
	public String show(Model model){
		model.addAttribute("buyers", buyerService.getAll());
		return "buyer";
		
	}

}
