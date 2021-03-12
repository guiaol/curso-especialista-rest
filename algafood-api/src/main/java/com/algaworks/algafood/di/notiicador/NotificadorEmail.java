package com.algaworks.algafood.di.notiicador;

import com.algaworks.algafood.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	private String hostServidorSmtp;

	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		if (caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}

		System.out.printf("Notificando %s atraves do email %s usando servidor SMTP %s: %s\n", cliente.getNome(),
				cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
