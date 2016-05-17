package mum.edu.foster.controller;

import mum.edu.foster.domain.Children;
import mum.edu.foster.service.ChildrenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

		return "children";
	}

	@RequestMapping(value = "/childrenAdd", method = RequestMethod.POST)
	public String childrenRegistration(
			@ModelAttribute("childrenAdd") Children children,
			final RedirectAttributes redirectAttributes) {

		childrenService.save(children);

		redirectAttributes.addFlashAttribute("message", "Added successfully.");
		return "/childrenAdd";

	}
}
