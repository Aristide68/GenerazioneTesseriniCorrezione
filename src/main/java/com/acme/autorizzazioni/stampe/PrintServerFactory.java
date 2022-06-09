package com.acme.autorizzazioni.stampe;

public class PrintServerFactory {
public static final int SERVER_UFFIO_CACCIA = 1;
public static final int SERVER_UFFIO_PESCA = 2;

	public static PrintServer create(int tipoServer) throws WrongPringServerException {
		PrintServer server = new PrintServer();
		if(tipoServer == SERVER_UFFIO_CACCIA) {
			server.setUserName("admin");
			server.setPassword("worty");
			server.setNetworkName("CACCIA_SRV_PRINT");
		}else if(tipoServer == SERVER_UFFIO_PESCA) {
			server.setUserName("admin");
			server.setPassword("54684");
			server.setNetworkName("PESCA_SRV_PRINT");
		} else {
			throw new WrongPringServerException("Il nome del serever non esiste");
		}
		
		return server;
		
	}

}
