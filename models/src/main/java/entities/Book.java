package entities;

import lombok.Value;

@Value
public class Book {

    String title;
    Author author;
    String publicationDate; // some date class is expected to be used here
    String originalLanguage;

    public Book(String title, Author author, String publicationDate, String originalLanguage) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.originalLanguage = originalLanguage;
    }

}
