package Es9;

public abstract class Forma {
    protected String nome;
    int superficie;
    protected Colore colore;

    public Forma(Colore colore) {
        this.colore = colore;
    }

    public abstract void colora();
}
