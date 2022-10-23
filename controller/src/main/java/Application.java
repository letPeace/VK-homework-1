import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Book;
import entities.Library;
import fabrics.LibraryFabric;

import java.util.Scanner;
import java.util.Set;

public class Application {

    public static void main(String[] args){

        // create a library
        LibraryFabric libraryFabric = new LibraryFabric();
        Library library = libraryFabric.create();
        // hint a user to input an author's name
        System.out.println("Enter an author's name to get their books:");
        // read an author's name
        Scanner input = new Scanner(System.in);
        String authorName = input.nextLine(); // probably it has to be in WHILE
        input.close();
        // get the author's books
        Set<Book> authorBooks = library.getAuthorBooks(authorName);
        // create Gson
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        // print these books
        if(authorBooks.isEmpty()) System.out.println("Such author does not exist!");
        else System.out.println(gson.toJson(authorBooks));

    }

}
