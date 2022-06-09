package com.acme.autorizzazioni.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnterpriseEmail extends EmailImp {
	public EnterpriseEmail(String to, String message, String subject) {
		super(to, message, subject);

	}
	
	

	//Questa è la classe concreta che estende la classe astratta
	
}
