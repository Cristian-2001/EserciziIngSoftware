package Es4_AbstractFactory;

public class Main {
    public static void main(String[] args) {
        EuropeVehicleStore europeanStore = new EuropeVehicleStore();
        USAVehicleStore USAStore = new USAVehicleStore();

        Vehicle myEuropeanFiat = europeanStore.createVehicle("Fiat");
        Vehicle myEuropeanFord = europeanStore.createVehicle("Ford");

        Vehicle myAmericanFiat = USAStore.createVehicle("Fiat");
        Vehicle myAmericanFord = USAStore.createVehicle("Ford");

        myEuropeanFiat.assemble();
        myEuropeanFord.assemble();
        myAmericanFiat.assemble();
        myAmericanFord.assemble();

        System.out.println(myEuropeanFiat.toString());
        System.out.println(myEuropeanFord.toString());
        System.out.println(myAmericanFiat.toString());
        System.out.println(myAmericanFord.toString());
    }
}
