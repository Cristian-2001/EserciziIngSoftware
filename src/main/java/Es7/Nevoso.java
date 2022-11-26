package Es7;

public class Nevoso implements State {
    Stazione stazione;

    public Nevoso(Stazione stazione) {
        this.stazione = stazione;
    }

    @Override
    public void previsione(int dati) {
        if (dati < 8) {
            migliora();
        } else if (dati > 9) {
            peggiora();
        }
    }

    @Override
    public void migliora() {
        System.out.println("Sta smettendo di nevicare...");
        stazione.setState(stazione.getNuvoloso());
    }

    @Override
    public void peggiora() {
        System.out.println("Sta iniziando a piovere...");
        stazione.setState(stazione.getPiovigginoso());
    }

    @Override
    public String toString() {
        return "Prevista neve";
    }
}
