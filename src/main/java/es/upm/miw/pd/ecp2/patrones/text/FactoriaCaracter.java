package es.upm.miw.pd.ecp2.patrones.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private static FactoriaCaracter factory;
	private  Map<Character, Caracter> map = new HashMap<Character, Caracter>();

	private FactoriaCaracter(){		
	}
		
	public Caracter get(char key) {			
		if(map.containsKey(key)){
			return map.get(key);
		}else{
			//Construccion perezosa
			Caracter pl = new Caracter(key);
			map.put(key, pl);
			return pl;
		}
	}
	
	public static FactoriaCaracter getFactoria() {
		// Creación perezosa
			if (FactoriaCaracter.factory == null) {
				FactoriaCaracter.factory = new FactoriaCaracter();
			}
			return FactoriaCaracter.factory;
		}
}
