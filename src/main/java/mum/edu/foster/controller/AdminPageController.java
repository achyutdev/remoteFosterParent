package mum.edu.foster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.foster.service.FosterParentService;

@Controller
public class AdminPageController {
	
	private FosterParentService fosterParentService;
	
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(Model model){
		
		model.addAttribute("fosterParentList",fosterParentService.getAll());
		return "admin";
	}
	
	

}
