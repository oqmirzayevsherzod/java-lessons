public class string_methods {
    public static void main (String[] args) {

        //Theme: String Methods

        String name = "Dream";
        //int length = name.length();
       //char letter = name.charAt(7);
        int index = name.indexOf("D");
        //int lastindex = name.lastIndexOf("e");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        name = name.trim();
        //name = name.replace("e","a");


        //System.out.println(name.toUpperCase() + " is a student at ITPU university");
        System.out.println(name);

        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

         */

        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any spaces");
        }

         */

        /*
        if(name.equalsIgnoreCase("password")){
            //IgnoreCase metodi password suzining bosh harfini kichik qiladi
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }

         */
        //concat() method

       //name = name.concat(" Zone");
       //System.out.println(name + " is a place where I studied and achieved a band 6.5 IELTS score");
    }
}
