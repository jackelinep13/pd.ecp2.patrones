package es.upm.miw.pd.ecp2.patrones.factoryMethod.naturalNumber;

import upm.jbb.IO;


public class NaturalNumberManager {
	   
    private NaturalNumberCreator[] creadores = {new NaturalNumberEsCreator(), new NaturalNumberEnCreator()};
    private NaturalNumberCreator creador = creadores[1];
    private NaturalNumber naturalNumber;
    
	String valorTexto="";     
    private int valor;

    public void tipoNaturalNumber() {
        this.creador = (NaturalNumberCreator) IO.in.select(creadores, "Elige un creador");
        this.valor = (int) IO.in.readInt("Valor");
        this.naturalNumber = this.creador.createNaturalNumber(valor);
        valorTexto = this.naturalNumber.getTextValue();        
        IO.out.println("El texto es: " + valorTexto);
    }
    

    public static void main(String[] args) {
        IO.in.addController(new NaturalNumberManager());
    }
        
	
}
