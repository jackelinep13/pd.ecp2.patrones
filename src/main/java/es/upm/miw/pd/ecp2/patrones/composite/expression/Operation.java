package es.upm.miw.pd.ecp2.patrones.composite.expression;

public abstract class Operation extends Expresion {

	protected Expresion exp1, exp2;
	
	public Operation(Expresion exp1, Expresion exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
    }
		
	public abstract int operar();
	public abstract String toString();
	
}
