package com.mitocode.patrones.interconexion.impl;

import com.mitocode.patrones.interconexion.IConexionBD;

public class ConexionProstgreSQL implements IConexionBD {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionProstgreSQL() {
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		System.out.println("me conecte a MSQL");
		
	}

	@Override
	public void desconectar() {
		System.out.println("me desconecte a MSQL");
		
	}
	
	@Override
	public String toString() {
		return "ConexionPostgreSQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
