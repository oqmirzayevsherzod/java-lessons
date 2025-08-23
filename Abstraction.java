public class Abstraction {
    public static void main(String[] args){

        //Theme: Abstraction

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangular rectangular = new Rectangular(2,3);


        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangular.area());

    }
}
