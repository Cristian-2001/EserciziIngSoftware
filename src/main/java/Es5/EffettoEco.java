package Es5;

public class EffettoEco extends CampanaDecorator {
    public Campana campana;

    public EffettoEco(Campana campana) {
        this.campana = campana;
    }

    @Override
    public String getSuono() {
        return campana.getSuono() + " " + campana.getSuono();
    }
}
