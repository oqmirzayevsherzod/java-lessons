public class Array_Of_Objects {
    public static void main(String[] args){

        //Theme: Array of objects

        /*Cars car1 = new Cars("BMW","Black");
        Cars car2 = new Cars("Tesla","Black");
        Cars car3 = new Cars("Rolls‑Royce Droptail (La Rose Noire)","Black");*/

        Cars[] cars = {new Cars("BMW","Black"),
                       new Cars("Tesla","Black"),
                       new Cars("Rolls‑Royce Droptail (La Rose Noire)","Black")};

        for(Cars car : cars){
            car.drive();
        }

    }
}
