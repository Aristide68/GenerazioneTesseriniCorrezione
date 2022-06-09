package com.acme.autorizzazioni.email;

public class EmailFactory {
	public final static int ENTERPRISE_EMAIL = 1;
 	
	public static Email create() throws WrognEmailTypeException {
		
		return create(ENTERPRISE_EMAIL);
		
	}
	
	public static Email create(int tipoEmail) throws WrognEmailTypeException {
		if (tipoEmail == ENTERPRISE_EMAIL) {
			 return new EnterpriseEmail();
		} 
		throw new WrognEmailTypeException();	
	}
	
	
	public static Email create(int tipoEmail, String to, String message, String subject) throws WrognEmailTypeException {
		Email email = create(tipoEmail);
		email.setTo(to);
		email.setMessage(message);
		email.setSubject(subject);
		return email;
	}
	public static Email create(String to, String message, String subject) throws WrognEmailTypeException {
		return create(ENTERPRISE_EMAIL, to, message, subject);
	}
}
