package Es4_AbstractFactory;

public class USAInterni extends Interni {
    String tipo = "Interni Americani";

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
