package Es4_FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle;
        VehicleStore vehicleStoreEU = new EuropeVehicleStore();
        VehicleStore vehicleStoreUSA = new USAVehicleStore();

        vehicle = vehicleStoreEU.createCar("Fiat");
        System.out.println("EU Fiat = " + vehicle.toString());

        /*vehicle = vehicleStoreEU.createCar("Ford");
        System.out.println("EU Ford = " + vehicle.toString());*/

        /*vehicle = vehicleStoreUSA.createCar("Fiat");
        System.out.println("USA Fiat = " + vehicle.toString());*/

        vehicle = vehicleStoreUSA.createCar("Ford");
        System.out.println("USA Ford = " + vehicle.toString());
    }
}
