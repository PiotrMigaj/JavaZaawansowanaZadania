package pl.migibud.day1extras.ex2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Programmer {

    private Person person;
    private List<String> programmingLanguages;

}
