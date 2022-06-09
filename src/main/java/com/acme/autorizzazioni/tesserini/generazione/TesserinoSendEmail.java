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
import com.acme.autorizzazioni.tesserini.Tesserino;

public class TesserinoSendEmail {

	public static void sendEmail(Tesserino tesserino, String tipoTesserino) throws AuthorizationFailureException, WrognEmailTypeException,
																								 MissingSubjectAndMessageException,
																								 MailServerNotAvaibleException, 
																								 EmailNotValidException {
		
		EmailService googleEmailServer = EmailServiceFactory.create(EmailServiceFactory.GOOGLE_EMAIL );
		
		Email mail = EmailFactory.create(tesserino.getLicenza().getTitolare().getEmail(), 
				"Le comunichiamo di aver provveduto all'invio del suo tesserino" + tipoTesserino, 
				"Notifica di avvenuto invio del Tesserino caccia");
		googleEmailServer.send(mail);
	}

}
