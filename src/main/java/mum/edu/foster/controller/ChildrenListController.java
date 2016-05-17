package mum.edu.foster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;
import mum.edu.foster.service.ChildrenService;
import mum.edu.foster.service.FosterParentService;

@Controller
public class ChildrenListController {
	
	@Autowired
	private ChildrenDAO childrenDao;
	
	
	@RequestMapping(value = "/childrenlist", method = RequestMethod.GET)
	public String childrenlistPage(Model model){
		
		List<Children> childList = childrenDao.findAll();
		System.out.println("Children List");
		for (Children person : childList) {
			
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(person.getDob());
			System.out.println(person.getDescription());
			System.out.println(person.getSupportNeeds().get(0).getFee());
			
		}
		model.addAttribute("childList",childList);
		
		return "childrenList";
		
	}

	
}
