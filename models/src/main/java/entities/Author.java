package entities;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.Date;
import java.util.Set;

@Value
@AllArgsConstructor
public class Author {

    String name;
    Set<String> pseudonyms;
    Date dateOfBirth; // some date class is expected to be used here
    String placeOfBirth;
    String citizenship;

}
