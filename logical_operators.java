import java.util.Scanner;

public class logical_operators {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Theme: Logical operators (&& --> and , || --> , ! --> not )

        double gpa;
        int attendance;
        boolean isWinner;

        System.out.print("Enter your GPA: ");
        gpa = scanner.nextDouble();
        System.out.print("Enter the attendance rate in percentage (%): ");
        attendance = scanner.nextInt();
        System.out.println("Have you ever been the winner of the competition? (true/false): ");
        isWinner = scanner.nextBoolean();

        if(gpa >= 85 && attendance > 90 || isWinner == true){
            System.out.println("✅ Siz stipendiyaga tavsiya etildingiz.");
        }
        else{
            System.out.println("❌ Afsuski, siz stipendiyaga tavsiya etilmadingiz.");
        }

        /*
        int age;
        boolean passport;
        boolean ruxsatnoma;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("Passportingiz bormi? (true/false)");
        passport = scanner.nextBoolean();
        System.out.print("Siz ota-onangizning ruxsotnomasiga egamisiz? (true/false): ");
        ruxsatnoma = scanner.nextBoolean();


        if ((age >= 18 && passport == true) || (age > 16 && ruxsatnoma == true ) ){
            System.out.println("✅Kirishga ruxsat berildi");
        }
        else{
            System.out.println("❌Kirish rad etildi");
        }

         */

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        /*
        String username;
        System.out.print("Enter a new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }

         */


        /*
        double temperature = 10;
        boolean isSunny = false;

        if(temperature > 0 && temperature <= 30 && isSunny){
            System.out.println("It is a good day 😍");
            System.out.println("It is sunny outside ☀️");
        }
        else if(temperature <= 0 || temperature > 30){
            System.out.println("It is Not a good day 😒");
        }
        else if(temperature > 0 && temperature <= 30 && !isSunny){
            System.out.println("It is a good day 😍");
            System.out.println("It is cloudy outside ☁️");
        }

         */
        scanner.close();
    }
}
