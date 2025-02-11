package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook(String bookName) {
        System.out.println("Get book from UniLibrary " + bookName);
    }

    protected String returnBook() {
        return "Return book from UniLibrary";
    }

    public void getMagazine(int numberOfMagazines) {
        System.out.println("Get " + numberOfMagazines + " magazines from UniLibrary");
    }
}
