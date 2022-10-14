package Es4_AbstractFactory;

public class EUCarrozzeria extends Carrozzeria {
    String tipo = "Carrozzeria Europea";

    @Override
    public String toString() {
        return ("Sono una " + this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
