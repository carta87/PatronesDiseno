package com.mitocode.patrones;

import com.mitocode.patrones.model.Conexion;

public class App {
  public static void main(String[] args) {

   //Accedemos por metodo estatico	  
   Conexion conexion = Conexion.getConexion();
   conexion.connectar();
   conexion.desconnectar();
   
   //podemos apuntar a este objecto para unica instancia 
   //para mejora en momoria y asi evitar instanciar muchas veces el mismo 
   
   //Adicional validacion de objecto
   boolean restpuesta = conexion instanceof Conexion;
   System.out.println(restpuesta);
   
   
  }
}
