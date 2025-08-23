public class Bird implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("*The bird is flying away*");
    }

    @Override
    public void hunt(){
        System.out.println("*The bird is hunting*");
    }
}
