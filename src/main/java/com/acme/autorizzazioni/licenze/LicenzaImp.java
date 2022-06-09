package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class LicenzaImp implements Licenza {
	//Questa è la classe astratta delle licenze che implementerà l'interfaccia
	//Inserisco le informazioni comuni
	
	private int annoDiScadenza;
	private int numeroLicenza;
	
//Ho creato un oggetto Persona che contiene tutti i dati anagrafici
	private Persona titolare;

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
