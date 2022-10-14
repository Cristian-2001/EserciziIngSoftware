package Es4_FactoryMethod;

public abstract class Vehicle {
    String carrozzeria, motore, interni;

    public Vehicle(String carrozzeria, String motore, String interni) {
        this.carrozzeria = carrozzeria;
        this.motore = motore;
        this.interni = interni;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "carrozzeria='" + carrozzeria + '\'' + ", motore='" + motore + '\'' + ", interni='" + interni + '\'' + '}';
    }
}
