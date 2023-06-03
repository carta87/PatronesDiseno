package com.mitocode.patrones;

import com.mitocode.patrones.interconexion.FabricaAbstracta;
import com.mitocode.patrones.interconexion.IConexionBD;
import com.mitocode.patrones.interconexion.IConexionREST;
import com.mitocode.patrones.interconexion.impl.ConexionMysql;
import com.mitocode.patrones.interconexion.impl.ConexionOracle;
import com.mitocode.patrones.interconexion.impl.ConexionProstgreSQL;
import com.mitocode.patrones.interconexion.impl.ConexionSQLServer;
import com.mitocode.patrones.interconexion.impl.ConexionVacia;

public class ConexionBDFabrica implements FabricaAbstracta  {

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) return new ConexionVacia();
		if (motor.equalsIgnoreCase("MYSQL")) return new ConexionMysql();
		if (motor.equalsIgnoreCase("POSTGRESQL")) return new ConexionProstgreSQL();
		if (motor.equalsIgnoreCase("ORACLE")) return new ConexionOracle();
		if (motor.equalsIgnoreCase("SQLSERVER")) return new ConexionSQLServer();
		
		return new ConexionVacia();
		
	}

}
