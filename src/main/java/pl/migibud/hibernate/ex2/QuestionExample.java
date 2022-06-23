package pl.migibud.hibernate.ex2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import pl.migibud.hibernate.ex2.model.Answer;
import pl.migibud.hibernate.ex2.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    public static void main(String[] args) {

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(ssr)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata
                .getSessionFactoryBuilder()
                .build();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Question question = new Question("Ile to 5 + 5");
        Answer a1 = new Answer("8",false);
        Answer a2 = new Answer("11",false);
        Answer a3 = new Answer("10",true);
        Answer a4 = new Answer("4",false);

        List<Answer> answers = List.of(a1,a2,a3,a4);
        //answers.add(a1)
        question.setAnswers(answers);

//        session.save(question);

        Question q2 = new Question("Ile to 4 + 4");
        List<Answer> answers2 = new ArrayList<>();
        answers2.add(new Answer("0",true));
        answers2.add(new Answer("1",false));
        q2.setAnswers(answers2);

//        session.save(q2);

        Query query = session.createQuery("FROM Question");
        List<Question> questions = query.list();

        questions.stream().forEach(q-> {
            System.out.println(q);
            q.getAnswers().forEach(System.out::println);
        });

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
