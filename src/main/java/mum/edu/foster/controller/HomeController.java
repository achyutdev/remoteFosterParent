package mum.edu.foster.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.foster.dao.FosterParentDAO;
import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.service.ChildrenService;

@Controller
public class HomeController {

	private ChildrenService childrenService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = { "	", "/home" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		logger.info("Welcome home! The client locale is {}.", locale);

		System.out.println("We are here !!");

		/*
		 * Date date = new Date(); DateFormat dateFormat =
		 * DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,
		 * locale); String formattedDate = dateFormat.format(date);
		 */

		return "home";
	}

	@RequestMapping("*")
	public String error404() {
		return "404";
	}
/*
	@Autowired
	private FosterParentDAO fosterParentDao;
	

	@RequestMapping(value = "/fosterParent", method = RequestMethod.GET)
	public String forsterParent(Model moder) {
		System.out.println("test form fosterparent");
		return "fosterParent";
	}

	@RequestMapping(value = "/fosterParentReg", method = RequestMethod.GET)
	public String forsterParentRegistration(Model model) {
		model.addAttribute("fosterParent", new FosterParent());
		return "fosterParentReg";
	}

	//@RequestMapping(value = "/fosterParentRegSave", method = RequestMethod.POST)
	@RequestMapping(value = "/fosterParentReg", method = RequestMethod.POST)
	public String forsterParentRegistrationSave(@ModelAttribute("fosterParent") FosterParent fosterParent,
			final RedirectAttributes redirectAttributes, BindingResult result) {
		if(result.hasErrors())
		{
			//ModelAndView model1=new ModelAndView("fosterParentReg");
			return "fosterParentReg";
		}
		
		if (fosterParentDao.save(fosterParent) != null) {
			// this is to take object to other page
			// redirectAttributes.addFlashAttribute("fosterParent",
			// fosterParent);
			System.out.println("Not null");
			redirectAttributes.addFlashAttribute("message", "Your are successfully register. Login in to the system");
			//return "redirect:redirectToHome";
			return "redirect:home";
		}else{
			redirectAttributes.addFlashAttribute("message", "Added successfully.");
			System.out.println("Not null");
			return "fosterParentReg";
		}
		
	}

	@RequestMapping(value = "redirectToHome", method = RequestMethod.GET)
	public String backToHome(@ModelAttribute("fosterparent") FosterParent fosterparent) {
		System.out.println("fosterparent:" + fosterparent.getFirstName());
		return "home";
	}
	*/
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
