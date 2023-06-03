package com.mitocode.patrones.model;

public class Conexion {

	//Declaracion
	private static Conexion instancia;
	
	//para evitar instancia mediante un new
	private Conexion () {
	}
	
	
	//para obtener la instancia por medio de este metodo
	public static Conexion  getConexion() {
		if (instancia == null) instancia = new Conexion();
		return instancia;
	}
	
	//metodo de prueba
	public void connectar() {
		System.out.println("Me conecte a BD");
	}
	
	//metodo de prueba
	public void desconnectar() {
		System.out.println("Me desconecte a BD");
	}

}
