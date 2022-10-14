package Es4_AbstractFactory;

public class USAVehicleStore extends VehicleStore {
    USAPartsFactory usaFactory = new USAPartsFactory();

    @Override
    public Vehicle createVehicle(String type) {
        if (type.equals("Ford")) {
            return new Ford(usaFactory);
        } else if (type.equals("Fiat")) {
            return new Fiat(usaFactory);
        }
        return null;
    }
}
