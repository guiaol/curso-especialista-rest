package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private Notificador notificador;

//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}
//	
//	public AtivacaoClienteService(String qualquerCoisa) {
//
//	} 

	public void ativar(Cliente cliente) {
		cliente.ativar();

		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

	}

	
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}

}
