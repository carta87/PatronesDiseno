package com.mitocode.patrones.interconexion.impl;

import com.mitocode.patrones.interconexion.IConexion;

public class ConexionOracle implements IConexion {
	
	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}
	
	

}
