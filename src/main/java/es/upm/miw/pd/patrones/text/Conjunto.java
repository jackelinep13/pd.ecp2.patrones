package es.upm.miw.pd.patrones.text;

import java.util.List;

public abstract class Conjunto extends Componente {

	List<Componente> conjunto;
	String valor="";
	
	public String dibujar(boolean mayusculas) {
		for (Componente unComponente : conjunto) {
			valor += unComponente.dibujar(mayusculas);
		}
		return valor+"\n";
		
	}

	
}
