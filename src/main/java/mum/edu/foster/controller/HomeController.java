package mum.edu.foster.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.dao.DonationDAO;
import mum.edu.foster.dao.FosterParentDAO;
import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.util.NoSuchResourceException;

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

	@RequestMapping(value = {"/admin" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		logger.info("Welcome home! The client locale is {}.", locale);

		System.out.println("We are here !!");

		/*
		 * Date date = new Date(); DateFormat dateFormat =
		 * DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,
		 * locale); String formattedDate = dateFormat.format(date);
		 */
		
		
		model.addAttribute("children", childrenService.findAll());
		model.addAttribute("fosterParent", fosterParent.findAll());
		model.addAttribute("donation", donationService.findDetailAll());

		return "admin";
	}
	
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	

	@RequestMapping(value = "/contactUs")
	public String contactUs(Model model){
		model.addAttribute("address","Fairfield IA");
		model.addAttribute("phoneOffice","9878653453");
		model.addAttribute("faxOffice","78234638746");
		return "contactUs";
	}
	
	@RequestMapping(value = "/aboutUs")
	public String aboutUs(Model model){
		model.addAttribute("description","We are to help children.");
		return "aboutUs";
	}
	
	
	@RequestMapping("*")
	public String error404() {
		return "404";
	}


	@ExceptionHandler(value=NoSuchResourceException.class)
	public ModelAndView handle(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.getModel().put("e", e);
		mv.setViewName("noSuchResource");
		return mv;
	}
}
