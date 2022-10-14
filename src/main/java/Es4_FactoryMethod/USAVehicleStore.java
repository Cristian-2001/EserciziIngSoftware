package Es4_FactoryMethod;

public class USAVehicleStore extends VehicleStore {
    @Override
    public Vehicle createCar(String brand) {
        if (brand.equals("Ford")) {
            return new FordFocus();
        } else {
            return null;
        }
    }
}
