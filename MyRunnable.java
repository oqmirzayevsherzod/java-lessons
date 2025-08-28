public class MyRunnable implements Runnable {

    public final String text;

    MyRunnable(String text){
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

//            if (i == 5) {
//                System.out.println("Time's up!");
//                System.exit(0);
//            }
        }
    }
}
