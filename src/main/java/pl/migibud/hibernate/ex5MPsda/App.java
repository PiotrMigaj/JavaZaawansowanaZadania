package pl.migibud.hibernate.ex5MPsda;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pl.migibud.hibernate.ex5MPsda.model.Actor;
import pl.migibud.hibernate.ex5MPsda.model.Movie;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConnection.SESSION_FACTORY.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Actor actor1 = new Actor("Piotr","Migaj",3.42);
		Actor actor2 = new Actor("Anna","Migaj",9.42);

		Movie movie1 = new Movie("Star Wars","George Lucas");
		Movie movie2 = new Movie("Star Wars 2","George Lucas");

//		actor1.addMovie(movie1);
//		actor1.addMovie(movie2);

//		movie2.addActor(actor2);

		actor1.addMovie(movie1);
		System.out.println(actor1.getMovies());

		session.save(actor1);
//		session.save(actor2);

		transaction.commit();
		session.close();
		HibernateConnection.SESSION_FACTORY.closeSessionFactory();
	}
}
