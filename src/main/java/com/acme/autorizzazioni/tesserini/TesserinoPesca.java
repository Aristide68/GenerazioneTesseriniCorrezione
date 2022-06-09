package com.acme.autorizzazioni.tesserini;

import com.acme.autorizzazioni.licenze.Licenza;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TesserinoPesca extends TesserinoImp {
	
	public TesserinoPesca(int annoValidita, Licenza licenza) {
		super(annoValidita, licenza);
	
	}

}
