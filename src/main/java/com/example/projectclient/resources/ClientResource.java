package com.example.projectclient.resources;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectclient.entities.Client;

@RestController
@RequestMapping( value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		Instant date = Instant.now();
		List<Client> list = new ArrayList<>();
		list.add(new Client(2L, "Joao", "12345678909", 3289.76, date, 2));
		list.add(new Client(3L, "Maria", "90987654321", 2190.65, date, 3));
		return ResponseEntity.ok().body(list);
	}
}
