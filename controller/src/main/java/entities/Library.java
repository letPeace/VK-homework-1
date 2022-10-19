package entities;

import lombok.Value;

import java.util.*;
import java.util.stream.Collectors;

@Value
public class Library {

    Map<String, Set<Book>> library;

    public Library(){
        this(new HashMap<>());
    }

    public Library(Map<String, Set<Book>> library) {
        this.library = library;
    }

    public void addBook(String authorName, Book book){
        if(library.containsKey(authorName)){
            Set<Book> authorBooks = library.get(authorName);
            authorBooks.add(book);
        } else{
            library.put(authorName, new HashSet<>(Collections.singleton(book)));
        }
    }

    public Set<Book> getAuthorBooks(final String authorName) {
        return library
                .getOrDefault(authorName.toLowerCase(), new HashSet<>())
                .stream()
                .filter(book -> book.getAuthor().getName().equalsIgnoreCase(authorName))
                .collect(Collectors.toSet());
    }

}
