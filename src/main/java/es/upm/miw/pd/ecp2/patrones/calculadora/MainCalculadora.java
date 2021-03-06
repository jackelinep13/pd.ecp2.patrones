package es.upm.miw.pd.ecp2.patrones.calculadora;

import es.upm.miw.pd.ecp2.patrones.calculadora.ComandoImprimir;
import es.upm.miw.pd.ecp2.patrones.calculadora.ComandoIniciar;
import es.upm.miw.pd.ecp2.patrones.calculadora.ComandoRestar;
import es.upm.miw.pd.ecp2.patrones.calculadora.ComandoSumar;
import upm.jbb.IO;

public class MainCalculadora {
    private GestorComandos gestor;

    public MainCalculadora() {
        Calculadora calc = new Calculadora();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}
