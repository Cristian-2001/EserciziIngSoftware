package Es6;

public class ParcheggioItem extends ParcheggioComponent {
    int num;
    int dim;
    boolean free;

    public ParcheggioItem(int num, int dim, boolean free) {
        this.num = num;
        this.dim = dim;
        this.free = free;
    }

    public int getNum() {
        return num;
    }

    @Override
    public Integer getDim() {
        return dim;
    }

    public boolean isFree() {
        return free;
    }

    public void print() {
        System.out.print(" " + getNum());
        if (isFree()) {
            System.out.print("(f)");
        }
        System.out.println(", " + getDim());
    }
}
