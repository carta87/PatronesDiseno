package com.mitocode.patrones.interconexion.impl;

import com.mitocode.patrones.interconexion.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST {

	@Override
	public void leerURL(String url) {
		System.out.println("Conectarse a "+ url);

	}

}
