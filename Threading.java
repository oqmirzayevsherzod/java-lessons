import java.util.Scanner;

public class Threading {
    public static void main(String[] args){

        //Theme: Threading

        Scanner scanner = new Scanner(System.in);

        //MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));
        //thread.setDaemon(true);

        System.out.println("GAME START!");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER!");


//        System.out.println("You have 5 seconds to enter your name: ");
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();

    }
}
