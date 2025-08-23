public class Employee extends Person{

    String first;
    String last;
    int salary;

    Employee(String first, String last, int salary){
        super(first,last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s salary is: " + this.salary);
    }
}
