package Es5;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int lunghezza = 20;

        CampanaCommand din = new CampanaCommand(new CampanaDin());
        CampanaCommand dinEco = new CampanaCommand(new EffettoEco(new CampanaDin()));
        CampanaCommand dinVento = new CampanaCommand(new EffettoVento(new CampanaDin()));
        CampanaCommand dinTic = new CampanaCommand(new EffettoBattito(new CampanaDin()));
        CampanaCommand don = new CampanaCommand(new CampanaDon());
        CampanaCommand donEco = new CampanaCommand(new EffettoEco(new CampanaDon()));
        CampanaCommand donVento = new CampanaCommand(new EffettoVento(new CampanaDon()));
        CampanaCommand donTic = new CampanaCommand(new EffettoBattito(new CampanaDon()));
        CampanaCommand dan = new CampanaCommand(new CampanaDan());
        CampanaCommand danEco = new CampanaCommand(new EffettoEco(new CampanaDan()));
        CampanaCommand danVento = new CampanaCommand(new EffettoVento(new CampanaDan()));
        CampanaCommand danTic = new CampanaCommand(new EffettoBattito(new CampanaDan()));

        Scheduler s = new Scheduler();

        HashMap<Integer, CampanaCommand> hm = new HashMap<>();
        hm.put(1, din);
        hm.put(2, dinEco);
        hm.put(3, dinVento);
        hm.put(4, dinTic);

        hm.put(5, don);
        hm.put(6, donEco);
        hm.put(7, donVento);
        hm.put(8, donTic);

        hm.put(9, dan);
        hm.put(10, danEco);
        hm.put(11, danVento);
        hm.put(12, danTic);

        List<Integer> indici = s.getIndici(lunghezza);

        for (int i = 0; i < lunghezza; i++) {
            System.out.println(hm.get(indici.get(i)).execute());
        }

        /*for(int i = 1; i <= 12; i++){
            System.out.println(hm.get(i).execute());
        }*/
    }
}
