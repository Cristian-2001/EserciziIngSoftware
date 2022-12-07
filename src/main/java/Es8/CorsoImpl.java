package Es8;

import java.util.ArrayList;
import java.util.List;

public class CorsoImpl implements Corso {
    private String nome;
    private List<Studente> studenti;

    public CorsoImpl(String nome) {
        this.nome = nome;
        studenti = new ArrayList<>();
    }

    @Override
    public void visualizzaStudenti() {
        if (studenti.isEmpty()) {
            System.out.println("\nNon ci sono studenti iscritti al corso");
        } else {
            System.out.println("\nStudenti iscritti al corso di " + nome);
            for (Studente s : studenti) {
                System.out.println(s);
            }
            System.out.println("");
        }
    }

    @Override
    public void aggiungiStudente(Studente s) {
        if (studenti.contains(s)) {
            System.out.println("Studente con matricola " + s.getMatricola());
        } else {
            studenti.add(s);
            System.out.println("Studente con matricola " + s.getMatricola());
        }
    }
}
