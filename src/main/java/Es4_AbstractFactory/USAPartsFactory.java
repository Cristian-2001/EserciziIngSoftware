package Es4_AbstractFactory;

public class USAPartsFactory implements VehiclePartsFactory{
    @Override
    public Interni getInterni() {
        return new USAInterni();
    }

    @Override
    public Carrozzeria getCarrozzeria() {
        return new USACarrozzeria();
    }

    @Override
    public Motore getMotore() {
        return new USAMotore();
    }
}
