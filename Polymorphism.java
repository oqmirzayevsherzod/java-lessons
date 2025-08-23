public class Polymorphism {
    public static void main(String[] args){

        //Theme: Polymorphism

        Bus bus = new Bus();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Transport[] transports= {bus, bike, boat};

        for(Transport transport : transports){
            transport.go();
        }

//        bus.go();
//        bike.go();
//        boat.go();
    }
}
