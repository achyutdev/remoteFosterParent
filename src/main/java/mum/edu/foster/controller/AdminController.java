package mum.edu.foster.controller;

import mum.edu.foster.service.ChildrenService;
import mum.edu.foster.service.DonationService;
import mum.edu.foster.service.FosterParentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	@Autowired
	private ChildrenService childrenService;

	@Autowired
	private FosterParentService fosterParent;

	@Autowired
	private DonationService donationService;

	public AdminController(ChildrenService childrenService,
			FosterParentService fosterParent, DonationService donationService) {
		this.childrenService = childrenService;
		this.fosterParent = fosterParent;
		this.donationService = donationService;
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(Model model) {

		model.addAttribute("children", childrenService.findAll());
		model.addAttribute("fosterParent", fosterParent.findAll());
		model.addAttribute("donation", donationService.findAll());

		return "admin";
	}
}
