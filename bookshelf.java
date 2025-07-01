import java.util.*;
public class bookshelf{
    static ArrayList<String> bookshelf = new ArrayList<>();
    // Addding books to arraylist
    public static void addBook(String title, String author){
        bookshelf.add(title + "-" + author);
    }
    //searchbook
    public static void searchbook(String author){
        boolean ispresent = false;
        for(String book : bookshelf){
            String [] books = book.split("-");
            if(books.length == 2 && books[1].equalsIgnoreCase(author)){
                ispresent = true;
                System.out.print(book);
            }
        }
        if(!ispresent){
            System.out.println("NO BOOK FOUND");
        }
    }
    public static String[] convert(){
        return bookshelf.toArray( new String[0]);
    }
    public static void main(String[] args) {
        addBook("Hary Potter", "Vipul Duve");
        addBook("zzz", "Ankush bhai");
        for(String book : bookshelf){
            System.out.println(book);
        }
    }


}