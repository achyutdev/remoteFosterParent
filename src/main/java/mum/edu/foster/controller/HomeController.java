package mum.edu.foster.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;
import mum.edu.foster.service.ChildrenService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.vote.AuthenticatedVoter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private ChildrenService childrenService;

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Secured(AuthenticatedVoter.IS_AUTHENTICATED_FULLY)
	@RequestMapping(value = { "/", "/home**" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		logger.info("Welcome home! The client locale is {}.", locale);

		/*
		 * Date date = new Date(); DateFormat dateFormat =
		 * DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,
		 * locale); String formattedDate = dateFormat.format(date);
		 */

		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}

	/*
	 * @RequestMapping(value = "/home", method = RequestMethod.POST) public
	 * String homeLogin(@ModelAttribute){ return "home"; }
	 */

	@RequestMapping("*")
	public String error404() {
		return "404";
	}

	// Spring Security see this :
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error,
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

	}

	@RequestMapping("/childrenlist")
	public String childrenList() {
		return "childrenList";
	}

	@RequestMapping(value = "/admin")
	public @ResponseBody String admin(Model model) {

		model.addAttribute("children", childrenService.findAll());

		for (Person ch : childrenService.findAll()) {
			System.out.println(ch.getFirstName());
		}

		return "admin";
	}

	/*@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public @ResponseBody String admin(HttpServletRequest request) {

		
		 * String firstName = request.getParameter("firstName"); String children
		 * = request.getParameter("children"); childrenService.save(children);
		 
		return "admins";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String createChildren(
			@ModelAttribute("newChildren") Children children) {

		Children newChildren = new Children();
		newChildren.setFirstName("Kebed");
		newChildren.setLastName("Hagos");
		return "redirect:/adminPage";
	}*/
}
