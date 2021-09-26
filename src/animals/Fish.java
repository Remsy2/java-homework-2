package animals;

public class Fish extends Carnivorous implements Swim {
    public Fish(String name, int age) {
        super(name,age);
    }
    public void swim(int depth) {
        System.out.println("The fish is swimming in depth "+depth);
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
