package com.mitocode.patrones.model;

import com.mitocode.patrones.inter.ICuenta;

public class CuentaAhorroImple implements ICuenta {
	
	private String tipo;
	private int monto;
	
	public CuentaAhorroImple () {
		tipo = "AHORRO";
	}
	
	@Override
	public ICuenta clonar() {
		CuentaAhorroImple ahorroImple = null;
		try {
			ahorroImple = (CuentaAhorroImple) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace ();
		}
		return ahorroImple;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaAhorroImple [tipo=");
		builder.append(tipo);
		builder.append(", monto=");
		builder.append(monto);
		builder.append("]");
		return builder.toString();
	}

	


}
