package Es4_FactoryMethod;

public class EuropeVehicleStore extends VehicleStore {
    @Override
    public Vehicle createCar(String brand) {
        if (brand.equals("Fiat")) {
            return new FiatMultipla();
        } else {
            return null;
        }
    }
}
