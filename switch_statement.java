import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Switch statement

        char baho = 'C';

        switch(baho){
            case 'A':
                System.out.println("A'lo");
                break;
            case 'B':
                System.out.println("Yaxshi");
                break;
            case 'C':
                System.out.println("Qoniqarli");
                break;
            case 'D':
                System.out.println("Qoniqarsiz");
                break;
            default:
                System.out.println("Noto'g'ri baho");
        }



        /*
        int monthNumber;
        System.out.print("Enter the number of the month: ");
        monthNumber = scanner.nextInt();

        switch(monthNumber){
            case 1,2,12:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println(monthNumber + " is NOT a valid month number");
        }

         */

        /*
        int day;
        System.out.print("Enter the number of the weekday: ");
        day = scanner.nextInt();

        switch (day) {
            case 1 , 2 , 3 , 4 , 5:
                System.out.println("It is a weekday 😀😀");
                break;
            case 6 , 7:
                System.out.println("It is a weekend 😀😀");
                break;
            default:
                System.out.println(day + " is NOT a number of the weekday");
        }

         */

        /*
        switch (day){
            case "Monday" , "Tuesday" , "Wednesday" ,"Thursday" , "Friday":
                System.out.println("It is a weekday 😀😀");
                break;
            case "Saturday" , "Sunday":
                System.out.println("It is a weekend 😀😀");
                break;
            default:
                System.out.println(day + " is not a day");
        }

         */

        /*
        switch(day){
            case "Monday":
                System.out.println("It is a weekday 😀😀");
                break;
            case "Tuesday":
                System.out.println("It is a weekday 😀😀");
                break;
            case "Wednesday":
                System.out.println("It is a weekday 😀😀");
                break;
            case "Thursday":
                System.out.println("It is a weekday 😀😀");
                break;
            case "Friday":
                System.out.println("It is a weekday 😀😀");
                break;
            case "Saturday":
                System.out.println("It is a weekend 😀😀");
                break;
            case "Sunday":
                System.out.println("It is a weekend 😀😀");
                break;
            default:
                System.out.println(day + " is not a day");
        }

         */
    }
}
