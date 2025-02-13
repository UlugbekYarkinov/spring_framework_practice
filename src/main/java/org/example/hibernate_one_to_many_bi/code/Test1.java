package org.example.hibernate_one_to_many_bi.code;


import org.example.hibernate_one_to_many_bi.entity.Department;
import org.example.hibernate_one_to_many_bi.entity.Employee;
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
//            Department department = new Department("IT", 300, 1200);
//            Employee employee1 = new Employee("Ulugbek", "Yarkinov", 1000);
//            Employee employee2 = new Employee("Elena", "Smirnova", 400);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//            session.persist(department);
//
//            session.getTransaction().commit();

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmps());

            System.out.println("--------------------");

            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            session.getTransaction().commit();
        }


    }
}
