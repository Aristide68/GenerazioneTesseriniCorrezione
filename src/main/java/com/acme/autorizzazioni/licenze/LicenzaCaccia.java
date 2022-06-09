package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class LicenzaCaccia extends LicenzaImp {
	private String atc;
	private String numeroDiSerieArma;
	private String tipologiaPrede;

	public LicenzaCaccia(int annoDiScadenza, int numeroLicenza, Persona titolare, String atc, String numeroDiSerie, String  tipologiaPrede) {
		super(annoDiScadenza, numeroLicenza, titolare);
		this.atc = atc;
		this.numeroDiSerieArma = numeroDiSerie;
		this.tipologiaPrede = tipologiaPrede;
	}

}
