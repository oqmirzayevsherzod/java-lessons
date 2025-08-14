import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        String[] fruits = {"olma", "anor", "uzum", "nok"};
        int[] numbers = {10,20,30,40,50};
        //fruits[1] = "shaftoli";
        //int numOfFruits = fruits.length;
        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "banan");

        /*
        for(int i = 0; i < fruits.length;i++){
            System.out.print(fruits[i] + " ");
        }

         */
        /*
        // an enhanced for loop or for each loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }

         */
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
