package mum.edu.foster.controller;

import java.util.Locale;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.dao.DonationDAO;
import mum.edu.foster.dao.FosterParentDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	//private ChildrenDAO childrenService;
	
	@Autowired
	private ChildrenDAO childrenService;

	@Autowired
	private FosterParentDAO fosterParent;

	@Autowired
	private DonationDAO donationService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = { "/", "/admin" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		logger.info("Welcome home! The client locale is {}.", locale);

		System.out.println("We are here !!");

		/*
		 * Date date = new Date(); DateFormat dateFormat =
		 * DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,
		 * locale); String formattedDate = dateFormat.format(date);
		 */
		//model.addAttribute("admin",childrenService.findAll());
		
		
		model.addAttribute("children", childrenService.findAll());
		model.addAttribute("fosterParent", fosterParent.findAll());
		model.addAttribute("donation", donationService.findDetailAll());

		return "admin";
	}

	@RequestMapping("*")
	public String error404() {
		return "404";
	}

/*	// Spring Security see this :
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}*/

/*	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(Model model) {
		return "admin";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String createChildren(@ModelAttribute("newChildren") Children children) {

		Children newChildren = new Children();
		newChildren.setFirstName("Kebed");
		newChildren.setLastName("Hagos");
		return "redirect:/adminPage";
	}*/
}
