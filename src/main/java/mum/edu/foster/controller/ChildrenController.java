package mum.edu.foster.controller;

import mum.edu.foster.domain.Person;
import mum.edu.foster.service.ChildrenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChildrenController {

	@Autowired
	private ChildrenService childrenService;
	
	public void setChildrenService(ChildrenService childrenService) {
		this.childrenService = childrenService;
	}

	@RequestMapping(value = "/children", method = RequestMethod.GET)
	public String Children(Model model) {

		model.addAttribute("children", childrenService.findAll());

		for (Person ch : childrenService.findAll()) {
			System.out.println(ch.getFirstName());
		}

		return "children";
	}
}
