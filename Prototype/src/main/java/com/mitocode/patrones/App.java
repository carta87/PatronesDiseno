package com.mitocode.patrones;

import com.mitocode.patrones.model.CuentaAhorroImple;

public class App {
  public static void main(String[] args) {

	  //ejemplo 1 
	  CuentaAhorroImple cuentaAhorroImple = new CuentaAhorroImple();
	  cuentaAhorroImple.setMonto(15000);
	  CuentaAhorroImple cuentaAhorroImpleClonada = (CuentaAhorroImple) cuentaAhorroImple.clonar();
	  
	  if (cuentaAhorroImple != null) System.out.println(cuentaAhorroImpleClonada);
	  System.out.println(cuentaAhorroImple == cuentaAhorroImpleClonada); //false
	  
	  //ejemplo 2 son diferentes direciones de memoria
	  CuentaAhorroImple cuentaAhorroImple2 = new CuentaAhorroImple();
	  System.out.println(cuentaAhorroImple2 == cuentaAhorroImple);//false
	  
	  //conclusion  son diferentes direciones de memoria
  }
}
