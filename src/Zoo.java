import food.*;
import animals.*;


public class Zoo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Food carrot=new Grass();
        Lion king=new Lion("Simba",13);
        Herbivore rabbit=new Rabbit("Bunny",6);

        System.out.println("The lion says "+king.voice());

        Fish shark=new Fish("Shark", 1);
        shark.swim(12);
        king.eat(carrot);
        rabbit.eat(carrot);


        Worker man=new Worker();
        man.getVoice("Lion");
        man.getVoice("Fish");

    }

}

