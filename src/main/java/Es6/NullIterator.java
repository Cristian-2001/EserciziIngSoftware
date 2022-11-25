package Es6;

import java.util.Iterator;

public class NullIterator implements Iterator<ParcheggioComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public ParcheggioComponent next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
