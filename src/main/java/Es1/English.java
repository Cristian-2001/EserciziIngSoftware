package Es1;

import java.util.List;

public class English extends Person{
    public English(String name, int age) {
        super(name, age);
    }

    public void speak(){
        System.out.println("Hello World!");
    }

    @Override
    public void say() {
        speak();
    }
}
