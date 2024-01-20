package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	
	public Email montarEmailAdimnistrador(String destinatario, String assunto) {
		
		StringBuffer texto = new StringBuffer();
		
		return new Email(destinatario, assunto, texto.toString());
	}

}
