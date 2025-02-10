package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml"); //Spring Container instance
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
