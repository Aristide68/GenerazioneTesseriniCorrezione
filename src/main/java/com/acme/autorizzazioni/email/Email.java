package com.acme.autorizzazioni.email;

public interface Email {
	
	// questa è l'interfaccia che definisce i metodi delle mail
	public void setTo(String to);
	public String getTo();
	
	public void setSubject(String subject);
	public String getSubject();
	
	public void setMessage(String message);
	public String getMessage();
}
