package mum.edu.foster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.foster.dao.FosterParentDAO;
import mum.edu.foster.domain.FosterParent;

@Controller
public class FosterParentController {

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
	@RequestMapping(value = "/fosterParentRegSave", method = RequestMethod.POST)
	public String forsterParentRegistrationSave(@ModelAttribute("fosterParent") FosterParent fosterParent,BindingResult result,
			final RedirectAttributes redirectAttributes) {
		if(result.hasErrors())
		{
			System.out.println("Got validation error");
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
			return "home"; //redirect:home";
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
}
