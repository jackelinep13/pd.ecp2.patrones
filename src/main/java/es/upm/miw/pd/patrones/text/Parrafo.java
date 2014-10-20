package es.upm.miw.pd.patrones.text;

public class Parrafo extends Conjunto{
	private char caracter;
	
	@Override
	public void add(Componente h) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dibujar(boolean b) {
		if(b) return Character.toString(Character.toUpperCase(this.caracter));
		else  return Character.toString(this.caracter);
	}

}
