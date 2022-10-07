package Es2;

public class Alieno extends Character{
    public Alieno() {
        fightBehavior = new Blob();
        move = new Teletrasporto();
    }

    @Override
    public void display() {
        System.out.println("Sono un alieno");
    }
}
