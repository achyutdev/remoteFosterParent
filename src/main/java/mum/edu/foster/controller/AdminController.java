package mum.edu.foster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.dao.DonationDAO;
import mum.edu.foster.dao.FosterParentDAO;
import mum.edu.foster.domain.Children;

@Controller
public class AdminController {

	@Autowired
	private ChildrenDAO childrenService;

	@Autowired
	private FosterParentDAO fosterParent;

	@Autowired
	private DonationDAO donationService;

	/*@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(Model model) {

		System.out.println(childrenService.findAll().size());
		model.addAttribute("children", childrenService.findAll());
		model.addAttribute("fosterParent", fosterParent.findAll());
		model.addAttribute("donation", donationService.findAll());

		return "admin";
	}*/
}