package animals;

public class Seagull extends Carnivorous implements Voice,Fly{
    protected int flyHeight;

    public Seagull(String name, int age) {
        super(name,age);
    }
    public String voice() {
        return "Chaaaa chaaaa";
    }
    public void flyHigh(int height){
        this.flyHeight=height;
        System.out.println("Seegull is flying in "+flyHeight+ "m from Eart.");
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
