package pl.migibud.hibernate.ex4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import pl.migibud.hibernate.ex3.model.Parcel;
import pl.migibud.hibernate.ex3.model.ParcelAddress;
import pl.migibud.hibernate.ex4.model.Article;
import pl.migibud.hibernate.ex4.model.Tag;

import java.util.List;

public class ArticlesExample {

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

		Article article = new Article("Article #1","content");
		Tag tag1 = new Tag("Programming");
		article.addTag(tag1);
		Tag tag2  = new Tag("Java");
		article.addTag(tag2);

//		session.save(article);

		Query query = session.createQuery("FROM Article");
		List<Article> articles = query.list();

		articles.stream().forEach(
				a->{
					System.out.println(a+": ");
					a.getTags().forEach(
							System.out::println
					);
				}
		);

		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
