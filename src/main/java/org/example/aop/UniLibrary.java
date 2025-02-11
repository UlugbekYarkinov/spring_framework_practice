package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Get book from UniLibrary");
        System.out.println("--------------------------------------");
    }

    public String returnBook() {
        System.out.println("Return book from UniLibrary");
        return "War and Peace";
    }

    public void getMagazine() {
        System.out.println("Get magazines from UniLibrary");
        System.out.println("--------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Return magazines from UniLibrary");
        System.out.println("--------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add book to UniLibrary");
        System.out.println("--------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add magazine to UniLibrary");
        System.out.println("--------------------------------------");
    }
}
