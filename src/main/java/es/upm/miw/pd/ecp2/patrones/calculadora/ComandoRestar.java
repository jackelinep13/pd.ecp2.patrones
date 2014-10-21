package es.upm.miw.pd.ecp2.patrones.calculadora;

import upm.jbb.IO;

public class ComandoRestar extends ComandoRaiz {
    private Calculadora calculadora;
    private static final String nombre="Restar";

    public ComandoRestar(Calculadora calculadora) {
    	super(nombre, calculadora);
        this.calculadora = calculadora;
    }

    @Override
    public void execute() {
        this.calculadora.restar(IO.in.readInt("Escribe el numero a restar: "));
    }

}
