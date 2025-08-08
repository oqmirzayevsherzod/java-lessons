public class methods {
    public static void main(String[] args) {
        //method  = a block of reusable code that is executed when called()

        /*
        String name = "Bro";
        int age = 65;
        happyBirthday(name, age);

         */
        String pizza = bakePizza("flat bread ", "mozzarella", "pepperoni6");
        System.out.println(pizza);


    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    static String bakePizza(String bread) {
        return bread + "pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + "pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + "pizza";
    }
}

