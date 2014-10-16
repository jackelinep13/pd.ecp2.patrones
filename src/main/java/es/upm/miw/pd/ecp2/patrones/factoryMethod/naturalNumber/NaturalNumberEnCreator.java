package es.upm.miw.pd.ecp2.patrones.factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber(int valor) {
		return new NaturalNumberEn(valor);
	}
	
	@Override
    public String toString() {
        return "Creador de NaturalNumberEn";
    }

}
