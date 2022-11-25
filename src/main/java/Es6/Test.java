package Es6;

public class Test {
    public static void main(String[] args) {
        ParcheggioComponent parcheggio1 =
                new Parcheggio("Area 1", "Area numero uno");
        ParcheggioComponent parcheggio2 =
                new Parcheggio("Area 2", "Area numero due");
        ParcheggioComponent parcheggio3 =
                new Parcheggio("Area 3", "Area numero tre");

        ParcheggioComponent sottoarea1 = new Parcheggio("Sottoarea 1", "Sottoarea numero 1");
        ParcheggioComponent sottoarea2 = new Parcheggio("Sottoarea 2", "Sottoarea numero 2");
        ParcheggioComponent sottoarea3 = new Parcheggio("Sottoarea 3", "Sottoarea numero 3");
        ParcheggioComponent sottoarea4 = new Parcheggio("Sottoarea 4", "Sottoarea numero 4");
        ParcheggioComponent sottoarea5 = new Parcheggio("Sottoarea 5", "Sottoarea numero 5");
        ParcheggioComponent sottoarea6 = new Parcheggio("Sottoarea 6", "Sottoarea numero 6");

        ParcheggioComponent allParkings = new Parcheggio("ALL PARKINGS", "All parkings combined");
        allParkings.add(parcheggio1);
        allParkings.add(parcheggio2);
        allParkings.add(parcheggio3);
        // add parking items here
        parcheggio1.add(new ParcheggioItem(1, 10, true));
        parcheggio1.add(sottoarea1);
        parcheggio1.add(sottoarea2);
        sottoarea1.add(new ParcheggioItem(2, 10, false));
        sottoarea1.add(new ParcheggioItem(3, 10, false));
        sottoarea2.add(new ParcheggioItem(4, 10, true));
        sottoarea2.add(new ParcheggioItem(5, 10, true));

        parcheggio2.add(new ParcheggioItem(1, 10, false));
        parcheggio2.add(sottoarea3);
        parcheggio2.add(sottoarea4);
        sottoarea3.add(new ParcheggioItem(2, 10, true));
        sottoarea3.add(new ParcheggioItem(3, 10, false));
        sottoarea4.add(new ParcheggioItem(4, 10, false));
        sottoarea4.add(new ParcheggioItem(5, 10, true));

        parcheggio3.add(new ParcheggioItem(1, 10, true));
        parcheggio3.add(sottoarea5);
        parcheggio3.add(sottoarea6);
        sottoarea5.add(new ParcheggioItem(2, 10, false));
        sottoarea5.add(new ParcheggioItem(3, 10, false));
        sottoarea6.add(new ParcheggioItem(4, 10, false));
        sottoarea6.add(new ParcheggioItem(5, 10, false));
        // add more menu items here

        Manager manager = new Manager(allParkings);
        manager.printParking();
        manager.printFreeParkings();
    }
}
