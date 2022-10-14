package Es4_AbstractFactory;

public interface VehiclePartsFactory {
    Interni getInterni();
    Carrozzeria getCarrozzeria();
    Motore getMotore();
}
