package Es3;

public class Desktop extends Computer{
    public Desktop() {
        description = "Desktop";
    }

    @Override
    public double cost() {
        return 800;
    }
}
