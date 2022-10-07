package Es1;

import java.util.List;

public class Italian extends Person{
    public Italian(String name, int age) {
        super(name, age);
    }

    public void parla(){
        System.out.println("Ciao gente!");
    }

    @Override
    public void say() {
        parla();
    }
}
