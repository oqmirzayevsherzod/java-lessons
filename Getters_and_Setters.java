public class Getters_and_Setters {
    public static void main(String[] args){

        //Theme: Getters and Setters
        //Getters = Methods that make a field READABLE
        //Setters = Methods that make a field WRITEABLE

        Automobile automobile = new Automobile("BMW","Black", 90000);

        automobile.setColour("White");
        automobile.setPrice(0);

        System.out.println(automobile.getColour() + " " + automobile.getModel() + " " + automobile.getPrice());
    }
}
