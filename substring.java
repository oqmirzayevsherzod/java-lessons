import java.util.Scanner;

public class substring {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Substring() = a method used to extract a portion of a string
        //              .substring(start, end)

        String email;
        String username;
        String domain;

        System.out.println("Enter your email: ");

        email = scanner.nextLine();
        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("The username of your email: " + username);
            System.out.println("The domain of your email: " + domain);
        }
        else{
            System.out.println("Emails must contain @");
        }


        //String email = "okhmirzayev@gmail.com";
        //String email = "okhmirzayevs@gmail.com";
        //String username = email.substring(0,12);
        //String domain = email.substring(13,22);
        //String username = email.substring(0,email.indexOf("@"));
        //String domain = email.substring(email.indexOf("@") + 1);
        //String ism = "Islom";
        //String qisqa = ism.substring(0,3);
        //System.out.print(domain);

        scanner.close();
    }
}
