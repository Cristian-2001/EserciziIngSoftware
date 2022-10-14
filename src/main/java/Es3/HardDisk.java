package Es3;

public class HardDisk extends ComponentDecorator {
    Computer computer;
    int capacity;

    public HardDisk(Computer computer, int capacity) {
        this.computer = computer;
        this.capacity = capacity;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", Hard Disk: " + capacity + " GB";
    }

    @Override
    public double cost() {
        return computer.cost() + capacity * 0.10;
    }
}
