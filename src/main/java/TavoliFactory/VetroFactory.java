package TavoliFactory;

public class VetroFactory implements PartsFactory{
    @Override
    public Piano getPiano() {
        return new PianoVetro();
    }

    @Override
    public Gambe getGambe() {
        return new GambeVetro();
    }
}
