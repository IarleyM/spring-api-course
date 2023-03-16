package com.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algalog.api.domain.model.Client;

@RestController
public class ClientController {

	@GetMapping("/clients")
	public List<Client> listar() {
		var client1 = new Client(1L, "Joao", "843593485","joao@gmaik.com");
		var client2 = new Client(2L, "Maria", "42598345", "maria@gmail.com");
		return Arrays.asList(client1, client2);
	}
}
