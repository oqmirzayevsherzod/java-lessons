import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args){

        //ArrayLists

        /*ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);

        System.out.println(list);*/

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Coconut");
//        fruits.add("Banana");
//        fruits.add("Apple");
//        fruits.add("Pineapple");

        //fruits.remove(2);
//        fruits.set(0,"Orange");
//        fruits.set(2,"Carrot");
//
//        System.out.println(fruits);
//        System.out.println(fruits.size());
//        Collections.sort(fruits);
//        System.out.println(fruits);

//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        ArrayList<String> foods = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();


    }
}
