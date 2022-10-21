package Es5;

public class EffettoBattito extends CampanaDecorator {
    public Campana campana;

    public EffettoBattito(Campana campana) {
        this.campana = campana;
    }

    @Override
    public String getSuono() {
        return campana.getSuono() + " tic";
    }
}
