package com.acme.autorizzazioni.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class EmailImp implements Email {
	//classe che implementa l'interfaccia
		private String to;
		private String message;
		private String subject;
}
