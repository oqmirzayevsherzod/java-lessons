public class Nested_If {
    public static void main(String[] args){

        int yosh = 17;
        int daraja = 1;
        int son = 15;

        if (yosh >= 18) {
            System.out.println("Siz kattasiz.");

            if (daraja == 1) {
                System.out.println("Siz boshlang'ich darajasiz.");
            } else if (daraja == 2) {
                System.out.println("Siz o'rta darajasiz.");
            } else {
                System.out.println("Siz yuqori darajasiz.");
            }
        } else {
            System.out.println("Siz voyaga yetmagansiz.");
        }


        if (son > 0) {
            if (son % 2 == 0) {
                System.out.println("Musbat juft son");
            } else {
                System.out.println("Musbat toq son");
            }
        } else {
            System.out.println("Son musbat emas");
        }
    }
}
