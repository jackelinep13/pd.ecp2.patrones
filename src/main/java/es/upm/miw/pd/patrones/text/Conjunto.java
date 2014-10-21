package es.upm.miw.pd.patrones.text;

import java.util.List;

public abstract class Conjunto extends Componente {

	List<Componente> conjunto;
		
	@Override
	public String dibujar(boolean b) {
		String valor="";
		for (Componente unComponente : conjunto) {
			valor += unComponente.dibujar(b);
		}
		 return valor;
	}

	@Override
	public void delete(int posicion) {
		try {
			conjunto.remove(posicion);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No se puede eliminar");
		}
	}
	
}
