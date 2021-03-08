package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {

	private Notificador notificador;

	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui ...
		
//		NotificadorEmail notificador = new NotificadorEmail();
		this.notificador.notificar(cliente, "Nota fiscal do protudo " + produto.getNome() + " foi emitida!");
	}
}
