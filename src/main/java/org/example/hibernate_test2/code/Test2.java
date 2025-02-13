package org.example.hibernate_test2.code;

import org.example.hibernate_test2.entity.Detail;
import org.example.hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

//            Employee employee = new Employee(
//                    "Nico",
//                    "Weiniger",
//                    "HR",
//                    4000
//            );
//            Detail detail = new Detail(
//                    "New York",
//                    "098909",
//                    "nico@gmail.com"
//            );

//            employee.setEmployeeDetail(detail);
//            detail.setEmployee(employee); //now the relationship is bidirectional and setting the
            // employee for detail automatically establish a relationship
//            employee.setEmployeeDetail(detail); //this is necessary to do to make employee aware about Detail

            session.beginTransaction();
//            session.persist(detail); //by adding a detail, employee will automatically be added

            Detail detail = session.get(Detail.class, 3);
            detail.getEmployee().setEmployeeDetail(null); //we have to break a relationship and set detail_id (aka employeeDetail) as null

            session.remove(detail); //this would delete both Detail and set detail_id of Employee to null!

            session.getTransaction().commit();
        }


    }
}
