public class Car {

    String make = "Chevrolet";
    String model = "Nexia 2";
    int year = 2016;
    double price = 5400;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You drive the car " + model);
    }
    void brake(){
        System.out.println("You brake the car " + model);
    }
}
