package br.com.emailproject.bean;

import java.io.Serializable;

import br.com.emailproject.dto.EmailLayout;
import br.com.emailproject.model.Email;
import br.com.emailproject.service.EmailService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class EmailBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EmailService emailService;
	
	public String enviarEmail() {
		
		emailService.enviar(montaremail());
		
		return null;
	}
	
	private Email montaremail() {
		
		EmailLayout layout = new EmailLayout();
		
		return layout.montarEmailAdimnistrador("guto_montaldi@yahoo.com.br", "Mudança de senha");
	}
}
