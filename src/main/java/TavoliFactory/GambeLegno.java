package TavoliFactory;

public class GambeLegno extends Gambe {
    String tipo = "Gambe di legno";

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
