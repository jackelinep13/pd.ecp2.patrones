package es.upm.miw.pd.ecp2.patrones.calculadora;

public class ComandoGuardar extends ComandoRaiz {
	private Calculadora calculadora;
    private static final String nombre="GuardarMemento";

    public ComandoGuardar(Calculadora calculadora) {
    	super(nombre, calculadora);
        this.calculadora = calculadora;        
    }

    @Override
    public void execute() {
        this.calculadora.iniciar();
    }

}
