package Es6;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator<ParcheggioComponent>> stack = new Stack<Iterator<ParcheggioComponent>>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public ParcheggioComponent next() {
        if (hasNext()) {
            Iterator<ParcheggioComponent> iterator = stack.peek();
            ParcheggioComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<ParcheggioComponent> iterator = stack.peek();
            if (iterator == null || !iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}
