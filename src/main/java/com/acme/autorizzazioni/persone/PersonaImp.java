package com.acme.autorizzazioni.persone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//Avendo le licenze dei dati comuni che possono essere dati di una persona, ho creato una classe che contiene questi dati
public abstract class PersonaImp implements Persona {
	private String email;
	private String nome;
	private String cognome;
	private String indirizzo;
	private String cap;
	private String citta;
}
