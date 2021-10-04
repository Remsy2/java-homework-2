import animals.*;
public class Worker {

    public void getVoice(String animal) {
        switch(animal) {
            case "Duck":
                System.out.println("Duuuuuck");
                break;
            case "Seagull":
                System.out.println("Chaaaa chaaaa");
                break;
            case "Lion":
                System.out.println("Arrrrrrrr");
                break;
            case "Elephant":
                System.out.println("Praaaaaaa praaaaaa");
            default:
                System.out.println("This animal has no voice");

        }
    }


}
