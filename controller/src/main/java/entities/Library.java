package entities;

import lombok.Value;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Value
public class Library {

    Set<Book> books;

    public Library(){
        this(new HashSet<>());
    }

    public Library(Set<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Set<Book> getAuthorBooks(final String authorName) {
        return books.stream()
                .filter(book -> book.getAuthor().getName().equalsIgnoreCase(authorName))
                .collect(Collectors.toSet());
    }

}
