package pl.migibud.hibernate.ex6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ProjectDAODB implements AbstractDAOInterface<Project>{

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	private SessionFactory

	@Override
	public void persist(Project entity) {

	}

	@Override
	public void update(Project entity) {

	}

	@Override
	public Project findById(Integer id) {
		return null;
	}

	@Override
	public void delete(Project entity) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public List<Project> findAll() {
		return null;
	}
}
