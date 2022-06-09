package com.acme.autorizzazioni.tesserini.generazione;

import java.util.List;

import com.acme.autorizzazioni.email.AuthorizationFailureException;
import com.acme.autorizzazioni.email.EmailNotValidException;
import com.acme.autorizzazioni.email.MailServerNotAvaibleException;
import com.acme.autorizzazioni.email.MissingSubjectAndMessageException;
import com.acme.autorizzazioni.email.WrognEmailTypeException;
import com.acme.autorizzazioni.licenze.Licenza;
import com.acme.autorizzazioni.licenze.LicenzaCaccia;
import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.licenze.LicenzaScadutaException;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoCaccia;
import com.acme.autorizzazioni.tesserini.TesserinoFactory;
import com.acme.autorizzazioni.tesserini.TesserinoPesca;
import com.acme.autorizzazioni.tesserini.WrongTesserinoTypeException;

public class TesserinoGenerator {
	public final static int ANNO_IN_CORSO = 2022;
	public static void generate(Licenza licenza) throws LicenzaScadutaException, WrongTesserinoTypeException, AuthorizationFailureException, WrognEmailTypeException, MissingSubjectAndMessageException, MailServerNotAvaibleException, EmailNotValidException {
		//Queesto blocco di istruzioni servono per generare il tesserino a partire dalla licenza 
		if(!licenza.isValid()) {
			throw new LicenzaScadutaException("La licenza di "+ licenza.getTitolare().getCognome()+ " è scaduta");
		}
		
		if(licenza.getClass().getSimpleName().equals("LicenzaCaccia"))	{
			//Utilizzo il factory per creare i tesserini
			TesserinoCacciaCreator.create((LicenzaCaccia) licenza, ANNO_IN_CORSO);
		}	else {
			TesserinoPescaGenerator.create((LicenzaPesca) licenza, ANNO_IN_CORSO);
		}
		
		//A questo punto dobbiamo creare un blocco di istruzioni per inviare l'email
		
	}
	
	public static void generate (List<Licenza> listaLicenze) throws LicenzaScadutaException, WrongTesserinoTypeException, AuthorizationFailureException, WrognEmailTypeException, MissingSubjectAndMessageException, MailServerNotAvaibleException, EmailNotValidException {
		for (Licenza licenza : listaLicenze) {
			//riutilizzo il metodo scritto sopra iterandolo in una lista
			generate(licenza);
		}
	}
}
