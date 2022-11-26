package Es7;

public class Nuvoloso implements State {
    Stazione stazione;

    public Nuvoloso(Stazione stazione) {
        this.stazione = stazione;
    }

    @Override
    public void previsione(int dati) {
        if (dati < 3) {
            migliora();
        } else if (dati > 4) {
            peggiora();
        }
    }

    @Override
    public void migliora() {
        System.out.println("Sta uscendo il sole...");
        stazione.setState(stazione.getSoleggiato());
    }

    @Override
    public void peggiora() {
        System.out.println("Sta iniziando a piovere...");
        stazione.setState(stazione.getPiovigginoso());
    }

    @Override
    public String toString() {
        return "Previsto nuvoloso";
    }
}
