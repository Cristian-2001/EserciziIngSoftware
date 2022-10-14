package Es4_AbstractFactory;

public class EUInterni extends Interni {
    String tipo = "Interni Europei";

    @Override
    public String toString() {
        return ("Sono degli " + this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
