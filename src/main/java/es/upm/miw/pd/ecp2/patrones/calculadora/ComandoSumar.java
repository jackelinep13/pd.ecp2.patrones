package es.upm.miw.pd.ecp2.patrones.calculadora;

import upm.jbb.IO;

public class ComandoSumar extends ComandoRaiz  {
    private Calculadora calculadora;
    private static final String nombre="Sumar";

    public ComandoSumar(Calculadora calculadora) {
    	super(nombre, calculadora);
        this.calculadora = calculadora;        
    }

   
    @Override
    public void execute() {
        this.calculadora.sumar(IO.in.readInt("Escribe el numero: "));
    }

}
