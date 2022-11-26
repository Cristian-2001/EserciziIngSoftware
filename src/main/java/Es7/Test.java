package Es7;

public class Test {
    public static void main(String[] args) {
        Stazione stazione = new Stazione();
        for (int i = 0; i < 100; i++) {
            stazione.previsione();
        }
    }
}
