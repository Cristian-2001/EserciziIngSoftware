package Es9;

public class App {
    public static void main(String[] args) {
        Forma pentagonoRosso = new Pentagono(100, new Rosso());
        Forma pentagonoGiallo = new Pentagono(100, new Giallo());
        Forma esagonoGiallo = new Esagono(70, new Giallo());

        pentagonoRosso.colora();
        pentagonoGiallo.colora();
        esagonoGiallo.colora();
    }
}
