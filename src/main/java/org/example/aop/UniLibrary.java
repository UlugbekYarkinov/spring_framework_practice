package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Get book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("Return book from UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Get magazines from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Return magazines from UniLibrary");
    }

    public void addBook() {
        System.out.println("We add book to UniLibrary");
    }

    public void addMagazine() {
        System.out.println("We add magazine to UniLibrary");
    }
}
