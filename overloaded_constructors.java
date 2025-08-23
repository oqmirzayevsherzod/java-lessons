public class overloaded_constructors {
    public static void main(String[] args){

        // Theme: Overloaded constructors

        User user1 = new User("oqmirzayev_sh");
        User user2 = new User("oqmirzayev_sh","okhmirzayev@gmail.com");
        User user3 = new User("oqmirzayev_sh","okhmirzayev@gmail.com",18);
        User user4 = new User();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

        /*System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);*/
    }
}
