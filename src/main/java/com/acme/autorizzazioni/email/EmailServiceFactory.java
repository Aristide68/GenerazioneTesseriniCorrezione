package com.acme.autorizzazioni.email;

public class EmailServiceFactory {
	public static final String GOOGLE_EMAIL = "google";
	public static final String LIBERO_EMAIL = "libero";
	
	public static EmailService create (String serverType) throws AuthorizationFailureException {
		EmailService service = new EmailService();;
		if(serverType.equals(GOOGLE_EMAIL)) {
			
			service.setNome("email.server.google.com");
			service.setUserNamePerInvio("admin");
			service.setPassword("123456");
		}else {
			service.setNome("libero.it");
			service.setUserNamePerInvio("user");
			service.setPassword("abcde");
			
			//questo metodo manda un'eccezine che io gestico a livello più alto
			service.connectToServer();
		}
		return service;
	}
	
	private EmailServiceFactory() {

	}

}
