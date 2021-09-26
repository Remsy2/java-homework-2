package animals;

public class Rabbit extends Herbivore  implements Run{
    protected int speed;

    public Rabbit(String name, int age) {
        super(name,age);
    }
    public void runInSpeed(int speed) {
        this.speed=speed;
        System.out.println("Rabbit is running in speed of "+speed);
    }

    public  void findSomething() {
        if(energy>0) {
            System.out.println("YEah I found something");
            energy--;
        }
        else {
            System.out.println("I'm hungry give me a food");

        }

    }

}
