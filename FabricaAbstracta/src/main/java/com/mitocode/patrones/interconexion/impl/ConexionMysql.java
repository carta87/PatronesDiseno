package com.mitocode.patrones.interconexion.impl;

import com.mitocode.patrones.interconexion.IConexionBD;

public class ConexionMysql implements IConexionBD {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMysql() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
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
		StringBuilder builder = new StringBuilder();
		builder.append("ConexionMysql [host=");
		builder.append(host);
		builder.append(", puerto=");
		builder.append(puerto);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", contrasena=");
		builder.append(contrasena);
		builder.append("]");
		return builder.toString();
	}
	
	

}
