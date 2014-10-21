package es.upm.miw.pd.ecp2.patrones.text;

public abstract class Componente {

		
	public abstract void add(Componente h);

	public abstract String dibujar(boolean b);

	public abstract void delete(int posicion);
	
	public abstract boolean isCompuesto();

}
