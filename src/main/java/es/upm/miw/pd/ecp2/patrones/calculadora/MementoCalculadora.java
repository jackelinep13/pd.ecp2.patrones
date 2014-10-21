package es.upm.miw.pd.ecp2.patrones.calculadora;

public class MementoCalculadora {
	private int total;

	public MementoCalculadora(int total) {
		this.setTotal(total);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
