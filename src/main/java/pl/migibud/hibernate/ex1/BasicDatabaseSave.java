package pl.migibud.hibernate.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BasicDatabaseSave {
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

        Employee employee = Employee.builder()
                .name("Ania")
                .surname("Migaj")
                .age(28)
                .build();
//        employee.setId(1);
//        employee.setName("Adam");
//        employee.setSurname("Kowalski");
//        employee.setJobTitle("Programmer");
//        employee.setSalary(10_000);

        session.save(employee);

        transaction.commit();

        System.out.println("employee saved");
        sessionFactory.close();
        session.close();
    }
}
