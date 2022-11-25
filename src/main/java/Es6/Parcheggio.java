package Es6;

import java.util.ArrayList;
import java.util.Iterator;

public class Parcheggio extends ParcheggioComponent {
    ArrayList<ParcheggioComponent> parcheggioComponents = new ArrayList<ParcheggioComponent>();
    Iterator<ParcheggioComponent> iterator = null;
    String name;
    String description;

    public Parcheggio(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(ParcheggioComponent parcheggioComponent) {
        parcheggioComponents.add(parcheggioComponent);
    }

    public void remove(ParcheggioComponent parcheggioComponent) {
        parcheggioComponents.remove(parcheggioComponent);
    }

    public ParcheggioComponent getChild(Integer i) {
        return parcheggioComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        Iterator<ParcheggioComponent> iterator = parcheggioComponents.iterator();
        while (iterator.hasNext()) {
            ParcheggioComponent parcheggioComponent = iterator.next();
            parcheggioComponent.print();
        }
    }

    public Iterator<ParcheggioComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(parcheggioComponents.iterator());
        }
        return iterator;
    }
}
