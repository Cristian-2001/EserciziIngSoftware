package Es9;

public class Esagono extends Forma {
    public Esagono(int superficie, Colore colore) {
        super(colore);
        super.nome = "Esagono";
        super.superficie = superficie;
    }

    @Override
    public void colora() {
        colore.disegna(nome, superficie);
    }
}
