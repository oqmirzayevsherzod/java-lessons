public class Cars{

    String name;
    String colour;

    Cars(String name, String colour){
        this.name = name;
        this.colour = colour;
    }

    void drive(){
        System.out.println("You drive the " + colour + " " + name);
    }
}