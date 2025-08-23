public class oop {
    public static void main(String[] args){

        // Theme: Constructors

        Student student1 = new Student("Sherzod",18,4.5);
        Student student2 = new Student("Ikrom",18,4.0);
        Student student3 = new Student("Shahriyor",18,4.24);

        /*System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);*/

        student1.study();
        student2.study();


    }
}
