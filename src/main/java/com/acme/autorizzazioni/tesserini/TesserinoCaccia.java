package com.acme.autorizzazioni.tesserini;

import com.acme.autorizzazioni.licenze.Licenza;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TesserinoCaccia extends TesserinoImp {

	public TesserinoCaccia(int annoValidita, Licenza licenza) {
		super(annoValidita, licenza);
		
	}

}
