public class Inheritance {
    public static void main(String[] args){

        //Theme: Inheritance = One class inherits the attributes and methods
        //                     from another class.
        //                     Child <- Parent <- Grandparent

          Dog dog = new Dog();
          Cat cat = new Cat();
          Plant plant = new Plant();
//
//        System.out.println(dog.lives);
//        System.out.println(cat.lives);
//
//        dog.speak();
//        cat.speak();
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        plant.photosynthesize();
    }
}
