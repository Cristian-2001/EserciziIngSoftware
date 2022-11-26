package Es7;

public class Piovigginoso implements State {
    Stazione stazione;

    public Piovigginoso(Stazione stazione) {
        this.stazione = stazione;
    }

    @Override
    public void previsione(int dati) {
        if (dati < 7) {
            migliora();
        } else if (dati > 8) {
            peggiora();
        }
    }

    @Override
    public void migliora() {
        System.out.println("Sta smettendo di piovere...");
        stazione.setState(stazione.getNuvoloso());
    }

    @Override
    public void peggiora() {
        System.out.println("Sta iniziando a nevicare...");
        stazione.setState(stazione.getNevoso());
    }

    @Override
    public String toString() {
        return "Prevista pioggia";
    }
}
