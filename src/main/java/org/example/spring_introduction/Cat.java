package org.example.spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean") //if id is not specified, default one is "cat"
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
