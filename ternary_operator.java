public class ternary_operator {
    public static void main(String[] args){

        // ternary operator ? uchta qiymat qabul qilib shart asosida ikki qiymatdan birini tanlaydi

        // variable = (condition) ? ifTrue : ifFalse;

        //int score = 78;
        //int number = 4;
        //int hours = 11;
        int income = 100000;
        double taxRate = (income >= 40000) ? 0.25:0.15;
        //String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        //String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        //String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.print(taxRate);

    }
}
