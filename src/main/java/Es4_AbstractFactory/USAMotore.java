package Es4_AbstractFactory;

public class USAMotore extends Motore {
    String tipo = "Motore Americano";

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
