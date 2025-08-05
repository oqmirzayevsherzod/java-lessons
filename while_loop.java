import java.util.Scanner;

public class while_loop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Theme: while loops

        int number = 0;

        do{
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        /*
        int age = 0;

        do{
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("You are " + age + " years old");

         */

        /*
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit:");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

         */

        /*
        int son = 0;

        while(son != 10){
            System.out.print("10 sonini kiriting: ");
            son = scanner.nextInt();
        }
            System.out.println("To'g'ri, dasturni yakunladik! ");

         */

        /*
        int i = 1

        while(i <= 5){
            System.out.println(i);
            i++;
        }

         */
        scanner.close();
    }
}
