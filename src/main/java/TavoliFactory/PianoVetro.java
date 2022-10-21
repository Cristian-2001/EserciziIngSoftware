package TavoliFactory;

public class PianoVetro extends Piano{
    String tipo = "Piano di vetro";

    @Override
    public String toString() {
        return ("Sono un " + this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
