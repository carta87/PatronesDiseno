package com.mitocode.patrones.interconexion.impl;

import com.mitocode.patrones.interconexion.IConexion;

public class ConexionVacia implements IConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionVacia() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir código JDBC
		System.out.println("Se conectó a Oracle");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de Oracle");
	}

	@Override
	public String toString() {
		return "ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
	

}
