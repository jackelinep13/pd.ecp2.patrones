package es.upm.miw.pd.patrones.text;

public class Caracter extends Componente{
	private char caracter;
	
	public Caracter(char caracter) {
		this.caracter = caracter;
	}
	
	@Override
	public void add(Componente h) {
		// TODO Auto-generated method stub		
	}

	@Override
	public String dibujar(boolean b) {
		if(b) return Character.toString(Character.toUpperCase(this.caracter));
		else  return Character.toString(this.caracter);
	}

	@Override
	public void delete(int posicion) {
		// TODO Auto-generated method stub		
	}

	@Override
	public boolean isCompuesto() {
		return false;
	}

}
