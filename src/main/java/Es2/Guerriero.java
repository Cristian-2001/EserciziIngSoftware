package Es2;

public class Guerriero extends Character{
    public Guerriero() {
        fightBehavior = new PistolaLaser();
        move = new NaveInterstellare();
    }

    @Override
    public void display() {
        System.out.println("Sono un guerriero!!");
    }
}
