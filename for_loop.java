import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) throws InterruptedException {

        // for loop =execute some code a CERTAIN amount of times

        Scanner scanner = new Scanner(System.in);

        int N;
        int son = 1;
        int sum = 0;

        System.out.print("N: ");
        N = scanner.nextInt();

        for(int i = 1; i <= N;i++){
            System.out.print(i + "-son: ");
            son = scanner.nextInt();
            sum = sum + son;

        }
        System.out.println("Yig'indi: " +sum);
        System.out.println("O'rtacha: " + (double)sum/N);














        /*
        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!😘😍");

         */

        /*
        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();
        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }

         */

        /*
        for(int i = 2; i < 10; i+=2){
            System.out.println(i);
        }

         */
    }
}
