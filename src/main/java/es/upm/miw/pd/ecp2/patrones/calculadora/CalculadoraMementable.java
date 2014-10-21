package es.upm.miw.pd.ecp2.patrones.calculadora;


public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora>{

    public CalculadoraMementable() {
        this.iniciar();
    }

    public void deshacer(int valor) {
    }

    public void guardar(int valor) {
    }

	@Override
	public MementoCalculadora guardar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deshacer(MementoCalculadora memento) {
		// TODO Auto-generated method stub
		
	}

    
    
 
	
}
