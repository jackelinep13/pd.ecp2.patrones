package es.upm.miw.pd.patrones.text;

import java.util.ArrayList;

public class Parrafo extends Conjunto{
	
	public Parrafo() {
		super();
		this.conjunto = new ArrayList<Componente>();

	}
	
	@Override
	public void add(Componente h) {
		conjunto.add(h);
	}
	
	@Override
	public String dibujar(boolean mayusculas) {
		 return super.dibujar(mayusculas)+"\n";
	}

	

}
