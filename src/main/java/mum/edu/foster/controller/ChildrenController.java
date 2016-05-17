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

@Controller
public class ChildrenController {

	@Autowired
	private ChildrenDAO childrenDao;
	
	
	@RequestMapping(value = "/childrenlist", method = RequestMethod.GET)
	public String childrenlistPage(Model model){
		
		List<Children> childList = childrenDao.findAll();
		
 		model.addAttribute("childList",childList);
		
		return "childrenList";
		
	}
	
}
