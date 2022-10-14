package Es3;

public class RAM extends ComponentDecorator {
    Computer computer;
    int capacity;

    public RAM(Computer computer, int capacity) {
        this.computer = computer;
        this.capacity = capacity;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", RAM: " + capacity + " GB";
    }

    @Override
    public double cost() {
        return computer.cost() + capacity * 10;
    }
}
