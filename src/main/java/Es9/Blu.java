package Es9;

public class Blu implements Colore {
    @Override
    public String getDenominazione() {
        return "blu";
    }

    @Override
    public String getCodice() {
        return "#0000ff";
    }

    @Override
    public void disegna(String nome, int superficie) {
        System.out.println("[BLU]: Ho costruito un " + nome + " di superficie " + superficie + " e colore blu");
    }
}
