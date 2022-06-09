package com.acme.autorizzazioni.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmailService {
	private String nome;
	private String userNamePerInvio;
	private String password;
	
	public void send(Email mail) throws  MissingSubjectAndMessageException, 
																MailServerNotAvaibleException, 
																AuthorizationFailureException, EmailNotValidException {
		//metodo che effettua l'invio
		
		//questi controlli vanno fatti prima dell'invio della mail perchè senza messaggio o testo l'emai non può essere inviata
		if(!isEmailValid(mail.getTo())) {
			throw new EmailNotValidException("Email non valida");
		}
		if(mail.getMessage() == null || mail.getMessage().isBlank() ) {
			if(mail.getSubject() == null || mail.getSubject().isBlank()) {
				throw new MissingSubjectAndMessageException("Mancano sia il messaggio che l'oggetto della mail ");
			}
		}
		
		//controllo se le credenziali sono valide. L'eccezione a questo punto va gestita a livello più alto
		
		connectToServer();
		
		//Questo controllo verifica se il server è attivo o no. Va fatto prima di inviare la mail perchè nel momento in cui prendiamo nel factory il server
		//può essere di nuovo online
		if(!isServerAvaible()) {
			throw new MailServerNotAvaibleException("Il server è momentaneamente offline ");
		}

		System.out.println("Email: " + mail.getMessage());
		//Questo metodo prende come parametro un'istanza dell'interfaccia email ed acquisisce il testo con il metodo getMessage() e lo stampa
	}
	
	private boolean isEmailValid(String email) {
		//metodo che controlla se l'email è valida. È sempre true a scopo didattico
		return true;
	}
	public void connectToServer() throws AuthorizationFailureException {
		//qui stiamo creando un metodo che controlla l'autenticazione
		//creo una variabile fittizia per fare una simulazione
		boolean connencted = true;
		if(!connencted) {
			throw new AuthorizationFailureException("Emai o password errate ");
		}
	}
	
	private boolean isServerAvaible() {
		//questo metodo controlla se il server è attivo o meno. A scopo didattico questo sarà sempre true
		return true;
	}
}


