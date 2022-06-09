package com.acme.autorizzazioni.licenze.titolari;

import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;

import com.acme.autorizzazioni.licenze.WrongPersonTypeException;
import com.acme.autorizzazioni.persone.Persona;

public class TitolareLicenzaFactory {
	
	public final static int TITOLARE_LICENZA = 1;
	
	public final static TitolareLicenza create( int tipoTitolare) throws WrongPersonTypeException {
		Persona persona = null;
		
		if(tipoTitolare == TITOLARE_LICENZA) {
			persona = new TitolareLicenza();
		} else {
			throw new WrongPersonTypeException("Hai inserito una persona sbagliata");
		}
		//ho effettuato il cast così che l'oggetto restituito sarà un titolare 
		return (TitolareLicenza) persona;
	}
	public final static TitolareLicenza create (int tipoTitolare, String nome, String cognome, String indirizzo, String email,
			String cap, String citta) throws WrongPersonTypeException {
		Persona persona = create (tipoTitolare);
		
		return (TitolareLicenza) persona;
	}
	
	//questo metodo viene creato per comodità chiamato "creatore di default"
	public final static TitolareLicenza create() throws WrongPersonTypeException {
		return create(TITOLARE_LICENZA);
	}
}
