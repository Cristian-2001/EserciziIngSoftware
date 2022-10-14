package Es4_AbstractFactory;

public class Ford extends Vehicle {
    public Ford(VehiclePartsFactory factory) {
        super();
        this.factory = factory;
        this.modello = "Ford";
    }

    @Override
    public void assemble() {
        motore = factory.getMotore();
        carrozzeria = factory.getCarrozzeria();
        interni = factory.getInterni();
    }

    @Override
    public String toString() {
        return "Ford{" + "motore=" + motore + ", carrozzeria=" + carrozzeria + ", interni=" + interni + ", modello='" + modello + '\'' + '}';
    }
}
