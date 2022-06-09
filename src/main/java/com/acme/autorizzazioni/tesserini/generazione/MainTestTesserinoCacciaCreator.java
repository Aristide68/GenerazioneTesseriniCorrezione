package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.licenze.Licenza;
import com.acme.autorizzazioni.licenze.LicenzaCaccia;
import com.acme.autorizzazioni.licenze.LicenzaFactory;
import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.licenze.titolari.TitolareLicenzaFactory;
import com.acme.autorizzazioni.persone.Persona;

public class MainTestTesserinoCacciaCreator {

	public static void main(String[] args) {
		
		//Definisco una licenza di caccia e una pesona 
		
		LicenzaCaccia lc;
		Persona pe;
		try {
			
			//All'interno del try creao la persona con i relativi dati e la licenza di caccia attraverso il suo factory
			
			//creo la persona e setto alcuni dati
			pe = TitolareLicenzaFactory.create();
			pe.setNome("Aristide");
			pe.setCognome("Gagliardino");
			pe.setEmail("arigagliardino@gmail.com");
			
			//creo la licenza di caccia e gli passo la persona come titolare e setto l'atc
			
			lc = (LicenzaCaccia) LicenzaFactory.create(LicenzaFactory.LICENZA_CACCIA);
			lc.setAtc("53513313");
			lc.setTitolare(pe);
			lc.setAnnoDiScadenza(2012);
			TesserinoCacciaCreator.create(lc, 2022);
		} catch (Exception e) {
			//se non va lancio l'eccezione generica 
			System.out.println(e.getMessage());
		}

	}

}
