package es.upm.miw.pd.ecp2.patrones.calculadora;

public class ComandoIniciar extends ComandoRaiz {
    private Calculadora calculadora;
    private static final String nombre="Iniciar";

    public ComandoIniciar(Calculadora calculadora) {
    	super(nombre, calculadora);
        this.calculadora = calculadora;        
    }

    @Override
    public void execute() {
        this.calculadora.iniciar();
    }

}
