package Es2;

public class Simulator {
    public static void main(String[] args) {
        Character guerriero = new Guerriero();
        Character alieno = new Alieno();

        guerriero.display();
        guerriero.performFight();
        guerriero.startMove();

        alieno.display();
        alieno.startMove();

        guerriero.setFightBehavior(new FucilePlasma());
        guerriero.setMove(new MotoSubsonica());

        guerriero.display();
        guerriero.performFight();
        guerriero.startMove();

        alieno.display();
        alieno.performFight();
    }
}
