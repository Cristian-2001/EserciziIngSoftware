package TavoliFactory;

public class Tavolo {
    public Piano piano;
    public Gambe gambe;
    public PartsFactory pianoFactory;
    public PartsFactory gambeFactory;

    public Tavolo(PartsFactory pianoFactory, PartsFactory gambeFactory) {
        this.pianoFactory = pianoFactory;
        this.gambeFactory = gambeFactory;
    }

    public void assemble(){
        piano = pianoFactory.getPiano();
        gambe = gambeFactory.getGambe();
    }

    @Override
    public String toString() {
        return "Tavolo{" + "piano=" + piano + ", gambe=" + gambe + '}';
    }
}
