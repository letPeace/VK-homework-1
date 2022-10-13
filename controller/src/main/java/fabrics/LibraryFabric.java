package fabrics;

import entities.Author;
import entities.Book;
import entities.Library;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class LibraryFabric {

    public Library create(){
        // create a library
        Library library = new Library();
        // create an AUTHOR №1
        Author author = new Author("Author1", Collections.singleton("Author1Pseudonym"), "01.01.2000", "Place1", "Citizenship1");
        // create and add to library a BOOK №1
        Book book = new Book("Title1", author, "01.01.2010", "Language1");
        library.addBook(book);
        // create and add to library a BOOK №2
        book = new Book("Title2", author, "02.02.2020", "Language2");
        library.addBook(book);
        // create an AUTHOR №2
        author = new Author("Author2", new HashSet<>(Arrays.asList("Author2Pseudonym1", "Author2Pseudonym2")), "02.02.2000", "Place2", "Citizenship2");
        // create and add to library a BOOK №3
        book = new Book("Title3", author, "03.03.2030", "Language3");
        library.addBook(book);
        //
        return library;
    }

}
