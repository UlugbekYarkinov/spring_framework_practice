package org.example.spring_introduction;

public class Dog implements Pet {
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void init() { //access modifier might be anything and the name is not a key word
        System.out.println("Dog init");
    }
    public void destroy() { //access modifier might be anything and the name is not a key word
        System.out.println("Dog destroy");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
