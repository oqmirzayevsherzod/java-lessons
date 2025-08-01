public class printf {
    public static void main(String[] args){

        //Theme: printf

        String name = "Sherzod";
        char firstLetter = 'S';
        int age = 18;
        double height = 1.85;
        boolean isStudent = true;

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;


        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n",firstLetter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Student: %b\n", isStudent);

        System.out.printf("%,.2f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%,.2f\n",price3);

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
    }
}
