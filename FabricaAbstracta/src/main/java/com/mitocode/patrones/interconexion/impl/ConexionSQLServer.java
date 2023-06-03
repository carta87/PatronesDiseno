package com.mitocode.patrones.interconexion.impl;

import com.mitocode.patrones.interconexion.IConexionBD;

public class ConexionSQLServer implements IConexionBD {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionSQLServer() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir código JDBC
		System.out.println("Se conectó a SQLServer");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de SQLServer");
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConexionSQLServer [host=");
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
