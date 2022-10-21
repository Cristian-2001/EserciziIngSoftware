package TavoliFactory;

public class LegnoFactory implements PartsFactory {
    @Override
    public Piano getPiano() {
        return new PianoLegno();
    }

    @Override
    public Gambe getGambe() {
        return new GambeLegno();
    }
}
