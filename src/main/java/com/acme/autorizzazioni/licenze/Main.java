package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.licenze.titolari.TitolareLicenzaFactory;
import com.acme.autorizzazioni.persone.Persona;

public class Main {

	public static void main(String[] args) {
		//mi creo un'istanza di LicenzaFactory a partire dall'interfaccia e utilizzo il metodo create definito in LicenzaFactory
		
		//Dato che LicenzaFactory mi lancia un'eccezione, devo gestirla con il try/catch
		try {
			Licenza licenzaCaccia =  LicenzaFactory.create(LicenzaFactory.LICENZA_CACCIA);
			
			licenzaCaccia.setAnnoDiScadenza(2000);
			licenzaCaccia.setNumeroLicenza(200);
			 //creo la persona con il metodo normale
			//Persona titolareLicenza = TitolareLicenzaFactory.create(TitolareLicenzaFactory.TITOLARE_LICENZA);
			
			//creazione della persona con il metodo di default
			
			/*
			Persona titolareLicenza = TitolareLicenzaFactory.create();
			titolareLicenza.setNome("Mario");
			titolareLicenza.setCognome("Rossi");
			titolareLicenza.setEmail("mario.rossi@gmail.com");
			titolareLicenza.setIndirizzo("Via Roma 1");
			titolareLicenza.setCitta("Roma");
			titolareLicenza.setCap("85058");
			*/
			
			// Creazione del titolare in un altro modo
			 Persona titolareLicenza = TitolareLicenzaFactory.create(TitolareLicenzaFactory.TITOLARE_LICENZA, "Mario", "Rossi", "Via Roma 1",
			 "mario.rossi@gmail.com", "85022", "Roma");
			 
			 //Creo la licenza di caccia con il relativo titolare
			 licenzaCaccia.setTitolare(titolareLicenza);
		} catch (Exception e) {
			System.out.println("Si è verificato un errore: " + e.getMessage());
		}
		
		
		
	}

}
