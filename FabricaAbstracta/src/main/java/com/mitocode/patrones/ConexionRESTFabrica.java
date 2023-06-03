package com.mitocode.patrones;

import com.mitocode.patrones.interconexion.FabricaAbstracta;
import com.mitocode.patrones.interconexion.IConexionBD;
import com.mitocode.patrones.interconexion.IConexionREST;
import com.mitocode.patrones.interconexion.impl.ConexionRESTCompras;
import com.mitocode.patrones.interconexion.impl.ConexionRESTNoArea;
import com.mitocode.patrones.interconexion.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null)return new ConexionRESTNoArea();
		if (area.equalsIgnoreCase("COMPRAS")) return new ConexionRESTCompras();
		if (area.equalsIgnoreCase("VENTAS")) return new ConexionRESTVentas();
		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}

}
