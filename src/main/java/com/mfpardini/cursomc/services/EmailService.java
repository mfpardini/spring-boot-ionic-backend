package com.mfpardini.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.mfpardini.cursomc.domain.Cliente;
import com.mfpardini.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPassword);
	
}
