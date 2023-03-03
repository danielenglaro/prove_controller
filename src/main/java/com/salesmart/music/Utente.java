package com.salesmart.music;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name="utenti")
@AllArgsConstructor
public class Utente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_utente;
	
	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	public Utente (UserDTO us) {
		this.nome = us.getNome();
		this.cognome = us.getCognome();
	}

}
