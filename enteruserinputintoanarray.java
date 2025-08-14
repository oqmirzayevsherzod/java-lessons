import java.util.Scanner;

public class enteruserinputintoanarray {
    public static void main(String[] args){

        //Enter user input into an array

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What # of foods do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];


        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food that you like: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }


        /*
        foods[0] = "pizza";
        foods[1] = "hot dog";
        foods[2] = "lavash";

         */

        /*
        for(int i = 0; i < foods.length; i++){
            System.out.println(foods[i]);
        }

         */



    }
}
