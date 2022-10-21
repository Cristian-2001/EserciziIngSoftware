package Es5;

public class EffettoVento extends CampanaDecorator {
    public Campana campana;

    public EffettoVento(Campana campana) {
        this.campana = campana;
    }

    @Override
    public String getSuono() {
        return campana.getSuono() + " fffff";
    }
}
