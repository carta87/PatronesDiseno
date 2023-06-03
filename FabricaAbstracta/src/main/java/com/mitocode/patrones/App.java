package com.mitocode.patrones;

import com.mitocode.patrones.interconexion.FabricaAbstracta;
import com.mitocode.patrones.interconexion.IConexionBD;
import com.mitocode.patrones.interconexion.IConexionREST;

public class App {
  public static void main(String[] args) {

   FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
   IConexionBD conexionBD = fabricaBD.getBD("MYSQL");
   conexionBD.conectar();
   
   FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
   IConexionREST conexionREST = fabricaREST.getREST("COMPRAS");
   conexionREST.leerURL("www.d1.areaCompras");
	
   //Conclusiones hay solicitar una implementacion indicamos a que 
   //familia se requiere y despues especifico su particuralidad 

		   
  }
}
