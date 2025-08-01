import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("What is your favorite colour? ");
        String colour = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("What is your gpa? ");
        double gpa = scanner.nextDouble();

        System.out.println("are you accepted to ITPU University as a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Is there a backend course that is directed to learn java language? (true/false)>> ");
        boolean javaCourse = scanner.nextBoolean();


        System.out.println("Your name is " + name);
        System.out.println("You like the colour " + colour);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);
        if(isStudent){
            System.out.println("Congratulations");
        }
        else{
            System.out.println("Never throw in the towel");
        }
        if(javaCourse){
            System.out.println("send more information about java backend course to me via email");
        }
        else{
            System.out.println("When java backend course is going to open?");
        }
        // Amaliyot
        double width = 0;
        double height = 0;
        double area = 0;


        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm²");

        scanner.close();
    }
}
