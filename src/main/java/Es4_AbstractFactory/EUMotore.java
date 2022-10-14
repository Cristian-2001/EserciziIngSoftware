package Es4_AbstractFactory;

public class EUMotore extends Motore {
    String tipo = "Motore Europeo";

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
