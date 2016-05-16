package mum.edu.foster.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.domain.Support;
import mum.edu.foster.service.FosterParentService;
import mum.edu.foster.service.StaffService;

public class IndexController {
@Resource	
private StaffService staffService;
@Resource
private FosterParentService fosterParentService;	
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String login(){
		return "index";
}
//	@RequestMapping(value="/index", method=RequestMethod.POST)
//	public  ModelAndView loginForm(@ModelAttribute())
//}

public StaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}

@RequestMapping(value="/registration", method=RequestMethod.POST)
public String SignUp(  long id,String FName,String Lname,String email, String phone, String occupation, List<Support> supports,
		List<Children> children)
{
	fosterParentService.creatFosterPrent(id, FName, Lname, email, phone, occupation, supports, children);
	return "chid...";
}
@RequestMapping(value="/index", method=RequestMethod.POST)
public String login(long userId, String password){
	//this.userId=userId;
	if(staffService.checkStaff(userId, password))
	    return "redirect:/...";
	
	return "login";
}


}