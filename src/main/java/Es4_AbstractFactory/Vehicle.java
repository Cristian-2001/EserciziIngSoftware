package Es4_AbstractFactory;

public abstract class Vehicle {
    public Motore motore;
    public Carrozzeria carrozzeria;
    public Interni interni;
    public String modello;
    public VehiclePartsFactory factory;

    public abstract void assemble();

    @Override
    public String toString() {
        return "Vehicle{" + "motore=" + motore + ", carrozzeria=" + carrozzeria + ", interni=" + interni + '\'' + '}';
    }
}