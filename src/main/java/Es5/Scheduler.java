package Es5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scheduler {
    List<Integer> list = new ArrayList<>();
    Random rnd = new Random();

    public List<Integer> getIndici(int max) {
        for(int i = 0; i < max; i++){
            list.add(rnd.nextInt(1, 12));
        }

        return list;
    }
}
