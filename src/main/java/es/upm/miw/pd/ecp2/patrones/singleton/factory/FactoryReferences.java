package es.upm.miw.pd.ecp2.patrones.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
    private Map<String, Integer> references;

    private int reference;

    public static FactoryReferences getFactory(){
    	return null;
    }
    
    public FactoryReferences() {    	
        this.references = new HashMap<>();        
        this.reference = 0;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}
