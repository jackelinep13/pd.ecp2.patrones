package es.upm.miw.pd.ecp2.patrones.calculadora;

import java.util.HashSet;
import java.util.Set;

import upm.jbb.IO;
import upm.jbb.io.Log;

public class MainCalculadoraMementable {
	private GestorComandos gestor;
	GestorMementos<MementoCalculadora> gestorMem = new GestorMementos<MementoCalculadora>();

	public MainCalculadoraMementable() {
        CalculadoraMementable calc = new CalculadoraMementable();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        this.gestor.add(new ComandoGuardar(calc, gestorMem));
        this.gestor.add(new ComandoDeshacer(calc, gestorMem));

    }
	
	public void ejecutar() {
		String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
	}
		
	public static void main(String[] args) {
		IO.in.addController(new MainCalculadoraMementable());
    }
	
}
