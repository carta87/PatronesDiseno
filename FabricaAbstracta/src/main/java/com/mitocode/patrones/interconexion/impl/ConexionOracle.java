package com.mitocode.patrones.interconexion.impl;

import com.mitocode.patrones.interconexion.IConexionBD;

public class ConexionOracle implements IConexionBD {
	
	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}
	
	

}
