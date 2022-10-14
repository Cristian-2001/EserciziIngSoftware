package Es3;

public class CPU extends ComponentDecorator{
    Computer computer;

    public CPU(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", CPU";
    }

    @Override
    public double cost() {
        return computer.cost() + 50;
    }
}
