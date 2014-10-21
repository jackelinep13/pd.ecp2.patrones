package es.upm.miw.pd.ecp2.patrones.calculadora;

public abstract class ComandoRaiz implements Comando{

	private String name;
	private Calculadora calc;
	
	public ComandoRaiz(String name, Calculadora calc){
		this.name= name;
		this.calc=calc;
	}
    
	public String name() {
        return name;
    }
    
    public Calculadora getCalculadora(){
    	return this.calc;
    }
	
}
