package Es8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Utente implements InvocationHandler {
    Corso corso;

    public Utente(Corso corso) {
        this.corso = corso;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().equals("visualizzaStudenti")) {
                method.invoke(corso, args);
            } else if (method.getName().equals("aggiungiStudente")) {
                throw  new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
