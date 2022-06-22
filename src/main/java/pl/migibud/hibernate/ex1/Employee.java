package pl.migibud.hibernate.ex1;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name="employees")
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private int id;
    private String name,surname,jobTitle,address;
    private int age;
    @Column(name = "salaryMonthly")
    private int salary;

    public Employee() {}


}


