package mum.edu.foster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.domain.Person;
import mum.edu.foster.service.ChildrenService;

@Controller
public class ChildrenController {

	@Autowired
	private ChildrenDAO childrenDao;

	@RequestMapping(value = "/childrenlist", method = RequestMethod.GET)
	public String childrenlistPage(Model model) {

		List<Children> childList = childrenDao.findAll();

		model.addAttribute("childList", childList);

		return "childrenList";

	}

	@RequestMapping(value = "/children", method = RequestMethod.GET)
	public String forsterParent(Model moder) {
		System.out.println("test form children");
		return "children";
	}

	@RequestMapping(value = "/childrenAdd", method = RequestMethod.GET)
	public String forsterParentRegistration(Model model) {
		model.addAttribute("children", new Children());
		return "childrenAdd";
	}

	@RequestMapping(value = "/childrenRegSave", method = RequestMethod.POST)
	public String childrenSave(@ModelAttribute("children") Children children,
			final RedirectAttributes redirectAttributes) {

		if (childrenDao.save(children) != null) {

			System.out.println("Not null");
			redirectAttributes.addFlashAttribute("message",
					"The Child is Successfully register");
			return "redirect:childrenAdd";
		} else {
			redirectAttributes.addFlashAttribute("message",
					"Added successfully.");
			System.out.println("Not null");
			return "childrenAdd";
		}

	}

}
