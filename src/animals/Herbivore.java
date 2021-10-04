package animals;
import food.*;

public abstract class Herbivore extends Animal{
    private String food;
    public int energy=0;
    public Herbivore(String name,int age) {
        super(name,age);
    }
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Foo, I can not eat this meal");
        }
        else {
            System.out.println("Yummy yummy");
            this.energy++;
        }

    }
    public abstract void findSomething();

}
