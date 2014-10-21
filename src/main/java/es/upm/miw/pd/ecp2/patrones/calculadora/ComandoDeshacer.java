package es.upm.miw.pd.ecp2.patrones.calculadora;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoRaiz {
	private CalculadoraMementable calculadora;
    private static final String nombre="DeshacerMemento";
    private GestorMementos<MementoCalculadora> gestorMem;

	public ComandoDeshacer(CalculadoraMementable calculadora, GestorMementos<MementoCalculadora> gestorMem) {
		super(nombre, calculadora);
		this.calculadora = calculadora;
		this.setGestorMem(gestorMem);
	}
    
	@Override
	public void execute() {
		this.calculadora.deshacer(
				this.gestorMem.getMemento((String) IO.in.select(gestorMem.keys(), "Restaurar Memento")));
	}


	public GestorMementos<MementoCalculadora> getGestorMem() {
		return gestorMem;
	}

	public void setGestorMem(GestorMementos<MementoCalculadora> gestorMem) {
		this.gestorMem = gestorMem;
	}

}

