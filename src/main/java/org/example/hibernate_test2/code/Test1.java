package org.example.hibernate_test2.code;

import org.example.hibernate_test2.entity.Detail;
import org.example.hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Ulugbek", "Yarkinov", "IT", 3000);
            Detail detail = new Detail("Baku", "123456", "yul@gmail.com");

            employee.setEmployeeDetail(detail);

            session.beginTransaction();

            session.persist(employee);


            session.getTransaction().commit(); //we do two actions in one transaction
        }


    }
}
