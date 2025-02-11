package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook(Book book) {
        System.out.println("Get book from UniLibrary " + book.getName());
    }

    protected String returnBook() {
        return "Return book from UniLibrary";
    }

    public void getMagazine() {
        System.out.println("Get magazines from UniLibrary");
    }
}
