public class Interfaces {
    public static void main(String[] args){

        //Theme: Interfaces

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Bird bird = new Bird();

        rabbit.flee();
        hawk.hunt();
        bird.hunt();
        bird.flee();


    }
}
