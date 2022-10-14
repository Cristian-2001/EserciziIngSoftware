package Es3;

public class ComputerRest {
    public static void main(String[] args) {
        Computer computer = new Desktop();
        System.out.println(computer.getDescription() + ", euro " + computer.cost());

        Computer computer2 = new Laptop();
        computer2 = new RAM(computer2, 16);
        computer2 = new CPU(computer2);
        computer2 = new HardDisk(computer2, 512);
        System.out.println(computer2.getDescription() + ", euro " + computer2.cost());
    }
}
