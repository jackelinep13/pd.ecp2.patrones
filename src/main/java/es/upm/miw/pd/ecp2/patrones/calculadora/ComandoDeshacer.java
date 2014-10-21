package es.upm.miw.pd.ecp2.patrones.calculadora;


public class ComandoDeshacer extends ComandoRaiz {
    private Calculadora calculadora;
    private static final String nombre="DeshacerMemento";

    public ComandoDeshacer(Calculadora calculadora) {
    	super(nombre, calculadora);
        this.calculadora = calculadora;        
    }

    @Override
    public void execute() {
        this.calculadora.iniciar();
    }

}
