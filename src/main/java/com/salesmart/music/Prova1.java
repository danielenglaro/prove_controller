package com.salesmart.music;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:9090")
@RequestMapping("/ehi")
public class Prova1 {

	@GetMapping("/ciao")
	String rispondi() {
		return "ciao";
	}
}
