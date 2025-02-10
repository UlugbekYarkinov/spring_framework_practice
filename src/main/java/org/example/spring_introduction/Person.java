package org.example.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    @Autowired //If we have only one constructor, we can omit @Autowired annotation
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Person surname is set");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Person age is set");
        this.age = age;
    }

    @Autowired
    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Person pet is set");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }
}
