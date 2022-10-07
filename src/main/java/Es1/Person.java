package Es1;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    public String name;
    public int age;
    public List<Person> amici = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> getAmici() {
        return amici;
    }

    public void setAmici(List<Person> amici) {
        this.amici = amici;
    }

    public void addAmici(Person p){
        amici.add(p);
    }

    public abstract void say();
}
