package mum.edu.foster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.foster.dao.SupportNeedDAO;
import mum.edu.foster.domain.Category;
import mum.edu.foster.domain.SupportNeed;

@Controller
public class SupportNeedController {
	
	
	private SupportNeedDAO suppdao;
	
	@Autowired
	SupportNeedController(SupportNeedDAO suppdao){
		this.suppdao = suppdao;
	}
	
	
	@RequestMapping("/supportneed")
	public void jpt(){ 
		SupportNeed supportneed = new SupportNeed();
		supportneed.setCategory(Category.FOOD);
		supportneed.setFee(345.34);
		System.out.println(supportneed);
		suppdao.save(supportneed);
	}
}
