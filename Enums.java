import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Enums {
    public static void main(String[] args){

        //Theme: Enums

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is the weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is the weekend");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day");
        }

        scanner.close();


    }
}
