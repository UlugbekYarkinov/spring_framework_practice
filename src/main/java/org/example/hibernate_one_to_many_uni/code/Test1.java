package org.example.hibernate_one_to_many_uni.code;


import org.example.hibernate_one_to_many_uni.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {
//            Session session = factory.getCurrentSession();
//
//            Department department = new Department("HR", 500, 1000);
//            Employee employee1 = new Employee("Oleg", "Olgeo", 800);
//            Employee employee2 = new Employee("Adnrei", "Dissorov", 1000);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//
//            session.persist(department);
//
//            session.getTransaction().commit();

//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 4);
            System.out.println(employee);

            session.remove(employee);

            session.getTransaction().commit();
        }


    }
}
