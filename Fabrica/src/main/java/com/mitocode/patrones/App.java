package com.mitocode.patrones;

import com.mitocode.patrones.interconexion.IConexion;

public class App {
  public static void main(String[] args) {

   ConexionFabrica fabrica =  new ConexionFabrica();
   
   IConexion conexion1 = fabrica.getConexion("MYSQL");
   conexion1.conectar();
   conexion1.desconectar();
   
   IConexion conexion2 = fabrica.getConexion("SQLSERVER");
   conexion2.conectar();
   conexion2.desconectar();
   
   
   
  }
}
