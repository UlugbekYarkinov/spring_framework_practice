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
                    "Elena",
                    "Petrov",
                    "Sales",
                    3050
            );

            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();

            int id = employee.getId();
            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee employeeFromDbById = session.get(Employee.class, id);
            session.getTransaction().commit();

            System.out.println(employeeFromDbById);
        }


    }
}
