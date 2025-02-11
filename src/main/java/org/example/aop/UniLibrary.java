package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Get book from UniLibrary ");
    }

    protected String returnBook() {
        return "Return book from UniLibrary";
    }

    public void getMagazine() {
        System.out.println("Get magazines from UniLibrary");
    }
}
