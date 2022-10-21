package TavoliFactory;

/**
 * Questo package l'ho provato a fare io per provare a creare tavoli con parti diverse.
 * Non sono sicuro sia giusto visto che il prof non ci ha detto di farlo.
 */
public class Main {
    public static void main(String[] args) {
        TavoloStore tavoloStore = new TavoloStore();

        Tavolo tavolo1 = tavoloStore.createTavolo("Vetro", "Vetro");
        tavolo1.assemble();
        System.out.println(tavolo1.toString());

        Tavolo tavolo2 = tavoloStore.createTavolo("Vetro", "Legno");
        tavolo2.assemble();
        System.out.println(tavolo2.toString());

        Tavolo tavolo3 = tavoloStore.createTavolo("Legno", "Legno");
        tavolo3.assemble();
        System.out.println(tavolo3.toString());

        Tavolo tavolo4 = tavoloStore.createTavolo("Legno", "Vetro");
        tavolo4.assemble();
        System.out.println(tavolo4.toString());
    }
}
