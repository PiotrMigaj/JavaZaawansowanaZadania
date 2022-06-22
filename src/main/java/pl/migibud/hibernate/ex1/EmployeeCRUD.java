package pl.migibud.hibernate.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeCRUD {

    private SessionFactory sessionFactory;

    public EmployeeCRUD() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(ssr)
                .getMetadataBuilder()
                .build();

        sessionFactory = metadata
                .getSessionFactoryBuilder()
                .build();
    }

    public Integer saveEmployee(Employee employee) {
        Session session = null;
        Integer id = null;

        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            id = (Integer) session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return id;
    }

    public Employee getEmployee(Integer id){
        Session session = null;
        Employee employee = null;
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            String hql = "FROM Employee E WHERE E.id = "+id;
            Query query = session.createQuery(hql);
            List results = query.list();
            if (results.size()>0){
                employee = (Employee) results.get(0);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return employee;
    }

    public List<Employee> getAllEmployees(){
        Session session = null;
        List<Employee> employees = null;
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            String hql = "FROM Employee";
            Query query = session.createQuery(hql);
            employees = (List<Employee>) query.list();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return employees;
    }

    public void updateEmployee(Integer id,String name){
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Employee employee = (Employee) session.get(Employee.class, id);
            employee.setName(name);
            session.update(employee);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            if (session!=null){
                session.close();
            }
        }
    }

    public void deleteEmployee(Integer id){
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Employee employee = (Employee) session.get(Employee.class, id);
            session.delete(employee);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            if (session!=null){
                session.close();
            }
        }
    }


    public void run() {
        Employee employee = Employee.builder()
                .address("ul.Ig Chrz 41/2, 51-180 Psary")
                .age(28)
                .name("Anna")
                .surname("Migaj")
                .build();

        Integer employeeId = this.saveEmployee(employee);

        System.out.println(employeeId);

        Employee savedEmployee = this.getEmployee(employeeId);
        System.out.println(savedEmployee);
        System.out.println();
        List<Employee> employeeList = this.getAllEmployees();
        employeeList.forEach(System.out::println);
        System.out.println();
//        this.updateEmployee(1,"Michał");
//        this.deleteEmployee(1);
    }

    public static void main(String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();
        employeeCRUD.run();
    }
}
