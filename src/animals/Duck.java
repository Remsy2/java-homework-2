package animals;

public class Duck extends Herbivore implements Voice,Swim {
    public int energy=0;
    public Duck(String name, int age) {
        super(name,age);
    }
    public void swim(int depth) {
        System.out.println("The fish is swimming in depth "+depth);
    }

    public String voice() {
        return "Duuuuuuck";
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
