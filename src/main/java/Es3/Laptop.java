package Es3;

public class Laptop extends Computer{
    public Laptop() {
        description = "Laptop";
    }

    @Override
    public double cost() {
        return 500;
    }
}
