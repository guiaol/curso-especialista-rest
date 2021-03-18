package com.algaworks.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.notificador.NivelUrgencia;
import com.algaworks.algafood.di.notificador.Notificador;
import com.algaworks.algafood.di.notificador.TipoDoNotificador;
import com.algaworks.algafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Cliente " + event.getCliente().getNome() + " agora esta ativo!");
	}
	
}
