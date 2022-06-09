package com.acme.autorizzazioni.email;

public class Main {

	public static void main(String[] args) {
		//Questa è la classe Test che ci permette di verificare le funzionalità
		//Usiamo il factory per recuperare un server a nostra scelta
		
		try {
			//il try mi permette di fare alcune istruzioni e nel caso falliscono entra nel catch che cattura le eccezioni
			EmailService googleService = EmailServiceFactory.create(EmailServiceFactory.GOOGLE_EMAIL);
			//Nel try io voglio fare tutte le operazioni del caso poichè solo se la creazione del servizio email è andata a buon fine faremo tutto il resto
			
			//Mi creo la mia mail a partira dall'interfaccia associandole un oggetto della classe concreta
			
			Email email = new EnterpriseEmail("mario.rossi@gmail.com", "Messaggio di test", " Prova messaggio");
			//Mando la mail
			googleService.send(email);
			
			
			
		} catch (AuthorizationFailureException e ) {
			System.out.println("Contattare l'amministratore");
			
		}	
			catch (Exception e) {
		
			//Dato che abbiamo dichiarato più eccezioni, dovremmo gestirle tutte attravero il try/catch. Inserendo solo "Exception" 
			//che prende tutte le eccezioni direttamente. Se vogliamo far uscire fuori un'eccezione particolare dobbiamo aggiungere un catch con
			//la relativa operazione
			
			
			// Questo costrutto va a prendere la firma del metodo (in questo caso create) e prende in automatico l'eccezione da mostrare
			System.out.println(e.getMessage());
		}
	}

}
