package com.algaworks.algafood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificador.NivelUrgencia;
import com.algaworks.algafood.di.notificador.Notificador;
import com.algaworks.algafood.di.notificador.TipoDoNotificador;

//@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

//	@PostConstruct
	public void init() {
		System.out.println("Init");
	}
	
//	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no seu sistema está ativo!");
	}
}
