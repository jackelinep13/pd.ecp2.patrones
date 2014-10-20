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
	public void dibujar(boolean b) {
		if(b) System.out.print(Character.toUpperCase(this.caracter));
		else  System.out.print(this.caracter);
	}

}
