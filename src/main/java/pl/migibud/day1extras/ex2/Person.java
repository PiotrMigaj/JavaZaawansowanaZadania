package pl.migibud.day1extras.ex2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
}
