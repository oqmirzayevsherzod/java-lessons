import java.util.Scanner;

public class if_statements {
    public static void main(String[] args){

        // Theme: IF Statement
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name:>>>");
        name = scanner.nextLine();

        System.out.print("Enter your age:>>>>");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false)");
        isStudent = scanner.nextBoolean();

        // GROUP 1
        if(name == ""){
            System.out.println("You did NOT enter your name! " + " ");
        }
        else{
            System.out.println("Hello " + name + " ");
        }

        // GROUP 2
        if(age >= 18){
            System.out.println("You are an adult");
        }
        else if(age == 0){
            System.out.print("You are a baby");
        }
        else if(age >= 65){
            System.out.println("You are retired");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet");
        }
        else{
            System.out.println("You are a child");
        }

        //GROUP 3
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("you are NOT a student");
        }
        float temperature;

        System.out.print("Enter the temperature:>>>");
        temperature = scanner.nextFloat();

        if(temperature >= 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if(temperature >= 20){
            System.out.print("It's a nice day");
        }
        else{
            System.out.print("It's cold");
        }
       // float temperature = -45;

        if(temperature >= 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if(temperature >= 20){
            System.out.print("It's a nice day");
        }
        else{
            System.out.print("It's cold");
        }
        int baho;

        System.out.print("Iltimos Sherzodning bahosini kiriting!>>>");
        baho = scanner.nextInt();

        if(baho == 5){
            System.out.print("A'lo");
        }
        else if(baho == 4){
            System.out.println("Yaxshi");
        }
        else if(baho == 3){
            System.out.println("Qoniqarli");
        }
        else{
            System.out.println("Qoniqarsiz");
        }
        int yosh = 16;
        boolean hujjatBor = false;

        if(yosh >= 18){
            if(hujjatBor){
                System.out.print("Siz ovoz bera olasiz");
            } else {
                System.out.println("Hujjat yo'q");
            }
        }else {
            System.out.println("Siz voyaga yetmagansiz.");
        }
    }
}
