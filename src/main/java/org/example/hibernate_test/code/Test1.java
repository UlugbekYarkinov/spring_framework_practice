package org.example.hibernate_test.code;

import org.example.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee(
                    "Misha",
                    "Ivanov",
                    "HR",
                    3000
            );

            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        }


    }
}
