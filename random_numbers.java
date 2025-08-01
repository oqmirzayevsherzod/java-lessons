import java.util.Random;

public class random_numbers {
    public static void main(String[] args){

        //Theme: Random Numbers

        Random random = new Random();

        int number1;
        number1 = random.nextInt(5,10);

        double number2;
        number2 = random.nextDouble(5.1 , 15.2);

        boolean number;
        number = random.nextBoolean();

        boolean isStudent;
        isStudent = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number);

        if(isStudent){
            System.out.print("You are a student");
        }
        else{
            System.out.println("You are NOT a student");
        }

    }
}
