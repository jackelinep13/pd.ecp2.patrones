package es.upm.miw.pd.ecp2.patrones.composite.expression;

public class Dividir extends Operation{

	public Dividir(final Expresion exp1, final Expresion exp2) {
	     super(exp1, exp2);  
	}

	
	@Override
	public int operar() {
		return exp1.operar()/exp2.operar();
	}
	
	@Override
	public String toString() {
		return "("+exp1.toString()+"/"+exp2.toString()+")";
	}
	
}
