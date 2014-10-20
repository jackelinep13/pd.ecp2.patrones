package es.upm.miw.pd.patrones.text;

public class Parrafo extends Conjunto{
	private char caracter;
	
	@Override
	public void add(Componente h) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dibujar(boolean b) {
		if(b) System.out.println(Character.toUpperCase(this.caracter));
		else  System.out.println(this.caracter);
	}

}
