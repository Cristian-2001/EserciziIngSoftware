package Es9;

public class Rosso implements Colore {
    @Override
    public String getDenominazione() {
        return "rosso";
    }

    @Override
    public String getCodice() {
        return "#ff0000";
    }

    @Override
    public void disegna(String nome, int superficie) {
        System.out.println("[ROSSO]: Ho costruito un " + nome + " di superficie " + superficie + " e colore rosso");
    }
}
