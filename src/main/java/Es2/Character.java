package Es2;

public abstract class Character {
    FightBehavior fightBehavior;
    Move move;

    public void performFight() {
        fightBehavior.fight();
    }

    public void startMove() {
        move.move();
    }

    public FightBehavior getFightBehavior() {
        return fightBehavior;
    }

    public Move getMove() {
        return move;
    }

    public void setFightBehavior(FightBehavior fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public abstract void display();

    public void move() {
        System.out.println("Mi sto muovendo!");
    }
}
