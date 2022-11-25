package Es6;

import java.util.Iterator;

public class Manager {
    ParcheggioComponent allParkings;

    public Manager(ParcheggioComponent allParkings) {
        this.allParkings = allParkings;
    }

    public void printParking() {
        allParkings.print();
    }

    public void printFreeParkings() {
        Iterator<ParcheggioComponent> iterator = allParkings.createIterator();
        System.out.println("\nFREE PARKINGS\n----");
        while (iterator.hasNext()) {
            ParcheggioComponent parcheggioComponent = iterator.next();
            try {
                if (parcheggioComponent.isFree()) {
                    parcheggioComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
