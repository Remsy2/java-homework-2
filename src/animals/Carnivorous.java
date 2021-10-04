package animals;

import food.*;

public abstract class Carnivorous extends Animal{

    public Carnivorous(String name,int age) {
        super(name,age);
    }
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Foo, I can not eat this meal");
        }
        else {
            System.out.println("Yummy yummy");
            energy+=100;

        }
    }
    public abstract void killSomething();


}
