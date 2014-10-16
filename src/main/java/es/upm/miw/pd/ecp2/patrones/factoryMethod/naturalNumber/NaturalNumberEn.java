package es.upm.miw.pd.ecp2.patrones.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber{
    private int value;

    private static final String[] textValue = {"zero", "one", "two", "three", "four", "five"};

    public NaturalNumberEn(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberEn.textValue[this.value];
        } else {
            return "???";
        }
    }

}
