package es.upm.miw.pd.patrones.text;

public class Texto extends Conjunto {

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
