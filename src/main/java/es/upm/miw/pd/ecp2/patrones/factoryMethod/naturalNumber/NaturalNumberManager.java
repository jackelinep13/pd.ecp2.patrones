package es.upm.miw.pd.ecp2.patrones.factoryMethod.naturalNumber;


public class NaturalNumberManager {

	private NaturalNumber naturalNumber;

    private NaturalNumberCreator creator;

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }

    public void createNaturalNumber() {
        this.naturalNumber = this.creator.createNaturalNumber();
    }

    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }
	
}
