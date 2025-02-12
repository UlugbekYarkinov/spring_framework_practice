package org.example.hibernate_test.code;

import org.example.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(1500); //this is the only thing I need to make UPDATE

            session.createMutationQuery("update Employee set salary=100 where name='Oleg'").executeUpdate();

            session.getTransaction().commit(); //we do two actions in one transaction
        }


    }
}
