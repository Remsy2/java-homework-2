package animals;

public class Lion extends Carnivorous implements Run, Voice {
    protected int speed;

    public Lion(String name,int age) {
        super(name,age);
    }
    public void runInSpeed(int speed) {
        this.speed=speed;
        System.out.println("Lion is running in speed of "+speed);
    }
    public  String voice() {
        return "ARRRRRRRRRRRR";
    }
    public  void killSomething() {
        if(energy>0) {
            System.out.println("YEah I killed something");
            energy--;
        }
        else {
            System.out.println("I'm hungry give me a food");

        }

    }
}
