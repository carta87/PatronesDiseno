package com.mitocode.patrones;

import com.mitocode.patrones.interconexion.FabricaAbstracta;
import com.mitocode.patrones.interconexion.IConexionBD;

public class FabricaProductor {
	
	public static FabricaAbstracta getFactory (String tipoFabrica) {
		if (tipoFabrica.equalsIgnoreCase("BD")) return new ConexionBDFabrica();
		if (tipoFabrica.equalsIgnoreCase("REST")) return new ConexionRESTFabrica();
		
		return null;
		
	}
}
