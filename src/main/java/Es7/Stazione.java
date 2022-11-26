package Es7;

import java.util.Random;

public class Stazione {
    State soleggiato;
    State nuvoloso;
    State piovigginoso;
    State nevoso;
    State state;

    public Stazione() {
        soleggiato = new Soleggiato(this);
        nuvoloso = new Nuvoloso(this);
        piovigginoso = new Piovigginoso(this);
        nevoso = new Nevoso(this);
        state = soleggiato;
    }

    public State getSoleggiato() {
        return soleggiato;
    }

    public State getNuvoloso() {
        return nuvoloso;
    }

    public State getPiovigginoso() {
        return piovigginoso;
    }

    public State getNevoso() {
        return nevoso;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void previsione() {
        Random random = new Random();
        int dati = random.nextInt(10);
        System.out.println(state);
        state.previsione(dati);
    }
}
