package es.upm.miw.pd.ecp2.patrones.calculadora;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoRaiz {
	private CalculadoraMementable calculadora;
    private static final String nombre="GuardarMemento";
    private GestorMementos<MementoCalculadora> gestorMem;

	public ComandoGuardar(CalculadoraMementable calculadora, GestorMementos<MementoCalculadora> gestorMem) {
		super(nombre, calculadora);
		this.calculadora = calculadora;
		this.setGestorMem(gestorMem);
	}
    
    @Override
    public void execute() {
    	String key;
    	key = IO.in.readString("Escribe nombre Memento:");
		this.gestorMem.addMemento(key, this.calculadora.guardar());

    }

	public GestorMementos<MementoCalculadora> getGestorMem() {
		return gestorMem;
	}

	public void setGestorMem(GestorMementos<MementoCalculadora> gestorMem) {
		this.gestorMem = gestorMem;
	}

}
