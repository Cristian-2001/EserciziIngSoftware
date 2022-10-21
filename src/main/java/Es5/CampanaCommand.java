package Es5;

public class CampanaCommand extends CampanaDecorator implements Command{
    public Campana campana;

    public CampanaCommand(Campana campana) {
        this.campana = campana;
    }

    @Override
    public String getSuono() {
        return campana.getSuono();
    }

    @Override
    public String execute() {
        return getSuono();
    }
}
