package mum.edu.foster.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import mum.edu.foster.domain.Category;
import mum.edu.foster.domain.Donation;
import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.messaging.sitruMailer;
import mum.edu.foster.service.FosterParentService;

@Aspect
public class SupportAdvice {
	//@Autowired
	FosterParentService fosterParentService;
	//@Autowired
	sitruMailer mailer;

	public sitruMailer getMailer() {
		return mailer;
	}

	public void setMailer(sitruMailer mailer) {
		this.mailer = mailer;
	}

	public FosterParentService getFosterParentService() {
		return fosterParentService;
	}

	public void setFosterParentService(FosterParentService fosterParentService) {
		this.fosterParentService = fosterParentService;
	}

	// @After("execution(*
	// mum.edu.foster.service.impl.DonationServiceImpl.save(..))")
	@After("execution( * mum.edu.foster.controller.FosterParentController.forsterParentRegistrationSave(..))")
	public void SupportAdvicemethod(JoinPoint jp) {
		/*
		 * donation.getId() donation.getAmount(); donation.getDonatedDate();
		 */
		System.out.println("Thank you for your help!!");
		Object[] args = jp.getArgs();
		FosterParent fosterParent = (	FosterParent  ) args[0];
//		FosterParent fosterParent = (FosterParent) fosterParentService.findById(Long.parseLong(id));
		System.out.println("Sending Email to========" + fosterParent.getEmail());

		mailer.sendMail("citysul12@gmail.com", "Conformation",
				"Thank you for your help! here is your id" );

	}

}