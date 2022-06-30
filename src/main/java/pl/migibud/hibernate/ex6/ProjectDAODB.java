package pl.migibud.hibernate.ex6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class ProjectDAODB implements AbstractDAOInterface<Project> {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    private SessionFactory getSessionFactory() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(ssr)
                .getMetadataBuilder()
                .build();

        return metadata
                .getSessionFactoryBuilder()
                .build();
    }

    private Session openSession(){
        if (sessionFactory==null){
            sessionFactory = getSessionFactory();
        }
        session = sessionFactory.openSession();
        return session;
    }

    private Session openSessionWithTransaction(){
        session = openSession();
        transaction = session.beginTransaction();
        return session;
    }

    private void closeSession(){
        if (session!=null){
            session.close();
        }
//        this.closeSessionFactory();
    }

    private void closeSessionWithTransaction(){
        if (transaction!=null){
            transaction.commit();
            this.closeSession();
        }
//        this.closeSessionFactory();
    }

    private void closeSessionFactory(){
        if (this.sessionFactory!=null){
            this.sessionFactory.close();
        }
    }

    @Override
    public void persist(Project entity) {
        this.openSessionWithTransaction().save(entity);
        this.closeSessionWithTransaction();
//        this.closeSessionFactory();
    }

    @Override
    public void update(Project entity) {
        this.openSessionWithTransaction().update(entity);
        this.closeSessionWithTransaction();
        this.closeSessionFactory();
    }

    @Override
    public Project findById(Integer id) {
        Project project = (Project) openSession().get(Project.class,id);
        this.closeSession();
        this.closeSessionFactory();
        return project;
    }

    @Override
    public void delete(Project entity) {
        openSessionWithTransaction().delete(entity);
        closeSessionWithTransaction();
        this.closeSessionFactory();
    }

    @Override
    public void deleteAll() {
        List<Project> projects = findAll();
        for (Project p : projects) {
            this.delete(p);
        }
        this.closeSessionFactory();
    }

    @Override
    public List<Project> findAll() {
        List<Project> projects = (List<Project>)openSession().createQuery("FROM Project").list();
        closeSession();
        this.closeSessionFactory();
        return projects;
    }
}
