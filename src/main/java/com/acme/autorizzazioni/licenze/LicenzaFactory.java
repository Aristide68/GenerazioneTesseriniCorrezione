package com.acme.autorizzazioni.licenze;


public class LicenzaFactory {
	
	/*
	public final static String LICENZA_PESCA = "pesca";
	public final static String LICENZA_CACCIA = "caccia";
	*/
	
	//metodo alternativo per dichiare le costanti. Il risultato è lo stesso ma questa soluzione occupa meno memoria
	public final static int LICENZA_PESCA = 1;
	public final static int LICENZA_CACCIA = 2;
	
	public final static Licenza create(int tipoLicenza) throws WrongLicenzeTypeException {
		Licenza licenza = null;
		
		if(tipoLicenza == LICENZA_CACCIA) {
			licenza = new LicenzaCaccia();
		}else if ( tipoLicenza == LICENZA_PESCA){
			licenza = new LicenzaPesca();
		} else {
			throw new WrongLicenzeTypeException("Tipo di licenza errato");
		}
		return licenza;
	}
}
