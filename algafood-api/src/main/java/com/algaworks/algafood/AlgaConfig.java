package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.di.notificador.NotificadorEmail;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

//@Configuration
public class AlgaConfig {

//	@Bean
//	public NotificadorEmail notificadorEmail() {
//		NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.algamail.com.br");
//		notificadorEmail.setCaixaAlta(true);
//		return notificadorEmail;
//	}
	
//	@Bean	
//	public AtivacaoClienteService ativacaoClienteService() {
//		return new AtivacaoClienteService(notificadorEmail());
//	}
}
