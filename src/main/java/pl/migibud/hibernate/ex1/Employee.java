package pl.migibud.hibernate.ex1;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Employee {

    private int id;
    private String name,surname,jobTitle,address;
    private int age, salary;

    public Employee() {}
}


