package entities;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.Date;

@Value
@AllArgsConstructor
public class Book {

    String title;
    Author author;
    Date publicationDate; // some date class is expected to be used here
    String originalLanguage;

}
