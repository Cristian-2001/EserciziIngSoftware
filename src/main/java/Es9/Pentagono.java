package Es9;

public class Pentagono extends Forma {
    public Pentagono(int superficie, Colore colore) {
        super(colore);
        super.nome = "Pentagono";
        super.superficie = superficie;
    }

    @Override
    public void colora() {
        colore.disegna(nome, superficie);
    }
}
