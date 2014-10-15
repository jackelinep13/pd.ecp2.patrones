package es.upm.miw.pd.ecp2.patrones.composite.expression;

import es.upm.miw.pd.ecp2.patrones.composite.expression.Expresion;

public class Numero extends Expresion {

	private int numero;
	
	public Numero(int valor) {
		setNumero(valor);
    }

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public int operar() {
		return getNumero();
	}
	
	
}
