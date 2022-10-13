package entities;

import lombok.Value;

import java.util.Set;

@Value
public class Author {

    String name;
    Set<String> pseudonyms;
    String dateOfBirth; // some date class is expected to be used here
    String placeOfBirth;
    String citizenship;

    public Author(String name, Set<String> pseudonyms, String dateOfBirth, String placeOfBirth, String citizenship) {
        this.name = name;
        this.pseudonyms = pseudonyms;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.citizenship = citizenship;
    }

}
