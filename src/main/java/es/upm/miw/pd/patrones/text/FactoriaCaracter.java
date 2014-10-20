package es.upm.miw.pd.patrones.text;

public class FactoriaCaracter {
	private static FactoriaCaracter factory;
	
	private FactoriaCaracter(){		
	}
		
	public Caracter get(char caracter) {			
		return null;
	}
	
	public static FactoriaCaracter getFactoria() {
		// Creación perezosa
			if (FactoriaCaracter.factory == null) {
				FactoriaCaracter.factory = new FactoriaCaracter();
			}
			return FactoriaCaracter.factory;
		}
}
