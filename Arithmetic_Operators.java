import java.util.Scanner;

public class Arithmetic_Operators {
    public static void main(String[] args){

        //Arithmetic Operators


       // int x = 10;
       //int y = 4;
        //int z;

        //z = x + y;
       // z = x - y;
       // z = x * y;
        //z = x / y;
        //z = x % y;
       // x += y;
       // x -= y;
       // x *= y;
       // x /= y;
       // x %= y;
       // System.out.print(x);

       // int x = 2;

       // x++;
       // x++;
       // x++;

        int y = 1;

        y--;
        y--;
        y--;
        System.out.print(y);

      //ORDER OF OPERATIONS [P-E-M-D-A-S]

      double result = 3 + 4 * (7-5) / 2;
        System.out.println(result);


        System.out.println(Math.PI);
        System.out.println(Math.E);

        double natija;

        natija = Math.pow(2,8);
        double matematika = Math.pow(25,2);
        natija = Math.sqrt(81);
        natija = Math.abs(-9000);
        natija = Math.max(38,28);
        natija = Math.min(83,93);
        System.out.println(matematika);
        System.out.print(natija);

        //HYPOTENUSE c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side A:>>>");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of side B:>>>");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print("The hypotenuse (c) is " + c +"cm");

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        volume = (4.0 / 3.0) * Math.PI *Math.pow(radius,3);

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        //System.out.println("The circumference is " + circumference + "cm");
        //System.out.println("The area is " + area + "cm²");
        //System.out.print("The volume is " + volume + "cm³");

        System.out.printf("The circumference is %.1fcm\n",circumference);
        System.out.printf("The area is %.1fcm²\n",area);
        System.out.printf("The volume is %.1fcm³\n",volume);

        System.out.print("Enter a number (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter another number (y): ");
        //double y = scanner.nextDouble();
        double z = x + y;

        System.out.println("Yig'indisi: " + z);


        scanner.close();

    }
}
