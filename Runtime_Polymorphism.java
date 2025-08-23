import java.util.Scanner;

public class Runtime_Polymorphism {
    public static void main(String[] args){

        //Theme: Runtime Polymorphism

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.println("Would you like a dog or a cat (1 = dog, 2 = cat):");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            dog.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            cat.speak();
        }
        else(){
            System.out.println("You did not enter a valid number! ");
        }
    }
}
