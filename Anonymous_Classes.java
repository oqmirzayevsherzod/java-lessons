public class Anonymous_Classes {
    public static void main(String[] args){

        //Theme: Anonymous Classes = A class that doesn't have a name. Cannot be reused.

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
