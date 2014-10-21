package es.upm.miw.pd.ecp2.patrones.calculadora;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoRaiz {
    private Calculadora calculadora;
    private static final String nombre="Imprimir";

    public ComandoImprimir(Calculadora calculadora) {
    	super(nombre, calculadora);
        this.calculadora = calculadora;        
    }


    @Override
    public void execute() {
    	IO.out.println("Resultado: " + this.calculadora.getTotal());
    }

}
