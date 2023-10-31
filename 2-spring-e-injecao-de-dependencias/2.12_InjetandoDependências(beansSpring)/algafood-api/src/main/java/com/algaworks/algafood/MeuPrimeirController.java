package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeirController {

	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeirController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeirController: " + ativacaoClienteService);
	}



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente joao = new Cliente("Joao", "@joao", "123");
		
		ativacaoClienteService.ativar(joao);
		
		return "Hello!";
	}
	
}
