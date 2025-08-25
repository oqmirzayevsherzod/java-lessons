public class Composition {
    public static void main(String[] args){

        //Theme: Composition

        Car car = new Car("Corvette", 2025,"V8");

        System.out.println(car.engine.type);
        car.start();
    }
}
