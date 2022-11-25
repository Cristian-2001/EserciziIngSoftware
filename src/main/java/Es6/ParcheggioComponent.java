package Es6;

import java.util.Iterator;

public abstract class ParcheggioComponent {
    public void add(ParcheggioComponent parcheggioComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(ParcheggioComponent parcheggioComponent) {
        throw new UnsupportedOperationException();
    }

    public void getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public Integer getDim() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public boolean isFree() {
        throw new UnsupportedOperationException();
    }

    public Iterator<ParcheggioComponent> createIterator() {
        throw new UnsupportedOperationException();
    }
}
