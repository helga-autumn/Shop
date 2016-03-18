package ua.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Buyer;

import service.BuyerService;

@Controller
public class IndexController {

	private List<Buyer> list = new ArrayList<Buyer>();
	@Autowired
	private BuyerService buyer;
	private String firstName;

	@RequestMapping("/buyer")
	public String indexView(Model model) {
		buyer.toString();
		model.addAttribute("buyers", list);
		return "index";
	}

	@RequestMapping(value = "/buyer", method = RequestMethod.POST)
	public String indexPost(@RequestParam(value="id") int id,
			@RequestParam String name) {
		list.add(new Buyer(id, firstName));
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String delete(@PathVariable int id){
		list.remove(id);
		return "redirect:/";
	}
}
