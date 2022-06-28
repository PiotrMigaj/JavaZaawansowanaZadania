package pl.migibud.hibernate.ex5MPsda;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public enum HibernateConnection {

	SESSION_FACTORY;

	private SessionFactory sessionFactory;

	HibernateConnection() {
		this.sessionFactory = buildSessionFactory();
	}

	private SessionFactory buildSessionFactory(){
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
				.configure("hibernate-sda-cinema.cfg.xml")
				.build();

		Metadata metadata = new MetadataSources(ssr)
				.getMetadataBuilder()
				.build();

		return metadata
				.getSessionFactoryBuilder()
				.build();
	}

	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}

	public void closeSessionFactory(){
		if (this.sessionFactory!=null){
			this.sessionFactory.close();
		}
	}
}
