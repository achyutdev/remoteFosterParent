/*package mum.edu.foster.service.impl;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("SitruEmail")
public class SitruMailer {

	private MailSender mailSender;

	private SimpleMailMessage preConfiguredMessage;


	*//**
	 * This method will send compose and send the message
	 *//*
	public void sendMail(String to, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(body);
		mailSender.send(message);

	}

	*//**
	 * This method will send a pre-configured message
	 *//*
	public void sendPreConfiguredMail(String message) {
		SimpleMailMessage mailMessage = new SimpleMailMessage(preConfiguredMessage);
		mailMessage.setText(message);
		mailSender.send(mailMessage);
	}

}*/