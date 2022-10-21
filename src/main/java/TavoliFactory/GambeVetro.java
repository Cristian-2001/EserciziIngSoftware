package TavoliFactory;

public class GambeVetro extends Gambe {
    String tipo = "Gambe di vetro";

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
