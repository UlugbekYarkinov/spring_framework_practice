package org.example.hibernate_test.code;

import org.example.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employees = session.createQuery("from Employee", Employee.class).getResultList();

//            List<Employee> employees = session.createQuery("from Employee where name = 'Oleg'", Employee.class).getResultList();
            // here name is not a column. It is a field of Employee class!!!
            List<Employee> employees = session.createQuery("from Employee where salary <= 3500", Employee.class).getResultList();
            //very similar to plane SQL language
            for (Employee employee : employees) {
                System.out.println(employee);
            }

            session.getTransaction().commit(); //we do two actions in one transaction
        }


    }
}
