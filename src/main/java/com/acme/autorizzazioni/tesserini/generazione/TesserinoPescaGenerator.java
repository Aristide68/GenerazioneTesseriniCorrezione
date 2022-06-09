package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.email.AuthorizationFailureException;
import com.acme.autorizzazioni.email.EmailNotValidException;
import com.acme.autorizzazioni.email.MailServerNotAvaibleException;
import com.acme.autorizzazioni.email.MissingSubjectAndMessageException;
import com.acme.autorizzazioni.email.WrognEmailTypeException;
import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoFactory;
import com.acme.autorizzazioni.tesserini.WrongTesserinoTypeException;

public class TesserinoPescaGenerator {

	public static void create (LicenzaPesca licenza, int annoInCorso) throws WrongTesserinoTypeException, AuthorizationFailureException, WrognEmailTypeException, MissingSubjectAndMessageException, MailServerNotAvaibleException, EmailNotValidException {
		
			Tesserino tesserino = TesserinoFactory.create(TesserinoFactory.TESSERINO_PESCA);
			tesserino.setAnnoValidita(annoInCorso);
			System.out.println("Tesserino pesca di: " + licenza.getTitolare().getCognome() + " inviato ad adc" + licenza.getLocalita());
			
			TesserinoSendEmail.sendEmail(tesserino, "Pesca");
	}

}
