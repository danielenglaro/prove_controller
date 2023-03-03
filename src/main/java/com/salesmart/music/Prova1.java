package com.salesmart.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salesmart.com")
public class Prova1 {
	
	@Autowired
	UserRepository userRepository;

//	localhost:8080/salesmart.com/ciao/daniele
	@GetMapping("/ciao/{nome}")
	public String rispondi(@PathVariable("nome") String nome) {
		return "ciao " + nome;
	}
	
//	localhost:8080/salesmart.com/saluta?nome=daniele
	@GetMapping("/saluta")
	public String saluta(@RequestParam("nome") String nome) {
		return "ehi " + nome;
	}
	
//	localhost:8080/salesmart.com/itera?nome=daniele&num=3
	@GetMapping("/itera")
	public String itera(@RequestParam("nome") String nome, @RequestParam("num") int num) {
		String str = "";
		for (int i = 0; i<num; i++) {
			str = str + " " + nome;
		}
		return str;
	}

	
	@PostMapping(path="/newuser") // Map ONLY POST Requests
	  public Utente addNewUser (@RequestBody UserDTO us ) {
		Utente u = new Utente(us);
		userRepository.save(u);
		return u;
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
		
	  }
}
