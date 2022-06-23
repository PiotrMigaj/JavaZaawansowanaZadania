package pl.migibud.hibernate.ex2.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "questions_id")
    private List<Answer> answers;

    public Question() {
    }

    public Question(String question) {
        this.question = question;
    }
}
