import org.w3c.dom.ls.LSOutput;

public class variable_scope {
    static int x = 9; //static variable
    public static void main(String[] args) {
        int a = 4; // Local scope
        //System.out.println("a ning qiymati: " + a);
        //System.out.println(x);

        if (true) {
            int b = 9; // Block variable
            System.out.println(b);
        }
        //System.out.println(b);
        for(int i = 0; i<3; i++){
            System.out.println("i: " + i);
        }
    }
}
