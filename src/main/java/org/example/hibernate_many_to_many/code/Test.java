package org.example.hibernate_many_to_many.code;

import org.example.hibernate_many_to_many.entity.Child;
import org.example.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

            Section section1 = new Section("Football");
            Child child1 = new Child("Ulugbek", 5);
            Child child2 = new Child("Masha", 7);
            Child child3 = new Child("Vera", 10);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);


            session.beginTransaction();

            session.persist(section1);

            session.getTransaction().commit();

        }
    }
}
