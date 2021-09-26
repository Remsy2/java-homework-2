package animals;

public class Elephant extends Herbivore implements Voice {

    public Elephant(String name, int age) {
        super(name,age);
    }

    public String voice() {
        return "Praaaaaaa praaaaaa";
    }

    public  void findSomething() {
        if(energy>0) {
            System.out.println("YEah I found something");
            this.energy--;
        }
        else {
            System.out.println("I'm hungry give me a food");

        }

    }

}
