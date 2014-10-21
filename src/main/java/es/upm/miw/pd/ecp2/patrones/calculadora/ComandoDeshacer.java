package es.upm.miw.pd.ecp2.patrones.calculadora;


public class ComandoDeshacer extends ComandoRaiz {
    private Calculadora calculadora;
    private static final String nombre="DeshacerMemento";
    private GestorMementos<MementoCalculadora> gestorMem;

   	public ComandoDeshacer(CalculadoraMementable calculadora, GestorMementos<MementoCalculadora> gestorMem) {
   		super(nombre, calculadora);
   		this.calculadora = calculadora;
   		this.setGestorMem(gestorMem);
   	}

    public GestorMementos<MementoCalculadora> getGestorMem() {
		return gestorMem;
	}

	public void setGestorMem(GestorMementos<MementoCalculadora> gestorMem) {
		this.gestorMem = gestorMem;
	}

	@Override
    public void execute() {
        this.calculadora.iniciar();
    }

}
