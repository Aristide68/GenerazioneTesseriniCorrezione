package com.acme.autorizzazioni.stampe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class PrintObjectImp implements PrintObject {
	private String testo;


}
