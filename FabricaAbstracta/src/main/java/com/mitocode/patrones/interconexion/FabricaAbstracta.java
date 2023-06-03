package com.mitocode.patrones.interconexion;

public interface FabricaAbstracta {
	IConexionREST getREST (String area);
	IConexionBD getBD (String motor);
}
