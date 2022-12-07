package Es9;

public class Giallo implements Colore {
    @Override
    public String getDenominazione() {
        return "giallo";
    }

    @Override
    public String getCodice() {
        return "#ffff00";
    }

    @Override
    public void disegna(String nome, int superficie) {
        System.out.println("[GIALLO]: Ho costruito un " + nome + " di superficie " + superficie + " e colore giallo");
    }
}
