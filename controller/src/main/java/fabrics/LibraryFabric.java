package fabrics;

import entities.Author;
import entities.Book;
import entities.Library;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class LibraryFabric {

    public Library create(){
        // create a library
        Library library = new Library();
        // create an AUTHOR №1
        String authorName1 = "author1";
        Author author = new Author(authorName1, Collections.singleton("Author1Pseudonym"), new Date(100, 1, 1), "Place1", "Citizenship1");
        // create and add to library a BOOK №1
        Book book = new Book("Title1", author, new Date(110, 1, 1), "Language1");
        library.addBook(authorName1, book);
        // create and add to library a BOOK №2
        book = new Book("Title2", author, new Date(120, 2, 2), "Language2");
        library.addBook(authorName1, book);
        // create an AUTHOR №2
        String authorName2 = "author2";
        author = new Author(authorName2, new HashSet<>(Arrays.asList("Author2Pseudonym1", "Author2Pseudonym2")), new Date(100, 2, 2), "Place2", "Citizenship2");
        // create and add to library a BOOK №3
        book = new Book("Title3", author, new Date(130, 3, 3), "Language3");
        library.addBook(authorName2, book);
        //
        return library;
    }

}
