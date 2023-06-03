package com.mitocode.patrones;

import com.mitocode.patrones.interconexion.IConexion;
import com.mitocode.patrones.interconexion.impl.ConexionMysql;
import com.mitocode.patrones.interconexion.impl.ConexionOracle;
import com.mitocode.patrones.interconexion.impl.ConexionProstgreSQL;
import com.mitocode.patrones.interconexion.impl.ConexionSQLServer;
import com.mitocode.patrones.interconexion.impl.ConexionVacia;

public class ConexionFabrica {
	
	public IConexion getConexion(String motor) {
		if (motor == null) return new ConexionVacia();
		if (motor.equalsIgnoreCase("MYSQL")) return new ConexionMysql();
		if (motor.equalsIgnoreCase("POSTGRESQL")) return new ConexionProstgreSQL();
		if (motor.equalsIgnoreCase("ORACLE")) return new ConexionOracle();
		if (motor.equalsIgnoreCase("SQLSERVER")) return new ConexionSQLServer();
		
		return new ConexionVacia();
		
	}

}
