package es.upm.miw.pd.ecp2.patrones.calculadora;


public class ComandoDeshacer implements Comando {
    private Calculadora calculadora;

    public ComandoDeshacer(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return "Iniciar";
    }

    @Override
    public void execute() {
        this.calculadora.iniciar();
    }

}
