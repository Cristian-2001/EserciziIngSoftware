package Es8;

import java.lang.reflect.Proxy;

public class App {
    public static void main(String[] args) {
        Corso corso = new CorsoImpl("Ingegneria del Software");
        Studente s1 = new Studente("Alberto", "Artabano", 111);
        Studente s2 = new Studente("Barbara", "Barbanera", 222);
        Studente s3 = new Studente("Ciro", "Cinto", 333);
        Studente s4 = new Studente("Dalia", "Dantesca", 444);
        Corso admin = creaAmministratore(corso);
        Corso utente = creaUtente(corso);
        try {
            //admin aggiunge gli studenti
            admin.aggiungiStudente(s1);
            admin.aggiungiStudente(s2);
            admin.aggiungiStudente(s3);
            admin.aggiungiStudente(s4);

            //utente aggiunge gli studenti
            /*utente.aggiungiStudente(s1);
            utente.aggiungiStudente(s2);
            utente.aggiungiStudente(s3);
            utente.aggiungiStudente(s4);*/

            //admin visualizza gli studenti
            //admin.visualizzaStudenti();

            //utente visualizza gli studenti
            utente.visualizzaStudenti();
        } catch (Exception e) {
            System.out.println("Solo gli amministratori possono aggiungere degli studenti a un corso.");
        }
    }

    private static Corso creaUtente(Corso corso) {
        Corso proxy = (Corso) Proxy.newProxyInstance(corso.getClass().getClassLoader(), corso.getClass().getInterfaces(), new Utente(corso));
        return proxy;
    }

    private static Corso creaAmministratore(Corso corso) {
        Corso proxy = (Corso) Proxy.newProxyInstance(corso.getClass().getClassLoader(), corso.getClass().getInterfaces(), new Amministratore(corso));
        return proxy;
    }
}
