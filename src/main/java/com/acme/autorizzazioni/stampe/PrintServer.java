package com.acme.autorizzazioni.stampe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PrintServer {
	private String networkName;
	private String userName;
	private String password;
	
	public void print(PrintObject document) {
		System.out.println(document.getTesto());
	}


}
