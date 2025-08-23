public class Rectangular extends Shape{

    double length;
    double width;

    Rectangular(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        return length * width;
    }
}
