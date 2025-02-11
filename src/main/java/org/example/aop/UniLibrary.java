package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Get book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("Return book from UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Get magazine from UniLibrary");
    }
}
