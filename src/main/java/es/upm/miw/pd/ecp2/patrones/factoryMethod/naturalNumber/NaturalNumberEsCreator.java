package es.upm.miw.pd.ecp2.patrones.factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int valor) {
		NaturalNumberEs natNumEs = new NaturalNumberEs(valor);
		return natNumEs;
	}
	
    @Override
    public String toString() {
        return "Creador de NaturalNumberEs";
    }

}
