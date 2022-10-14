package Es4_AbstractFactory;

public class EuropePartsFactory implements VehiclePartsFactory {
    @Override
    public Interni getInterni() {
        return new EUInterni();
    }

    @Override
    public Carrozzeria getCarrozzeria() {
        return new EUCarrozzeria();
    }

    @Override
    public Motore getMotore() {
        return new EUMotore();
    }
}
