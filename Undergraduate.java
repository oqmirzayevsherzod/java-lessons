public class Undergraduate extends Person {

    String first;
    String last;
    double gpa;

    Undergraduate(String first, String last, double gpa){
        super(first,last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}
