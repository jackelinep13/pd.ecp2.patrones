package es.upm.miw.pd.ecp2.patrones.calculadora;

public interface Mementable<T> {
	
	T guardar();
	void deshacer(T memento);
}

