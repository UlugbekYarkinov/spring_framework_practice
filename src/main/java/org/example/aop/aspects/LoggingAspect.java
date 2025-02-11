package org.example.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook(org.example.aop.Book))") //when we write the class Name it should be complete
    public void beforeGetBookAdvice() {
        System.out.println("Before getBookAdvice: Attempt to get a book");
    }

    @Before("execution(* returnBook())") //this is a pointcut with a wildcard
    public void beforeReturnBookAdvice() {
        System.out.println("Before returnBookAdvice: Attempt to return a book");
    }
}
