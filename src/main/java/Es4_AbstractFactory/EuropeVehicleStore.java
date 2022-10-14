package Es4_AbstractFactory;

public class EuropeVehicleStore extends VehicleStore {
    EuropePartsFactory europeFactory = new EuropePartsFactory();

    @Override
    public Vehicle createVehicle(String type) {
        if (type.equals("Ford")) {
            return new Ford(europeFactory);
        } else if (type.equals("Fiat")) {
            return new Fiat(europeFactory);
        }
        return null;
    }
}
