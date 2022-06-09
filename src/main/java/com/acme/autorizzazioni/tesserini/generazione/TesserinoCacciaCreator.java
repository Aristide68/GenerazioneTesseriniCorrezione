package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.email.AuthorizationFailureException;
import com.acme.autorizzazioni.email.Email;
import com.acme.autorizzazioni.email.EmailFactory;
import com.acme.autorizzazioni.email.EmailNotValidException;
import com.acme.autorizzazioni.email.EmailService;
import com.acme.autorizzazioni.email.EmailServiceFactory;
import com.acme.autorizzazioni.email.MailServerNotAvaibleException;
import com.acme.autorizzazioni.email.MissingSubjectAndMessageException;
import com.acme.autorizzazioni.email.WrognEmailTypeException;
import com.acme.autorizzazioni.licenze.LicenzaCaccia;
import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoFactory;
import com.acme.autorizzazioni.tesserini.WrongTesserinoTypeException;

public class TesserinoCacciaCreator {
	
	public static void create (LicenzaCaccia licenza, int annoInCorso) throws WrongTesserinoTypeException, AuthorizationFailureException, WrognEmailTypeException, MissingSubjectAndMessageException, MailServerNotAvaibleException, EmailNotValidException {
		
		Tesserino tesserino = TesserinoFactory.create(TesserinoFactory.TESSERINO_CACCIA);
		tesserino.setAnnoValidita(annoInCorso);
		System.out.println("Tesserino caccia di: " + licenza.getTitolare().getCognome() + " - Inviato ad atc" + licenza.getAtc());
		
		TesserinoSendEmail.sendEmail(tesserino, "caccia");
		
	}


}
