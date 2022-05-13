import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("The Alchemist", 370, 2015);
        Book book2 = new Book("Ekigai", 75, 1998);
        Book book3 = new Book("Wonder", 392, 2021);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to print? everything/name");
        String userChoice = scanner.nextLine();
        for (Book book : books) {
            if(userChoice.equalsIgnoreCase("everything"))
            {
                System.out.println(book);
            }
            else
            {
                System.out.println(book.getTitle());
            }            
        }
        scanner.close();        
    }    
}
