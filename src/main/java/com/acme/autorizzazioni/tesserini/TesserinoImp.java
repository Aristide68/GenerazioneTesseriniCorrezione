package com.acme.autorizzazioni.tesserini;

import com.acme.autorizzazioni.licenze.Licenza;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class TesserinoImp implements Tesserino {
	
	private int annoValidita;
	
	//Grazie alla dependence injection posso inserire direttamente la licenza che oltre alle informazioni del tesserino ha anche quelle della persona
	private Licenza licenza;

}
