public class Aggregation {
    public static void main(String[] args){

        //Theme: Aggregation

        Book book1 = new Book("The Return of the King",416);
        Book book2 = new Book("The Two Towers",352);
        Book book3 = new Book("The Fellow of the Ring",352);

        Book[] books = {book1, book2, book3};

        /*for(Book book : books){
            System.out.println(book.displayInfo());
        }*/

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();


    }
}
