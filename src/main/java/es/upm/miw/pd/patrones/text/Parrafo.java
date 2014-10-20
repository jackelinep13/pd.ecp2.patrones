package es.upm.miw.pd.patrones.text;

import java.util.ArrayList;

public class Parrafo extends Conjunto{
	private char caracter;
	
	public Parrafo() {
		super();
		this.conjunto = new ArrayList<Componente>();

	}
	
	@Override
	public void add(Componente h) {
		conjunto.add(h);
	}



}
