package es.upm.miw.pd.ecp2.patrones.text;

import java.util.ArrayList;

public class Texto extends Conjunto {
	
	public Texto() {
		super();
		this.conjunto = new ArrayList<Componente>();

	}
	
	@Override
	public void add(Componente h) {
		if (!h.isCompuesto()) {
			throw new UnsupportedOperationException();
		}
		else conjunto.add(h);
	}
	
	@Override
	public String dibujar(boolean b) {
		 return super.dibujar(b)+"---o---\n";
	}
	
	@Override
	public boolean isCompuesto() {
		return true;
	}

}
