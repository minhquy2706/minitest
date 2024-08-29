package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.Person;

@Controller
public class HomeController {
	
	@RequestMapping(value = { "/", "trang-chu" }, method = RequestMethod.GET)
	public String index(Model model) {
		// tạo 1 đối tượng person
		Person p = new Person();
		p.setAge(43);
		p.setId(1);
		p.setName("nguyen caen â");
		model.addAttribute("p", p);
		return "index1";
	}
}
