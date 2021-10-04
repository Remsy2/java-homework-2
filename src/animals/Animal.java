package animals;
import food.Food;


public class Animal {
    protected String name;
    protected int age;
    protected int energy=0;

    public Animal(String name,int age) {
        this.name=name;
        this.age=age;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }


    public void eat(Food food) {
        energy++;

    }

}
//All interfaces are here
interface Run {
    public void runInSpeed(int speed);
}
interface Swim{
    public void swim(int depth);
}
interface Fly{
    public void flyHigh(int height);
}
interface Voice{
    public String voice();
}