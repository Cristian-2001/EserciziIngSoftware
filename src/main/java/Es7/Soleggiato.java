package Es7;

public class Soleggiato implements State {
    Stazione stazione;

    public Soleggiato(Stazione stazione) {
        this.stazione = stazione;
    }

    @Override
    public void previsione(int dati) {
        if (dati < 5) {
            peggiora();
        }
    }

    @Override
    public void migliora() {
        //do nothing
    }

    @Override
    public void peggiora() {
        System.out.println("Si sta annuvolando...");
        stazione.setState(stazione.getNuvoloso());
    }

    @Override
    public String toString() {
        return "Previsto sole";
    }
}
