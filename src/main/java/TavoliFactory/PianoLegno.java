package TavoliFactory;

public class PianoLegno extends Piano {
    String tipo = "Piano di legno";

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
