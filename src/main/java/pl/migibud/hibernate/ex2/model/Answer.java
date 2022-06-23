package pl.migibud.hibernate.ex2.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "answers")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String answer;
    private boolean correctFlag;

    public Answer() {
    }

    public Answer(String answer, boolean correctFlag) {
        this.answer = answer;
        this.correctFlag = correctFlag;
    }
}
