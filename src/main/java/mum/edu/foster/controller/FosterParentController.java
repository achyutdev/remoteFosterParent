package mum.edu.foster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FosterParentController {
	
	@RequestMapping(value = "/fosterParent", method = RequestMethod.GET)
	public String forsterParent(Model moder){
		System.out.println("test form fosterparent");
		return "fosterParent";
	}
	
	
}
