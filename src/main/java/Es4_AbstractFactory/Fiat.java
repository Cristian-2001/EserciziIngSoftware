package Es4_AbstractFactory;

public class Fiat extends Vehicle {
    public Fiat(VehiclePartsFactory factory) {
        super();
        this.factory = factory;
        this.modello = "Fiat";
    }

    @Override
    public void assemble() {
        motore = factory.getMotore();
        carrozzeria = factory.getCarrozzeria();
        interni = factory.getInterni();
    }

    @Override
    public String toString() {
        return "Fiat{" + "motore=" + motore + ", carrozzeria=" + carrozzeria + ", interni=" + interni + ", modello='" + modello + '\'' + '}';
    }
}
