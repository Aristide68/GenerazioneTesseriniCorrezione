package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.licenze.Licenza;
import com.acme.autorizzazioni.licenze.LicenzaFactory;
import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.licenze.titolari.TitolareLicenzaFactory;
import com.acme.autorizzazioni.persone.Persona;

public class MainTestTesserinoPescaCreator {

	public static void main(String[] args) {
		
		LicenzaPesca lp;
		Persona pe;
		try {
			pe = TitolareLicenzaFactory.create();
			pe.setNome("Aristide");
			pe.setCognome("Gagliardino");
			pe.setEmail("arigagliardino@gmail.com");
			
			lp = (LicenzaPesca) LicenzaFactory.create(LicenzaFactory.LICENZA_PESCA);
			lp.setLocalita("Vietri di Potenza");
			lp.setTitolare(pe);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
