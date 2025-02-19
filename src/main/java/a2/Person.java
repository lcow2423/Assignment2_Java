package a2;

import lombok.Builder;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

// Jacksonized annotation for deserialization support.
@Jacksonized
@Builder
@Getter
@EqualsAndHashCode
@ToString
public class Person {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String gender;

    // Private constructor to ensure only the builder can instantiate the object
    private Person(String id, String firstName, String lastName, Integer age, String gender) {

        // Input validation with exception handling
        if (id == null) throw new IllegalArgumentException("ID cannot be null.");
        if (firstName == null || firstName.trim().isEmpty()) throw new IllegalArgumentException("First name cannot be null or blank.");
        if (lastName == null || lastName.trim().isEmpty()) throw new IllegalArgumentException("Last name cannot be null or blank.");
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative.");

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
}
