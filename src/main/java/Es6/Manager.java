package Es6;

public class Manager {
    ParcheggioComponent allParkings;

    public Manager(ParcheggioComponent allParkings) {
        this.allParkings = allParkings;
    }

    public void printParking(){
        allParkings.print();
    }
}
