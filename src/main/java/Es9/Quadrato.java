package Es9;

public class Quadrato extends Forma {
    public Quadrato(int superficie, Colore colore) {
        super(colore);
        super.nome = "Quadrato";
        super.superficie = superficie;
    }

    @Override
    public void colora() {
        colore.disegna(nome, superficie);
    }
}
