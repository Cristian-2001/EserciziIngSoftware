package TavoliFactory;

public class TavoloStore {
    private PartsFactory pianoFactory;
    private PartsFactory gambeFactory;

    public Tavolo createTavolo(String typePiano, String typeGambe) {
        if (typePiano.equals("Legno")) {
            pianoFactory = new LegnoFactory();
        } else if (typePiano.equals("Vetro")) {
            pianoFactory = new VetroFactory();
        } else {
            pianoFactory = null;
        }

        if (typeGambe.equals("Legno")) {
            gambeFactory = new LegnoFactory();
        } else if (typeGambe.equals("Vetro")) {
            gambeFactory = new VetroFactory();
        } else {
            gambeFactory = null;
        }

        if (pianoFactory != null && gambeFactory != null) {
            return new Tavolo(pianoFactory, gambeFactory);
        } else {
            return null;
        }
    }
}
