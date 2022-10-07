package Es1;

public class Test {
    public static Person frank = new English("Frank", 29);
    public static Person francesco = new Italian("Francesco", 29);

    public static void main(String[] args){
        francesco.addAmici(frank);

        System.out.println("I'm " + francesco.getName());
        francesco.say();

        System.out.println("I'm " + frank.getName());
        frank.say();
    }
}
