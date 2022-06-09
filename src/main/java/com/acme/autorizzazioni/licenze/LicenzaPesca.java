package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class LicenzaPesca extends LicenzaImp {
	private String tipo;
	private String localita;

	public LicenzaPesca(int annoDiScadenza, int numeroLicenza, Persona titolare, String tipo, String  localita) {
		super(annoDiScadenza, numeroLicenza, titolare);
		this.tipo = tipo;
		this.localita = localita;
	}

}
