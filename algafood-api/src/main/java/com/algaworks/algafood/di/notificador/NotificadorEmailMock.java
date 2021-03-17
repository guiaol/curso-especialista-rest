package com.algaworks.algafood.di.notificador;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {

	public NotificadorEmailMock() {
		System.out.println("Notificador email MOCK");
		}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificacao seria enviada para %s atraves do email %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}
}
